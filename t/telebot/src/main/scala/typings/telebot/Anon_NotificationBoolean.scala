package typings.telebot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NotificationBoolean extends js.Object {
  var notification: js.UndefOr[Boolean] = js.undefined
}

object Anon_NotificationBoolean {
  @scala.inline
  def apply(notification: js.UndefOr[Boolean] = js.undefined): Anon_NotificationBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(notification)) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NotificationBoolean]
  }
}

