package typings.vueI18n.mod

import typings.vue.pluginMod.PluginFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-i18n", JSImport.Default)
@js.native
class default ()
  extends StObject
     with VueI18n {
  def this(options: typings.vueI18n.mod.VueI18n.I18nOptions) = this()
}
object default {
  
  @JSImport("vue-i18n", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("vue-i18n", "default.availabilities")
  @js.native
  def availabilities: typings.vueI18n.mod.VueI18n.IntlAvailability = js.native
  @scala.inline
  def availabilities_=(x: typings.vueI18n.mod.VueI18n.IntlAvailability): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("availabilities")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("vue-i18n", "default.install")
  @js.native
  def install: PluginFunction[scala.Nothing] = js.native
  @scala.inline
  def install_=(x: PluginFunction[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("install")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("vue-i18n", "default.version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
