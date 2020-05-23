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
  
}

