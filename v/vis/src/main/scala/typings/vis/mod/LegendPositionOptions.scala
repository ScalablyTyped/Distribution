package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendPositionOptions extends js.Object {
  var position: js.UndefOr[LegendPositionType] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object LegendPositionOptions {
  @scala.inline
  def apply(position: LegendPositionType = null, visible: js.UndefOr[Boolean] = js.undefined): LegendPositionOptions = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendPositionOptions]
  }
}

