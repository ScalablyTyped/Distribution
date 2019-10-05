package typings.winrtDashUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about state and status changes to an AllJoyn bus connection managed by an AllJoynBusAttachment object. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynBusAttachmentStateChangedEventArgs")
@js.native
abstract class AllJoynBusAttachmentStateChangedEventArgs () extends js.Object {
  /** Indicates the current state of a connection to an AllJoyn bus. */
  var state: AllJoynBusAttachmentState = js.native
  /** Contains a status code that provides status information for AllJoynBusAttachment change events. Properties used in the generation of possible values are defined by AllJoynStatus . */
  var status: Double = js.native
}

