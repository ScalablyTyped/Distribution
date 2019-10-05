package typings.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ControlChannelTriggerResetReason extends js.Object

@JSGlobal("Windows.Networking.Sockets.ControlChannelTriggerResetReason")
@js.native
object ControlChannelTriggerResetReason extends js.Object {
  @js.native
  sealed trait fastUserSwitched extends ControlChannelTriggerResetReason
  
  @js.native
  sealed trait lowPowerExit extends ControlChannelTriggerResetReason
  
  /* 0 */ val fastUserSwitched: typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerResetReason.fastUserSwitched with Double = js.native
  /* 1 */ val lowPowerExit: typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerResetReason.lowPowerExit with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ControlChannelTriggerResetReason with Double] = js.native
}

