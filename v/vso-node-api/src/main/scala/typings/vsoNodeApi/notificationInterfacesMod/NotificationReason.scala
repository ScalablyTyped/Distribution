package typings.vsoNodeApi.notificationInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationReason extends StObject {
  
  var notificationReasonType: NotificationReasonType
  
  var targetIdentities: js.Array[IdentityRef]
}
object NotificationReason {
  
  @scala.inline
  def apply(notificationReasonType: NotificationReasonType, targetIdentities: js.Array[IdentityRef]): NotificationReason = {
    val __obj = js.Dynamic.literal(notificationReasonType = notificationReasonType.asInstanceOf[js.Any], targetIdentities = targetIdentities.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationReason]
  }
  
  @scala.inline
  implicit class NotificationReasonMutableBuilder[Self <: NotificationReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotificationReasonType(value: NotificationReasonType): Self = StObject.set(x, "notificationReasonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdentities(value: js.Array[IdentityRef]): Self = StObject.set(x, "targetIdentities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdentitiesVarargs(value: IdentityRef*): Self = StObject.set(x, "targetIdentities", js.Array(value :_*))
  }
}
