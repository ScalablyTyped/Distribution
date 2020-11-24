package typings.tensorflowTfjsLayers.coreSerializationMod

import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropoutLayerConfig extends LayerConfig {
  
  var noise_shape: js.UndefOr[js.Array[Double]] = js.native
  
  var rate: Double = js.native
  
  var seed: js.UndefOr[Double] = js.native
}
object DropoutLayerConfig {
  
  @scala.inline
  def apply(rate: Double): DropoutLayerConfig = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropoutLayerConfig]
  }
  
  @scala.inline
  implicit class DropoutLayerConfigOps[Self <: DropoutLayerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoise_shapeVarargs(value: Double*): Self = this.set("noise_shape", js.Array(value :_*))
    
    @scala.inline
    def setNoise_shape(value: js.Array[Double]): Self = this.set("noise_shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoise_shape: Self = this.set("noise_shape", js.undefined)
    
    @scala.inline
    def setSeed(value: Double): Self = this.set("seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
  }
}
