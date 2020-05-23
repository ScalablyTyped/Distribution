package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  var notification: js.UndefOr[Boolean] = js.undefined
  var parseMode: js.UndefOr[String] = js.undefined
  var replyMarkup: js.UndefOr[js.Any] = js.undefined
  var replyToMessage: js.UndefOr[Double] = js.undefined
  var webPreview: js.UndefOr[Boolean] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    notification: js.UndefOr[Boolean] = js.undefined,
    parseMode: String = null,
    replyMarkup: js.Any = null,
    replyToMessage: js.UndefOr[Double] = js.undefined,
    webPreview: js.UndefOr[Boolean] = js.undefined
  ): Notification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(notification)) __obj.updateDynamic("notification")(notification.get.asInstanceOf[js.Any])
    if (parseMode != null) __obj.updateDynamic("parseMode")(parseMode.asInstanceOf[js.Any])
    if (replyMarkup != null) __obj.updateDynamic("replyMarkup")(replyMarkup.asInstanceOf[js.Any])
    if (!js.isUndefined(replyToMessage)) __obj.updateDynamic("replyToMessage")(replyToMessage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(webPreview)) __obj.updateDynamic("webPreview")(webPreview.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
}

