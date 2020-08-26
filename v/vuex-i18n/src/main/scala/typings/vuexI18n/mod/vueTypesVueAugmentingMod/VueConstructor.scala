package typings.vuexI18n.mod.vueTypesVueAugmentingMod

import typings.vuexI18n.mod.Ii18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueConstructor[V /* <: Vue */] extends js.Object {
  var i18n: Ii18n = js.native
}

object VueConstructor {
  @scala.inline
  def apply[/* <: typings.vuexI18n.mod.vueTypesVueAugmentingMod.Vue */ V](i18n: Ii18n): VueConstructor[V] = {
    val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueConstructor[V]]
  }
  @scala.inline
  implicit class VueConstructorOps[Self <: VueConstructor[_], /* <: typings.vuexI18n.mod.vueTypesVueAugmentingMod.Vue */ V] (val x: Self with VueConstructor[V]) extends AnyVal {
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
    def setI18n(value: Ii18n): Self = this.set("i18n", value.asInstanceOf[js.Any])
  }
  
}

