package typings.winrt.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ToastDismissalReason extends js.Object

@JSGlobal("Windows.UI.Notifications.ToastDismissalReason")
@js.native
object ToastDismissalReason extends js.Object {
  @js.native
  sealed trait applicationHidden extends ToastDismissalReason
  
  @js.native
  sealed trait timedOut extends ToastDismissalReason
  
  @js.native
  sealed trait userCanceled extends ToastDismissalReason
  
  /* 1 */ val applicationHidden: typings.winrt.Windows.UI.Notifications.ToastDismissalReason.applicationHidden with Double = js.native
  /* 2 */ val timedOut: typings.winrt.Windows.UI.Notifications.ToastDismissalReason.timedOut with Double = js.native
  /* 0 */ val userCanceled: typings.winrt.Windows.UI.Notifications.ToastDismissalReason.userCanceled with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ToastDismissalReason with Double] = js.native
}

