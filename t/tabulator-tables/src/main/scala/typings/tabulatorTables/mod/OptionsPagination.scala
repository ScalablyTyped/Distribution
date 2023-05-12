package typings.tabulatorTables.mod

import typings.std.HTMLElement
import typings.std.Record
import typings.tabulatorTables.tabulatorTablesBooleans.`true`
import typings.tabulatorTables.tabulatorTablesStrings.page
import typings.tabulatorTables.tabulatorTablesStrings.pages
import typings.tabulatorTables.tabulatorTablesStrings.rows
import typings.tabulatorTables.tabulatorTablesStrings.table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsPagination extends StObject {
  
  /**
    * Lookup list to link expected data fields from the server to their function
    * ```typescript
    * default: {
    *   "current_page": "current_page",
    *   "last_page": "last_page",
    *   "data": "data",
    *   }
    * ```
    */
  var dataReceiveParams: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * Lookup list to link fields expected by the server to their function
    * ```typescript
    * default: {
    *   "page": "page",
    *   "size": "size",
    *   "sorters": "sorters",
    *   "filters": "filters",
    * }
    * ```
    */
  var dataSendParams: js.UndefOr[Record[String, String]] = js.undefined
  
  var pagination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When using the addRow function on a paginated table, rows will be added relative to the current page (ie to the top or bottom of the current page), with overflowing rows being shifted onto the next page.
    *
    * If you would prefer rows to be added relative to the table (firs/last page) then you can use the paginationAddRow option. it can take one of two values:
    *
    * page - add rows relative to current page (default)
    * table - add rows relative to the table
    */
  var paginationAddRow: js.UndefOr[table | page] = js.undefined
  
  /** The number of pagination page buttons shown in the footer using the paginationButtonCount option. By default this has a value of 5. */
  var paginationButtonCount: js.UndefOr[Double] = js.undefined
  
  /**
    * You can choose to display a pagination counter in the bottom left of the footer that shows a summary of the current number of rows shown out of the total.
    * If you want to have a fully customized counter, then you can pass a function to the paginationCounter option
    *
    * The formatter function accepts 5 arguments:
    *
    * pageSize - Number of rows shown per page
    * currentRow - First visible row position
    * currentPage - Current page
    * totalRows - Total rows in table
    * totalPages - Total pages in table
    * The function must return the contents of the counter, either the text value of the counter, valid HTML or a DOM node
    */
  var paginationCounter: js.UndefOr[
    rows | pages | (js.Function5[
      /* pageSize */ Double, 
      /* currentRow */ Double, 
      /* currentPage */ Double, 
      /* totalRows */ Double, 
      /* totalPages */ Double, 
      String | HTMLElement
    ])
  ] = js.undefined
  
  /**
    * By default the counter will be displayed in the left of the table footer. If you would like it displayed in another element pass a DOM node or a CSS selector for that element.
    */
  var paginationCounterElement: js.UndefOr[String | HTMLElement] = js.undefined
  
  /** By default the pagination controls are added to the footer of the table. If you wish the controls to be created in another element pass a DOM node or a CSS selector for that element to the paginationElement option. */
  var paginationElement: js.UndefOr[HTMLElement | String] = js.undefined
  
  /** Specify that a specific page should be loaded when the table first load. */
  var paginationInitialPage: js.UndefOr[Double] = js.undefined
  
  var paginationMode: js.UndefOr[SortMode] = js.undefined
  
  /** Set the number of rows in each page. */
  var paginationSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Setting this option to true will cause Tabulator to create a list of page size options, that are multiples of the current page size. In the example below, the list will have the values of 5, 10, 15 and 20.
    *
    *  When using the page size selector like this, if you use the setPageSize function to set the page size to a value not in the list, the list will be regenerated using the new page size as the starting valuer
    */
  var paginationSizeSelector: js.UndefOr[`true` | (js.Array[Any | Double])] = js.undefined
}
object OptionsPagination {
  
