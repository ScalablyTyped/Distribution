package typings.vueRouter.optionsMod

import typings.vue.vueMod.Vue
import typings.vueRouter.mod.default
import typings.vueRouter.routerMod.NavigationGuard
import typings.vueRouter.routerMod.NavigationGuardNext
import typings.vueRouter.routerMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentOptions[V /* <: Vue */] extends js.Object {
  var beforeRouteEnter: js.UndefOr[NavigationGuard[V]] = js.native
  var beforeRouteLeave: js.UndefOr[NavigationGuard[V]] = js.native
  var beforeRouteUpdate: js.UndefOr[NavigationGuard[V]] = js.native
  var router: js.UndefOr[default] = js.native
}

object ComponentOptions {
  @scala.inline
  def apply[/* <: typings.vue.vueMod.Vue */ V](): ComponentOptions[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOptions[V]]
  }
  @scala.inline
  implicit class ComponentOptionsOps[Self <: ComponentOptions[_], /* <: typings.vue.vueMod.Vue */ V] (val x: Self with ComponentOptions[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBeforeRouteEnter(value: (/* to */ Route, /* from */ Route, /* next */ NavigationGuardNext[V]) => js.Any): Self = this.set("beforeRouteEnter", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeRouteEnter: Self = this.set("beforeRouteEnter", js.undefined)
    @scala.inline
    def setBeforeRouteLeave(value: (/* to */ Route, /* from */ Route, /* next */ NavigationGuardNext[V]) => js.Any): Self = this.set("beforeRouteLeave", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeRouteLeave: Self = this.set("beforeRouteLeave", js.undefined)
    @scala.inline
    def setBeforeRouteUpdate(value: (/* to */ Route, /* from */ Route, /* next */ NavigationGuardNext[V]) => js.Any): Self = this.set("beforeRouteUpdate", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeRouteUpdate: Self = this.set("beforeRouteUpdate", js.undefined)
    @scala.inline
    def setRouter(value: default): Self = this.set("router", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouter: Self = this.set("router", js.undefined)
  }
  
}

