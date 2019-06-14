package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ControlChannelTriggerResetReason extends js.Object

@JSGlobal("Windows.Networking.Sockets.ControlChannelTriggerResetReason")
@js.native
object ControlChannelTriggerResetReason extends js.Object {
  @js.native
  sealed trait fastUserSwitched
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.ControlChannelTriggerResetReason
  
  @js.native
  sealed trait lowPowerExit
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.ControlChannelTriggerResetReason
  
  /* 0 */ val fastUserSwitched: fastUserSwitched with scala.Double = js.native
  /* 1 */ val lowPowerExit: lowPowerExit with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.SocketsNs.ControlChannelTriggerResetReason with scala.Double
  ] = js.native
}

