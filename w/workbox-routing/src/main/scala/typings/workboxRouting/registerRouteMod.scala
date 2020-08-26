package typings.workboxRouting

import typings.std.RegExp
import typings.workboxRouting.httpmethodMod.HTTPMethod
import typings.workboxRouting.regExpRouteMod.RegExpRoute
import typings.workboxRouting.routeHandlerMod.RouteHandler
import typings.workboxRouting.routeMatchCallbackMod.RouteMatchCallback
import typings.workboxRouting.routeMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-routing/registerRoute", JSImport.Namespace)
@js.native
object registerRouteMod extends js.Object {
  def registerRoute(capture: String): Route[Boolean] = js.native
  def registerRoute(capture: String, handler: js.UndefOr[RouteHandler], method: HTTPMethod): Route[Boolean] = js.native
  def registerRoute(capture: String, handler: RouteHandler): Route[Boolean] = js.native
  def registerRoute(capture: RegExp): RegExpRoute = js.native
  def registerRoute(capture: RegExp, handler: js.UndefOr[RouteHandler], method: HTTPMethod): RegExpRoute = js.native
  def registerRoute(capture: RegExp, handler: RouteHandler): RegExpRoute = js.native
  def registerRoute(capture: RegisterRouteCapture): Route[_] = js.native
  def registerRoute(capture: RegisterRouteCapture, handler: js.UndefOr[RouteHandler], method: HTTPMethod): Route[_] = js.native
  def registerRoute(capture: RegisterRouteCapture, handler: RouteHandler): Route[_] = js.native
  def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn]): Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: js.UndefOr[RouteHandler], method: HTTPMethod): Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: RouteHandler): Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](capture: Route[MatchReturn]): Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](capture: Route[MatchReturn], handler: js.UndefOr[RouteHandler], method: HTTPMethod): Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](capture: Route[MatchReturn], handler: RouteHandler): Route[MatchReturn] = js.native
  type RegisterRouteCapture = String | RegExp | RouteMatchCallback[js.Any] | Route[js.Any]
}

