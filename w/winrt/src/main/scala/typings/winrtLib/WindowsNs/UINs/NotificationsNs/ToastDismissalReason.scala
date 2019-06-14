package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ToastDismissalReason extends js.Object

@JSGlobal("Windows.UI.Notifications.ToastDismissalReason")
@js.native
object ToastDismissalReason extends js.Object {
  @js.native
  sealed trait applicationHidden
    extends winrtLib.WindowsNs.UINs.NotificationsNs.ToastDismissalReason
  
  @js.native
  sealed trait timedOut
    extends winrtLib.WindowsNs.UINs.NotificationsNs.ToastDismissalReason
  
  @js.native
  sealed trait userCanceled
    extends winrtLib.WindowsNs.UINs.NotificationsNs.ToastDismissalReason
  
  /* 1 */ val applicationHidden: applicationHidden with scala.Double = js.native
  /* 2 */ val timedOut: timedOut with scala.Double = js.native
  /* 0 */ val userCanceled: userCanceled with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.NotificationsNs.ToastDismissalReason with scala.Double] = js.native
}

