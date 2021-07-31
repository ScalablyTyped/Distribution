package typings.winrtUwp.Windows.Devices.AllJoyn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about state and status changes to an AllJoyn bus connection managed by an AllJoynBusAttachment object. */
trait AllJoynBusAttachmentStateChangedEventArgs extends StObject {
  
  /** Indicates the current state of a connection to an AllJoyn bus. */
  var state: AllJoynBusAttachmentState
  
  /** Contains a status code that provides status information for AllJoynBusAttachment change events. Properties used in the generation of possible values are defined by AllJoynStatus . */
  var status: Double
}
object AllJoynBusAttachmentStateChangedEventArgs {
  
  @scala.inline
  def apply(state: AllJoynBusAttachmentState, status: Double): AllJoynBusAttachmentStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynBusAttachmentStateChangedEventArgs]
  }
  
  @scala.inline
  implicit class AllJoynBusAttachmentStateChangedEventArgsMutableBuilder[Self <: AllJoynBusAttachmentStateChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: AllJoynBusAttachmentState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
