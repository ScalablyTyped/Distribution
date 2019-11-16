package typings.workboxDashRouting

import typings.std.RegExp
import typings.workboxDashRouting.routeMod.Route
import typings.workboxDashRouting.typesHTTPMethodMod.HTTPMethod
import typings.workboxDashRouting.typesRouteHandlerMod.RouteHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-routing/RegExpRoute", JSImport.Namespace)
@js.native
object regExpRouteMod extends js.Object {
  @js.native
  class RegExpRoute protected ()
    extends Route[js.Array[String]] {
    def this(regExp: RegExp, handler: RouteHandler) = this()
    def this(regExp: RegExp, handler: RouteHandler, method: HTTPMethod) = this()
  }
  
}

