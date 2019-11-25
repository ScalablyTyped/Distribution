package typings.workboxDashRouting.routerMod.Router

import typings.workboxDashRouting.routeMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindMatchingRouteReturn[MatchReturn] extends js.Object {
  var params: js.Any
   // Exclude<MatchReturn, Falsy> | undefined; <-- TypeScript 2.8
  var route: Route[MatchReturn]
}

object FindMatchingRouteReturn {
  @scala.inline
  def apply[MatchReturn](params: js.Any, route: Route[MatchReturn]): FindMatchingRouteReturn[MatchReturn] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FindMatchingRouteReturn[MatchReturn]]
  }
}

