package typings.workboxDashRouting

import typings.workboxDashRouting.typesHTTPMethodMod.HTTPMethod
import typings.workboxDashRouting.typesRouteHandlerMod.RouteHandler
import typings.workboxDashRouting.typesRouteMatchCallbackMod.RouteMatchCallback
import typings.workboxDashRouting.typesRouteMatchCallbackMod.RouteMatchCallbackOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-routing/Route", JSImport.Namespace)
@js.native
object routeMod extends js.Object {
  @js.native
  class Route[MatchReturn] protected () extends js.Object {
    def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler) = this()
    def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler, method: HTTPMethod) = this()
    val handler: RouteHandler = js.native
    val method: HTTPMethod = js.native
    def `match`(options: RouteMatchCallbackOptions): MatchReturn = js.native
  }
  
}

