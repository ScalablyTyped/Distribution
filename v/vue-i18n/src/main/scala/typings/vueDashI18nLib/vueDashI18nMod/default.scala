package typings
package vueDashI18nLib.vueDashI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-i18n", JSImport.Default)
@js.native
class default () extends VueI18n {
  def this(options: vueDashI18nLib.vueDashI18nMod.VueI18nNs.I18nOptions) = this()
}

/* static members */
@JSImport("vue-i18n", JSImport.Default)
@js.native
object default extends js.Object {
  var availabilities: vueDashI18nLib.vueDashI18nMod.VueI18nNs.IntlAvailability = js.native
  @JSName("install")
  var install_Original: vueLib.typesPluginMod.PluginFunction[scala.Nothing] = js.native
  var version: java.lang.String = js.native
  def install(Vue: vueLib.typesVueMod.VueConstructor[vueLib.typesVueMod.Vue]): scala.Unit = js.native
  def install(Vue: vueLib.typesVueMod.VueConstructor[vueLib.typesVueMod.Vue], options: scala.Nothing): scala.Unit = js.native
}

