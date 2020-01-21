package typings.universalRouter.mod

import typings.pathToRegexp.mod.Key
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
  def next(): js.Promise[R] = js.native
  def next(resume: Boolean): js.Promise[R] = js.native
}

