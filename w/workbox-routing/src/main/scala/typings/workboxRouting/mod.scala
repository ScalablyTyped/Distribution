package typings.workboxRouting

import typings.workboxRouting.httpmethodMod.HTTPMethod
import typings.workboxRouting.navigationRouteMod.NavigationRouteOptions
import typings.workboxRouting.registerNavigationRouteMod.RegisterNavigationRouteOptions
import typings.workboxRouting.registerRouteMod.RegisterRouteCapture
import typings.workboxRouting.routeHandlerMod.RouteHandler
import typings.workboxRouting.routeMatchCallbackMod.RouteMatchCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-routing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("workbox-routing", "NavigationRoute")
  @js.native
  open class NavigationRoute protected ()
    extends typings.workboxRouting.navigationRouteMod.NavigationRoute {
    def this(handler: RouteHandler) = this()
    def this(handler: RouteHandler, options: NavigationRouteOptions) = this()
  }
  
  @JSImport("workbox-routing", "RegExpRoute")
  @js.native
  open class RegExpRoute protected ()
    extends typings.workboxRouting.regExpRouteMod.RegExpRoute {
    def this(regExp: js.RegExp, handler: RouteHandler) = this()
    def this(regExp: js.RegExp, handler: RouteHandler, method: HTTPMethod) = this()
  }
  
  @JSImport("workbox-routing", "Route")
  @js.native
  open class Route[MatchReturn] protected ()
    extends typings.workboxRouting.routeMod.Route[MatchReturn] {
    def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler) = this()
    def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler, method: HTTPMethod) = this()
  }
  
  @JSImport("workbox-routing", "Router")
  @js.native
  open class Router ()
    extends typings.workboxRouting.routerMod.Router
  
  inline def registerNavigationRoute(cachedAssetUrl: String): typings.workboxRouting.navigationRouteMod.NavigationRoute = ^.asInstanceOf[js.Dynamic].applyDynamic("registerNavigationRoute")(cachedAssetUrl.asInstanceOf[js.Any]).asInstanceOf[typings.workboxRouting.navigationRouteMod.NavigationRoute]
  inline def registerNavigationRoute(cachedAssetUrl: String, options: RegisterNavigationRouteOptions): typings.workboxRouting.navigationRouteMod.NavigationRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("registerNavigationRoute")(cachedAssetUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.navigationRouteMod.NavigationRoute]
  
  inline def registerRoute(capture: String): typings.workboxRouting.routeMod.Route[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[typings.workboxRouting.routeMod.Route[Boolean]]
  inline def registerRoute(capture: String, handler: Unit, method: HTTPMethod): typings.workboxRouting.routeMod.Route[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route[Boolean]]
  inline def registerRoute(capture: String, handler: RouteHandler): typings.workboxRouting.routeMod.Route[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route[Boolean]]
  inline def registerRoute(capture: String, handler: RouteHandler, method: HTTPMethod): typings.workboxRouting.routeMod.Route[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route[Boolean]]
  inline def registerRoute(capture: js.RegExp): typings.workboxRouting.regExpRouteMod.RegExpRoute = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[typings.workboxRouting.regExpRouteMod.RegExpRoute]
  inline def registerRoute(capture: js.RegExp, handler: Unit, method: HTTPMethod): typings.workboxRouting.regExpRouteMod.RegExpRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.regExpRouteMod.RegExpRoute]
  inline def registerRoute(capture: js.RegExp, handler: RouteHandler): typings.workboxRouting.regExpRouteMod.RegExpRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.regExpRouteMod.RegExpRoute]
  inline def registerRoute(capture: js.RegExp, handler: RouteHandler, method: HTTPMethod): typings.workboxRouting.regExpRouteMod.RegExpRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.regExpRouteMod.RegExpRoute]
  inline def registerRoute(capture: RegisterRouteCapture): typings.workboxRouting.routeMod.Route[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[typings.workboxRouting.routeMod.Route[Any]]
  inline def registerRoute(capture: RegisterRouteCapture, handler: Unit, method: HTTPMethod): typings.workboxRouting.routeMod.Route[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route[Any]]
  inline def registerRoute(capture: RegisterRouteCapture, handler: RouteHandler): typings.workboxRouting.routeMod.Route[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route[Any]]
  inline def registerRoute(capture: RegisterRouteCapture, handler: RouteHandler, method: HTTPMethod): typings.workboxRouting.routeMod.Route[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route[Any]]
  inline def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn]): typings.workboxRouting.routeMod.Route[MatchReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[typings.workboxRouting.routeMod.Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: Unit, method: HTTPMethod): typings.workboxRouting.routeMod.Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: RouteHandler): typings.workboxRouting.routeMod.Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: RouteHandler, method: HTTPMethod): typings.workboxRouting.routeMod.Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: typings.workboxRouting.routeMod.Route[MatchReturn]): typings.workboxRouting.routeMod.Route[MatchReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[typings.workboxRouting.routeMod.Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: typings.workboxRouting.routeMod.Route[MatchReturn], handler: Unit, method: HTTPMethod): typings.workboxRouting.routeMod.Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: typings.workboxRouting.routeMod.Route[MatchReturn], handler: RouteHandler): typings.workboxRouting.routeMod.Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route[MatchReturn]]
  inline def registerRoute[MatchReturn](
    capture: typings.workboxRouting.routeMod.Route[MatchReturn],
    handler: RouteHandler,
    method: HTTPMethod
  ): typings.workboxRouting.routeMod.Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route[MatchReturn]]
  
  inline def setCatchHandler(handler: RouteHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCatchHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setDefaultHandler(handler: RouteHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
