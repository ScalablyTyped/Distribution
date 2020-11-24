package typings.winrtUwp.global.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the reason that a toast notification is no longer being shown. Used with ToastDismissedEventArgs.Reason . */
@JSGlobal("Windows.UI.Notifications.ToastDismissalReason")
@js.native
object ToastDismissalReason extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Notifications.ToastDismissalReason with Double] = js.native
  
  /* 1 */ val applicationHidden: typings.winrtUwp.Windows.UI.Notifications.ToastDismissalReason.applicationHidden with Double = js.native
  
  /* 2 */ val timedOut: typings.winrtUwp.Windows.UI.Notifications.ToastDismissalReason.timedOut with Double = js.native
  
  /* 0 */ val userCanceled: typings.winrtUwp.Windows.UI.Notifications.ToastDismissalReason.userCanceled with Double = js.native
}
