package typings.tablesorter.columnWidgetOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnOptions extends js.Object {
  /**
    * The names of the classes to apply when sorting in chronological order.
    */
  var columns: js.UndefOr[js.Array[String]] = js.native
  /**
    * A value indicating whether the class specified in `columns` should also be applied to the table-foot.
    */
  var columns_tfoot: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether the class specified in `columns` should also be applied to the table-head.
    */
  var columns_thead: js.UndefOr[Boolean] = js.native
}

object ColumnOptions {
  @scala.inline
  def apply(): ColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnOptions]
  }
  @scala.inline
  implicit class ColumnOptionsOps[Self <: ColumnOptions] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: String*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setColumns_tfoot(value: Boolean): Self = this.set("columns_tfoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns_tfoot: Self = this.set("columns_tfoot", js.undefined)
    @scala.inline
    def setColumns_thead(value: Boolean): Self = this.set("columns_thead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns_thead: Self = this.set("columns_thead", js.undefined)
  }
  
}

