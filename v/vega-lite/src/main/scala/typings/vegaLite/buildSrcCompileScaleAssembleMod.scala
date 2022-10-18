package typings.vegaLite

import typings.vegaLite.buildSrcChannelMod.ScaleChannel
import typings.vegaLite.buildSrcCompileModelMod.Model
import typings.vegaLite.buildSrcVegaDotschemaMod.VgRange
import typings.vegaLite.buildSrcVegaDotschemaMod.VgScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileScaleAssembleMod {
  
  @JSImport("vega-lite/build/src/compile/scale/assemble", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleScaleRange(scaleRange: VgRange, scaleName: String, channel: ScaleChannel): VgRange = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleScaleRange")(scaleRange.asInstanceOf[js.Any], scaleName.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[VgRange]
  inline def assembleScaleRange(scaleRange: VgRange, scaleName: String, channel: ScaleChannel, model: Model): VgRange = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleScaleRange")(scaleRange.asInstanceOf[js.Any], scaleName.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[VgRange]
  
  inline def assembleScales(model: Model): js.Array[VgScale] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleScales")(model.asInstanceOf[js.Any]).asInstanceOf[js.Array[VgScale]]
  
  inline def assembleScalesForModel(model: Model): js.Array[VgScale] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleScalesForModel")(model.asInstanceOf[js.Any]).asInstanceOf[js.Array[VgScale]]
}
