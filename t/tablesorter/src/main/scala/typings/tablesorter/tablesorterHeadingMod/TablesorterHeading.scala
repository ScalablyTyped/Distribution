package typings.tablesorter.tablesorterHeadingMod

import typings.tablesorter.columnFilterMod.ColumnFilter
import typings.tablesorter.emptySortingMod.EmptySorting
import typings.tablesorter.sortOrderMod.SortOrder
import typings.tablesorter.stringSortingMod.StringSorting
import typings.tablesorter.tablesorterConfigBaseMod.TablesorterConfigBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TablesorterHeading extends TablesorterConfigBase {
  /**
    * The sorting to apply for empty cells.
    */
  var empty: js.UndefOr[EmptySorting] = js.undefined
  /**
    * The filter-concept for the column.
    */
  var filter: js.UndefOr[ColumnFilter] = js.undefined
  /**
    * The locked sort-order of the heading.
    */
  var lockedOrder: js.UndefOr[SortOrder] = js.undefined
  /**
    * Either the name of the parser to use for text-extraction or a value indicating whether text-extraction is enabled.
    */
  var parser: js.UndefOr[String | Boolean] = js.undefined
  /**
    * A value indicating whether the column should be resizable.
    */
  var resizable: js.UndefOr[Boolean] = js.undefined
  /**
    * Either the name of the parser to use for sorting or a value indicating whether sorting is enabled.
    */
  var sorter: js.UndefOr[String | Boolean] = js.undefined
  /**
    * The sorting to apply for text-cells.
    */
  var string: js.UndefOr[StringSorting] = js.undefined
}

object TablesorterHeading {
  @scala.inline
  def apply(
    dateFormat: String = null,
    empty: EmptySorting = null,
    filter: ColumnFilter = null,
    lockedOrder: SortOrder = null,
    parser: String | Boolean = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    sortInitialOrder: SortOrder = null,
    sorter: String | Boolean = null,
    string: StringSorting = null
  ): TablesorterHeading = {
    val __obj = js.Dynamic.literal()
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (lockedOrder != null) __obj.updateDynamic("lockedOrder")(lockedOrder.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (sortInitialOrder != null) __obj.updateDynamic("sortInitialOrder")(sortInitialOrder.asInstanceOf[js.Any])
    if (sorter != null) __obj.updateDynamic("sorter")(sorter.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    __obj.asInstanceOf[TablesorterHeading]
  }
}

