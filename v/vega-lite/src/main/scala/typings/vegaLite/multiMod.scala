package typings.vegaLite

import typings.vegaLite.anon.On
import typings.vegaLite.selectionMod.SelectionCompiler
import typings.vegaLite.selectionMod.SelectionComponent
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.vegaLiteStrings.multi
import typings.vegaLite.vegaLiteStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiMod {
  
  @JSImport("vega-lite/build/src/compile/selection/multi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/multi", JSImport.Default)
  @js.native
  val default: SelectionCompiler[multi] = js.native
  
  inline def singleOrMultiSignals(model: UnitModel, selCmpt: SelectionComponent[single | multi]): js.Array[On] = (^.asInstanceOf[js.Dynamic].applyDynamic("singleOrMultiSignals")(model.asInstanceOf[js.Any], selCmpt.asInstanceOf[js.Any])).asInstanceOf[js.Array[On]]
}
