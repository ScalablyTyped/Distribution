package typings.vegaLite

import typings.vegaLite.channelMod.ScaleChannel
import typings.vegaLite.modelMod.Model
import typings.vegaLite.vegaSchemaMod.VgRange
import typings.vegaLite.vegaSchemaMod.VgScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleAssembleMod {
  
  @JSImport("vega-lite/build/src/compile/scale/assemble", "assembleScaleRange")
  @js.native
  def assembleScaleRange(scaleRange: VgRange, scaleName: String, channel: ScaleChannel): VgRange = js.native
  @JSImport("vega-lite/build/src/compile/scale/assemble", "assembleScaleRange")
  @js.native
  def assembleScaleRange(scaleRange: VgRange, scaleName: String, channel: ScaleChannel, model: Model): VgRange = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/assemble", "assembleScales")
  @js.native
  def assembleScales(model: Model): js.Array[VgScale] = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/assemble", "assembleScalesForModel")
  @js.native
  def assembleScalesForModel(model: Model): js.Array[VgScale] = js.native
}
