package typings.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ControlChannelTriggerStatus extends js.Object
@JSGlobal("Windows.Networking.Sockets.ControlChannelTriggerStatus")
@js.native
object ControlChannelTriggerStatus extends js.Object {
  
  @js.native
  sealed trait hardwareSlotAllocated extends ControlChannelTriggerStatus
  
  @js.native
  sealed trait hardwareSlotRequested extends ControlChannelTriggerStatus
  
  @js.native
  sealed trait policyError extends ControlChannelTriggerStatus
  
  @js.native
  sealed trait serviceUnavailable extends ControlChannelTriggerStatus
  
  @js.native
  sealed trait softwareSlotAllocated extends ControlChannelTriggerStatus
  
  @js.native
  sealed trait systemError extends ControlChannelTriggerStatus
  
  @js.native
  sealed trait transportDisconnected extends ControlChannelTriggerStatus
}
