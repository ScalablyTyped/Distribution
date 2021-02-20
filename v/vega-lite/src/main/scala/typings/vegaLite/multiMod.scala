package typings.vegaLite

import org.scalablytyped.runtime.Shortcut
import typings.vegaLite.anon.On
import typings.vegaLite.selectionMod.SelectionCompiler
import typings.vegaLite.selectionMod.SelectionComponent
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.vegaLiteStrings.multi
import typings.vegaLite.vegaLiteStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiMod extends Shortcut {
  
  @JSImport("vega-lite/build/src/compile/selection/multi", JSImport.Default)
  @js.native
  val default: SelectionCompiler[multi] = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/multi", "singleOrMultiSignals")
  @js.native
  def singleOrMultiSignals(model: UnitModel, selCmpt: SelectionComponent[single | multi]): js.Array[On] = js.native
  
  type _To = SelectionCompiler[multi]
  
  /* This means you don't have to write `default`, but can instead just say `multiMod.foo` */
  override def _to: SelectionCompiler[multi] = default
}
