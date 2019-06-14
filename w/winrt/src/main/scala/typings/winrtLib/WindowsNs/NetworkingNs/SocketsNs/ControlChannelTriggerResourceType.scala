package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ControlChannelTriggerResourceType extends js.Object

@JSGlobal("Windows.Networking.Sockets.ControlChannelTriggerResourceType")
@js.native
object ControlChannelTriggerResourceType extends js.Object {
  @js.native
  sealed trait requestHardwareSlot
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.ControlChannelTriggerResourceType
  
  @js.native
  sealed trait requestSoftwareSlot
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.ControlChannelTriggerResourceType
  
  /* 1 */ val requestHardwareSlot: requestHardwareSlot with scala.Double = js.native
  /* 0 */ val requestSoftwareSlot: requestSoftwareSlot with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.SocketsNs.ControlChannelTriggerResourceType with scala.Double
  ] = js.native
}

