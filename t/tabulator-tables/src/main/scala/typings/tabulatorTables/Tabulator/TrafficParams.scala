package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficParams extends _FormatterParams {
  var color: js.UndefOr[Color] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  // Traffic
  var min: js.UndefOr[Double] = js.undefined
}

object TrafficParams {
  @scala.inline
  def apply(
    color: Color = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined
  ): TrafficParams = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficParams]
  }
}

