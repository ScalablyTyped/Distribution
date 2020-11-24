package typings.winrtUwp.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ToastDismissalReason extends js.Object
/** Specifies the reason that a toast notification is no longer being shown. Used with ToastDismissedEventArgs.Reason . */
@JSGlobal("Windows.UI.Notifications.ToastDismissalReason")
@js.native
object ToastDismissalReason extends js.Object {
  
  /** The app explicitly hid the toast notification by calling the ToastNotifier.hide method. */
  @js.native
  sealed trait applicationHidden extends ToastDismissalReason
  
  /** The toast notification had been shown for the maximum allowed time and was faded out. The maximum time to show a toast notification is 7 seconds except in the case of long-duration toasts, in which case it is 25 seconds. */
  @js.native
  sealed trait timedOut extends ToastDismissalReason
  
  /** The user dismissed the toast notification. */
  @js.native
  sealed trait userCanceled extends ToastDismissalReason
}
