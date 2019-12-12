package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerResetReason.fastUserSwitched
import typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerResetReason.lowPowerExit
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ControlChannelTriggerResetReason with Double] = js.native
  /* 0 */ @js.native
  object fastUserSwitched extends TopLevel[fastUserSwitched with Double]
  
  /* 1 */ @js.native
  object lowPowerExit extends TopLevel[lowPowerExit with Double]
  
}

