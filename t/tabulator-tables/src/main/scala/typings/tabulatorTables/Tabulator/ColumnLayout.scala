package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnLayout extends js.Object {
  /** field - Required (not required in icon/button columns) this is the key for this column in the data array*/
  var field: js.UndefOr[String] = js.native
  /** title - Required This is the title that will be displayed in the header for this column */
  var title: String = js.native
  /** visible - (boolean, default - true) determines if the column is visible. (see Column Visibility for more details */
  var visible: js.UndefOr[Boolean] = js.native
  /** sets the width of this column, this can be set in pixels or as a percentage of total table width (if not set the system will determine the best) */
  var width: js.UndefOr[Double | String] = js.native
}

object ColumnLayout {
  @scala.inline
  def apply(title: String): ColumnLayout = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnLayout]
  }
  @scala.inline
  implicit class ColumnLayoutOps[Self <: ColumnLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

