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
  
  val hardwareSlotAllocated: hardwareSlotAllocated with java.lang.String = js.native
  val hardwareSlotRequested: hardwareSlotRequested with java.lang.String = js.native
  val policyError: policyError with java.lang.String = js.native
  val serviceUnavailable: serviceUnavailable with java.lang.String = js.native
  val softwareSlotAllocated: softwareSlotAllocated with java.lang.String = js.native
  val systemError: systemError with java.lang.String = js.native
  val transportDisconnected: transportDisconnected with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.SocketsNs.ControlChannelTriggerStatus with java.lang.String
  ] = js.native
}

