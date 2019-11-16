package typings.workboxDashRouting

import typings.std.RegExp
import typings.workboxDashRouting.navigationRouteMod.NavigationRouteOptions
import typings.workboxDashRouting.registerNavigationRouteMod.RegisterNavigationRouteOptions
import typings.workboxDashRouting.registerRouteMod.RegisterRouteCapture
import typings.workboxDashRouting.typesHTTPMethodMod.HTTPMethod
import typings.workboxDashRouting.typesRouteHandlerMod.RouteHandler
import typings.workboxDashRouting.typesRouteMatchCallbackMod.RouteMatchCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-routing", JSImport.Namespace)
@js.native
object workboxDashRoutingMod extends js.Object {
  @js.native
  class NavigationRoute protected ()
    extends typings.workboxDashRouting.navigationRouteMod.NavigationRoute {
    def this(handler: RouteHandler) = this()
    def this(handler: RouteHandler, options: NavigationRouteOptions) = this()
  }
  
  @js.native
  class RegExpRoute protected ()
    extends typings.workboxDashRouting.regExpRouteMod.RegExpRoute {
    def this(regExp: RegExp, handler: RouteHandler) = this()
    def this(regExp: RegExp, handler: RouteHandler, method: HTTPMethod) = this()
  }
  
  @js.native
  class Route[MatchReturn] protected ()
    extends typings.workboxDashRouting.routeMod.Route[MatchReturn] {
    def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler) = this()
    def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler, method: HTTPMethod) = this()
  }
  
  @js.native
  class Router ()
    extends typings.workboxDashRouting.routerMod.Router
  
  def registerNavigationRoute(cachedAssetUrl: String): typings.workboxDashRouting.navigationRouteMod.NavigationRoute = js.native
  def registerNavigationRoute(cachedAssetUrl: String, options: RegisterNavigationRouteOptions): typings.workboxDashRouting.navigationRouteMod.NavigationRoute = js.native
  def registerRoute(capture: String): typings.workboxDashRouting.routeMod.Route[Boolean] = js.native
  def registerRoute(capture: String, handler: RouteHandler): typings.workboxDashRouting.routeMod.Route[Boolean] = js.native
  def registerRoute(capture: String, handler: RouteHandler, method: HTTPMethod): typings.workboxDashRouting.routeMod.Route[Boolean] = js.native
  def registerRoute(capture: RegExp): typings.workboxDashRouting.regExpRouteMod.RegExpRoute = js.native
  def registerRoute(capture: RegExp, handler: RouteHandler): typings.workboxDashRouting.regExpRouteMod.RegExpRoute = js.native
  def registerRoute(capture: RegExp, handler: RouteHandler, method: HTTPMethod): typings.workboxDashRouting.regExpRouteMod.RegExpRoute = js.native
  def registerRoute(capture: RegisterRouteCapture): typings.workboxDashRouting.routeMod.Route[_] = js.native
  def registerRoute(capture: RegisterRouteCapture, handler: RouteHandler): typings.workboxDashRouting.routeMod.Route[_] = js.native
  def registerRoute(capture: RegisterRouteCapture, handler: RouteHandler, method: HTTPMethod): typings.workboxDashRouting.routeMod.Route[_] = js.native
  def registerRoute[MatchReturn](capture: typings.workboxDashRouting.routeMod.Route[MatchReturn]): typings.workboxDashRouting.routeMod.Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](capture: typings.workboxDashRouting.routeMod.Route[MatchReturn], handler: RouteHandler): typings.workboxDashRouting.routeMod.Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](
    capture: typings.workboxDashRouting.routeMod.Route[MatchReturn],
    handler: RouteHandler,
    method: HTTPMethod
  ): typings.workboxDashRouting.routeMod.Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn]): typings.workboxDashRouting.routeMod.Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: RouteHandler): typings.workboxDashRouting.routeMod.Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: RouteHandler, method: HTTPMethod): typings.workboxDashRouting.routeMod.Route[MatchReturn] = js.native
  def setCatchHandler(handler: RouteHandler): Unit = js.native
  def setDefaultHandler(handler: RouteHandler): Unit = js.native
}

