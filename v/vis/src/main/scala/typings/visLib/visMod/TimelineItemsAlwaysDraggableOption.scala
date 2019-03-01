package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineItemsAlwaysDraggableOption extends js.Object {
  var item: js.UndefOr[scala.Boolean] = js.undefined
  var range: js.UndefOr[scala.Boolean] = js.undefined
}

object TimelineItemsAlwaysDraggableOption {
  @scala.inline
  def apply(item: js.UndefOr[scala.Boolean] = js.undefined, range: js.UndefOr[scala.Boolean] = js.undefined): TimelineItemsAlwaysDraggableOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(item)) __obj.updateDynamic("item")(item)
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[TimelineItemsAlwaysDraggableOption]
  }
}

