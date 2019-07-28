package typings.winrt.WindowsNs.NetworkingNs.SocketsNs

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
  
  /* 2 */ val hardwareSlotAllocated: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.ControlChannelTriggerStatus.hardwareSlotAllocated with Double = js.native
  /* 0 */ val hardwareSlotRequested: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.ControlChannelTriggerStatus.hardwareSlotRequested with Double = js.native
  /* 3 */ val policyError: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.ControlChannelTriggerStatus.policyError with Double = js.native
  /* 6 */ val serviceUnavailable: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.ControlChannelTriggerStatus.serviceUnavailable with Double = js.native
  /* 1 */ val softwareSlotAllocated: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.ControlChannelTriggerStatus.softwareSlotAllocated with Double = js.native
  /* 4 */ val systemError: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.ControlChannelTriggerStatus.systemError with Double = js.native
  /* 5 */ val transportDisconnected: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.ControlChannelTriggerStatus.transportDisconnected with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ControlChannelTriggerStatus with Double] = js.native
}

