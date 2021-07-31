package typings.xrm.Xrm.Controls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddControlNotificationOptions extends StObject {
  
  /**
    * A collection of actions
    */
  var actions: js.UndefOr[js.Array[ControlNotificationAction]] = js.undefined
  
  /**
    * The message to display in the notification.
    * In the current release, only the first message specified in this array will be displayed.
    */
  var messages: js.Array[String]
  
  /**
    * Defines the type of notification.
    */
  var notificationLevel: js.UndefOr[NotificationLevel] = js.undefined
  
  /**
    * The ID to use to clear this notification when using the clearNotification method.
    */
  var uniqueId: String
}
object AddControlNotificationOptions {
  
  @scala.inline
  def apply(messages: js.Array[String], uniqueId: String): AddControlNotificationOptions = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddControlNotificationOptions]
  }
  
  @scala.inline
  implicit class AddControlNotificationOptionsMutableBuilder[Self <: AddControlNotificationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[ControlNotificationAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: ControlNotificationAction*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesVarargs(value: String*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setNotificationLevel(value: NotificationLevel): Self = StObject.set(x, "notificationLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationLevelUndefined: Self = StObject.set(x, "notificationLevel", js.undefined)
    
    @scala.inline
    def setUniqueId(value: String): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
  }
}
