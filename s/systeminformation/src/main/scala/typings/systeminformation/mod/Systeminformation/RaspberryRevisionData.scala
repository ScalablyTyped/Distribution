package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 2. System (HW)
trait RaspberryRevisionData extends StObject {
  
  var manufacturer: String
  
  var processor: String
  
  var revision: String
  
  var `type`: String
}
object RaspberryRevisionData {
  
  inline def apply(manufacturer: String, processor: String, revision: String, `type`: String): RaspberryRevisionData = {
    val __obj = js.Dynamic.literal(manufacturer = manufacturer.asInstanceOf[js.Any], processor = processor.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaspberryRevisionData]
  }
  
  extension [Self <: RaspberryRevisionData](x: Self) {
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setProcessor(value: String): Self = StObject.set(x, "processor", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
