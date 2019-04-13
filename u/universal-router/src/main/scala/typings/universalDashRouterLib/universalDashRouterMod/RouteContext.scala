package typings
package universalDashRouterLib.universalDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteContext[C /* <: Context */, R] extends ResolveContext {
  var baseUrl: java.lang.String = js.native
  var keys: js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.Key] = js.native
  var params: Params = js.native
  var path: java.lang.String = js.native
  var route: Route[_, _] = js.native
  var router: UniversalRouter[C, R] = js.native
  def next(): js.Promise[R] = js.native
  def next(resume: scala.Boolean): js.Promise[R] = js.native
}

