package typings.winrtUwp.Windows.UI.Notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ToastHistoryChangedType extends StObject
/** Specifies the kind of change that has happened to a notification in toast history. Used with ToastNotificationHistoryChangedTriggerDetail.ChangeType . */
@JSGlobal("Windows.UI.Notifications.ToastHistoryChangedType")
@js.native
object ToastHistoryChangedType extends StObject {
  
  /** The notification was added. */
  @js.native
  sealed trait added
    extends StObject
       with ToastHistoryChangedType
  
  /** One or more notifications were removed with a clear command. */
  @js.native
  sealed trait cleared
    extends StObject
       with ToastHistoryChangedType
  
  /** The notification has expired. */
  @js.native
  sealed trait expired
    extends StObject
       with ToastHistoryChangedType
  
  /** Just this notification was removed with a remove command. */
  @js.native
  sealed trait removed
    extends StObject
       with ToastHistoryChangedType
}
