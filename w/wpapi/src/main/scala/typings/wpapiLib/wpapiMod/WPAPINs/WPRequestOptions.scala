package typings
package wpapiLib.wpapiMod.WPAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WPRequestOptions extends Credentials {
  /** The URI for a WP-API endpoint */
  var endpoint: java.lang.String
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
    endpoint: java.lang.String,
    nonce: java.lang.String = null,
    password: java.lang.String = null,
    transport: Transport = null,
    username: java.lang.String = null
  ): WPRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endpoint")(endpoint)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (password != null) __obj.updateDynamic("password")(password)
    if (transport != null) __obj.updateDynamic("transport")(transport)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[WPRequestOptions]
  }
}

