package typings.vuexI18n.mod.vueTypesVueAugmentingMod

import typings.vuexI18n.mod.Ii18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueConstructor[V /* <: Vue */] extends js.Object {
  var i18n: Ii18n
}

object VueConstructor {
  @scala.inline
  def apply[V /* <: Vue */](i18n: Ii18n): VueConstructor[V] = {
    val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueConstructor[V]]
  }
}

