package typings.winrtUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about state and status changes to an AllJoyn bus connection managed by an AllJoynBusAttachment object. */
trait AllJoynBusAttachmentStateChangedEventArgs extends js.Object {
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
}

