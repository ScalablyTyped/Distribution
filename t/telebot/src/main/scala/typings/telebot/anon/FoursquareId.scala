package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoursquareId extends js.Object {
  var foursquareId: js.UndefOr[String] = js.undefined
  var notification: js.UndefOr[Boolean] = js.undefined
  var replyMarkup: js.UndefOr[js.Any] = js.undefined
  var replyToMessage: js.UndefOr[Double] = js.undefined
}

object FoursquareId {
  @scala.inline
  def apply(
    foursquareId: String = null,
    notification: js.UndefOr[Boolean] = js.undefined,
    replyMarkup: js.Any = null,
    replyToMessage: js.UndefOr[Double] = js.undefined
  ): FoursquareId = {
    val __obj = js.Dynamic.literal()
    if (foursquareId != null) __obj.updateDynamic("foursquareId")(foursquareId.asInstanceOf[js.Any])
    if (!js.isUndefined(notification)) __obj.updateDynamic("notification")(notification.get.asInstanceOf[js.Any])
    if (replyMarkup != null) __obj.updateDynamic("replyMarkup")(replyMarkup.asInstanceOf[js.Any])
    if (!js.isUndefined(replyToMessage)) __obj.updateDynamic("replyToMessage")(replyToMessage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoursquareId]
  }
}

