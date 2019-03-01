package typings
package updateDashNotifierLib.updateDashNotifierMod.UpdateNotifierNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyOptions extends js.Object {
  var boxenOpts: js.UndefOr[BoxenOptions] = js.undefined
  var defer: js.UndefOr[scala.Boolean] = js.undefined
  var isGlobal: js.UndefOr[scala.Boolean] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object NotifyOptions {
  @scala.inline
  def apply(
    boxenOpts: BoxenOptions = null,
    defer: js.UndefOr[scala.Boolean] = js.undefined,
    isGlobal: js.UndefOr[scala.Boolean] = js.undefined,
    message: java.lang.String = null
  ): NotifyOptions = {
    val __obj = js.Dynamic.literal()
    if (boxenOpts != null) __obj.updateDynamic("boxenOpts")(boxenOpts)
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer)
    if (!js.isUndefined(isGlobal)) __obj.updateDynamic("isGlobal")(isGlobal)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[NotifyOptions]
  }
}

