package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Notification Item
  */
trait INotificationItem extends js.Object {
  /*Collection of button actions to append (label, func, cssClass)*/
  var actions: js.Array[IButtonAction]
  /*Short headline*/
  var headline: String
  /*longer text for the notication, trimmed after 200 characters, which can then be exanded*/
  var message: String
  /*if set to true, the notification will not auto- close*/
  var sticky: Boolean
  /*Notification type, can be: "success", "warning", "error" or "info"*/
  var `type`: NotificationType
  /*url to open when notification is clicked*/
  var url: String
  /*path to custom view to load into the notification box*/
  var view: String
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
}

