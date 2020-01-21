package typings.workboxRouting

import typings.workboxRouting.httpmethodMod.HTTPMethod
import typings.workboxRouting.routeHandlerMod.RouteHandler
import typings.workboxRouting.routeMatchCallbackMod.RouteMatchCallback
import typings.workboxRouting.routeMatchCallbackMod.RouteMatchCallbackOptions
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

