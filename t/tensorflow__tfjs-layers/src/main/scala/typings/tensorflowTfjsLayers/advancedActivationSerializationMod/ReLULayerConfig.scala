package typings.tensorflowTfjsLayers.advancedActivationSerializationMod

import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReLULayerConfig extends LayerConfig {
  
  var max_value: js.UndefOr[Double] = js.native
}
object ReLULayerConfig {
  
  @scala.inline
  def apply(): ReLULayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReLULayerConfig]
  }
  
  @scala.inline
  implicit class ReLULayerConfigOps[Self <: ReLULayerConfig] (val x: Self) extends AnyVal {
    
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
    def setMax_value(value: Double): Self = this.set("max_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_value: Self = this.set("max_value", js.undefined)
  }
}