  inline def apply(): OptionsPagination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsPagination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsPagination] (val x: Self) extends AnyVal {
    
    inline def setDataReceiveParams(value: Record[String, String]): Self = StObject.set(x, "dataReceiveParams", value.asInstanceOf[js.Any])
    
    inline def setDataReceiveParamsUndefined: Self = StObject.set(x, "dataReceiveParams", js.undefined)
    
    inline def setDataSendParams(value: Record[String, String]): Self = StObject.set(x, "dataSendParams", value.asInstanceOf[js.Any])
    
    inline def setDataSendParamsUndefined: Self = StObject.set(x, "dataSendParams", js.undefined)
    
    inline def setPagination(value: Boolean): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    inline def setPaginationAddRow(value: table | page): Self = StObject.set(x, "paginationAddRow", value.asInstanceOf[js.Any])
    
    inline def setPaginationAddRowUndefined: Self = StObject.set(x, "paginationAddRow", js.undefined)
    
    inline def setPaginationButtonCount(value: Double): Self = StObject.set(x, "paginationButtonCount", value.asInstanceOf[js.Any])
    
    inline def setPaginationButtonCountUndefined: Self = StObject.set(x, "paginationButtonCount", js.undefined)
    
    inline def setPaginationCounter(
      value: rows | pages | (js.Function5[
          /* pageSize */ Double, 
          /* currentRow */ Double, 
          /* currentPage */ Double, 
          /* totalRows */ Double, 
          /* totalPages */ Double, 
          String | HTMLElement
        ])
    ): Self = StObject.set(x, "paginationCounter", value.asInstanceOf[js.Any])
    
    inline def setPaginationCounterElement(value: String | HTMLElement): Self = StObject.set(x, "paginationCounterElement", value.asInstanceOf[js.Any])
    
    inline def setPaginationCounterElementUndefined: Self = StObject.set(x, "paginationCounterElement", js.undefined)
    
    inline def setPaginationCounterFunction5(
      value: (/* pageSize */ Double, /* currentRow */ Double, /* currentPage */ Double, /* totalRows */ Double, /* totalPages */ Double) => String | HTMLElement
    ): Self = StObject.set(x, "paginationCounter", js.Any.fromFunction5(value))
    
    inline def setPaginationCounterUndefined: Self = StObject.set(x, "paginationCounter", js.undefined)
    
    inline def setPaginationElement(value: HTMLElement | String): Self = StObject.set(x, "paginationElement", value.asInstanceOf[js.Any])
    
    inline def setPaginationElementUndefined: Self = StObject.set(x, "paginationElement", js.undefined)
    
    inline def setPaginationInitialPage(value: Double): Self = StObject.set(x, "paginationInitialPage", value.asInstanceOf[js.Any])
    
    inline def setPaginationInitialPageUndefined: Self = StObject.set(x, "paginationInitialPage", js.undefined)
    
    inline def setPaginationMode(value: SortMode): Self = StObject.set(x, "paginationMode", value.asInstanceOf[js.Any])
    
    inline def setPaginationModeUndefined: Self = StObject.set(x, "paginationMode", js.undefined)
    
    inline def setPaginationSize(value: Double): Self = StObject.set(x, "paginationSize", value.asInstanceOf[js.Any])
    
    inline def setPaginationSizeSelector(value: `true` | (js.Array[Any | Double])): Self = StObject.set(x, "paginationSizeSelector", value.asInstanceOf[js.Any])
    
    inline def setPaginationSizeSelectorUndefined: Self = StObject.set(x, "paginationSizeSelector", js.undefined)
    
    inline def setPaginationSizeSelectorVarargs(value: (Any | Double)*): Self = StObject.set(x, "paginationSizeSelector", js.Array(value*))
    
    inline def setPaginationSizeUndefined: Self = StObject.set(x, "paginationSize", js.undefined)
    
    inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
  }
}
