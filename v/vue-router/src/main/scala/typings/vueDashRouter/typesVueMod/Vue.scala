package typings.vueDashRouter.typesVueMod

import typings.vueDashRouter.typesMod.default
import typings.vueDashRouter.typesRouterMod.Route
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
    val __obj = js.Dynamic.literal($route = $route, $router = $router)
  
    __obj.asInstanceOf[Vue]
  }
}

