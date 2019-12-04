package typings.webdriverio.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitForOptions extends js.Object {
  var interval: js.UndefOr[Double] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var timeoutMsg: js.UndefOr[String] = js.undefined
}

object WaitForOptions {
  @scala.inline
  def apply(
    interval: Int | Double = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    timeoutMsg: String = null
  ): WaitForOptions = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (timeoutMsg != null) __obj.updateDynamic("timeoutMsg")(timeoutMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitForOptions]
  }
}

