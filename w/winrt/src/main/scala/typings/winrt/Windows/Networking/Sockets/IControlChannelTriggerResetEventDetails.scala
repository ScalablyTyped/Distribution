package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IControlChannelTriggerResetEventDetails extends StObject {
  
  var hardwareSlotReset: Boolean
  
  var resetReason: ControlChannelTriggerResetReason
  
  var softwareSlotReset: Boolean
}
object IControlChannelTriggerResetEventDetails {
  
  @scala.inline
  def apply(
    hardwareSlotReset: Boolean,
    resetReason: ControlChannelTriggerResetReason,
    softwareSlotReset: Boolean
  ): IControlChannelTriggerResetEventDetails = {
    val __obj = js.Dynamic.literal(hardwareSlotReset = hardwareSlotReset.asInstanceOf[js.Any], resetReason = resetReason.asInstanceOf[js.Any], softwareSlotReset = softwareSlotReset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IControlChannelTriggerResetEventDetails]
  }
  
  @scala.inline
  implicit class IControlChannelTriggerResetEventDetailsMutableBuilder[Self <: IControlChannelTriggerResetEventDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHardwareSlotReset(value: Boolean): Self = StObject.set(x, "hardwareSlotReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetReason(value: ControlChannelTriggerResetReason): Self = StObject.set(x, "resetReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareSlotReset(value: Boolean): Self = StObject.set(x, "softwareSlotReset", value.asInstanceOf[js.Any])
  }
}
