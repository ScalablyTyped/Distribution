package typings.winrtDashUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AllJoynBusAttachmentState extends js.Object

/** Defines values used to indicate the state of a connection with an AllJoyn bus that is managed by an AllJoynBusAttachment object. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynBusAttachmentState")
@js.native
object AllJoynBusAttachmentState extends js.Object {
  /** Currently connected to the bus. */
  @js.native
  sealed trait connected extends AllJoynBusAttachmentState
  
  /** Connecting to the bus. */
  @js.native
  sealed trait connecting extends AllJoynBusAttachmentState
  
  /** Disconnected from the bus. */
  @js.native
  sealed trait disconnected extends AllJoynBusAttachmentState
  
  /** Currently disconnecting from the bus. */
  @js.native
  sealed trait disconnecting extends AllJoynBusAttachmentState
  
  /* 2 */ val connected: typings.winrtDashUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState.connected with Double = js.native
  /* 1 */ val connecting: typings.winrtDashUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState.connecting with Double = js.native
  /* 0 */ val disconnected: typings.winrtDashUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState.disconnected with Double = js.native
  /* 3 */ val disconnecting: typings.winrtDashUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState.disconnecting with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AllJoynBusAttachmentState with Double] = js.native
}

