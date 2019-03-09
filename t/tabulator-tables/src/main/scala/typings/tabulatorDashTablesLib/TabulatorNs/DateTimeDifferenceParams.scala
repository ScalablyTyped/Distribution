package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabulatorDashTablesLib.TabulatorNs._FormatterParams because Already inherited */ trait DateTimeDifferenceParams extends DateTimeParams {
  // Date Time Difference
  var date: js.UndefOr[js.Any] = js.undefined
  var humanize: js.UndefOr[scala.Boolean] = js.undefined
  var suffix: js.UndefOr[scala.Boolean] = js.undefined
  var unit: js.UndefOr[
    tabulatorDashTablesLib.tabulatorDashTablesLibStrings.years | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.months | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.weeks | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.days | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.hours | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.minutes | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.seconds
  ] = js.undefined
}

object DateTimeDifferenceParams {
  @scala.inline
  def apply(
    date: js.Any = null,
    humanize: js.UndefOr[scala.Boolean] = js.undefined,
    inputFormat: java.lang.String = null,
    invalidPlaceholder: tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`true` | java.lang.String | scala.Double | ValueStringCallback = null,
    outputFormat: java.lang.String = null,
    suffix: js.UndefOr[scala.Boolean] = js.undefined,
    unit: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.years | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.months | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.weeks | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.days | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.hours | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.minutes | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.seconds = null
  ): DateTimeDifferenceParams = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (!js.isUndefined(humanize)) __obj.updateDynamic("humanize")(humanize)
    if (inputFormat != null) __obj.updateDynamic("inputFormat")(inputFormat)
    if (invalidPlaceholder != null) __obj.updateDynamic("invalidPlaceholder")(invalidPlaceholder.asInstanceOf[js.Any])
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat)
    if (!js.isUndefined(suffix)) __obj.updateDynamic("suffix")(suffix)
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeDifferenceParams]
  }
}

