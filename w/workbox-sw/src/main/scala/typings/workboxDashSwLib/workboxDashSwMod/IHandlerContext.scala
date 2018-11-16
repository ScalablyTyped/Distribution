package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * ===== HandlerCallback =====
 */


trait IHandlerContext extends IMatchContext {
  /**
  	 * Parameters returned by the Route's match callback function. This will be undefined if nothing was returned.
  	 */
  var params: js.UndefOr[js.Object] = js.undefined
}

