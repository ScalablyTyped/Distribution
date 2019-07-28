package typings.telebot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Caption extends js.Object {
  var caption: js.UndefOr[String] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var notification: js.UndefOr[Boolean] = js.undefined
  var replyMarkup: js.UndefOr[js.Any] = js.undefined
  var replyToMessage: js.UndefOr[Double] = js.undefined
  var serverDownload: js.UndefOr[Boolean] = js.undefined
}

object Anon_Caption {
  @scala.inline
  def apply(
    caption: String = null,
    fileName: String = null,
    notification: js.UndefOr[Boolean] = js.undefined,
    replyMarkup: js.Any = null,
    replyToMessage: Int | Double = null,
    serverDownload: js.UndefOr[Boolean] = js.undefined
  ): Anon_Caption = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (!js.isUndefined(notification)) __obj.updateDynamic("notification")(notification)
    if (replyMarkup != null) __obj.updateDynamic("replyMarkup")(replyMarkup)
    if (replyToMessage != null) __obj.updateDynamic("replyToMessage")(replyToMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(serverDownload)) __obj.updateDynamic("serverDownload")(serverDownload)
    __obj.asInstanceOf[Anon_Caption]
  }
}

