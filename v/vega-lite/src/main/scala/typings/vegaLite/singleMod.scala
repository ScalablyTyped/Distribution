package typings.vegaLite

import org.scalablytyped.runtime.Shortcut
import typings.vegaLite.selectionMod.SelectionCompiler
import typings.vegaLite.vegaLiteStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object singleMod extends Shortcut {
  
  @JSImport("vega-lite/build/src/compile/selection/single", JSImport.Default)
  @js.native
  val default: SelectionCompiler[single] = js.native
  
  type _To = SelectionCompiler[single]
  
  /* This means you don't have to write `default`, but can instead just say `singleMod.foo` */
  override def _to: SelectionCompiler[single] = default
}
