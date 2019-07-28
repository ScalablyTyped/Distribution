package typings.tampermonkey.TampermonkeyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextNotification
  extends Notification
     with NotificationDetails {
  /** Text of the notification (optional if highlight is set) */
  @JSName("text")
  var text_TextNotification: String
}

object TextNotification {
  @scala.inline
  def apply(
    text: String,
    highlight: js.UndefOr[Boolean] = js.undefined,
    image: String = null,
    onclick: NotificationOnClick = null,
    ondone: NotificationOnDone = null,
    timeout: Int | Double = null,
    title: String = null
  ): TextNotification = {
    val __obj = js.Dynamic.literal(text = text)
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight)
    if (image != null) __obj.updateDynamic("image")(image)
    if (onclick != null) __obj.updateDynamic("onclick")(onclick)
    if (ondone != null) __obj.updateDynamic("ondone")(ondone)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[TextNotification]
  }
}

