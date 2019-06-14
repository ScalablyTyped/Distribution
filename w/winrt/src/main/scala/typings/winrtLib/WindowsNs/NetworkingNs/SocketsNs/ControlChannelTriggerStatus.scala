package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ControlChannelTriggerStatus extends js.Object

@JSGlobal("Windows.Networking.Sockets.ControlChannelTriggerStatus")
@js.native
object ControlChannelTriggerStatus extends js.Object {
  @js.native
  sealed trait hardwareSlotAllocated
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.ControlChannelTriggerStatus
  
  @js.native
  sealed trait hardwareSlotRequested
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.ControlChannelTriggerStatus
  
  @js.native
  sealed trait policyError
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.ControlChannelTriggerStatus
  
  @js.native
  sealed trait serviceUnavailable
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.ControlChannelTriggerStatus
  
  @js.native
  sealed trait softwareSlotAllocated
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.ControlChannelTriggerStatus
  
  @js.native
  sealed trait systemError
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.ControlChannelTriggerStatus
  
  @js.native
  sealed trait transportDisconnected
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.ControlChannelTriggerStatus
  
  /* 2 */ val hardwareSlotAllocated: hardwareSlotAllocated with scala.Double = js.native
  /* 0 */ val hardwareSlotRequested: hardwareSlotRequested with scala.Double = js.native
  /* 3 */ val policyError: policyError with scala.Double = js.native
  /* 6 */ val serviceUnavailable: serviceUnavailable with scala.Double = js.native
  /* 1 */ val softwareSlotAllocated: softwareSlotAllocated with scala.Double = js.native
  /* 4 */ val systemError: systemError with scala.Double = js.native
  /* 5 */ val transportDisconnected: transportDisconnected with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.SocketsNs.ControlChannelTriggerStatus with scala.Double
  ] = js.native
}

