package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineMarginOption extends js.Object {
  var axis: js.UndefOr[scala.Double] = js.undefined
  var item: js.UndefOr[TimelineMarginItemType] = js.undefined
}

object TimelineMarginOption {
  @scala.inline
  def apply(axis: scala.Int | scala.Double = null, item: TimelineMarginItemType = null): TimelineMarginOption = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineMarginOption]
  }
}

