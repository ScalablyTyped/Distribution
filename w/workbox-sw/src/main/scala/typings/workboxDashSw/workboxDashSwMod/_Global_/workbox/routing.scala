package typings.workboxDashSw.workboxDashSwMod._Global_.workbox

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.RegExp
import typings.workboxDashRouting.registerNavigationRouteMod.RegisterNavigationRouteOptions
import typings.workboxDashRouting.registerRouteMod.RegisterRouteCapture
import typings.workboxDashRouting.typesHTTPMethodMod.HTTPMethod
import typings.workboxDashRouting.typesRouteHandlerMod.RouteHandler
import typings.workboxDashRouting.typesRouteMatchCallbackMod.RouteMatchCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("workbox.routing")
@js.native
object routing extends js.Object {
  @js.native
  class NavigationRoute protected ()
    extends typings.workboxDashRouting.workboxDashRoutingMod.NavigationRoute {
    def this(handler: RouteHandler) = this()
  }
  
  @js.native
  class RegExpRoute protected ()
    extends typings.workboxDashRouting.workboxDashRoutingMod.RegExpRoute {
    def this(regExp: RegExp, handler: RouteHandler) = this()
  }
  
  @js.native
  class Route[MatchReturn] protected ()
    extends typings.workboxDashRouting.workboxDashRoutingMod.Route[MatchReturn] {
    def this(
      `match`: RouteMatchCallback[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam MatchReturn */ _
          ],
      handler: RouteHandler
    ) = this()
  }
  
  @js.native
  class Router ()
    extends typings.workboxDashRouting.workboxDashRoutingMod.Router
  
  var NavigationRoute: Instantiable1[
    /* handler */ RouteHandler, 
    typings.workboxDashRouting.workboxDashRoutingMod.NavigationRoute
  ] = js.native
  var RegExpRoute: Instantiable2[
    /* regExp */ RegExp, 
    /* handler */ RouteHandler, 
    typings.workboxDashRouting.workboxDashRoutingMod.RegExpRoute
  ] = js.native
  var Route: Instantiable2[
    /* match */ RouteMatchCallback[
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam MatchReturn */ js.Any
    ], 
    /* handler */ RouteHandler, 
    typings.workboxDashRouting.workboxDashRoutingMod.Route[js.Object]
  ] = js.native
  var Router: js.Any | Instantiable0[typings.workboxDashRouting.workboxDashRoutingMod.Router] = js.native
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

