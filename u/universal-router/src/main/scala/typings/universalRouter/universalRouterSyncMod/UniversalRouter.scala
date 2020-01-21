package typings.universalRouter.universalRouterSyncMod

import typings.std.Map
import typings.universalRouter.AnonRouterC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UniversalRouter[C /* <: Context */, R] extends js.Object {
  var baseUrl: String = js.native
  var context: C with (AnonRouterC[C, R]) = js.native
  var errorHandler: js.UndefOr[ErrorHandler[C, R]] = js.native
  @JSName("resolveRoute")
  var resolveRoute_Original: ResolveRoute[C, R] = js.native
  var root: Route[C, R] = js.native
  var routesByName: js.UndefOr[Map[String, Route[C, R]]] = js.native
  def resolve(pathnameOrContext: String): R = js.native
  def resolve(pathnameOrContext: ResolveContext): R = js.native
  def resolveRoute(context: C with (RouteContext[C, R]), params: QueryParams): Result[R] = js.native
}

