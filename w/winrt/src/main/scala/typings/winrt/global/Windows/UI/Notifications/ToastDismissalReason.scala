package typings.winrt.global.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.UI.Notifications.ToastDismissalReason")
@js.native
object ToastDismissalReason extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Notifications.ToastDismissalReason with Double] = js.native
  
  /* 1 */ val applicationHidden: typings.winrt.Windows.UI.Notifications.ToastDismissalReason.applicationHidden with Double = js.native
  
  /* 2 */ val timedOut: typings.winrt.Windows.UI.Notifications.ToastDismissalReason.timedOut with Double = js.native
  
  /* 0 */ val userCanceled: typings.winrt.Windows.UI.Notifications.ToastDismissalReason.userCanceled with Double = js.native
}
