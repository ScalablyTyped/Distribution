package typings.winrtUwp.Windows.UI.Notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the details of a toast history changed trigger. */
trait ToastNotificationHistoryChangedTriggerDetail extends StObject {
  
  /** Gets a value representing the kind of change that caused the toast history changed trigger. */
  var changeType: ToastHistoryChangedType
}
object ToastNotificationHistoryChangedTriggerDetail {
  
  @scala.inline
  def apply(changeType: ToastHistoryChangedType): ToastNotificationHistoryChangedTriggerDetail = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastNotificationHistoryChangedTriggerDetail]
  }
  
  @scala.inline
  implicit class ToastNotificationHistoryChangedTriggerDetailMutableBuilder[Self <: ToastNotificationHistoryChangedTriggerDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeType(value: ToastHistoryChangedType): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
  }
}
