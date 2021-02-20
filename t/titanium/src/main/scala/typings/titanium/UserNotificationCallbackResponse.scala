package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response when receiving pending or local notifications
  * in <Titanium.App.iOS.UserNotificationCenter.getPendingNotifications> and
  * <Titanium.App.iOS.UserNotificationCenter.getDeliveredNotifications>.
  */
@js.native
trait UserNotificationCallbackResponse extends StObject {
  
  /**
    * An array of identifiers used to create notifications.
    */
  var notifications: js.UndefOr[js.Array[UserNotificationDictionary]] = js.native
}
object UserNotificationCallbackResponse {
  
  @scala.inline
  def apply(): UserNotificationCallbackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserNotificationCallbackResponse]
  }
  
  @scala.inline
  implicit class UserNotificationCallbackResponseMutableBuilder[Self <: UserNotificationCallbackResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotifications(value: js.Array[UserNotificationDictionary]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
    
    @scala.inline
    def setNotificationsVarargs(value: UserNotificationDictionary*): Self = StObject.set(x, "notifications", js.Array(value :_*))
  }
}
