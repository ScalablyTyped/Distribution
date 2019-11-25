package typings.vuexDashI18n.vuexDashI18nMod.typesVueMod

import typings.vuexDashI18n.vuexDashI18nMod.Ii18n
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

