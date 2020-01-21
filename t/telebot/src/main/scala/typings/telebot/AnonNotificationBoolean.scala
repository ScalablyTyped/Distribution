package typings.telebot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNotificationBoolean extends js.Object {
  var notification: js.UndefOr[Boolean] = js.undefined
}

object AnonNotificationBoolean {
  @scala.inline
  def apply(notification: js.UndefOr[Boolean] = js.undefined): AnonNotificationBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(notification)) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNotificationBoolean]
  }
}

