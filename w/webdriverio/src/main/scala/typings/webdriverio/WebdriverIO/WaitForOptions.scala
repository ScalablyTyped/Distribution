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
    interval: js.UndefOr[Double] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    timeoutMsg: String = null
  ): WaitForOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (timeoutMsg != null) __obj.updateDynamic("timeoutMsg")(timeoutMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitForOptions]
  }
}

