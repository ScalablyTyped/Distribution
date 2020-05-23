package typings.tabulatorTables.Tabulator

import typings.tabulatorTables.tabulatorTablesBooleans.`true`
import typings.tabulatorTables.tabulatorTablesStrings.days
import typings.tabulatorTables.tabulatorTablesStrings.hours
import typings.tabulatorTables.tabulatorTablesStrings.minutes
import typings.tabulatorTables.tabulatorTablesStrings.months
import typings.tabulatorTables.tabulatorTablesStrings.seconds
import typings.tabulatorTables.tabulatorTablesStrings.weeks
import typings.tabulatorTables.tabulatorTablesStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.tabulatorTables.Tabulator._FormatterParams because Already inherited */ trait DateTimeDifferenceParams extends DateTimeParams {
  // Date Time Difference
  var date: js.UndefOr[js.Any] = js.undefined
  var humanize: js.UndefOr[Boolean] = js.undefined
  var suffix: js.UndefOr[Boolean] = js.undefined
  var unit: js.UndefOr[years | months | weeks | days | hours | minutes | seconds] = js.undefined
}

object DateTimeDifferenceParams {
  @scala.inline
  def apply(
    date: js.Any = null,
    humanize: js.UndefOr[Boolean] = js.undefined,
    inputFormat: String = null,
    invalidPlaceholder: `true` | String | Double | ValueStringCallback = null,
    outputFormat: String = null,
    suffix: js.UndefOr[Boolean] = js.undefined,
    unit: years | months | weeks | days | hours | minutes | seconds = null
  ): DateTimeDifferenceParams = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(humanize)) __obj.updateDynamic("humanize")(humanize.get.asInstanceOf[js.Any])
    if (inputFormat != null) __obj.updateDynamic("inputFormat")(inputFormat.asInstanceOf[js.Any])
    if (invalidPlaceholder != null) __obj.updateDynamic("invalidPlaceholder")(invalidPlaceholder.asInstanceOf[js.Any])
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(suffix)) __obj.updateDynamic("suffix")(suffix.get.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeDifferenceParams]
  }
}

