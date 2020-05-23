package typings.tampermonkey.Tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationThis extends Notification {
  var id: String
}

object NotificationThis {
  @scala.inline
  def apply(
    id: String,
    highlight: js.UndefOr[Boolean] = js.undefined,
    image: String = null,
    onclick: NotificationOnClick = null,
    ondone: NotificationOnDone = null,
    text: String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    title: String = null
  ): NotificationThis = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.get.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (onclick != null) __obj.updateDynamic("onclick")(onclick.asInstanceOf[js.Any])
    if (ondone != null) __obj.updateDynamic("ondone")(ondone.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationThis]
  }
}

