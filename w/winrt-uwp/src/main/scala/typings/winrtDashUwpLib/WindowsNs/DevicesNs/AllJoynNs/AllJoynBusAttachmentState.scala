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
  
  val connected: connected with java.lang.String = js.native
  val connecting: connecting with java.lang.String = js.native
  val disconnected: disconnected with java.lang.String = js.native
  val disconnecting: disconnecting with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynBusAttachmentState with java.lang.String
  ] = js.native
}

