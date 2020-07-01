package typings.vueRouter.optionsMod

import typings.vue.vueMod.Vue
import typings.vueRouter.mod.default
import typings.vueRouter.routerMod.NavigationGuard
import typings.vueRouter.routerMod.NavigationGuardNext
import typings.vueRouter.routerMod.Route
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
  def apply[/* <: typings.vue.vueMod.Vue */ V](
    beforeRouteEnter: (/* to */ Route, /* from */ Route, /* next */ NavigationGuardNext[V]) => js.Any = null,
    beforeRouteLeave: (/* to */ Route, /* from */ Route, /* next */ NavigationGuardNext[V]) => js.Any = null,
    beforeRouteUpdate: (/* to */ Route, /* from */ Route, /* next */ NavigationGuardNext[V]) => js.Any = null,
    router: default = null
  ): ComponentOptions[V] = {
    val __obj = js.Dynamic.literal()
    if (beforeRouteEnter != null) __obj.updateDynamic("beforeRouteEnter")(js.Any.fromFunction3(beforeRouteEnter))
    if (beforeRouteLeave != null) __obj.updateDynamic("beforeRouteLeave")(js.Any.fromFunction3(beforeRouteLeave))
    if (beforeRouteUpdate != null) __obj.updateDynamic("beforeRouteUpdate")(js.Any.fromFunction3(beforeRouteUpdate))
    if (router != null) __obj.updateDynamic("router")(router.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptions[V]]
  }
}

