package typings
package tediousLib.tediousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionConfig extends js.Object {
  /**
    * Once you set domain, driver will connect to SQL Server using domain login.
    */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Further options
    */
  var options: js.UndefOr[ConnectionOptions] = js.undefined
  /**
    * Password to use for authentication.
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Hostname to connect to.
    */
  var server: js.UndefOr[java.lang.String] = js.undefined
  /**
    * User name to use for authentication.
    */
  var userName: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectionConfig {
  @scala.inline
  def apply(
    domain: java.lang.String = null,
    options: ConnectionOptions = null,
    password: java.lang.String = null,
    server: java.lang.String = null,
    userName: java.lang.String = null
  ): ConnectionConfig = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (options != null) __obj.updateDynamic("options")(options)
    if (password != null) __obj.updateDynamic("password")(password)
    if (server != null) __obj.updateDynamic("server")(server)
    if (userName != null) __obj.updateDynamic("userName")(userName)
    __obj.asInstanceOf[ConnectionConfig]
  }
}

