package typings
package tgfancyLib.tgfancyMod.TgfancyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RatelimitingOptions extends js.Object {
  var maxBackoff: js.UndefOr[scala.Double] = js.undefined
  var maxRetries: js.UndefOr[scala.Double] = js.undefined
  @JSName("notify")
  var notify_FRatelimitingOptions: js.UndefOr[
    js.Function2[/* methodName */ java.lang.String, /* repeated */ js.Any, scala.Unit]
  ] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object RatelimitingOptions {
  @scala.inline
  def apply(
    maxBackoff: scala.Int | scala.Double = null,
    maxRetries: scala.Int | scala.Double = null,
    notify: js.Function2[/* methodName */ java.lang.String, /* repeated */ js.Any, scala.Unit] = null,
    timeout: scala.Int | scala.Double = null
  ): RatelimitingOptions = {
    val __obj = js.Dynamic.literal()
    if (maxBackoff != null) __obj.updateDynamic("maxBackoff")(maxBackoff.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (notify != null) __obj.updateDynamic("notify")(notify)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatelimitingOptions]
  }
}

