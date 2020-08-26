package typings.tablesorter.tablesorterHeadingMod

import typings.tablesorter.columnFilterMod.ColumnFilter
import typings.tablesorter.emptySortingMod.EmptySorting
import typings.tablesorter.sortOrderMod.SortOrder
import typings.tablesorter.stringSortingMod.StringSorting
import typings.tablesorter.tablesorterConfigBaseMod.TablesorterConfigBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TablesorterHeading extends TablesorterConfigBase {
  /**
    * The sorting to apply for empty cells.
    */
  var empty: js.UndefOr[EmptySorting] = js.native
  /**
    * The filter-concept for the column.
    */
  var filter: js.UndefOr[ColumnFilter] = js.native
  /**
    * The locked sort-order of the heading.
    */
  var lockedOrder: js.UndefOr[SortOrder] = js.native
  /**
    * Either the name of the parser to use for text-extraction or a value indicating whether text-extraction is enabled.
    */
  var parser: js.UndefOr[String | Boolean] = js.native
  /**
    * A value indicating whether the column should be resizable.
    */
  var resizable: js.UndefOr[Boolean] = js.native
  /**
    * Either the name of the parser to use for sorting or a value indicating whether sorting is enabled.
    */
  var sorter: js.UndefOr[String | Boolean] = js.native
  /**
    * The sorting to apply for text-cells.
    */
  var string: js.UndefOr[StringSorting] = js.native
}

object TablesorterHeading {
  @scala.inline
  def apply(): TablesorterHeading = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TablesorterHeading]
  }
  @scala.inline
  implicit class TablesorterHeadingOps[Self <: TablesorterHeading] (val x: Self) extends AnyVal {
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
    def setEmpty(value: EmptySorting): Self = this.set("empty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    @scala.inline
    def setFilter(value: ColumnFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setLockedOrder(value: SortOrder): Self = this.set("lockedOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockedOrder: Self = this.set("lockedOrder", js.undefined)
    @scala.inline
    def setParser(value: String | Boolean): Self = this.set("parser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    @scala.inline
    def setSorter(value: String | Boolean): Self = this.set("sorter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSorter: Self = this.set("sorter", js.undefined)
    @scala.inline
    def setString(value: StringSorting): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
  }
  
}

