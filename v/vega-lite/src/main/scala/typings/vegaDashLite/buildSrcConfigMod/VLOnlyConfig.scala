package typings.vegaDashLite.buildSrcConfigMod

import typings.vegaDashLite.buildSrcScaleMod.ScaleConfig
import typings.vegaDashLite.buildSrcSelectionMod.SelectionConfig
import typings.vegaDashLite.buildSrcStackMod.StackOffset
import typings.vegaDashLite.vegaDashLiteStrings.filter
import typings.vegaDashLite.vegaDashLiteStrings.functional
import typings.vegaDashLite.vegaDashLiteStrings.plain
import typings.vegaDashLite.vegaDashLiteStrings.verbal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VLOnlyConfig extends js.Object {
  /**
    * Default axis and legend title for count fields.
    *
    * __Default value:__ `'Number of Records'`.
    *
    * @type {string}
    */
  var countTitle: js.UndefOr[String] = js.undefined
  /**
    * Defines how Vega-Lite generates title for fields.  There are three possible styles:
    * - `"verbal"` (Default) - displays function in a verbal style (e.g., "Sum of field", "Year-month of date", "field (binned)").
    * - `"function"` - displays function using parentheses and capitalized texts (e.g., "SUM(field)", "YEARMONTH(date)", "BIN(field)").
    * - `"plain"` - displays only the field name without functions (e.g., "field", "date", "field").
    */
  var fieldTitle: js.UndefOr[verbal | functional | plain] = js.undefined
  /**
    * Defines how Vega-Lite should handle invalid values (`null` and `NaN`).
    * - If set to `"filter"` (default), all data items with null values will be skipped (for line, trail, and area marks) or filtered (for other marks).
    * - If `null`, all data items are included. In this case, invalid values will be interpreted as zeroes.
    */
  var invalidValues: js.UndefOr[filter | Null] = js.undefined
  /**
    * D3 Number format for axis labels and text tables. For example "s" for SI units. Use [D3's number format pattern](https://github.com/d3/d3-format#locale_format).
    */
  var numberFormat: js.UndefOr[String] = js.undefined
  /**
    * Scale configuration determines default properties for all [scales](https://vega.github.io/vega-lite/docs/scale.html). For a full list of scale configuration options, please see the [corresponding section of the scale documentation](https://vega.github.io/vega-lite/docs/scale.html#config).
    */
  var scale: js.UndefOr[ScaleConfig] = js.undefined
  /** An object hash for defining default properties for each type of selections. */
  var selection: js.UndefOr[SelectionConfig] = js.undefined
  /** Default stack offset for stackable mark. */
  var stack: js.UndefOr[StackOffset] = js.undefined
  /**
    * Default datetime format for axis and legend labels. The format can be set directly on each axis and legend. Use [D3's time format pattern](https://github.com/d3/d3-time-format#locale_format).
    *
    * __Default value:__ `''` (The format will be automatically determined).
    *
    */
  var timeFormat: js.UndefOr[String] = js.undefined
  /** Default properties for [single view plots](https://vega.github.io/vega-lite/docs/spec.html#single). */
  var view: js.UndefOr[ViewConfig] = js.undefined
}

object VLOnlyConfig {
  @scala.inline
  def apply(
    countTitle: String = null,
    fieldTitle: verbal | functional | plain = null,
    invalidValues: filter = null,
    numberFormat: String = null,
    scale: ScaleConfig = null,
    selection: SelectionConfig = null,
    stack: StackOffset = null,
    timeFormat: String = null,
    view: ViewConfig = null
  ): VLOnlyConfig = {
    val __obj = js.Dynamic.literal()
    if (countTitle != null) __obj.updateDynamic("countTitle")(countTitle)
    if (fieldTitle != null) __obj.updateDynamic("fieldTitle")(fieldTitle.asInstanceOf[js.Any])
    if (invalidValues != null) __obj.updateDynamic("invalidValues")(invalidValues)
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat)
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (selection != null) __obj.updateDynamic("selection")(selection)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (timeFormat != null) __obj.updateDynamic("timeFormat")(timeFormat)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[VLOnlyConfig]
  }
}

