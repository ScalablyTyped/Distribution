package typings.vegaLite

import typings.vegaLite.buildSrcCompileAxisComponentMod.AxisComponentIndex
import typings.vegaLite.buildSrcCompileLayerMod.LayerModel
import typings.vegaLite.buildSrcCompileUnitMod.UnitModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileAxisParseMod {
  
  @JSImport("vega-lite/build/src/compile/axis/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseLayerAxes(model: LayerModel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLayerAxes")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseUnitAxes(model: UnitModel): AxisComponentIndex = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUnitAxes")(model.asInstanceOf[js.Any]).asInstanceOf[AxisComponentIndex]
}
