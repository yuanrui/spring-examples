package org.banana.authserver.domain;

/**
 * @author yuanrui@live.cn
 * @since 2020/11/30 15:54
 */
public class LoginModel {

    private String user;
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
