package typings.workboxRouting

import typings.std.RegExp
import typings.workboxRouting.httpmethodMod.HTTPMethod
import typings.workboxRouting.regExpRouteMod.RegExpRoute
import typings.workboxRouting.routeHandlerMod.RouteHandler
import typings.workboxRouting.routeMatchCallbackMod.RouteMatchCallback
import typings.workboxRouting.routeMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerRouteMod {
  
  @JSImport("workbox-routing/registerRoute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerRoute(capture: String): Route[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[Route[Boolean]]
  inline def registerRoute(capture: String, handler: Unit, method: HTTPMethod): Route[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Route[Boolean]]
  inline def registerRoute(capture: String, handler: RouteHandler): Route[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Route[Boolean]]
  inline def registerRoute(capture: String, handler: RouteHandler, method: HTTPMethod): Route[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Route[Boolean]]
  inline def registerRoute(capture: RegExp): RegExpRoute = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[RegExpRoute]
  inline def registerRoute(capture: RegExp, handler: Unit, method: HTTPMethod): RegExpRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RegExpRoute]
  inline def registerRoute(capture: RegExp, handler: RouteHandler): RegExpRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[RegExpRoute]
  inline def registerRoute(capture: RegExp, handler: RouteHandler, method: HTTPMethod): RegExpRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RegExpRoute]
  inline def registerRoute(capture: RegisterRouteCapture): Route[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[Route[js.Any]]
  inline def registerRoute(capture: RegisterRouteCapture, handler: Unit, method: HTTPMethod): Route[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Route[js.Any]]
  inline def registerRoute(capture: RegisterRouteCapture, handler: RouteHandler): Route[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Route[js.Any]]
  inline def registerRoute(capture: RegisterRouteCapture, handler: RouteHandler, method: HTTPMethod): Route[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Route[js.Any]]
  inline def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn]): Route[MatchReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: Unit, method: HTTPMethod): Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: RouteHandler): Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: RouteHandler, method: HTTPMethod): Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: Route[MatchReturn]): Route[MatchReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: Route[MatchReturn], handler: Unit, method: HTTPMethod): Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: Route[MatchReturn], handler: RouteHandler): Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: Route[MatchReturn], handler: RouteHandler, method: HTTPMethod): Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Route[MatchReturn]]
  
  type RegisterRouteCapture = String | RegExp | RouteMatchCallback[js.Any] | Route[js.Any]
}
