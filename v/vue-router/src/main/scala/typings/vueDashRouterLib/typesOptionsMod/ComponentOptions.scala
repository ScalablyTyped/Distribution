package typings
package vueDashRouterLib.typesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOptions[V /* <: vueLib.typesVueMod.Vue */] extends js.Object {
  var beforeRouteEnter: js.UndefOr[vueDashRouterLib.typesRouterMod.NavigationGuard[V]] = js.undefined
  var beforeRouteLeave: js.UndefOr[vueDashRouterLib.typesRouterMod.NavigationGuard[V]] = js.undefined
  var beforeRouteUpdate: js.UndefOr[vueDashRouterLib.typesRouterMod.NavigationGuard[V]] = js.undefined
  var router: js.UndefOr[vueDashRouterLib.typesMod.default] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply[V /* <: vueLib.typesVueMod.Vue */](
    beforeRouteEnter: vueDashRouterLib.typesRouterMod.NavigationGuard[V] = null,
    beforeRouteLeave: vueDashRouterLib.typesRouterMod.NavigationGuard[V] = null,
    beforeRouteUpdate: vueDashRouterLib.typesRouterMod.NavigationGuard[V] = null,
    router: vueDashRouterLib.typesMod.default = null
  ): ComponentOptions[V] = {
    val __obj = js.Dynamic.literal()
    if (beforeRouteEnter != null) __obj.updateDynamic("beforeRouteEnter")(beforeRouteEnter)
    if (beforeRouteLeave != null) __obj.updateDynamic("beforeRouteLeave")(beforeRouteLeave)
    if (beforeRouteUpdate != null) __obj.updateDynamic("beforeRouteUpdate")(beforeRouteUpdate)
    if (router != null) __obj.updateDynamic("router")(router)
    __obj.asInstanceOf[ComponentOptions[V]]
  }
}

