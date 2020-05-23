package typings.universalRouter.universalRouterSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteMatch[R, C /* <: RouterContext */] extends js.Object {
  var baseUrl: String
  var params: RouteParams
  var path: String
  var route: Route[R, C]
}

object RouteMatch {
  @scala.inline
  def apply[R, C](baseUrl: String, params: RouteParams, path: String, route: Route[R, C]): RouteMatch[R, C] = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteMatch[R, C]]
  }
}

