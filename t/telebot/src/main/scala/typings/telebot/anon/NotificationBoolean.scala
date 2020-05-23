package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationBoolean extends js.Object {
  var notification: js.UndefOr[Boolean] = js.undefined
}

object NotificationBoolean {
  @scala.inline
  def apply(notification: js.UndefOr[Boolean] = js.undefined): NotificationBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(notification)) __obj.updateDynamic("notification")(notification.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationBoolean]
  }
}

