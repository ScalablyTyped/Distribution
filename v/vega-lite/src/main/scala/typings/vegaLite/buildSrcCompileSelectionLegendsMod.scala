package typings.vegaLite

import typings.vegaLite.buildSrcChannelMod.NonPositionScaleChannel
import typings.vegaLite.buildSrcCompileLegendComponentMod.LegendComponent
import typings.vegaLite.buildSrcCompileSelectionMod.SelectionCompiler
import typings.vegaLite.buildSrcCompileUnitMod.UnitModel
import typings.vegaLite.vegaLiteStrings.point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileSelectionLegendsMod {
  
  @JSImport("vega-lite/build/src/compile/selection/legends", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/legends", JSImport.Default)
  @js.native
  val default: SelectionCompiler[point] = js.native
  
  inline def parseInteractiveLegend(model: UnitModel, channel: NonPositionScaleChannel, legendCmpt: LegendComponent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseInteractiveLegend")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], legendCmpt.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
