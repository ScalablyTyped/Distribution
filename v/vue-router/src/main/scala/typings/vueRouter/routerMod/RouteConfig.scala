package typings.vueRouter.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vueRouter.routerMod.RouteConfigSingleView
  - typings.vueRouter.routerMod.RouteConfigMultipleViews
*/
trait RouteConfig extends js.Object

object RouteConfig {
  @scala.inline
  def RouteConfigSingleView(path: String): RouteConfig = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteConfig]
  }
  @scala.inline
  def RouteConfigMultipleViews(path: String): RouteConfig = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteConfig]
  }
}

