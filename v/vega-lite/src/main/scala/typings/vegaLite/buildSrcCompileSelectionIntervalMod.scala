package typings.vegaLite

import org.scalablytyped.runtime.Shortcut
import typings.vegaLite.buildSrcCompileSelectionMod.SelectionCompiler
import typings.vegaLite.vegaLiteStrings.interval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileSelectionIntervalMod extends Shortcut {
  
  @JSImport("vega-lite/build/src/compile/selection/interval", JSImport.Default)
  @js.native
  val default: SelectionCompiler[interval] = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/interval", "BRUSH")
  @js.native
  val BRUSH: /* "_brush" */ String = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/interval", "SCALE_TRIGGER")
  @js.native
  val SCALE_TRIGGER: /* "_scale_trigger" */ String = js.native
  
  type _To = SelectionCompiler[interval]
  
  /* This means you don't have to write `default`, but can instead just say `buildSrcCompileSelectionIntervalMod.foo` */
  override def _to: SelectionCompiler[interval] = default
}
