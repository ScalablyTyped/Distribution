package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graph2dBarChartOption extends js.Object {
  var align: js.UndefOr[Graph2dBarChartAlign] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var sideBySide: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Graph2dBarChartOption {
  @scala.inline
  def apply(
    align: Graph2dBarChartAlign = null,
    minWidth: Int | Double = null,
    sideBySide: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): Graph2dBarChartOption = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(sideBySide)) __obj.updateDynamic("sideBySide")(sideBySide)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph2dBarChartOption]
  }
}

