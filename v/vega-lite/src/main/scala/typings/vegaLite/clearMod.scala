package typings.vegaLite

import org.scalablytyped.runtime.Shortcut
import typings.vegaLite.selectionMod.SelectionCompiler
import typings.vegaLite.srcSelectionMod.SelectionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clearMod extends Shortcut {
  
  @JSImport("vega-lite/build/src/compile/selection/clear", JSImport.Default)
  @js.native
  val default: SelectionCompiler[SelectionType] = js.native
  
  type _To = SelectionCompiler[SelectionType]
  
  /* This means you don't have to write `default`, but can instead just say `clearMod.foo` */
  override def _to: SelectionCompiler[SelectionType] = default
}
