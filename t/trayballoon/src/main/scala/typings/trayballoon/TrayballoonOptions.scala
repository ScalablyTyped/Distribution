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
    timeout: js.UndefOr[Double] = js.undefined,
    title: String = null,
    wait: js.UndefOr[Boolean] = js.undefined
  ): TrayballoonOptions = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrayballoonOptions]
  }
}

