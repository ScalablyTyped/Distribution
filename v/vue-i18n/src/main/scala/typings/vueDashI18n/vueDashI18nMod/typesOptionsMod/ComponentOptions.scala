package typings.vueDashI18n.vueDashI18nMod.typesOptionsMod

import typings.vue.typesVueMod.Vue
import typings.vueDashI18n.Anon_DateTimeFormats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOptions[V /* <: Vue */] extends js.Object {
  var i18n: js.UndefOr[Anon_DateTimeFormats] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply[V /* <: Vue */](i18n: Anon_DateTimeFormats = null): ComponentOptions[V] = {
    val __obj = js.Dynamic.literal()
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptions[V]]
  }
}

