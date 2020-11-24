package typings.tensorflowTfjsLayers.modelSerializationMod

import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Model
import typings.tensorflowTfjsLayers.typesMod.BaseSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelSerialization extends BaseSerialization[Model, ModelConfig] {
  
  var backend: js.UndefOr[String] = js.native
  
  var keras_version: js.UndefOr[String] = js.native
}
object ModelSerialization {
  
  @scala.inline
  def apply(class_name: Model, config: ModelConfig): ModelSerialization = {
    val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelSerialization]
  }
  
  @scala.inline
  implicit class ModelSerializationOps[Self <: ModelSerialization] (val x: Self) extends AnyVal {
    
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
    def setBackend(value: String): Self = this.set("backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackend: Self = this.set("backend", js.undefined)
    
    @scala.inline
    def setKeras_version(value: String): Self = this.set("keras_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeras_version: Self = this.set("keras_version", js.undefined)
  }
}
