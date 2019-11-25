package typings.updateDashNotifier.updateDashNotifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyOptions extends js.Object {
  var boxenOpts: js.UndefOr[BoxenOptions] = js.undefined
  var defer: js.UndefOr[Boolean] = js.undefined
  var isGlobal: js.UndefOr[Boolean] = js.undefined
  var message: js.UndefOr[String] = js.undefined
}

object NotifyOptions {
  @scala.inline
  def apply(
    boxenOpts: BoxenOptions = null,
    defer: js.UndefOr[Boolean] = js.undefined,
    isGlobal: js.UndefOr[Boolean] = js.undefined,
    message: String = null
  ): NotifyOptions = {
    val __obj = js.Dynamic.literal()
    if (boxenOpts != null) __obj.updateDynamic("boxenOpts")(boxenOpts.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.asInstanceOf[js.Any])
    if (!js.isUndefined(isGlobal)) __obj.updateDynamic("isGlobal")(isGlobal.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyOptions]
  }
}

