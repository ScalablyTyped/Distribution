package typings
package winrtDashUwpLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ToastHistoryChangedType extends js.Object

/** Specifies the kind of change that has happened to a notification in toast history. Used with ToastNotificationHistoryChangedTriggerDetail.ChangeType . */
@JSGlobal("Windows.UI.Notifications.ToastHistoryChangedType")
@js.native
object ToastHistoryChangedType extends js.Object {
  /** The notification was added. */
  @js.native
  sealed trait added
    extends winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.ToastHistoryChangedType
  
  /** One or more notifications were removed with a clear command. */
  @js.native
  sealed trait cleared
    extends winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.ToastHistoryChangedType
  
  /** The notification has expired. */
  @js.native
  sealed trait expired
    extends winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.ToastHistoryChangedType
  
  /** Just this notification was removed with a remove command. */
  @js.native
  sealed trait removed
    extends winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.ToastHistoryChangedType
  
  /* 3 */ val added: added with scala.Double = js.native
  /* 0 */ val cleared: cleared with scala.Double = js.native
  /* 2 */ val expired: expired with scala.Double = js.native
  /* 1 */ val removed: removed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.ToastHistoryChangedType with scala.Double
  ] = js.native
}

