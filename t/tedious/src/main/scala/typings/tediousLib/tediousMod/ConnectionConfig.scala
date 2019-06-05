package typings
package tediousLib.tediousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionConfig extends js.Object {
  /**
    * Authentication Options
    */
  var authentication: js.UndefOr[ConnectionAuthentication] = js.undefined
  /**
    * Once you set domain, driver will connect to SQL Server using domain login.
    */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Further options
    */
  var options: js.UndefOr[ConnectionOptions] = js.undefined
  /**
    * Hostname to connect to.
    */
  var server: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectionConfig {
  @scala.inline
  def apply(
    authentication: ConnectionAuthentication = null,
    domain: java.lang.String = null,
    options: ConnectionOptions = null,
    server: java.lang.String = null
  ): ConnectionConfig = {
    val __obj = js.Dynamic.literal()
    if (authentication != null) __obj.updateDynamic("authentication")(authentication)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (options != null) __obj.updateDynamic("options")(options)
    if (server != null) __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[ConnectionConfig]
  }
}

