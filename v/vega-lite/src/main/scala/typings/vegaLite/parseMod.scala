package typings.vegaLite

import typings.vegaLite.componentMod.AxisComponentIndex
import typings.vegaLite.layerMod.LayerModel
import typings.vegaLite.unitMod.UnitModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  @JSImport("vega-lite/build/src/compile/axis/parse", "parseLayerAxes")
  @js.native
  def parseLayerAxes(model: LayerModel): Unit = js.native
  
  @JSImport("vega-lite/build/src/compile/axis/parse", "parseUnitAxes")
  @js.native
  def parseUnitAxes(model: UnitModel): AxisComponentIndex = js.native
}
