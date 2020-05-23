package typings.vis.mod

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
    minWidth: js.UndefOr[Double] = js.undefined,
    sideBySide: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): Graph2dBarChartOption = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sideBySide)) __obj.updateDynamic("sideBySide")(sideBySide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph2dBarChartOption]
  }
}

