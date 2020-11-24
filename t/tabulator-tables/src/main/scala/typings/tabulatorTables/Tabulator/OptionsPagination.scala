package typings.tabulatorTables.Tabulator

import typings.std.HTMLElement
import typings.std.Record
import typings.tabulatorTables.tabulatorTablesBooleans.`true`
import typings.tabulatorTables.tabulatorTablesStrings.local
import typings.tabulatorTables.tabulatorTablesStrings.page
import typings.tabulatorTables.tabulatorTablesStrings.remote
import typings.tabulatorTables.tabulatorTablesStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsPagination extends js.Object {
  
  /** Choose pagination method, "local" or "remote"     */
  var pagination: js.UndefOr[remote | local] = js.native
  
  /** When using the addRow function on a paginated table, rows will be added relative to the current page (ie to the top or bottom of the current page), with overflowing rows being shifted onto the next page.
    If you would prefer rows to be added relative to the table (firs/last page) then you can use the paginationAddRow option. it can take one of two values:
    page - add rows relative to current page (default)
    table - add rows relative to the table */
  var paginationAddRow: js.UndefOr[table | page] = js.native
  
  /**  The number of pagination page buttons shown in the footer using the paginationButtonCount option. By default this has a value of 5.*/
  var paginationButtonCount: js.UndefOr[Double] = js.native
  
  /** Lookup list to link expected data feilds from the server to their function    * default* {
    "current_page":"current_page",
    "last_page":"last_page",
    "data":"data",
    }* *
    */
  var paginationDataReceived: js.UndefOr[Record[String, String]] = js.native
  
  /** Lookup list to link fields expected by the server to their function* default:* {
    "page":"page",
    "size":"size",
    "sorters":"sorters",
    "filters":"filters",
    }
    */
  var paginationDataSent: js.UndefOr[Record[String, String]] = js.native
  
  /**  By default the pagination controls are added to the footer of the table. If you wish the controls to be created in another element pass a DOM node or a CSS selector for that element to the paginationElement option.*/
  var paginationElement: js.UndefOr[HTMLElement | String] = js.native
  
  /** Specify that a specific page should be loaded when the table first load */
  var paginationInitialPage: js.UndefOr[Double] = js.native
  
  /** Set the number of rows in each page     */
  var paginationSize: js.UndefOr[Double] = js.native
  
  /**  Setting this option to true will cause Tabulator to create a list of page size options, that are multiples of the current page size. In the example below, the list will have the values of 5, 10, 15 and 20.
    When using the page size selector like this, if you use the setPageSize function to set the page size to a value not in the list, the list will be regenerated using the new page size as the starting valuer    */
  var paginationSizeSelector: js.UndefOr[`true` | (js.Array[_ | Double])] = js.native
}
object OptionsPagination {
  
  @scala.inline
  def apply(): OptionsPagination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsPagination]
  }
  
  @scala.inline
  implicit class OptionsPaginationOps[Self <: OptionsPagination] (val x: Self) extends AnyVal {
    
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
    def setPagination(value: remote | local): Self = this.set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    
    @scala.inline
    def setPaginationAddRow(value: table | page): Self = this.set("paginationAddRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationAddRow: Self = this.set("paginationAddRow", js.undefined)
    
    @scala.inline
    def setPaginationButtonCount(value: Double): Self = this.set("paginationButtonCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationButtonCount: Self = this.set("paginationButtonCount", js.undefined)
    
    @scala.inline
    def setPaginationDataReceived(value: Record[String, String]): Self = this.set("paginationDataReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationDataReceived: Self = this.set("paginationDataReceived", js.undefined)
    
    @scala.inline
    def setPaginationDataSent(value: Record[String, String]): Self = this.set("paginationDataSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationDataSent: Self = this.set("paginationDataSent", js.undefined)
    
    @scala.inline
    def setPaginationElement(value: HTMLElement | String): Self = this.set("paginationElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationElement: Self = this.set("paginationElement", js.undefined)
    
    @scala.inline
    def setPaginationInitialPage(value: Double): Self = this.set("paginationInitialPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationInitialPage: Self = this.set("paginationInitialPage", js.undefined)
    
    @scala.inline
    def setPaginationSize(value: Double): Self = this.set("paginationSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationSize: Self = this.set("paginationSize", js.undefined)
    
    @scala.inline
    def setPaginationSizeSelectorVarargs(value: (js.Any | Double)*): Self = this.set("paginationSizeSelector", js.Array(value :_*))
    
    @scala.inline
    def setPaginationSizeSelector(value: `true` | (js.Array[_ | Double])): Self = this.set("paginationSizeSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationSizeSelector: Self = this.set("paginationSizeSelector", js.undefined)
  }
}
