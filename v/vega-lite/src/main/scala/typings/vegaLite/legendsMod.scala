package typings.vegaLite

import org.scalablytyped.runtime.Shortcut
import typings.vegaLite.channelMod.NonPositionScaleChannel
import typings.vegaLite.legendComponentMod.LegendComponent
import typings.vegaLite.transformsMod.TransformCompiler
import typings.vegaLite.unitMod.UnitModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legendsMod extends Shortcut {
  
  @JSImport("vega-lite/build/src/compile/selection/transforms/legends", JSImport.Default)
  @js.native
  val default: TransformCompiler = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/transforms/legends", "parseInteractiveLegend")
  @js.native
  def parseInteractiveLegend(model: UnitModel, channel: NonPositionScaleChannel, legendCmpt: LegendComponent): Unit = js.native
  
  type _To = TransformCompiler
  
  /* This means you don't have to write `default`, but can instead just say `legendsMod.foo` */
  override def _to: TransformCompiler = default
}
