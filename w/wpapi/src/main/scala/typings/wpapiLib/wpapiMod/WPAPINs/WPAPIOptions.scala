package typings
package wpapiLib.wpapiMod.WPAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WPAPIOptions extends Credentials {
  /** The URI for a WP-API endpoint */
  var endpoint: java.lang.String
  /**
    * A dictionary of API routes with which to bootstrap the WPAPI instance:
    * the instance will be initialized with default routes only if this
    * property is omitted
    */
  var routes: js.UndefOr[Routes] = js.undefined
  /**
    * An optional dictionary of HTTP transport methods (.get, .post, .put,
    * .delete, .head) to use instead of the defaults, e.g. to use a
    * different HTTP library than superagent
    */
  var transport: js.UndefOr[Transport] = js.undefined
}

object WPAPIOptions {
  @scala.inline
  def apply(
    endpoint: java.lang.String,
    nonce: java.lang.String = null,
    password: java.lang.String = null,
    routes: Routes = null,
    transport: Transport = null,
    username: java.lang.String = null
  ): WPAPIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endpoint")(endpoint)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (password != null) __obj.updateDynamic("password")(password)
    if (routes != null) __obj.updateDynamic("routes")(routes)
    if (transport != null) __obj.updateDynamic("transport")(transport)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[WPAPIOptions]
  }
}

