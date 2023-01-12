package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UuidData extends StObject {
  
  var hardware: String
  
  var macs: js.Array[String]
  
  var os: String
}
object UuidData {
  
  inline def apply(hardware: String, macs: js.Array[String], os: String): UuidData = {
    val __obj = js.Dynamic.literal(hardware = hardware.asInstanceOf[js.Any], macs = macs.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any])
    __obj.asInstanceOf[UuidData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UuidData] (val x: Self) extends AnyVal {
    
    inline def setHardware(value: String): Self = StObject.set(x, "hardware", value.asInstanceOf[js.Any])
    
    inline def setMacs(value: js.Array[String]): Self = StObject.set(x, "macs", value.asInstanceOf[js.Any])
    
    inline def setMacsVarargs(value: String*): Self = StObject.set(x, "macs", js.Array(value*))
    
    inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
  }
}
