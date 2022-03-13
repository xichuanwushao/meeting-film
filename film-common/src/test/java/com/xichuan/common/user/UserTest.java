package com.xichuan.common.user;

import com.xichuan.common.FilmCommonApplicationTest;
import com.xichuan.common.dao.entity.MoocBackendUserT;
import com.xichuan.common.dao.mapper.MoocBackendUserTMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : wuxiao
 * @date : 15:44 2022/3/13
 */
public class UserTest extends FilmCommonApplicationTest {
    @Resource
    private MoocBackendUserTMapper moocBackendUserTMapper;
    @Test
    public void add(){
        MoocBackendUserT user = new MoocBackendUserT();
        user.setUserName("zhangsan");
        user.setUserPwd("qwe123");
        user.setUserPhone("899-2123-1323");
        moocBackendUserTMapper.insert(user);

    }
    @Test
    public void delete(){
        moocBackendUserTMapper.deleteById(2);
    }
    @Test
    public void update(){
        MoocBackendUserT user = new MoocBackendUserT();
        user.setUuid(2);
        user.setUserName("admin");
        user.setUserPwd("admin123");
        user.setUserPhone("899-2123-1323");
        moocBackendUserTMapper.updateById(user);

    }
    @Test
    public void select(){
        MoocBackendUserT moocBackendUserT = moocBackendUserTMapper.selectById("2");
        System.out.println(moocBackendUserT);
        List<MoocBackendUserT> moocBackendUserTS = moocBackendUserTMapper.selectList(null);
        moocBackendUserTS.stream().forEach(
            System.out::println
        );
    }
}
