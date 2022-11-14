package typings.vueComponentCompilerUtils

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStylePluginsScopedMod extends Shortcut {
  
  @JSImport("@vue/component-compiler-utils/dist/stylePlugins/scoped", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `distStylePluginsScopedMod.foo` */
  override def _to: Plugin = default
}
