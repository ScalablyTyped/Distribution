package typings.workboxRouting

import typings.workboxRouting.typesHttpmethodMod.HTTPMethod
import typings.workboxRouting.typesRouteHandlerMod.RouteHandler
import typings.workboxRouting.typesRouteMatchCallbackMod.RouteMatchCallback
import typings.workboxRouting.typesRouteMatchCallbackMod.RouteMatchCallbackOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeMod {
  
  @JSImport("workbox-routing/Route", "Route")
  @js.native
  open class Route[MatchReturn] protected () extends StObject {
    def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler) = this()
    def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler, method: HTTPMethod) = this()
    
    val handler: RouteHandler = js.native
    
    def `match`(options: RouteMatchCallbackOptions): MatchReturn = js.native
    
    val method: HTTPMethod = js.native
  }
}
