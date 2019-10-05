package typings.tampermonkey.Tampermonkey

import typings.tampermonkey.tampermonkeyNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightNotification
  extends Notification
     with NotificationDetails {
  @JSName("highlight")
  var highlight_HighlightNotification: `true`
  @JSName("text")
  var text_HighlightNotification: js.UndefOr[scala.Nothing] = js.undefined
}

object HighlightNotification {
  @scala.inline
  def apply(
    highlight: `true`,
    image: String = null,
    onclick: NotificationOnClick = null,
    ondone: NotificationOnDone = null,
    text: js.UndefOr[scala.Nothing] = js.undefined,
    timeout: Int | Double = null,
    title: String = null
  ): HighlightNotification = {
    val __obj = js.Dynamic.literal(highlight = highlight)
    if (image != null) __obj.updateDynamic("image")(image)
    if (onclick != null) __obj.updateDynamic("onclick")(onclick)
    if (ondone != null) __obj.updateDynamic("ondone")(ondone)
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[HighlightNotification]
  }
}

