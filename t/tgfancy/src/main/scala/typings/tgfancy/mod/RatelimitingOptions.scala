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
    maxBackoff: Int | Double = null,
    maxRetries: Int | Double = null,
    notify: (/* methodName */ String, /* repeated */ js.Any) => Unit = null,
    timeout: Int | Double = null
  ): RatelimitingOptions = {
    val __obj = js.Dynamic.literal()
    if (maxBackoff != null) __obj.updateDynamic("maxBackoff")(maxBackoff.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (notify != null) __obj.updateDynamic("notify")(js.Any.fromFunction2(notify))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatelimitingOptions]
  }
}

