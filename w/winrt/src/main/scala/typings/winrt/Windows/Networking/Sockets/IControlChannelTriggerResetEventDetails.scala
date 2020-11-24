package typings.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IControlChannelTriggerResetEventDetails extends js.Object {
  
  var hardwareSlotReset: Boolean = js.native
  
  var resetReason: ControlChannelTriggerResetReason = js.native
  
  var softwareSlotReset: Boolean = js.native
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
  implicit class IControlChannelTriggerResetEventDetailsOps[Self <: IControlChannelTriggerResetEventDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHardwareSlotReset(value: Boolean): Self = this.set("hardwareSlotReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetReason(value: ControlChannelTriggerResetReason): Self = this.set("resetReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareSlotReset(value: Boolean): Self = this.set("softwareSlotReset", value.asInstanceOf[js.Any])
  }
}
