package typings.vegaLite

import typings.vegaLite.anon.PartialRecordfillstrokeco
import typings.vegaLite.channelMod.NonPositionScaleChannel
import typings.vegaLite.legendComponentMod.LegendComponent
import typings.vegaLite.modelMod.Model
import typings.vegaLite.unitMod.UnitModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legendParseMod {
  
  @JSImport("vega-lite/build/src/compile/legend/parse", "mergeLegendComponent")
  @js.native
  def mergeLegendComponent(mergedLegend: LegendComponent, childLegend: LegendComponent): LegendComponent = js.native
  
  @JSImport("vega-lite/build/src/compile/legend/parse", "parseLegend")
  @js.native
  def parseLegend(model: Model): PartialRecordfillstrokeco = js.native
  
  @JSImport("vega-lite/build/src/compile/legend/parse", "parseLegendForChannel")
  @js.native
  def parseLegendForChannel(model: UnitModel, channel: NonPositionScaleChannel): LegendComponent = js.native
}
