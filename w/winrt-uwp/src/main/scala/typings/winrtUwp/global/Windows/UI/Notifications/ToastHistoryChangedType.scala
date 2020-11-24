package typings.winrtUwp.global.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the kind of change that has happened to a notification in toast history. Used with ToastNotificationHistoryChangedTriggerDetail.ChangeType . */
@JSGlobal("Windows.UI.Notifications.ToastHistoryChangedType")
@js.native
object ToastHistoryChangedType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Notifications.ToastHistoryChangedType with Double] = js.native
  
  /* 3 */ val added: typings.winrtUwp.Windows.UI.Notifications.ToastHistoryChangedType.added with Double = js.native
  
  /* 0 */ val cleared: typings.winrtUwp.Windows.UI.Notifications.ToastHistoryChangedType.cleared with Double = js.native
  
  /* 2 */ val expired: typings.winrtUwp.Windows.UI.Notifications.ToastHistoryChangedType.expired with Double = js.native
  
  /* 1 */ val removed: typings.winrtUwp.Windows.UI.Notifications.ToastHistoryChangedType.removed with Double = js.native
}
