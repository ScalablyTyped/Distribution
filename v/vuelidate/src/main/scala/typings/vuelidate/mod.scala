package typings.vuelidate

import org.scalablytyped.runtime.Shortcut
import typings.vue.pluginMod.PluginFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vuelidate", JSImport.Default)
  @js.native
  val default: PluginFunction[js.Any] = js.native
  
  @JSImport("vuelidate", "validationMixin")
  @js.native
  val validationMixin: js.Any = js.native
  
  type _To = PluginFunction[js.Any]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: PluginFunction[js.Any] = default
}
