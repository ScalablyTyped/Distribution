package typings.vegaLite

import org.scalablytyped.runtime.Shortcut
import typings.vegaLite.buildSrcCompileSelectionMod.SelectionCompiler
import typings.vegaLite.vegaLiteStrings.point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileSelectionToggleMod extends Shortcut {
  
  @JSImport("vega-lite/build/src/compile/selection/toggle", JSImport.Default)
  @js.native
  val default: SelectionCompiler[point] = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/toggle", "TOGGLE")
  @js.native
  val TOGGLE: /* "_toggle" */ String = js.native
  
  type _To = SelectionCompiler[point]
  
  /* This means you don't have to write `default`, but can instead just say `buildSrcCompileSelectionToggleMod.foo` */
  override def _to: SelectionCompiler[point] = default
}
