package typings.vegaLite

import org.scalablytyped.runtime.Shortcut
import typings.vegaLite.selectionMod.SelectionCompiler
import typings.vegaLite.vegaLiteStrings.interval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomMod extends Shortcut {
  
  @JSImport("vega-lite/build/src/compile/selection/zoom", JSImport.Default)
  @js.native
  val default: SelectionCompiler[interval] = js.native
  
  type _To = SelectionCompiler[interval]
  
  /* This means you don't have to write `default`, but can instead just say `zoomMod.foo` */
  override def _to: SelectionCompiler[interval] = default
}
