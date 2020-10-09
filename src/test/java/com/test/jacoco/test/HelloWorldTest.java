package com.test.jacoco.test;

/**
 * Created by zc on 2017/5/2.
 */

import org.springframework.util.Assert;
import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String ss = hw.testMethod1();
        org.junit.Assert.assertNotNull(ss);
//        Assert.assertNotNull(ss);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int ss = hw.addMethod(1, 1);
//        Assert.assertEquals(ss, 2);
    }
}
