package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemInfoPeripheral extends SystemInfoProperty {
  
  /**
    * Represents the video out status.
    */
  val isVideoOutputOn: Boolean = js.native
}
object SystemInfoPeripheral {
  
  @scala.inline
  def apply(isVideoOutputOn: Boolean): SystemInfoPeripheral = {
    val __obj = js.Dynamic.literal(isVideoOutputOn = isVideoOutputOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoPeripheral]
  }
  
  @scala.inline
  implicit class SystemInfoPeripheralMutableBuilder[Self <: SystemInfoPeripheral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsVideoOutputOn(value: Boolean): Self = StObject.set(x, "isVideoOutputOn", value.asInstanceOf[js.Any])
  }
}
