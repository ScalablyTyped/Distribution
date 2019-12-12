package typings.winrtDashUwp.Windows.Devices.AllJoyn

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState.connected
import typings.winrtDashUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState.connecting
import typings.winrtDashUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState.disconnected
import typings.winrtDashUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState.disconnecting
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AllJoynBusAttachmentState with Double] = js.native
  /* 2 */ @js.native
  object connected extends TopLevel[connected with Double]
  
  /* 1 */ @js.native
  object connecting extends TopLevel[connecting with Double]
  
  /* 0 */ @js.native
  object disconnected extends TopLevel[disconnected with Double]
  
  /* 3 */ @js.native
  object disconnecting extends TopLevel[disconnecting with Double]
  
}

