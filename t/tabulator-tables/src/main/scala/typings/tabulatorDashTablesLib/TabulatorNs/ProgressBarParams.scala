package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarParams extends TrafficParams {
  // Progress Bar
  var legend: js.UndefOr[
    java.lang.String | tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`true` | ValueStringCallback
  ] = js.undefined
  var legendAlign: js.UndefOr[Align] = js.undefined
  var legendColor: js.UndefOr[Color] = js.undefined
}

object ProgressBarParams {
  @scala.inline
  def apply(
    color: Color = null,
    legend: java.lang.String | tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`true` | ValueStringCallback = null,
    legendAlign: Align = null,
    legendColor: Color = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null
  ): ProgressBarParams = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (legendAlign != null) __obj.updateDynamic("legendAlign")(legendAlign)
    if (legendColor != null) __obj.updateDynamic("legendColor")(legendColor.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarParams]
  }
}

