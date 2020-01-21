package typings.workboxRouting.routerMod

import typings.std.Map
import typings.std.Response
import typings.workboxRouting.httpmethodMod.HTTPMethod
import typings.workboxRouting.routeHandlerMod.RouteHandler
import typings.workboxRouting.routeMod.Route
import typings.workboxRouting.routerMod.Router.FindMatchingRouteOptions
import typings.workboxRouting.routerMod.Router.FindMatchingRouteReturn
import typings.workboxRouting.routerMod.Router.HandleRequestOptions
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

