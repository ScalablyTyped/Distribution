package typings
package telebotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Notification extends js.Object {
  var notification: js.UndefOr[scala.Boolean] = js.undefined
  var parseMode: js.UndefOr[java.lang.String] = js.undefined
  var replyMarkup: js.UndefOr[js.Any] = js.undefined
  var replyToMessage: js.UndefOr[scala.Double] = js.undefined
  var webPreview: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Notification {
  @scala.inline
  def apply(
    notification: js.UndefOr[scala.Boolean] = js.undefined,
    parseMode: java.lang.String = null,
    replyMarkup: js.Any = null,
    replyToMessage: scala.Int | scala.Double = null,
    webPreview: js.UndefOr[scala.Boolean] = js.undefined
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

