package typings.tampermonkey.Tampermonkey

import typings.tampermonkey.tampermonkeyBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tampermonkey.Tampermonkey.TextNotification
  - typings.tampermonkey.Tampermonkey.HighlightNotification
*/
trait NotificationDetails extends js.Object

object NotificationDetails {
  @scala.inline
  def TextNotification(
    text: String,
    highlight: js.UndefOr[Boolean] = js.undefined,
    image: String = null,
    onclick: NotificationOnClick = null,
    ondone: NotificationOnDone = null,
    timeout: js.UndefOr[Double] = js.undefined,
    title: String = null
  ): NotificationDetails = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.get.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (onclick != null) __obj.updateDynamic("onclick")(onclick.asInstanceOf[js.Any])
    if (ondone != null) __obj.updateDynamic("ondone")(ondone.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationDetails]
  }
  @scala.inline
  def HighlightNotification(
    highlight: `true`,
    image: String = null,
    onclick: NotificationOnClick = null,
    ondone: NotificationOnDone = null,
    text: String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    title: String = null
  ): NotificationDetails = {
    val __obj = js.Dynamic.literal(highlight = highlight.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (onclick != null) __obj.updateDynamic("onclick")(onclick.asInstanceOf[js.Any])
    if (ondone != null) __obj.updateDynamic("ondone")(ondone.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationDetails]
  }
}

