package typings.workboxDashRouting.routerMod

import typings.std.Map
import typings.std.Response
import typings.workboxDashRouting.routeMod.Route
import typings.workboxDashRouting.routerMod.Router.FindMatchingRouteOptions
import typings.workboxDashRouting.routerMod.Router.FindMatchingRouteReturn
import typings.workboxDashRouting.routerMod.Router.HandleRequestOptions
import typings.workboxDashRouting.typesHTTPMethodMod.HTTPMethod
import typings.workboxDashRouting.typesRouteHandlerMod.RouteHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-routing/Router", "Router")
@js.native
class Router_ () extends js.Object {
  val routes: Map[HTTPMethod, js.Array[Route[_]]] = js.native
  def addCacheListener(): Unit = js.native
  def addFetchListener(): Unit = js.native
  def findMatchingRoute(options: FindMatchingRouteOptions): js.Object | FindMatchingRouteReturn[_] = js.native
  def handleRequest(options: HandleRequestOptions): js.Promise[js.UndefOr[Response]] = js.native
  def registerRoute(route: Route[_]): Unit = js.native
  def setCatchHandler(handler: RouteHandler): Unit = js.native
  def setDefaultHandler(handler: RouteHandler): Unit = js.native
  def unregisterRoute(route: Route[_]): Unit = js.native
}

