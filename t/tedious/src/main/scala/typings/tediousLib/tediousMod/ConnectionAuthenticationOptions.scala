package typings
package tediousLib.tediousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionAuthenticationOptions extends js.Object {
  /**
    * Once you set domain, driver will connect to SQL Server using domain login.
    */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Password to use for authentication.
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Authentication token used when type is 'azure-active-directory-access-token'
    */
  var token: js.UndefOr[java.lang.String] = js.undefined
  /**
    * User name to use for authentication.
    */
  var userName: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectionAuthenticationOptions {
  @scala.inline
  def apply(
    domain: java.lang.String = null,
    password: java.lang.String = null,
    token: java.lang.String = null,
    userName: java.lang.String = null
  ): ConnectionAuthenticationOptions = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (password != null) __obj.updateDynamic("password")(password)
    if (token != null) __obj.updateDynamic("token")(token)
    if (userName != null) __obj.updateDynamic("userName")(userName)
    __obj.asInstanceOf[ConnectionAuthenticationOptions]
  }
}

