package typings.vueRouter.vueMod

import typings.vueRouter.mod.default
import typings.vueRouter.routerMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vue extends js.Object {
  @JSName("$route")
  var $route: Route
  @JSName("$router")
  var $router: default
}

object Vue {
  @scala.inline
  def apply($route: Route, $router: default): Vue = {
    val __obj = js.Dynamic.literal($route = $route.asInstanceOf[js.Any], $router = $router.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vue]
  }
}

