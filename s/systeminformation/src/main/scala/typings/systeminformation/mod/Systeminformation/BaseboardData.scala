package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseboardData extends StObject {
  
  var assetTag: String = js.native
  
  var manufacturer: String = js.native
  
  var model: String = js.native
  
  var serial: String = js.native
  
  var version: String = js.native
}
object BaseboardData {
  
  @scala.inline
  def apply(assetTag: String, manufacturer: String, model: String, serial: String, version: String): BaseboardData = {
    val __obj = js.Dynamic.literal(assetTag = assetTag.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseboardData]
  }
  
  @scala.inline
  implicit class BaseboardDataMutableBuilder[Self <: BaseboardData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetTag(value: String): Self = StObject.set(x, "assetTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
