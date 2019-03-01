package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graph2dBarChartOption extends js.Object {
  var align: js.UndefOr[Graph2dBarChartAlign] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var sideBySide: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Graph2dBarChartOption {
  @scala.inline
  def apply(
    align: Graph2dBarChartAlign = null,
    minWidth: scala.Int | scala.Double = null,
    sideBySide: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): Graph2dBarChartOption = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(sideBySide)) __obj.updateDynamic("sideBySide")(sideBySide)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph2dBarChartOption]
  }
}

