package typings
package telebotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileName extends js.Object {
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  var notification: js.UndefOr[scala.Boolean] = js.undefined
  var replyMarkup: js.UndefOr[js.Any] = js.undefined
  var replyToMessage: js.UndefOr[scala.Double] = js.undefined
  var serverDownload: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_FileName {
  @scala.inline
  def apply(
    fileName: java.lang.String = null,
    notification: js.UndefOr[scala.Boolean] = js.undefined,
    replyMarkup: js.Any = null,
    replyToMessage: scala.Int | scala.Double = null,
    serverDownload: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_FileName = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (!js.isUndefined(notification)) __obj.updateDynamic("notification")(notification)
    if (replyMarkup != null) __obj.updateDynamic("replyMarkup")(replyMarkup)
    if (replyToMessage != null) __obj.updateDynamic("replyToMessage")(replyToMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(serverDownload)) __obj.updateDynamic("serverDownload")(serverDownload)
    __obj.asInstanceOf[Anon_FileName]
  }
}

