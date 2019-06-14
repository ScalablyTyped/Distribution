package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs

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
  sealed trait connected
    extends winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynBusAttachmentState
  
  /** Connecting to the bus. */
  @js.native
  sealed trait connecting
    extends winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynBusAttachmentState
  
  /** Disconnected from the bus. */
  @js.native
  sealed trait disconnected
    extends winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynBusAttachmentState
  
  /** Currently disconnecting from the bus. */
  @js.native
  sealed trait disconnecting
    extends winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynBusAttachmentState
  
  /* 2 */ val connected: connected with scala.Double = js.native
  /* 1 */ val connecting: connecting with scala.Double = js.native
  /* 0 */ val disconnected: disconnected with scala.Double = js.native
  /* 3 */ val disconnecting: disconnecting with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynBusAttachmentState with scala.Double
  ] = js.native
}

