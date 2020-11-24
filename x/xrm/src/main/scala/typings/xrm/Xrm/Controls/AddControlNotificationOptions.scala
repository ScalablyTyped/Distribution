package typings.xrm.Xrm.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddControlNotificationOptions extends js.Object {
  
  /**
    * A collection of actions
    */
  var actions: js.UndefOr[js.Array[ControlNotificationAction]] = js.native
  
  /**
    * The message to display in the notification.
    * In the current release, only the first message specified in this array will be displayed.
    */
  var messages: js.Array[String] = js.native
  
  /**
    * Defines the type of notification.
    */
  var notificationLevel: js.UndefOr[NotificationLevel] = js.native
  
  /**
    * The ID to use to clear this notification when using the clearNotification method.
    */
  var uniqueId: String = js.native
}
object AddControlNotificationOptions {
  
  @scala.inline
  def apply(messages: js.Array[String], uniqueId: String): AddControlNotificationOptions = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddControlNotificationOptions]
  }
  
  @scala.inline
  implicit class AddControlNotificationOptionsOps[Self <: AddControlNotificationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMessagesVarargs(value: String*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[String]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueId(value: String): Self = this.set("uniqueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: ControlNotificationAction*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[ControlNotificationAction]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setNotificationLevel(value: NotificationLevel): Self = this.set("notificationLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationLevel: Self = this.set("notificationLevel", js.undefined)
  }
}
