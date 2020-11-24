package typings.tensorflowTfjsLayers.recurrentSerializationMod

import typings.tensorflowTfjsLayers.activationConfigMod.ActivationSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LSTMLayerConfig extends SimpleRNNLayerConfig {
  
  var implementation: js.UndefOr[Double] = js.native
  
  var recurrent_activation: js.UndefOr[ActivationSerialization] = js.native
  
  var unit_forget_bias: js.UndefOr[Boolean] = js.native
}
object LSTMLayerConfig {
  
  @scala.inline
  def apply(units: Double): LSTMLayerConfig = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[LSTMLayerConfig]
  }
  
  @scala.inline
  implicit class LSTMLayerConfigOps[Self <: LSTMLayerConfig] (val x: Self) extends AnyVal {
    
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
    def setImplementation(value: Double): Self = this.set("implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplementation: Self = this.set("implementation", js.undefined)
    
    @scala.inline
    def setRecurrent_activation(value: ActivationSerialization): Self = this.set("recurrent_activation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrent_activation: Self = this.set("recurrent_activation", js.undefined)
    
    @scala.inline
    def setUnit_forget_bias(value: Boolean): Self = this.set("unit_forget_bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit_forget_bias: Self = this.set("unit_forget_bias", js.undefined)
  }
}
