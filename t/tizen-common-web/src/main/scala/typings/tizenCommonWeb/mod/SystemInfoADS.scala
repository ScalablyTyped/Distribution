package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoADS
  extends StObject
     with SystemInfoProperty {
  
  /**
    * Represents the unique id of advertisement service. It is used to distinguish each device.
    */
  val id: String
}
object SystemInfoADS {
  
  inline def apply(id: String): SystemInfoADS = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoADS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemInfoADS] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
