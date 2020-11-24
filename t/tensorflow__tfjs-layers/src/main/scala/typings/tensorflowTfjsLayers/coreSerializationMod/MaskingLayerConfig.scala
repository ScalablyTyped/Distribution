package typings.tensorflowTfjsLayers.coreSerializationMod

import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskingLayerConfig extends LayerConfig {
  
  var maskValue: Double = js.native
}
object MaskingLayerConfig {
  
  @scala.inline
  def apply(maskValue: Double): MaskingLayerConfig = {
    val __obj = js.Dynamic.literal(maskValue = maskValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskingLayerConfig]
  }
  
  @scala.inline
  implicit class MaskingLayerConfigOps[Self <: MaskingLayerConfig] (val x: Self) extends AnyVal {
    
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
    def setMaskValue(value: Double): Self = this.set("maskValue", value.asInstanceOf[js.Any])
  }
}
