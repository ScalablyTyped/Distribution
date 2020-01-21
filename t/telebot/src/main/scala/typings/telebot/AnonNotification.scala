package typings.telebot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNotification extends js.Object {
  var notification: js.UndefOr[Boolean] = js.undefined
  var parseMode: js.UndefOr[String] = js.undefined
  var replyMarkup: js.UndefOr[js.Any] = js.undefined
  var replyToMessage: js.UndefOr[Double] = js.undefined
  var webPreview: js.UndefOr[Boolean] = js.undefined
}

object AnonNotification {
  @scala.inline
  def apply(
    notification: js.UndefOr[Boolean] = js.undefined,
    parseMode: String = null,
    replyMarkup: js.Any = null,
    replyToMessage: Int | Double = null,
    webPreview: js.UndefOr[Boolean] = js.undefined
  ): AnonNotification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(notification)) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    if (parseMode != null) __obj.updateDynamic("parseMode")(parseMode.asInstanceOf[js.Any])
    if (replyMarkup != null) __obj.updateDynamic("replyMarkup")(replyMarkup.asInstanceOf[js.Any])
    if (replyToMessage != null) __obj.updateDynamic("replyToMessage")(replyToMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(webPreview)) __obj.updateDynamic("webPreview")(webPreview.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNotification]
  }
}

