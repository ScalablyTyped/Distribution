package typings.tensorflowTfjsLayers.modelSerializationMod

import typings.tensorflowTfjsLayers.layerSerializationMod.LayerSerialization
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Sequential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegacySequentialSerialization extends js.Object {
  
  var backend: js.UndefOr[String] = js.native
  
  var class_name: Sequential = js.native
  
  var config: js.Array[LayerSerialization] = js.native
  
  var keras_version: js.UndefOr[String] = js.native
}
object LegacySequentialSerialization {
  
  @scala.inline
  def apply(class_name: Sequential, config: js.Array[LayerSerialization]): LegacySequentialSerialization = {
    val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacySequentialSerialization]
  }
  
  @scala.inline
  implicit class LegacySequentialSerializationOps[Self <: LegacySequentialSerialization] (val x: Self) extends AnyVal {
    
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
    def setClass_name(value: Sequential): Self = this.set("class_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigVarargs(value: LayerSerialization*): Self = this.set("config", js.Array(value :_*))
    
    @scala.inline
    def setConfig(value: js.Array[LayerSerialization]): Self = this.set("config", value.asInstanceOf[js.Any])
    
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
