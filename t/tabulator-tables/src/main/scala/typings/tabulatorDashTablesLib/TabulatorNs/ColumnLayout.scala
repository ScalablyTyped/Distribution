package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnLayout extends js.Object {
  /** field - Required (not required in icon/button columns) this is the key for this column in the data array*/
  var field: js.UndefOr[java.lang.String] = js.undefined
  /** title - Required This is the title that will be displayed in the header for this column */
  var title: java.lang.String
  /** visible - (boolean, default - true) determines if the column is visible. (see Column Visibility for more details */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** sets the width of this column, this can be set in pixels or as a percentage of total table width (if not set the system will determine the best) */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object ColumnLayout {
  @scala.inline
  def apply(
    title: java.lang.String,
    field: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Double | java.lang.String = null
  ): ColumnLayout = {
    val __obj = js.Dynamic.literal(title = title)
    if (field != null) __obj.updateDynamic("field")(field)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnLayout]
  }
}

