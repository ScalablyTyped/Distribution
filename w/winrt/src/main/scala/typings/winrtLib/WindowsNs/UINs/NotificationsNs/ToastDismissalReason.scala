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
  
  val applicationHidden: applicationHidden with java.lang.String = js.native
  val timedOut: timedOut with java.lang.String = js.native
  val userCanceled: userCanceled with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.UINs.NotificationsNs.ToastDismissalReason with java.lang.String
  ] = js.native
}

