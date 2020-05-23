package typings.tampermonkey.Tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  /** Flag whether to highlight the tab that sends the notification */
  var highlight: js.UndefOr[Boolean] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  /**
    * Called when the notification is closed (no matter if this was
    * triggered by a timeout or a click) or the tab was highlighted
    */
  var onclick: js.UndefOr[NotificationOnClick] = js.undefined
  /** Called in case the user clicks the notification */
  var ondone: js.UndefOr[NotificationOnDone] = js.undefined
  /** Text of the notification (optional if highlight is set) */
  var text: js.UndefOr[String] = js.undefined
  /** Time after that the notification will be hidden. `0` = disabled */
  var timeout: js.UndefOr[Double] = js.undefined
  /** Notification title. If not specified the script name is used */
  var title: js.UndefOr[String] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    highlight: js.UndefOr[Boolean] = js.undefined,
    image: String = null,
    onclick: NotificationOnClick = null,
    ondone: NotificationOnDone = null,
    text: String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    title: String = null
  ): Notification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.get.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (onclick != null) __obj.updateDynamic("onclick")(onclick.asInstanceOf[js.Any])
    if (ondone != null) __obj.updateDynamic("ondone")(ondone.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
}

