package typings.vueI18n.mod.vueTypesOptionsAugmentingMod

import typings.vue.vueMod.Vue
import typings.vueI18n.anon.DateTimeFormats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOptions[V /* <: Vue */] extends js.Object {
  var i18n: js.UndefOr[DateTimeFormats] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply[/* <: typings.vue.vueMod.Vue */ V](i18n: DateTimeFormats = null): ComponentOptions[V] = {
    val __obj = js.Dynamic.literal()
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptions[V]]
  }
}

