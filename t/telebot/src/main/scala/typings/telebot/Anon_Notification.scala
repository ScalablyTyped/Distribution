package typings.telebot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Notification extends js.Object {
  var notification: js.UndefOr[Boolean] = js.undefined
  var parseMode: js.UndefOr[String] = js.undefined
  var replyMarkup: js.UndefOr[js.Any] = js.undefined
  var replyToMessage: js.UndefOr[Double] = js.undefined
  var webPreview: js.UndefOr[Boolean] = js.undefined
}

object Anon_Notification {
  @scala.inline
  def apply(
    notification: js.UndefOr[Boolean] = js.undefined,
    parseMode: String = null,
    replyMarkup: js.Any = null,
    replyToMessage: Int | Double = null,
    webPreview: js.UndefOr[Boolean] = js.undefined
  ): Anon_Notification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(notification)) __obj.updateDynamic("notification")(notification)
    if (parseMode != null) __obj.updateDynamic("parseMode")(parseMode)
    if (replyMarkup != null) __obj.updateDynamic("replyMarkup")(replyMarkup)
    if (replyToMessage != null) __obj.updateDynamic("replyToMessage")(replyToMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(webPreview)) __obj.updateDynamic("webPreview")(webPreview)
    __obj.asInstanceOf[Anon_Notification]
  }
}

