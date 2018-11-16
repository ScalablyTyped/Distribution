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
  
  val fastUserSwitched: fastUserSwitched with java.lang.String = js.native
  val lowPowerExit: lowPowerExit with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.SocketsNs.ControlChannelTriggerResetReason with java.lang.String
  ] = js.native
}

