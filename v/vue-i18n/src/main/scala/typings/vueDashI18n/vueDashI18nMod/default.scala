package typings.vueDashI18n.vueDashI18nMod

import typings.vue.typesPluginMod.PluginFunction
import typings.vue.typesVueMod.Vue
import typings.vue.typesVueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-i18n", JSImport.Default)
@js.native
class default () extends VueI18n {
  def this(options: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.I18nOptions) = this()
}

/* static members */
@JSImport("vue-i18n", JSImport.Default)
@js.native
object default extends js.Object {
  var availabilities: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.IntlAvailability = js.native
  @JSName("install")
  var install_Original: PluginFunction[scala.Nothing] = js.native
  var version: String = js.native
  def install(Vue: VueConstructor[Vue]): Unit = js.native
  def install(Vue: VueConstructor[Vue], options: scala.Nothing): Unit = js.native
}

