package typings.webidlConversions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegerOptions extends Options {
  var clamp: js.UndefOr[Boolean] = js.undefined
  var enforceRange: js.UndefOr[Boolean] = js.undefined
}

object IntegerOptions {
  @scala.inline
  def apply(
    clamp: js.UndefOr[Boolean] = js.undefined,
    context: String = null,
    enforceRange: js.UndefOr[Boolean] = js.undefined
  ): IntegerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clamp)) __obj.updateDynamic("clamp")(clamp.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceRange)) __obj.updateDynamic("enforceRange")(enforceRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerOptions]
  }
}

