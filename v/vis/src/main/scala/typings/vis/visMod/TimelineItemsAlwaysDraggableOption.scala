package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineItemsAlwaysDraggableOption extends js.Object {
  var item: js.UndefOr[Boolean] = js.undefined
  var range: js.UndefOr[Boolean] = js.undefined
}

object TimelineItemsAlwaysDraggableOption {
  @scala.inline
  def apply(item: js.UndefOr[Boolean] = js.undefined, range: js.UndefOr[Boolean] = js.undefined): TimelineItemsAlwaysDraggableOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(item)) __obj.updateDynamic("item")(item)
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[TimelineItemsAlwaysDraggableOption]
  }
}

