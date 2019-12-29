package typings.tabulatorDashTables.Tabulator

import typings.tabulatorDashTables.tabulatorDashTablesBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeParams extends _FormatterParams {
  // datetime
  var inputFormat: js.UndefOr[String] = js.undefined
  var invalidPlaceholder: js.UndefOr[`true` | String | Double | ValueStringCallback] = js.undefined
  var outputFormat: js.UndefOr[String] = js.undefined
}

object DateTimeParams {
  @scala.inline
  def apply(
    inputFormat: String = null,
    invalidPlaceholder: `true` | String | Double | ValueStringCallback = null,
    outputFormat: String = null
  ): DateTimeParams = {
    val __obj = js.Dynamic.literal()
    if (inputFormat != null) __obj.updateDynamic("inputFormat")(inputFormat.asInstanceOf[js.Any])
    if (invalidPlaceholder != null) __obj.updateDynamic("invalidPlaceholder")(invalidPlaceholder.asInstanceOf[js.Any])
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeParams]
  }
}

