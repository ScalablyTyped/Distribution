package typings.workboxRouting

import typings.workboxRouting.regExpRouteMod.RegExpRoute
import typings.workboxRouting.routeMod.Route
import typings.workboxRouting.typesHttpmethodMod.HTTPMethod
import typings.workboxRouting.typesRouteHandlerMod.RouteHandler
import typings.workboxRouting.typesRouteMatchCallbackMod.RouteMatchCallback
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
  inline def registerRoute(capture: js.RegExp): RegExpRoute = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[RegExpRoute]
  inline def registerRoute(capture: js.RegExp, handler: Unit, method: HTTPMethod): RegExpRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RegExpRoute]
  inline def registerRoute(capture: js.RegExp, handler: RouteHandler): RegExpRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[RegExpRoute]
  inline def registerRoute(capture: js.RegExp, handler: RouteHandler, method: HTTPMethod): RegExpRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RegExpRoute]
  inline def registerRoute(capture: RegisterRouteCapture): Route[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[Route[Any]]
  inline def registerRoute(capture: RegisterRouteCapture, handler: Unit, method: HTTPMethod): Route[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Route[Any]]
  inline def registerRoute(capture: RegisterRouteCapture, handler: RouteHandler): Route[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Route[Any]]
  inline def registerRoute(capture: RegisterRouteCapture, handler: RouteHandler, method: HTTPMethod): Route[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Route[Any]]
  inline def registerRoute[MatchReturn](capture: Route[MatchReturn]): Route[MatchReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: Route[MatchReturn], handler: Unit, method: HTTPMethod): Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: Route[MatchReturn], handler: RouteHandler): Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: Route[MatchReturn], handler: RouteHandler, method: HTTPMethod): Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn]): Route[MatchReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: Unit, method: HTTPMethod): Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: RouteHandler): Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: RouteHandler, method: HTTPMethod): Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Route[MatchReturn]]
  
  type RegisterRouteCapture = String | js.RegExp | RouteMatchCallback[Any] | Route[Any]
}
