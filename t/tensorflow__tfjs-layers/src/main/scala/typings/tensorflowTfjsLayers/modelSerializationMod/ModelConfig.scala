package typings.tensorflowTfjsLayers.modelSerializationMod

import typings.tensorflowTfjsLayers.layerSerializationMod.LayerSerialization
import typings.tensorflowTfjsLayers.nodeConfigMod.TensorKeyArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelConfig extends js.Object {
  
  var input_layers: js.Array[TensorKeyArray] = js.native
  
  var layers: js.Array[LayerSerialization] = js.native
  
  var name: String = js.native
  
  var output_layers: js.Array[TensorKeyArray] = js.native
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
  
  @scala.inline
  implicit class ModelConfigOps[Self <: ModelConfig] (val x: Self) extends AnyVal {
    
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
    def setInput_layersVarargs(value: TensorKeyArray*): Self = this.set("input_layers", js.Array(value :_*))
    
    @scala.inline
    def setInput_layers(value: js.Array[TensorKeyArray]): Self = this.set("input_layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersVarargs(value: LayerSerialization*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[LayerSerialization]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput_layersVarargs(value: TensorKeyArray*): Self = this.set("output_layers", js.Array(value :_*))
    
    @scala.inline
    def setOutput_layers(value: js.Array[TensorKeyArray]): Self = this.set("output_layers", value.asInstanceOf[js.Any])
  }
}
