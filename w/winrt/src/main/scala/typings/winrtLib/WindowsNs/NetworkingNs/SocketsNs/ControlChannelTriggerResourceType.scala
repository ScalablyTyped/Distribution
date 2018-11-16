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
  
  val requestHardwareSlot: requestHardwareSlot with java.lang.String = js.native
  val requestSoftwareSlot: requestSoftwareSlot with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.SocketsNs.ControlChannelTriggerResourceType with java.lang.String
  ] = js.native
}

