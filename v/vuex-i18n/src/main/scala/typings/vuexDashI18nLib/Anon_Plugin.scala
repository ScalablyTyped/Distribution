package typings
package vuexDashI18nLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Plugin extends js.Object {
  var plugin: vueLib.typesPluginMod.PluginObject[vuexDashI18nLib.vuexDashI18nMod.Ii18n]
}

object Anon_Plugin {
  @scala.inline
  def apply(plugin: vueLib.typesPluginMod.PluginObject[vuexDashI18nLib.vuexDashI18nMod.Ii18n]): Anon_Plugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("plugin")(plugin)
    __obj.asInstanceOf[Anon_Plugin]
  }
}

