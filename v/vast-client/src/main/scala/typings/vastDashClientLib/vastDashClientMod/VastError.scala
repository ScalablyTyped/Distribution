package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastError extends js.Object {
  /**
    * Whenever an error occurs during the VAST parsing, the parser will call on his own all related tracking error URLs. Reported errors are:
    *      no_ad: The VAST document is empty
    *      VAST error 101: VAST schema validation error.
    *      VAST error 301: Timeout of VAST URI provided in Wrapper element.
    *      VAST error 302: Wrapper limit reached.
    *      VAST error 303: No VAST response after one or more Wrappers.
    */
  var ERRORCODE: java.lang.String
}

