package typings.tgfancy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RatelimitingOptions extends js.Object {
  var maxBackoff: js.UndefOr[Double] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  @JSName("notify")
  var notify_FRatelimitingOptions: js.UndefOr[js.Function2[/* methodName */ String, /* repeated */ js.Any, Unit]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object RatelimitingOptions {
  @scala.inline
  def apply(
    maxBackoff: js.UndefOr[Double] = js.undefined,
    maxRetries: js.UndefOr[Double] = js.undefined,
    notify: (/* methodName */ String, /* repeated */ js.Any) => Unit = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): RatelimitingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxBackoff)) __obj.updateDynamic("maxBackoff")(maxBackoff.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (notify != null) __obj.updateDynamic("notify")(js.Any.fromFunction2(notify))
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatelimitingOptions]
  }
}

