package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerStatus.hardwareSlotAllocated
import typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerStatus.hardwareSlotRequested
import typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerStatus.policyError
import typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerStatus.serviceUnavailable
import typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerStatus.softwareSlotAllocated
import typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerStatus.systemError
import typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerStatus.transportDisconnected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ControlChannelTriggerStatus with Double] = js.native
  /* 2 */ @js.native
  object hardwareSlotAllocated extends TopLevel[hardwareSlotAllocated with Double]
  
  /* 0 */ @js.native
  object hardwareSlotRequested extends TopLevel[hardwareSlotRequested with Double]
  
  /* 3 */ @js.native
  object policyError extends TopLevel[policyError with Double]
  
  /* 6 */ @js.native
  object serviceUnavailable extends TopLevel[serviceUnavailable with Double]
  
  /* 1 */ @js.native
  object softwareSlotAllocated extends TopLevel[softwareSlotAllocated with Double]
  
  /* 4 */ @js.native
  object systemError extends TopLevel[systemError with Double]
  
  /* 5 */ @js.native
  object transportDisconnected extends TopLevel[transportDisconnected with Double]
  
}

