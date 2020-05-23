package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileName extends js.Object {
  var fileName: js.UndefOr[String] = js.undefined
  var notification: js.UndefOr[Boolean] = js.undefined
  var replyMarkup: js.UndefOr[js.Any] = js.undefined
  var replyToMessage: js.UndefOr[Double] = js.undefined
  var serverDownload: js.UndefOr[Boolean] = js.undefined
}

object FileName {
  @scala.inline
  def apply(
    fileName: String = null,
    notification: js.UndefOr[Boolean] = js.undefined,
    replyMarkup: js.Any = null,
    replyToMessage: js.UndefOr[Double] = js.undefined,
    serverDownload: js.UndefOr[Boolean] = js.undefined
  ): FileName = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (!js.isUndefined(notification)) __obj.updateDynamic("notification")(notification.get.asInstanceOf[js.Any])
    if (replyMarkup != null) __obj.updateDynamic("replyMarkup")(replyMarkup.asInstanceOf[js.Any])
    if (!js.isUndefined(replyToMessage)) __obj.updateDynamic("replyToMessage")(replyToMessage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverDownload)) __obj.updateDynamic("serverDownload")(serverDownload.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileName]
  }
}

