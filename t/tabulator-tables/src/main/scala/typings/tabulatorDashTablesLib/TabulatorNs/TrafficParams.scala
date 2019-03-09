package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficParams extends _FormatterParams {
  var color: js.UndefOr[Color] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  // Traffic
  var min: js.UndefOr[scala.Double] = js.undefined
}

object TrafficParams {
  @scala.inline
  def apply(color: Color = null, max: scala.Int | scala.Double = null, min: scala.Int | scala.Double = null): TrafficParams = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficParams]
  }
}

