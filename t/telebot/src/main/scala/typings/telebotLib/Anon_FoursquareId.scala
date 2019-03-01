package typings
package telebotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FoursquareId extends js.Object {
  var foursquareId: js.UndefOr[java.lang.String] = js.undefined
  var notification: js.UndefOr[scala.Boolean] = js.undefined
  var replyMarkup: js.UndefOr[js.Any] = js.undefined
  var replyToMessage: js.UndefOr[scala.Double] = js.undefined
}

object Anon_FoursquareId {
  @scala.inline
  def apply(
    foursquareId: java.lang.String = null,
    notification: js.UndefOr[scala.Boolean] = js.undefined,
    replyMarkup: js.Any = null,
    replyToMessage: scala.Int | scala.Double = null
  ): Anon_FoursquareId = {
    val __obj = js.Dynamic.literal()
    if (foursquareId != null) __obj.updateDynamic("foursquareId")(foursquareId)
    if (!js.isUndefined(notification)) __obj.updateDynamic("notification")(notification)
    if (replyMarkup != null) __obj.updateDynamic("replyMarkup")(replyMarkup)
    if (replyToMessage != null) __obj.updateDynamic("replyToMessage")(replyToMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FoursquareId]
  }
}

