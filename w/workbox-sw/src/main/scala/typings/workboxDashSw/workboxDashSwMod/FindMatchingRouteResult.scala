package typings.workboxDashSw.workboxDashSwMod

import typings.std.URLSearchParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindMatchingRouteResult extends js.Object {
  var params: URLSearchParams
  var route: Route
}

object FindMatchingRouteResult {
  @scala.inline
  def apply(params: URLSearchParams, route: Route): FindMatchingRouteResult = {
    val __obj = js.Dynamic.literal(params = params, route = route)
  
    __obj.asInstanceOf[FindMatchingRouteResult]
  }
}

