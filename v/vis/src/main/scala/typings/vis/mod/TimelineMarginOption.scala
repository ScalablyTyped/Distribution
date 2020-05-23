package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineMarginOption extends js.Object {
  var axis: js.UndefOr[Double] = js.undefined
  var item: js.UndefOr[TimelineMarginItemType] = js.undefined
}

object TimelineMarginOption {
  @scala.inline
  def apply(axis: js.UndefOr[Double] = js.undefined, item: TimelineMarginItemType = null): TimelineMarginOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(axis)) __obj.updateDynamic("axis")(axis.get.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineMarginOption]
  }
}

