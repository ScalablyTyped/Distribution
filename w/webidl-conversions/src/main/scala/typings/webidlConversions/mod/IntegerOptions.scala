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
    enforceRange: js.UndefOr[Boolean] = js.undefined,
    globals: Globals = null
  ): IntegerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clamp)) __obj.updateDynamic("clamp")(clamp.get.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceRange)) __obj.updateDynamic("enforceRange")(enforceRange.get.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerOptions]
  }
}

