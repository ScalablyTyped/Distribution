package typings.winrtUwp.global.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines values used to indicate the state of a connection with an AllJoyn bus that is managed by an AllJoynBusAttachment object. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynBusAttachmentState")
@js.native
object AllJoynBusAttachmentState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState with Double] = js.native
  
  /* 2 */ val connected: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState.connected with Double = js.native
  
  /* 1 */ val connecting: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState.connecting with Double = js.native
  
  /* 0 */ val disconnected: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState.disconnected with Double = js.native
  
  /* 3 */ val disconnecting: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState.disconnecting with Double = js.native
}
