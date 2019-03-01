package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendPositionOptions extends js.Object {
  var position: js.UndefOr[LegendPositionType] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object LegendPositionOptions {
  @scala.inline
  def apply(position: LegendPositionType = null, visible: js.UndefOr[scala.Boolean] = js.undefined): LegendPositionOptions = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[LegendPositionOptions]
  }
}

