package typings.tedious.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionAuthenticationOptions extends js.Object {
  /**
    * Once you set domain, driver will connect to SQL Server using domain login.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * Password to use for authentication.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * Authentication token used when type is 'azure-active-directory-access-token'
    */
  var token: js.UndefOr[String] = js.native
  /**
    * User name to use for authentication.
    */
  var userName: js.UndefOr[String] = js.native
}

object ConnectionAuthenticationOptions {
  @scala.inline
  def apply(): ConnectionAuthenticationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionAuthenticationOptions]
  }
  @scala.inline
  implicit class ConnectionAuthenticationOptionsOps[Self <: ConnectionAuthenticationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
  }
  
}

