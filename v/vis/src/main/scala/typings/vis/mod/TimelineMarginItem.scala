package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineMarginItem extends js.Object {
  var horizontal: js.UndefOr[Double] = js.undefined
  var vertical: js.UndefOr[Double] = js.undefined
}

object TimelineMarginItem {
  @scala.inline
  def apply(horizontal: js.UndefOr[Double] = js.undefined, vertical: js.UndefOr[Double] = js.undefined): TimelineMarginItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineMarginItem]
  }
}

