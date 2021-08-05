package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemData extends StObject {
  
  var manufacturer: String
  
  var model: String
  
  var raspberry: js.UndefOr[RaspberryRevisionData] = js.undefined
  
  var serial: String
  
  var sku: String
  
  var uuid: String
  
  var version: String
}
object SystemData {
  
  inline def apply(manufacturer: String, model: String, serial: String, sku: String, uuid: String, version: String): SystemData = {
    val __obj = js.Dynamic.literal(manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemData]
  }
  
  extension [Self <: SystemData](x: Self) {
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setRaspberry(value: RaspberryRevisionData): Self = StObject.set(x, "raspberry", value.asInstanceOf[js.Any])
    
    inline def setRaspberryUndefined: Self = StObject.set(x, "raspberry", js.undefined)
    
    inline def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    inline def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
