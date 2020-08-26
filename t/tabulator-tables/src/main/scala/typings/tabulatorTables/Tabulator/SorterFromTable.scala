package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SorterFromTable extends js.Object {
  /** The column component for the sorted column. */
  var column: ColumnComponent = js.native
  /** A string of either `asc` or `desc` indicating the direction of sort. */
  var dir: SortDirection = js.native
  /** A string of the field name for the sorted column. */
  var field: String = js.native
}

object SorterFromTable {
  @scala.inline
  def apply(column: ColumnComponent, dir: SortDirection, field: String): SorterFromTable = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[SorterFromTable]
  }
  @scala.inline
  implicit class SorterFromTableOps[Self <: SorterFromTable] (val x: Self) extends AnyVal {
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
    def setColumn(value: ColumnComponent): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setDir(value: SortDirection): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
  }
  
}

