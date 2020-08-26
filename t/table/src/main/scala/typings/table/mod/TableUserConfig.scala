package typings.table.mod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableUserConfig extends js.Object {
  var border: js.UndefOr[TableBorder] = js.native
  var columnCount: js.UndefOr[Double] = js.native
  var columnDefault: js.UndefOr[TableColumns] = js.native
  var columns: js.UndefOr[NumberDictionary[TableColumns]] = js.native
  var drawHorizontalLine: js.UndefOr[TableDrawHorizontalLine] = js.native
  var singleLine: js.UndefOr[Boolean] = js.native
}

object TableUserConfig {
  @scala.inline
  def apply(): TableUserConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableUserConfig]
  }
  @scala.inline
  implicit class TableUserConfigOps[Self <: TableUserConfig] (val x: Self) extends AnyVal {
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
    def setBorder(value: TableBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setColumnCount(value: Double): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnCount: Self = this.set("columnCount", js.undefined)
    @scala.inline
    def setColumnDefault(value: TableColumns): Self = this.set("columnDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnDefault: Self = this.set("columnDefault", js.undefined)
    @scala.inline
    def setColumns(value: NumberDictionary[TableColumns]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setDrawHorizontalLine(value: (/* index */ Double, /* size */ Double) => Boolean): Self = this.set("drawHorizontalLine", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDrawHorizontalLine: Self = this.set("drawHorizontalLine", js.undefined)
    @scala.inline
    def setSingleLine(value: Boolean): Self = this.set("singleLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleLine: Self = this.set("singleLine", js.undefined)
  }
  
}

