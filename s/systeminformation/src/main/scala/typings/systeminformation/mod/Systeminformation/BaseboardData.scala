package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseboardData extends StObject {
  
  var assetTag: String
  
  var manufacturer: String
  
  var memMax: Double | Null
  
  var memSlots: Double | Null
  
  var model: String
  
  var serial: String
  
  var version: String
}
object BaseboardData {
  
  inline def apply(assetTag: String, manufacturer: String, model: String, serial: String, version: String): BaseboardData = {
    val __obj = js.Dynamic.literal(assetTag = assetTag.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], memMax = null, memSlots = null)
    __obj.asInstanceOf[BaseboardData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseboardData] (val x: Self) extends AnyVal {
    
    inline def setAssetTag(value: String): Self = StObject.set(x, "assetTag", value.asInstanceOf[js.Any])
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setMemMax(value: Double): Self = StObject.set(x, "memMax", value.asInstanceOf[js.Any])
    
    inline def setMemMaxNull: Self = StObject.set(x, "memMax", null)
    
    inline def setMemSlots(value: Double): Self = StObject.set(x, "memSlots", value.asInstanceOf[js.Any])
    
    inline def setMemSlotsNull: Self = StObject.set(x, "memSlots", null)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
