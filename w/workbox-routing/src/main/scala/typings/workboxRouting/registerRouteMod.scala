package typings.workboxRouting

import typings.workboxCore.typesMod.RouteHandler
import typings.workboxCore.typesMod.RouteMatchCallback
import typings.workboxRouting.routeMod.Route
import typings.workboxRouting.utilsConstantsMod.HTTPMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerRouteMod {
  
  @JSImport("workbox-routing/registerRoute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerRoute(capture: String): Route = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[Route]
  inline def registerRoute(capture: String, handler: Unit, method: HTTPMethod): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Route]
  inline def registerRoute(capture: String, handler: RouteHandler): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Route]
  inline def registerRoute(capture: String, handler: RouteHandler, method: HTTPMethod): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Route]
  /**
    * Easily register a RegExp, string, or function with a caching
    * strategy to a singleton Router instance.
    *
    * This method will generate a Route for you if needed and
    * call {@link workbox-routing.Router#registerRoute}.
    *
    * @param {RegExp|string|workbox-routing.Route~matchCallback|workbox-routing.Route} capture
    * If the capture param is a `Route`, all other arguments will be ignored.
    * @param {workbox-routing~handlerCallback} [handler] A callback
    * function that returns a Promise resulting in a Response. This parameter
    * is required if `capture` is not a `Route` object.
    * @param {string} [method='GET'] The HTTP method to match the Route
    * against.
    * @return {workbox-routing.Route} The generated `Route`.
    *
    * @memberof workbox-routing
    */
  inline def registerRoute(capture: js.RegExp): Route = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[Route]
  inline def registerRoute(capture: js.RegExp, handler: Unit, method: HTTPMethod): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Route]
  inline def registerRoute(capture: js.RegExp, handler: RouteHandler): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Route]
  inline def registerRoute(capture: js.RegExp, handler: RouteHandler, method: HTTPMethod): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Route]
  inline def registerRoute(capture: RouteMatchCallback): Route = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[Route]
  inline def registerRoute(capture: RouteMatchCallback, handler: Unit, method: HTTPMethod): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Route]
  inline def registerRoute(capture: RouteMatchCallback, handler: RouteHandler): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Route]
  inline def registerRoute(capture: RouteMatchCallback, handler: RouteHandler, method: HTTPMethod): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Route]
  inline def registerRoute(capture: Route): Route = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[Route]
  inline def registerRoute(capture: Route, handler: Unit, method: HTTPMethod): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Route]
  inline def registerRoute(capture: Route, handler: RouteHandler): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Route]
  inline def registerRoute(capture: Route, handler: RouteHandler, method: HTTPMethod): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Route]
}
