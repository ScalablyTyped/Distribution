package typings.vueComponentCompilerUtils

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.Plugin_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trimMod extends Shortcut {
  
  @JSImport("@vue/component-compiler-utils/dist/stylePlugins/trim", JSImport.Default)
  @js.native
  val default: Plugin_[js.Any] = js.native
  
  type _To = Plugin_[js.Any]
  
  /* This means you don't have to write `default`, but can instead just say `trimMod.foo` */
  override def _to: Plugin_[js.Any] = default
}
