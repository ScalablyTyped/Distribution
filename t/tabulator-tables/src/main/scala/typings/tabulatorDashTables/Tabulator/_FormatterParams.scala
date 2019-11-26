package typings.tabulatorDashTables.Tabulator

import typings.tabulatorDashTables.tabulatorDashTablesNumbers.`true`
import typings.tabulatorDashTables.tabulatorDashTablesStrings.days
import typings.tabulatorDashTables.tabulatorDashTablesStrings.hours
import typings.tabulatorDashTables.tabulatorDashTablesStrings.minutes
import typings.tabulatorDashTables.tabulatorDashTablesStrings.months
import typings.tabulatorDashTables.tabulatorDashTablesStrings.seconds
import typings.tabulatorDashTables.tabulatorDashTablesStrings.weeks
import typings.tabulatorDashTables.tabulatorDashTablesStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _FormatterParams extends js.Object

object _FormatterParams {
  @scala.inline
  def StarRatingParams(stars: Int | Double = null): _FormatterParams = {
    val __obj = js.Dynamic.literal()
    if (stars != null) __obj.updateDynamic("stars")(stars.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FormatterParams]
  }
  @scala.inline
  def TrafficParams(color: Color = null, max: Int | Double = null, min: Int | Double = null): _FormatterParams = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FormatterParams]
  }
  @scala.inline
  def ImageParams(height: String = null, width: String = null): _FormatterParams = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FormatterParams]
  }
  @scala.inline
  def DateTimeDifferenceParams(
    date: js.Any = null,
    humanize: js.UndefOr[Boolean] = js.undefined,
    inputFormat: String = null,
    invalidPlaceholder: `true` | String | Double | ValueStringCallback = null,
    outputFormat: String = null,
    suffix: js.UndefOr[Boolean] = js.undefined,
    unit: years | months | weeks | days | hours | minutes | seconds = null
  ): _FormatterParams = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(humanize)) __obj.updateDynamic("humanize")(humanize.asInstanceOf[js.Any])
    if (inputFormat != null) __obj.updateDynamic("inputFormat")(inputFormat.asInstanceOf[js.Any])
    if (invalidPlaceholder != null) __obj.updateDynamic("invalidPlaceholder")(invalidPlaceholder.asInstanceOf[js.Any])
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(suffix)) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FormatterParams]
  }
  @scala.inline
  def LinkParams(
    download: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    labelField: String = null,
    target: String = null,
    url: String = null,
    urlField: String = null,
    urlPrefix: String = null
  ): _FormatterParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(download)) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelField != null) __obj.updateDynamic("labelField")(labelField.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urlField != null) __obj.updateDynamic("urlField")(urlField.asInstanceOf[js.Any])
    if (urlPrefix != null) __obj.updateDynamic("urlPrefix")(urlPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FormatterParams]
  }
  @scala.inline
  def MoneyParams(
    decimal: String = null,
    precision: Boolean | Double = null,
    symbol: String = null,
    symbolAfter: js.UndefOr[Boolean] = js.undefined,
    thousand: String = null
  ): _FormatterParams = {
    val __obj = js.Dynamic.literal()
    if (decimal != null) __obj.updateDynamic("decimal")(decimal.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (!js.isUndefined(symbolAfter)) __obj.updateDynamic("symbolAfter")(symbolAfter.asInstanceOf[js.Any])
    if (thousand != null) __obj.updateDynamic("thousand")(thousand.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FormatterParams]
  }
  @scala.inline
  def TickCrossParams(
    allowEmpty: js.UndefOr[Boolean] = js.undefined,
    allowTruthy: js.UndefOr[Boolean] = js.undefined,
    crossElement: Boolean | String = null,
    tickElement: Boolean | String = null
  ): _FormatterParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTruthy)) __obj.updateDynamic("allowTruthy")(allowTruthy.asInstanceOf[js.Any])
    if (crossElement != null) __obj.updateDynamic("crossElement")(crossElement.asInstanceOf[js.Any])
    if (tickElement != null) __obj.updateDynamic("tickElement")(tickElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FormatterParams]
  }
  @scala.inline
  def DateTimeParams(
    inputFormat: String = null,
    invalidPlaceholder: `true` | String | Double | ValueStringCallback = null,
    outputFormat: String = null
  ): _FormatterParams = {
    val __obj = js.Dynamic.literal()
    if (inputFormat != null) __obj.updateDynamic("inputFormat")(inputFormat.asInstanceOf[js.Any])
    if (invalidPlaceholder != null) __obj.updateDynamic("invalidPlaceholder")(invalidPlaceholder.asInstanceOf[js.Any])
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FormatterParams]
  }
}

