package typings.winrtUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about state and status changes to an AllJoyn bus connection managed by an AllJoynBusAttachment object. */
@js.native
trait AllJoynBusAttachmentStateChangedEventArgs extends js.Object {
  
  /** Indicates the current state of a connection to an AllJoyn bus. */
  var state: AllJoynBusAttachmentState = js.native
  
  /** Contains a status code that provides status information for AllJoynBusAttachment change events. Properties used in the generation of possible values are defined by AllJoynStatus . */
  var status: Double = js.native
}
object AllJoynBusAttachmentStateChangedEventArgs {
  
  @scala.inline
  def apply(state: AllJoynBusAttachmentState, status: Double): AllJoynBusAttachmentStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynBusAttachmentStateChangedEventArgs]
  }
  
  @scala.inline
  implicit class AllJoynBusAttachmentStateChangedEventArgsOps[Self <: AllJoynBusAttachmentStateChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setState(value: AllJoynBusAttachmentState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
