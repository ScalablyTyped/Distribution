package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Notification args
  */
trait INotificationArgs extends js.Object {
  var header: String
  var message: String
  var `type`: NotificationType
}

object INotificationArgs {
  @scala.inline
  def apply(header: String, message: String, `type`: NotificationType): INotificationArgs = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotificationArgs]
  }
}

