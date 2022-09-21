package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoPeripheral
  extends StObject
     with SystemInfoProperty {
  
  /**
    * Represents the video out status.
    */
  val isVideoOutputOn: Boolean
}
object SystemInfoPeripheral {
  
  inline def apply(isVideoOutputOn: Boolean): SystemInfoPeripheral = {
    val __obj = js.Dynamic.literal(isVideoOutputOn = isVideoOutputOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoPeripheral]
  }
  
  extension [Self <: SystemInfoPeripheral](x: Self) {
    
    inline def setIsVideoOutputOn(value: Boolean): Self = StObject.set(x, "isVideoOutputOn", value.asInstanceOf[js.Any])
  }
}
