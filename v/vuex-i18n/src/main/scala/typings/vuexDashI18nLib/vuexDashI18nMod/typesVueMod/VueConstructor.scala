package typings
package vuexDashI18nLib.vuexDashI18nMod.typesVueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueConstructor[V /* <: Vue */] extends js.Object {
  var i18n: vuexDashI18nLib.vuexDashI18nMod.Ii18n
}

object VueConstructor {
  @scala.inline
  def apply[V /* <: Vue */](i18n: vuexDashI18nLib.vuexDashI18nMod.Ii18n): VueConstructor[V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("i18n")(i18n)
    __obj.asInstanceOf[VueConstructor[V]]
  }
}

