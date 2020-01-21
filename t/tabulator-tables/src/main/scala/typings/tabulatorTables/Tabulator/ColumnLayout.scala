package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnLayout extends js.Object {
  /** field - Required (not required in icon/button columns) this is the key for this column in the data array*/
  var field: js.UndefOr[String] = js.undefined
  /** title - Required This is the title that will be displayed in the header for this column */
  var title: String
  /** visible - (boolean, default - true) determines if the column is visible. (see Column Visibility for more details */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** sets the width of this column, this can be set in pixels or as a percentage of total table width (if not set the system will determine the best) */
  var width: js.UndefOr[Double | String] = js.undefined
}

object ColumnLayout {
  @scala.inline
  def apply(
    title: String,
    field: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null
  ): ColumnLayout = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnLayout]
  }
}

