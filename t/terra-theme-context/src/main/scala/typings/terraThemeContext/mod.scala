package typings.terraThemeContext

import org.scalablytyped.runtime.Shortcut
import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.react.mod.Context
import typings.terraThemeContext.anon.ClassName
import typings.terraThemeContext.anon.ClassNameRequireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("terra-theme-context", JSImport.Default)
  @js.native
  val default: Context[ClassName] = js.native
  
  @JSImport("terra-theme-context", "themeContextShape")
  @js.native
  val themeContextShape: Requireable[InferProps[ClassNameRequireable]] = js.native
  
  type _To = Context[ClassName]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Context[ClassName] = default
}
