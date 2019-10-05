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
    timeout: Int | Double = null,
    title: String = null
  ): NotificationThis = {
    val __obj = js.Dynamic.literal(id = id)
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight)
    if (image != null) __obj.updateDynamic("image")(image)
    if (onclick != null) __obj.updateDynamic("onclick")(onclick)
    if (ondone != null) __obj.updateDynamic("ondone")(ondone)
    if (text != null) __obj.updateDynamic("text")(text)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[NotificationThis]
  }
}

