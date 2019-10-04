package typings.webidlDashConversions.webidlDashConversionsMod

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
    if (!js.isUndefined(clamp)) __obj.updateDynamic("clamp")(clamp)
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(enforceRange)) __obj.updateDynamic("enforceRange")(enforceRange)
    __obj.asInstanceOf[IntegerOptions]
  }
}

