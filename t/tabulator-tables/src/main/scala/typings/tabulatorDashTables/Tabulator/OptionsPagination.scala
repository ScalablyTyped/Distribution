package typings.tabulatorDashTables.Tabulator

import typings.std.HTMLElement
import typings.std.Record
import typings.tabulatorDashTables.tabulatorDashTablesBooleans.`true`
import typings.tabulatorDashTables.tabulatorDashTablesStrings.local
import typings.tabulatorDashTables.tabulatorDashTablesStrings.page
import typings.tabulatorDashTables.tabulatorDashTablesStrings.remote
import typings.tabulatorDashTables.tabulatorDashTablesStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsPagination extends js.Object {
  /** Choose pagination method, "local" or "remote"	 */
  var pagination: js.UndefOr[remote | local] = js.undefined
  /** When using the addRow function on a paginated table, rows will be added relative to the current page (ie to the top or bottom of the current page), with overflowing rows being shifted onto the next page.
    If you would prefer rows to be added relative to the table (firs/last page) then you can use the paginationAddRow option. it can take one of two values:
    page - add rows relative to current page (default)
    table - add rows relative to the table */
  var paginationAddRow: js.UndefOr[table | page] = js.undefined
  /**  The number of pagination page buttons shown in the footer using the paginationButtonCount option. By default this has a value of 5.*/
  var paginationButtonCount: js.UndefOr[Double] = js.undefined
  /** Lookup list to link expected data feilds from the server to their function	* default* {
    "current_page":"current_page",
    "last_page":"last_page",
    "data":"data",
    }* *
    */
  var paginationDataReceived: js.UndefOr[Record[String, String]] = js.undefined
  /** Lookup list to link fields expected by the server to their function* default:* {
    "page":"page",
    "size":"size",
    "sorters":"sorters",
    "filters":"filters",
    }
    	 */
  var paginationDataSent: js.UndefOr[Record[String, String]] = js.undefined
  /**  By default the pagination controls are added to the footer of the table. If you wish the controls to be created in another element pass a DOM node or a CSS selector for that element to the paginationElement option.*/
  var paginationElement: js.UndefOr[HTMLElement | String] = js.undefined
  /** Specify that a specific page should be loaded when the table first load */
  var paginationInitialPage: js.UndefOr[Double] = js.undefined
  /** Set the number of rows in each page	 */
  var paginationSize: js.UndefOr[Double] = js.undefined
  /**  Setting this option to true will cause Tabulator to create a list of page size options, that are multiples of the current page size. In the example below, the list will have the values of 5, 10, 15 and 20.
    When using the page size selector like this, if you use the setPageSize function to set the page size to a value not in the list, the list will be regenerated using the new page size as the starting valuer	*/
  var paginationSizeSelector: js.UndefOr[`true` | js.Array[Double]] = js.undefined
}

object OptionsPagination {
  @scala.inline
  def apply(
    pagination: remote | local = null,
    paginationAddRow: table | page = null,
    paginationButtonCount: Int | Double = null,
    paginationDataReceived: Record[String, String] = null,
    paginationDataSent: Record[String, String] = null,
    paginationElement: HTMLElement | String = null,
    paginationInitialPage: Int | Double = null,
    paginationSize: Int | Double = null,
    paginationSizeSelector: `true` | js.Array[Double] = null
  ): OptionsPagination = {
    val __obj = js.Dynamic.literal()
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (paginationAddRow != null) __obj.updateDynamic("paginationAddRow")(paginationAddRow.asInstanceOf[js.Any])
    if (paginationButtonCount != null) __obj.updateDynamic("paginationButtonCount")(paginationButtonCount.asInstanceOf[js.Any])
    if (paginationDataReceived != null) __obj.updateDynamic("paginationDataReceived")(paginationDataReceived.asInstanceOf[js.Any])
    if (paginationDataSent != null) __obj.updateDynamic("paginationDataSent")(paginationDataSent.asInstanceOf[js.Any])
    if (paginationElement != null) __obj.updateDynamic("paginationElement")(paginationElement.asInstanceOf[js.Any])
    if (paginationInitialPage != null) __obj.updateDynamic("paginationInitialPage")(paginationInitialPage.asInstanceOf[js.Any])
    if (paginationSize != null) __obj.updateDynamic("paginationSize")(paginationSize.asInstanceOf[js.Any])
    if (paginationSizeSelector != null) __obj.updateDynamic("paginationSizeSelector")(paginationSizeSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsPagination]
  }
}

