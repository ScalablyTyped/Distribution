package typings.tampermonkey.Tampermonkey

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
    timeout: js.UndefOr[Double] = js.undefined,
    title: String = null
  ): TextNotification = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.get.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (onclick != null) __obj.updateDynamic("onclick")(onclick.asInstanceOf[js.Any])
    if (ondone != null) __obj.updateDynamic("ondone")(ondone.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextNotification]
  }
}

