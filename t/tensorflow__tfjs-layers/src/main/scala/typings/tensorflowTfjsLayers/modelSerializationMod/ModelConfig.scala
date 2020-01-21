package typings.tensorflowTfjsLayers.modelSerializationMod

import typings.tensorflowTfjsLayers.layerSerializationMod.LayerSerialization
import typings.tensorflowTfjsLayers.nodeConfigMod.TensorKeyArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelConfig extends js.Object {
  var input_layers: js.Array[TensorKeyArray]
  var layers: js.Array[LayerSerialization]
  var name: String
  var output_layers: js.Array[TensorKeyArray]
}

object ModelConfig {
  @scala.inline
  def apply(
    input_layers: js.Array[TensorKeyArray],
    layers: js.Array[LayerSerialization],
    name: String,
    output_layers: js.Array[TensorKeyArray]
  ): ModelConfig = {
    val __obj = js.Dynamic.literal(input_layers = input_layers.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output_layers = output_layers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModelConfig]
  }
}

