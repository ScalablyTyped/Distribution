package typings
package telebotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NotificationReplyMarkup extends js.Object {
  var notification: js.UndefOr[scala.Boolean] = js.undefined
  var replyMarkup: js.UndefOr[js.Any] = js.undefined
  var replyToMessage: js.UndefOr[scala.Double] = js.undefined
}

object Anon_NotificationReplyMarkup {
  @scala.inline
  def apply(
    notification: js.UndefOr[scala.Boolean] = js.undefined,
    replyMarkup: js.Any = null,
    replyToMessage: scala.Int | scala.Double = null
  ): Anon_NotificationReplyMarkup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(notification)) __obj.updateDynamic("notification")(notification)
    if (replyMarkup != null) __obj.updateDynamic("replyMarkup")(replyMarkup)
    if (replyToMessage != null) __obj.updateDynamic("replyToMessage")(replyToMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NotificationReplyMarkup]
  }
}

