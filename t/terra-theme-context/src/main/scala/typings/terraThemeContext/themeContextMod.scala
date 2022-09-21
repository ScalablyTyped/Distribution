package typings.terraThemeContext

import org.scalablytyped.runtime.Shortcut
import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.react.mod.Context
import typings.terraThemeContext.anon.ClassName
import typings.terraThemeContext.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeContextMod extends Shortcut {
  
  @JSImport("terra-theme-context/lib/ThemeContext", JSImport.Default)
  @js.native
  val default: Context[`0`] = js.native
  
  @JSImport("terra-theme-context/lib/ThemeContext", "themeContextShape")
  @js.native
  val themeContextShape: Requireable[InferProps[ClassName]] = js.native
  
  type _To = Context[`0`]
  
  /* This means you don't have to write `default`, but can instead just say `themeContextMod.foo` */
  override def _to: Context[`0`] = default
}
