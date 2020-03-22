package typings.universalRouter.universalRouterSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteContext[R, C /* <: RouterContext */] extends ResolveContext {
  /**
    * Base URL path relative to the path of the current route.
    */
  var baseUrl: String = js.native
  /**
    * Matched path params.
    */
  var params: RouteParams = js.native
  /**
    * Matched path.
    */
  var path: String = js.native
  /**
    * Matched route object.
    */
  var route: Route[R, C] = js.native
  /**
    * Current router instance.
    */
  var router: UniversalRouterSync[R, C] = js.native
  /**
    * Middleware style function which can continue resolving.
    */
  def next(): RouteResultSync[R] = js.native
  def next(resume: Boolean): RouteResultSync[R] = js.native
}

