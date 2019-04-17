package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineTooltipOption extends js.Object {
  var followMouse: js.UndefOr[scala.Boolean] = js.undefined
  var overflowMethod: js.UndefOr[visLib.visLibStrings.cap | visLib.visLibStrings.flip] = js.undefined
}

object TimelineTooltipOption {
  @scala.inline
  def apply(
    followMouse: js.UndefOr[scala.Boolean] = js.undefined,
    overflowMethod: visLib.visLibStrings.cap | visLib.visLibStrings.flip = null
  ): TimelineTooltipOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(followMouse)) __obj.updateDynamic("followMouse")(followMouse)
    if (overflowMethod != null) __obj.updateDynamic("overflowMethod")(overflowMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineTooltipOption]
  }
}

