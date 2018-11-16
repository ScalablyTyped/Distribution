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

