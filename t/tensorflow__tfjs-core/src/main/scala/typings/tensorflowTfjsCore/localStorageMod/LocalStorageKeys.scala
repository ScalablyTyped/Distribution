package typings.tensorflowTfjsCore.localStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalStorageKeys extends js.Object {
  
  var info: String = js.native
  
  var modelMetadata: String = js.native
  
  var topology: String = js.native
  
  var weightData: String = js.native
  
  var weightSpecs: String = js.native
}
object LocalStorageKeys {
  
  @scala.inline
  def apply(info: String, modelMetadata: String, topology: String, weightData: String, weightSpecs: String): LocalStorageKeys = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], modelMetadata = modelMetadata.asInstanceOf[js.Any], topology = topology.asInstanceOf[js.Any], weightData = weightData.asInstanceOf[js.Any], weightSpecs = weightSpecs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalStorageKeys]
  }
  
  @scala.inline
  implicit class LocalStorageKeysOps[Self <: LocalStorageKeys] (val x: Self) extends AnyVal {
    
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
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelMetadata(value: String): Self = this.set("modelMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopology(value: String): Self = this.set("topology", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightData(value: String): Self = this.set("weightData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightSpecs(value: String): Self = this.set("weightSpecs", value.asInstanceOf[js.Any])
  }
}
