package typings.vegaLite

import org.scalablytyped.runtime.Shortcut
import typings.vegaLite.buildSrcCompileSelectionMod.SelectionCompiler
import typings.vegaLite.buildSrcSelectionMod.SelectionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileSelectionClearMod extends Shortcut {
  
  @JSImport("vega-lite/build/src/compile/selection/clear", JSImport.Default)
  @js.native
  val default: SelectionCompiler[SelectionType] = js.native
  
  type _To = SelectionCompiler[SelectionType]
  
  /* This means you don't have to write `default`, but can instead just say `buildSrcCompileSelectionClearMod.foo` */
  override def _to: SelectionCompiler[SelectionType] = default
}
