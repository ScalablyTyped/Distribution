package typings.updateNotifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyOptions extends js.Object {
  /** Options object that will be passed to `boxen` */
  var boxenOptions: js.UndefOr[BoxenOptions] = js.undefined
  /** Defer showing the notification to after the process has exited */
  var defer: js.UndefOr[Boolean] = js.undefined
  /** Include the -g argument in the default message's npm i recommendation */
  var isGlobal: js.UndefOr[Boolean] = js.undefined
  /** Message that will be shown when an update is available */
  var message: js.UndefOr[String] = js.undefined
}

object NotifyOptions {
  @scala.inline
  def apply(
    boxenOptions: BoxenOptions = null,
    defer: js.UndefOr[Boolean] = js.undefined,
    isGlobal: js.UndefOr[Boolean] = js.undefined,
    message: String = null
  ): NotifyOptions = {
    val __obj = js.Dynamic.literal()
    if (boxenOptions != null) __obj.updateDynamic("boxenOptions")(boxenOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isGlobal)) __obj.updateDynamic("isGlobal")(isGlobal.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyOptions]
  }
}

