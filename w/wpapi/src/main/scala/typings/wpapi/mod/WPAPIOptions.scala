package typings.wpapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WPAPIOptions extends Credentials {
  /** The URI for a WP-API endpoint */
  var endpoint: String
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
    endpoint: String,
    nonce: String = null,
    password: String = null,
    routes: Routes = null,
    transport: Transport = null,
    username: String = null
  ): WPAPIOptions = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[WPAPIOptions]
  }
}

