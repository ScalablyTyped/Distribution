package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device extends StObject {
  
  var group: String
  
  var major: Double
  
  var `type`: DeviceType
}
object Device {
  
  inline def apply(group: String, major: Double, `type`: DeviceType): Device = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setType(value: DeviceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
