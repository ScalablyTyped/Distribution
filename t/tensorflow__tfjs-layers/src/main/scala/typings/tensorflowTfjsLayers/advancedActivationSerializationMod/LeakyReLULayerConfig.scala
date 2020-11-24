package typings.tensorflowTfjsLayers.advancedActivationSerializationMod

import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeakyReLULayerConfig extends LayerConfig {
  
  var alpha: js.UndefOr[Double] = js.native
}
object LeakyReLULayerConfig {
  
  @scala.inline
  def apply(): LeakyReLULayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeakyReLULayerConfig]
  }
  
  @scala.inline
  implicit class LeakyReLULayerConfigOps[Self <: LeakyReLULayerConfig] (val x: Self) extends AnyVal {
    
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
  }
}
