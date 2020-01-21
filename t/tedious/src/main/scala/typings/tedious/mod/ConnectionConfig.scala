package typings.tedious.mod

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
  var domain: js.UndefOr[String] = js.undefined
  /**
    * Further options
    */
  var options: js.UndefOr[ConnectionOptions] = js.undefined
  /**
    * Hostname to connect to.
    */
  var server: js.UndefOr[String] = js.undefined
}

object ConnectionConfig {
  @scala.inline
  def apply(
    authentication: ConnectionAuthentication = null,
    domain: String = null,
    options: ConnectionOptions = null,
    server: String = null
  ): ConnectionConfig = {
    val __obj = js.Dynamic.literal()
    if (authentication != null) __obj.updateDynamic("authentication")(authentication.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionConfig]
  }
}

