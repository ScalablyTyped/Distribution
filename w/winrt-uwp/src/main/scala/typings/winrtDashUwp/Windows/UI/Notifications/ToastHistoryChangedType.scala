package typings.winrtDashUwp.Windows.UI.Notifications

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.UI.Notifications.ToastHistoryChangedType.added
import typings.winrtDashUwp.Windows.UI.Notifications.ToastHistoryChangedType.cleared
import typings.winrtDashUwp.Windows.UI.Notifications.ToastHistoryChangedType.expired
import typings.winrtDashUwp.Windows.UI.Notifications.ToastHistoryChangedType.removed
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ToastHistoryChangedType with Double] = js.native
  /* 3 */ @js.native
  object added extends TopLevel[added with Double]
  
  /* 0 */ @js.native
  object cleared extends TopLevel[cleared with Double]
  
  /* 2 */ @js.native
  object expired extends TopLevel[expired with Double]
  
  /* 1 */ @js.native
  object removed extends TopLevel[removed with Double]
  
}

