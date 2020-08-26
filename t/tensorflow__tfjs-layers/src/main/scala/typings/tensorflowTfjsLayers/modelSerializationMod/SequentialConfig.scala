package typings.tensorflowTfjsLayers.modelSerializationMod

import typings.tensorflowTfjsLayers.layerSerializationMod.LayerSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequentialConfig extends js.Object {
  var layers: js.Array[LayerSerialization] = js.native
}

object SequentialConfig {
  @scala.inline
  def apply(layers: js.Array[LayerSerialization]): SequentialConfig = {
    val __obj = js.Dynamic.literal(layers = layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequentialConfig]
  }
  @scala.inline
  implicit class SequentialConfigOps[Self <: SequentialConfig] (val x: Self) extends AnyVal {
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
    def setLayersVarargs(value: LayerSerialization*): Self = this.set("layers", js.Array(value :_*))
    @scala.inline
    def setLayers(value: js.Array[LayerSerialization]): Self = this.set("layers", value.asInstanceOf[js.Any])
  }
  
}

