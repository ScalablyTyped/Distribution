package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Notification Item
  */
@js.native
trait INotificationItem extends js.Object {
  
  /*Collection of button actions to append (label, func, cssClass)*/
  var actions: js.Array[IButtonAction] = js.native
  
  /*Short headline*/
  var headline: String = js.native
  
  /*longer text for the notication, trimmed after 200 characters, which can then be exanded*/
  var message: String = js.native
  
  /*if set to true, the notification will not auto- close*/
  var sticky: Boolean = js.native
  
  /*Notification type, can be: "success", "warning", "error" or "info"*/
  var `type`: NotificationType = js.native
  
  /*url to open when notification is clicked*/
  var url: String = js.native
  
  /*path to custom view to load into the notification box*/
  var view: String = js.native
}
object INotificationItem {
  
  @scala.inline
  def apply(
    actions: js.Array[IButtonAction],
    headline: String,
    message: String,
    sticky: Boolean,
    `type`: NotificationType,
    url: String,
    view: String
  ): INotificationItem = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], headline = headline.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sticky = sticky.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotificationItem]
  }
  
  @scala.inline
  implicit class INotificationItemOps[Self <: INotificationItem] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: IButtonAction*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[IButtonAction]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadline(value: String): Self = this.set("headline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSticky(value: Boolean): Self = this.set("sticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NotificationType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
  }
}
