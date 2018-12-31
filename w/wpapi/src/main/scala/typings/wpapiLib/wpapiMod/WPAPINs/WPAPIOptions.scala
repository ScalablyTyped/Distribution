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

