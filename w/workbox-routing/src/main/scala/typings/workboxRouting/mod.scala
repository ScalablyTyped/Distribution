package typings.workboxRouting

import typings.std.RegExp
import typings.workboxRouting.httpmethodMod.HTTPMethod
import typings.workboxRouting.navigationRouteMod.NavigationRouteOptions
import typings.workboxRouting.registerNavigationRouteMod.RegisterNavigationRouteOptions
import typings.workboxRouting.registerRouteMod.RegisterRouteCapture
import typings.workboxRouting.routeHandlerMod.RouteHandler
import typings.workboxRouting.routeMatchCallbackMod.RouteMatchCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-routing", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class NavigationRoute protected ()
    extends typings.workboxRouting.navigationRouteMod.NavigationRoute {
    def this(handler: RouteHandler) = this()
    def this(handler: RouteHandler, options: NavigationRouteOptions) = this()
  }
  
  @js.native
  class RegExpRoute protected ()
    extends typings.workboxRouting.regExpRouteMod.RegExpRoute {
    def this(regExp: RegExp, handler: RouteHandler) = this()
    def this(regExp: RegExp, handler: RouteHandler, method: HTTPMethod) = this()
  }
  
  @js.native
  class Route[MatchReturn] protected ()
    extends typings.workboxRouting.routeMod.Route[MatchReturn] {
    def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler) = this()
    def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler, method: HTTPMethod) = this()
  }
  
  @js.native
  class Router ()
    extends typings.workboxRouting.routerMod.Router
  
  def registerNavigationRoute(cachedAssetUrl: String): typings.workboxRouting.navigationRouteMod.NavigationRoute = js.native
  def registerNavigationRoute(cachedAssetUrl: String, options: RegisterNavigationRouteOptions): typings.workboxRouting.navigationRouteMod.NavigationRoute = js.native
  def registerRoute(capture: String): typings.workboxRouting.routeMod.Route[Boolean] = js.native
  def registerRoute(capture: String, handler: RouteHandler): typings.workboxRouting.routeMod.Route[Boolean] = js.native
  def registerRoute(capture: String, handler: RouteHandler, method: HTTPMethod): typings.workboxRouting.routeMod.Route[Boolean] = js.native
  def registerRoute(capture: RegExp): typings.workboxRouting.regExpRouteMod.RegExpRoute = js.native
  def registerRoute(capture: RegExp, handler: RouteHandler): typings.workboxRouting.regExpRouteMod.RegExpRoute = js.native
  def registerRoute(capture: RegExp, handler: RouteHandler, method: HTTPMethod): typings.workboxRouting.regExpRouteMod.RegExpRoute = js.native
  def registerRoute(capture: RegisterRouteCapture): typings.workboxRouting.routeMod.Route[_] = js.native
  def registerRoute(capture: RegisterRouteCapture, handler: RouteHandler): typings.workboxRouting.routeMod.Route[_] = js.native
  def registerRoute(capture: RegisterRouteCapture, handler: RouteHandler, method: HTTPMethod): typings.workboxRouting.routeMod.Route[_] = js.native
  def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn]): typings.workboxRouting.routeMod.Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: RouteHandler): typings.workboxRouting.routeMod.Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: RouteHandler, method: HTTPMethod): typings.workboxRouting.routeMod.Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](capture: typings.workboxRouting.routeMod.Route[MatchReturn]): typings.workboxRouting.routeMod.Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](capture: typings.workboxRouting.routeMod.Route[MatchReturn], handler: RouteHandler): typings.workboxRouting.routeMod.Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](
    capture: typings.workboxRouting.routeMod.Route[MatchReturn],
    handler: RouteHandler,
    method: HTTPMethod
  ): typings.workboxRouting.routeMod.Route[MatchReturn] = js.native
  def setCatchHandler(handler: RouteHandler): Unit = js.native
  def setDefaultHandler(handler: RouteHandler): Unit = js.native
}

