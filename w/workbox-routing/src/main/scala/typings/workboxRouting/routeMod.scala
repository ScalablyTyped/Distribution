package typings.workboxRouting

import typings.workboxRouting.httpmethodMod.HTTPMethod
import typings.workboxRouting.routeHandlerMod.RouteHandler
import typings.workboxRouting.routeMatchCallbackMod.RouteMatchCallback
import typings.workboxRouting.routeMatchCallbackMod.RouteMatchCallbackOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeMod {
  
  @JSImport("workbox-routing/Route", "Route")
  @js.native
  class Route[MatchReturn] protected () extends StObject {
    def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler) = this()
    def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler, method: HTTPMethod) = this()
    
    val handler: RouteHandler = js.native
    
    def `match`(options: RouteMatchCallbackOptions): MatchReturn = js.native
    
    val method: HTTPMethod = js.native
  }
}
