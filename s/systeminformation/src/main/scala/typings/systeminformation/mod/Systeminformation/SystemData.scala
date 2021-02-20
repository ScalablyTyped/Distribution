package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemData extends StObject {
  
  var manufacturer: String = js.native
  
  var model: String = js.native
  
  var raspberry: js.UndefOr[RaspberryRevisionData] = js.native
  
  var serial: String = js.native
  
  var sku: String = js.native
  
  var uuid: String = js.native
  
  var version: String = js.native
}
object SystemData {
  
  @scala.inline
  def apply(manufacturer: String, model: String, serial: String, sku: String, uuid: String, version: String): SystemData = {
    val __obj = js.Dynamic.literal(manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemData]
  }
  
  @scala.inline
  implicit class SystemDataMutableBuilder[Self <: SystemData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaspberry(value: RaspberryRevisionData): Self = StObject.set(x, "raspberry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaspberryUndefined: Self = StObject.set(x, "raspberry", js.undefined)
    
    @scala.inline
    def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
