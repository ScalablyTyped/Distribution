package typings
package tampermonkeyLib.TampermonkeyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  /** Flag whether to highlight the tab that sends the notification */
  var highlight: js.UndefOr[scala.Boolean] = js.undefined
  var image: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Called when the notification is closed (no matter if this was
    * triggered by a timeout or a click) or the tab was highlighted
    */
  var onclick: js.UndefOr[NotificationOnClick] = js.undefined
  /** Called in case the user clicks the notification */
  var ondone: js.UndefOr[NotificationOnDone] = js.undefined
  /** Text of the notification (optional if highlight is set) */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Time after that the notification will be hidden. `0` = disabled */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** Notification title. If not specified the script name is used */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    highlight: js.UndefOr[scala.Boolean] = js.undefined,
    image: java.lang.String = null,
    onclick: NotificationOnClick = null,
    ondone: NotificationOnDone = null,
    text: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    title: java.lang.String = null
  ): Notification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight)
    if (image != null) __obj.updateDynamic("image")(image)
    if (onclick != null) __obj.updateDynamic("onclick")(onclick)
    if (ondone != null) __obj.updateDynamic("ondone")(ondone)
    if (text != null) __obj.updateDynamic("text")(text)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Notification]
  }
}

