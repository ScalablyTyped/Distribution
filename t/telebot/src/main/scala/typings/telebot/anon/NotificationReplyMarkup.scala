package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationReplyMarkup extends js.Object {
  var notification: js.UndefOr[Boolean] = js.undefined
  var replyMarkup: js.UndefOr[js.Any] = js.undefined
  var replyToMessage: js.UndefOr[Double] = js.undefined
}

object NotificationReplyMarkup {
  @scala.inline
  def apply(
    notification: js.UndefOr[Boolean] = js.undefined,
    replyMarkup: js.Any = null,
    replyToMessage: js.UndefOr[Double] = js.undefined
  ): NotificationReplyMarkup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(notification)) __obj.updateDynamic("notification")(notification.get.asInstanceOf[js.Any])
    if (replyMarkup != null) __obj.updateDynamic("replyMarkup")(replyMarkup.asInstanceOf[js.Any])
    if (!js.isUndefined(replyToMessage)) __obj.updateDynamic("replyToMessage")(replyToMessage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationReplyMarkup]
  }
}

