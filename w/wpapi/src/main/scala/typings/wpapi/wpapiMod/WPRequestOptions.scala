package typings.wpapi.wpapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WPRequestOptions extends Credentials {
  /** The URI for a WP-API endpoint */
  var endpoint: String
  /**
    * An dictionary of HTTP transport methods (.get, .post, .put,
    * .delete, .head) to use instead of the defaults, e.g. to use a
    * different HTTP library than superagent
    */
  var transport: js.UndefOr[Transport] = js.undefined
}

object WPRequestOptions {
  @scala.inline
  def apply(
    endpoint: String,
    nonce: String = null,
    password: String = null,
    transport: Transport = null,
    username: String = null
  ): WPRequestOptions = {
    val __obj = js.Dynamic.literal(endpoint = endpoint)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (password != null) __obj.updateDynamic("password")(password)
    if (transport != null) __obj.updateDynamic("transport")(transport)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[WPRequestOptions]
  }
}

