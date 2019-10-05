package typings.winrtDashUwp.Windows.UI.Notifications

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
  sealed trait added extends ToastHistoryChangedType
  
  /** One or more notifications were removed with a clear command. */
  @js.native
  sealed trait cleared extends ToastHistoryChangedType
  
  /** The notification has expired. */
  @js.native
  sealed trait expired extends ToastHistoryChangedType
  
  /** Just this notification was removed with a remove command. */
  @js.native
  sealed trait removed extends ToastHistoryChangedType
  
  /* 3 */ val added: typings.winrtDashUwp.Windows.UI.Notifications.ToastHistoryChangedType.added with Double = js.native
  /* 0 */ val cleared: typings.winrtDashUwp.Windows.UI.Notifications.ToastHistoryChangedType.cleared with Double = js.native
  /* 2 */ val expired: typings.winrtDashUwp.Windows.UI.Notifications.ToastHistoryChangedType.expired with Double = js.native
  /* 1 */ val removed: typings.winrtDashUwp.Windows.UI.Notifications.ToastHistoryChangedType.removed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ToastHistoryChangedType with Double] = js.native
}

