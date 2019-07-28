package typings.trayballoon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrayballoonOptions extends js.Object {
  var icon: js.UndefOr[String] = js.undefined
  var text: String
  var timeout: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  @JSName("wait")
  var wait_FTrayballoonOptions: js.UndefOr[Boolean] = js.undefined
}

object TrayballoonOptions {
  @scala.inline
  def apply(
    text: String,
    icon: String = null,
    timeout: Int | Double = null,
    title: String = null,
    wait: js.UndefOr[Boolean] = js.undefined
  ): TrayballoonOptions = {
    val __obj = js.Dynamic.literal(text = text)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[TrayballoonOptions]
  }
}

