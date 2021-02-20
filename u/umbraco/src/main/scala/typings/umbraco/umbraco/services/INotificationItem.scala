package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Notification Item
  */
@js.native
trait INotificationItem extends StObject {
  
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
  implicit class INotificationItemMutableBuilder[Self <: INotificationItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[IButtonAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: IButtonAction*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NotificationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
