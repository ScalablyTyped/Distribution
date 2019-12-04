package typings.universalDashRouter.srcUniversalRouterSyncMod

import typings.pathDashToDashRegexp.pathDashToDashRegexpMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteContext[C /* <: Context */, R] extends ResolveContext {
  var baseUrl: String = js.native
  var keys: js.Array[Key] = js.native
  var params: QueryParams = js.native
  var path: String = js.native
  var route: Route[C, R] = js.native
  var router: UniversalRouter[C, R] = js.native
  def next(): R = js.native
  def next(resume: Boolean): R = js.native
}

