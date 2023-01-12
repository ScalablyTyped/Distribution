package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemEventData extends StObject {
  
  /**
    * Type of the system event data item.
    *
    * @since 2.4
    */
  var `type`: String
  
  /**
    * Value of the system event data item.
    *
    * @since 2.4
    */
  var value: String
}
object SystemEventData {
  
  inline def apply(`type`: String, value: String): SystemEventData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemEventData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemEventData] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
