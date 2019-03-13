package typings
package tampermonkeyLib.TampermonkeyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationThis extends Notification {
  var id: java.lang.String
}

object NotificationThis {
  @scala.inline
  def apply(
    id: java.lang.String,
    highlight: js.UndefOr[scala.Boolean] = js.undefined,
    image: java.lang.String = null,
    onclick: NotificationOnClick = null,
    ondone: NotificationOnDone = null,
    text: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    title: java.lang.String = null
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

