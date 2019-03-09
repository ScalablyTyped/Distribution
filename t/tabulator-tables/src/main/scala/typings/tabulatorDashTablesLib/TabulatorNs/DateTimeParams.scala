package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeParams extends _FormatterParams {
  // datetime
  var inputFormat: js.UndefOr[java.lang.String] = js.undefined
  var invalidPlaceholder: js.UndefOr[
    tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`true` | java.lang.String | scala.Double | ValueStringCallback
  ] = js.undefined
  var outputFormat: js.UndefOr[java.lang.String] = js.undefined
}

object DateTimeParams {
  @scala.inline
  def apply(
    inputFormat: java.lang.String = null,
    invalidPlaceholder: tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`true` | java.lang.String | scala.Double | ValueStringCallback = null,
    outputFormat: java.lang.String = null
  ): DateTimeParams = {
    val __obj = js.Dynamic.literal()
    if (inputFormat != null) __obj.updateDynamic("inputFormat")(inputFormat)
    if (invalidPlaceholder != null) __obj.updateDynamic("invalidPlaceholder")(invalidPlaceholder.asInstanceOf[js.Any])
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat)
    __obj.asInstanceOf[DateTimeParams]
  }
}

