package typings.tensorflowTfjsLayers.modelSerializationMod

import typings.tensorflowTfjsLayers.layerSerializationMod.LayerSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequentialConfig extends js.Object {
  var layers: js.Array[LayerSerialization]
}

object SequentialConfig {
  @scala.inline
  def apply(layers: js.Array[LayerSerialization]): SequentialConfig = {
    val __obj = js.Dynamic.literal(layers = layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequentialConfig]
  }
}

