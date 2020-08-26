package typings.tensorflowTfjsLayers.wrappersSerializationMod

import typings.tensorflowTfjsLayers.layerSerializationMod.LayerSerialization
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeDistributedLayerConfig extends LayerConfig {
  var layer: LayerSerialization = js.native
}

object TimeDistributedLayerConfig {
  @scala.inline
  def apply(layer: LayerSerialization): TimeDistributedLayerConfig = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeDistributedLayerConfig]
  }
  @scala.inline
  implicit class TimeDistributedLayerConfigOps[Self <: TimeDistributedLayerConfig] (val x: Self) extends AnyVal {
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
    def setLayer(value: LayerSerialization): Self = this.set("layer", value.asInstanceOf[js.Any])
  }
  
}

