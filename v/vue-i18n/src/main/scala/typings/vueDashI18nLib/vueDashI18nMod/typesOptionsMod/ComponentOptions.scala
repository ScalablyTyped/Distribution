package typings
package vueDashI18nLib.vueDashI18nMod.typesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOptions[V /* <: vueLib.typesVueMod.Vue */] extends js.Object {
  var i18n: js.UndefOr[vueDashI18nLib.Anon_DateTimeFormats] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply[V /* <: vueLib.typesVueMod.Vue */](i18n: vueDashI18nLib.Anon_DateTimeFormats = null): ComponentOptions[V] = {
    val __obj = js.Dynamic.literal()
    if (i18n != null) __obj.updateDynamic("i18n")(i18n)
    __obj.asInstanceOf[ComponentOptions[V]]
  }
}

