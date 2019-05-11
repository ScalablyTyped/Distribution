package typings
package universalDashRouterLib.universalDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UniversalRouter[C /* <: Context */, R] extends js.Object {
  var baseUrl: java.lang.String = js.native
  var context: C with (universalDashRouterLib.Anon_Router[C, R]) = js.native
  var errorHandler: js.UndefOr[ErrorHandler[C, R]] = js.native
  @JSName("resolveRoute")
  var resolveRoute_Original: ResolveRoute[C, R] = js.native
  var root: Route[C, R] = js.native
  var routesByName: js.UndefOr[stdLib.Map[java.lang.String, Route[C, R]]] = js.native
  def resolve(pathnameOrContext: java.lang.String): js.Promise[R] = js.native
  def resolve(pathnameOrContext: ResolveContext): js.Promise[R] = js.native
  def resolveRoute(context: C with (RouteContext[C, R]), params: QueryParams): Result[R] = js.native
}

