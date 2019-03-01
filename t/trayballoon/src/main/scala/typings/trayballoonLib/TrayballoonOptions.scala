package typings
package trayballoonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrayballoonOptions extends js.Object {
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var text: java.lang.String
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  @JSName("wait")
  var wait_FTrayballoonOptions: js.UndefOr[scala.Boolean] = js.undefined
}

object TrayballoonOptions {
  @scala.inline
  def apply(
    text: java.lang.String,
    icon: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    wait: js.UndefOr[scala.Boolean] = js.undefined
  ): TrayballoonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[TrayballoonOptions]
  }
}

