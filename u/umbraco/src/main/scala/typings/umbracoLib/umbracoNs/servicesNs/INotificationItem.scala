package typings
package umbracoLib.umbracoNs.servicesNs

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
  var headline: java.lang.String
  /*longer text for the notication, trimmed after 200 characters, which can then be exanded*/
  var message: java.lang.String
  /*if set to true, the notification will not auto- close*/
  var sticky: scala.Boolean
  /*Notification type, can be: "success", "warning", "error" or "info"*/
  var `type`: NotificationType
  /*url to open when notification is clicked*/
  var url: java.lang.String
  /*path to custom view to load into the notification box*/
  var view: java.lang.String
}

object INotificationItem {
  @scala.inline
  def apply(
    actions: js.Array[IButtonAction],
    headline: java.lang.String,
    message: java.lang.String,
    sticky: scala.Boolean,
    `type`: NotificationType,
    url: java.lang.String,
    view: java.lang.String
  ): INotificationItem = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("actions")(actions)
    __obj.updateDynamic("headline")(headline)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("sticky")(sticky)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[INotificationItem]
  }
}

