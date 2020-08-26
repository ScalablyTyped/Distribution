package typings.tensorflowTfjsLayers.coreSerializationMod

import typings.tensorflowTfjsLayers.activationConfigMod.ActivationSerialization
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivationLayerConfig extends LayerConfig {
  var activation: ActivationSerialization = js.native
}

object ActivationLayerConfig {
  @scala.inline
  def apply(activation: ActivationSerialization): ActivationLayerConfig = {
    val __obj = js.Dynamic.literal(activation = activation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivationLayerConfig]
  }
  @scala.inline
  implicit class ActivationLayerConfigOps[Self <: ActivationLayerConfig] (val x: Self) extends AnyVal {
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
    def setActivation(value: ActivationSerialization): Self = this.set("activation", value.asInstanceOf[js.Any])
  }
  
}

