package typings.winrtUwp.global.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about state and status changes to an AllJoyn bus connection managed by an AllJoynBusAttachment object. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynBusAttachmentStateChangedEventArgs")
@js.native
abstract class AllJoynBusAttachmentStateChangedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentStateChangedEventArgs {
  /** Indicates the current state of a connection to an AllJoyn bus. */
  /* CompleteClass */
  override var state: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState = js.native
  /** Contains a status code that provides status information for AllJoynBusAttachment change events. Properties used in the generation of possible values are defined by AllJoynStatus . */
  /* CompleteClass */
  override var status: Double = js.native
}

