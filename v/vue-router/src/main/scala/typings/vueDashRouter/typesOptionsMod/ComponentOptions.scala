package typings.vueDashRouter.typesOptionsMod

import typings.vue.typesVueMod.Vue
import typings.vueDashRouter.typesMod.default
import typings.vueDashRouter.typesRouterMod.NavigationGuard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOptions[V /* <: Vue */] extends js.Object {
  var beforeRouteEnter: js.UndefOr[NavigationGuard[V]] = js.undefined
  var beforeRouteLeave: js.UndefOr[NavigationGuard[V]] = js.undefined
  var beforeRouteUpdate: js.UndefOr[NavigationGuard[V]] = js.undefined
  var router: js.UndefOr[default] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply[V /* <: Vue */](
    beforeRouteEnter: NavigationGuard[V] = null,
    beforeRouteLeave: NavigationGuard[V] = null,
    beforeRouteUpdate: NavigationGuard[V] = null,
    router: default = null
  ): ComponentOptions[V] = {
    val __obj = js.Dynamic.literal()
    if (beforeRouteEnter != null) __obj.updateDynamic("beforeRouteEnter")(beforeRouteEnter)
    if (beforeRouteLeave != null) __obj.updateDynamic("beforeRouteLeave")(beforeRouteLeave)
    if (beforeRouteUpdate != null) __obj.updateDynamic("beforeRouteUpdate")(beforeRouteUpdate)
    if (router != null) __obj.updateDynamic("router")(router)
    __obj.asInstanceOf[ComponentOptions[V]]
  }
}

