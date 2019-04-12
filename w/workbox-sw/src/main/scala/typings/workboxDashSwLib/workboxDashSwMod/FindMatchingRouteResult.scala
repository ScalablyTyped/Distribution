package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindMatchingRouteResult extends js.Object {
  var params: stdLib.URLSearchParams
  var route: Route
}

object FindMatchingRouteResult {
  @scala.inline
  def apply(params: stdLib.URLSearchParams, route: Route): FindMatchingRouteResult = {
    val __obj = js.Dynamic.literal(params = params, route = route)
  
    __obj.asInstanceOf[FindMatchingRouteResult]
  }
}

