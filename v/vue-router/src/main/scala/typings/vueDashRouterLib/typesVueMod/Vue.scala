package typings
package vueDashRouterLib.typesVueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vue extends js.Object {
  @JSName("$route")
  var $route: vueDashRouterLib.typesRouterMod.Route
  @JSName("$router")
  var $router: vueDashRouterLib.typesMod.default
}

object Vue {
  @scala.inline
  def apply($route: vueDashRouterLib.typesRouterMod.Route, $router: vueDashRouterLib.typesMod.default): Vue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$route")($route)
    __obj.updateDynamic("$router")($router)
    __obj.asInstanceOf[Vue]
  }
}

