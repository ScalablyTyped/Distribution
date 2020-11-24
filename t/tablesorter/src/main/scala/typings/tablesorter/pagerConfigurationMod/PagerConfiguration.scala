package typings.tablesorter.pagerConfigurationMod

import typings.jquery.JQuery.AjaxSettings
import typings.jquery.JQuery.Selector
import typings.jquery.JQuery.jqXHR
import typings.jquery.JQueryAjaxSettings
import typings.tablesorter.ajaxDataProcessorMod.AjaxDataProcessor
import typings.tablesorter.ajaxErrorHandlerMod.AjaxErrorHandler
import typings.tablesorter.ajaxUrlProcessorMod.AjaxUrlProcessor
import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import typings.tablesorter.pageSizeMod.PageSize
import typings.tablesorter.pagerDataPartMod.PagerDataPart
import typings.tablesorter.pagerInitialRowsMod.PagerInitialRows
import typings.tablesorter.pagerOutputProcessorMod.PagerOutputProcessor
import typings.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagerConfiguration[TElement] extends js.Object {
  
  /**
    * Handles errors caused by an ajax-request.
    */
  var ajaxError: js.UndefOr[AjaxErrorHandler[TElement]] = js.native
  
  /**
    * The settings for the api-interaction of the pager.
    */
  var ajaxObject: js.UndefOr[JQueryAjaxSettings] = js.native
  
  /**
    * Processes the ajax-result for the `pager`-widget.
    *
    * @param data
    * The result of ajax.
    *
    * @param table
    * The table which is being processed.
    *
    * @param request
    * The ajax-request which processed the `data`.
    *
    * @return
    * The data for the pager to show.
    */
  var ajaxProcessing: js.UndefOr[AjaxDataProcessor[TElement]] = js.native
  
  /**
    * The url to query data from.
    *
    * Following portions of text are substituted:
    *
    * | Tag                                    | Replacement                                                            |
    * |----------------------------------------|------------------------------------------------------------------------|
    * | `{page}`                               | The zero-based index of the page to show.                              |
    * | `{page+n}`                             | The zero-based index of the page added to `n`.                         |
    * | `{size}`                               | The number of rows to fetch.                                           |
    * | `{sortList:name}` or `{sort:name}`     | A GET-variable called `name` containing the current sorting.           |
    * | `{filterList:name}` or `{filter:name}` | A GET-variable called `name` containing all currently applied filters. |
    */
  var ajaxUrl: js.UndefOr[String] = js.native
  
  /**
    * The selector for querying the pager-container.
    */
  var container: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  
  /**
    * A value indicating whether to split child-rows on page-breaks.
    */
  var countChildRows: js.UndefOr[Boolean] = js.native
  
  /**
    * The css-class to apply to disabled pager-controls.
    */
  var cssDisabled: js.UndefOr[String] = js.native
  
  /**
    * The css-class to apply to the table-row which displays the error-message in case of an ajax-error.
    */
  var cssErrorRow: js.UndefOr[String] = js.native
  
  /**
    * The selector for querying the control to jump to the first page.
    */
  var cssFirst: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  
  /**
    * The selector for querying the dropdown-control to jump to a specific page.
    */
  var cssGoto: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  
  /**
    * The selector for querying the control to jump to the last page.
    */
  var cssLast: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  
  /**
    * The selector for querying the control to jump to the next page.
    */
  var cssNext: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  
  /**
    * The selector for querying the container to print the output to.
    */
  var cssPageDisplay: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  
  /**
    * The selector for querying the control to set the page-size.
    */
  var cssPageSize: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  
  /**
    * The selector for querying the control to jump to the previous page.
    */
  var cssPrev: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  
  /**
    * Pre-processes the url for `ajax`.
    */
  var customAjaxUrl: js.UndefOr[AjaxUrlProcessor[TElement]] = js.native
  
  /**
    * A value indicating whether the table should always have the same number of rows even if there is a lesser number of records to show.
    */
  var fixedHeight: js.UndefOr[Boolean] = js.native
  
  /**
    * The initial amount of rows to show.
    */
  var initialRows: js.UndefOr[PagerInitialRows] = js.native
  
  /**
    * The output to display in the output-area.
    *
    * Following portions of text are substituted:
    *
    * | Tag                | Replacement                                  |
    * |--------------------|----------------------------------------------|
    * | `{size}`           | The current page size.                       |
    * | `{page}`           | The current page.                            |
    * | `{page:input}`     | The page inputted by the user.               |
    * | `{totalPages}`     | The total amount of pages.                   |
    * | `{filteredPages}`  | The filtered number of pages.                |
    * | `{startRow}`       | The number of the first row being displayed. |
    * | `{startRow:input}` | The start-row inputted by the user.          |
    * | `{endRow}`         | The number of the last row being displayed.  |
    * | `{filteredRows}`   | The amount of filtered rows.                 |
    * | `{totalRows}`      | The total amount of rows.                    |
    */
  var output: js.UndefOr[String | PagerOutputProcessor[TElement]] = js.native
  
  /**
    * The number of the first page to show.
    */
  var page: js.UndefOr[Double] = js.native
  
  /**
    * The number of the first page to show after applying a filter.
    */
  var pageReset: js.UndefOr[Double | Boolean] = js.native
  
  /**
    * A value indicating whether an ajax-request should be executed after the initialization of the table.
    */
  var processAjaxOnInit: js.UndefOr[Boolean] = js.native
  
  /**
    * A value indicating whether to remove the rows while performing sortings for speed up.
    */
  var removeRows: js.UndefOr[Boolean] = js.native
  
  /**
    * A value indicating whether to save the current page locally.
    */
  var savePages: js.UndefOr[Boolean] = js.native
  
  /**
    * The initial page-size.
    */
  var size: js.UndefOr[PageSize] = js.native
  
  /**
    * The key to of the local storage to save data to.
    */
  var storageKey: js.UndefOr[String] = js.native
  
  /**
    * A value indicating whether the `cssDisabled` class should be applied to non-applicable buttons.
    */
  var updateArrows: js.UndefOr[Boolean] = js.native
}
object PagerConfiguration {
  
  @scala.inline
  def apply[TElement](): PagerConfiguration[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagerConfiguration[TElement]]
  }
  
  @scala.inline
  implicit class PagerConfigurationOps[Self <: PagerConfiguration[_], TElement] (val x: Self with PagerConfiguration[TElement]) extends AnyVal {
    
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
    def setAjaxError(
      value: (/* config */ TablesorterConfigurationStore[TElement], /* request */ jqXHR[js.Any], /* ajaxSettings */ AjaxSettings[js.Any], /* thrownError */ String) => String
    ): Self = this.set("ajaxError", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteAjaxError: Self = this.set("ajaxError", js.undefined)
    
    @scala.inline
    def setAjaxObject(value: JQueryAjaxSettings): Self = this.set("ajaxObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxObject: Self = this.set("ajaxObject", js.undefined)
    
    @scala.inline
    def setAjaxProcessing(
      value: (/* data */ js.Any, TElement, /* request */ jqXHR[js.Any]) => PagerDataPart[TElement] | js.Array[Double] | (js.Tuple3[
          Double, 
          JQuery[HTMLElement] | js.Array[js.Array[js.Any]], 
          js.UndefOr[js.Array[String]]
        ])
    ): Self = this.set("ajaxProcessing", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAjaxProcessing: Self = this.set("ajaxProcessing", js.undefined)
    
    @scala.inline
    def setAjaxUrl(value: String): Self = this.set("ajaxUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxUrl: Self = this.set("ajaxUrl", js.undefined)
    
    @scala.inline
    def setContainer(value: Selector | JQuery[HTMLElement]): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setCountChildRows(value: Boolean): Self = this.set("countChildRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountChildRows: Self = this.set("countChildRows", js.undefined)
    
    @scala.inline
    def setCssDisabled(value: String): Self = this.set("cssDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssDisabled: Self = this.set("cssDisabled", js.undefined)
    
    @scala.inline
    def setCssErrorRow(value: String): Self = this.set("cssErrorRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssErrorRow: Self = this.set("cssErrorRow", js.undefined)
    
    @scala.inline
    def setCssFirst(value: Selector | JQuery[HTMLElement]): Self = this.set("cssFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssFirst: Self = this.set("cssFirst", js.undefined)
    
    @scala.inline
    def setCssGoto(value: Selector | JQuery[HTMLElement]): Self = this.set("cssGoto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssGoto: Self = this.set("cssGoto", js.undefined)
    
    @scala.inline
    def setCssLast(value: Selector | JQuery[HTMLElement]): Self = this.set("cssLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssLast: Self = this.set("cssLast", js.undefined)
    
    @scala.inline
    def setCssNext(value: Selector | JQuery[HTMLElement]): Self = this.set("cssNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssNext: Self = this.set("cssNext", js.undefined)
    
    @scala.inline
    def setCssPageDisplay(value: Selector | JQuery[HTMLElement]): Self = this.set("cssPageDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssPageDisplay: Self = this.set("cssPageDisplay", js.undefined)
    
    @scala.inline
    def setCssPageSize(value: Selector | JQuery[HTMLElement]): Self = this.set("cssPageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssPageSize: Self = this.set("cssPageSize", js.undefined)
    
    @scala.inline
    def setCssPrev(value: Selector | JQuery[HTMLElement]): Self = this.set("cssPrev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssPrev: Self = this.set("cssPrev", js.undefined)
    
    @scala.inline
    def setCustomAjaxUrl(value: (TElement, /* url */ String) => String): Self = this.set("customAjaxUrl", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCustomAjaxUrl: Self = this.set("customAjaxUrl", js.undefined)
    
    @scala.inline
    def setFixedHeight(value: Boolean): Self = this.set("fixedHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedHeight: Self = this.set("fixedHeight", js.undefined)
    
    @scala.inline
    def setInitialRows(value: PagerInitialRows): Self = this.set("initialRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialRows: Self = this.set("initialRows", js.undefined)
    
    @scala.inline
    def setOutputFunction2(value: (TElement, /* pager */ js.Any) => String): Self = this.set("output", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOutput(value: String | PagerOutputProcessor[TElement]): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPageReset(value: Double | Boolean): Self = this.set("pageReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageReset: Self = this.set("pageReset", js.undefined)
    
    @scala.inline
    def setProcessAjaxOnInit(value: Boolean): Self = this.set("processAjaxOnInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessAjaxOnInit: Self = this.set("processAjaxOnInit", js.undefined)
    
    @scala.inline
    def setRemoveRows(value: Boolean): Self = this.set("removeRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveRows: Self = this.set("removeRows", js.undefined)
    
    @scala.inline
    def setSavePages(value: Boolean): Self = this.set("savePages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavePages: Self = this.set("savePages", js.undefined)
    
    @scala.inline
    def setSize(value: PageSize): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStorageKey(value: String): Self = this.set("storageKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageKey: Self = this.set("storageKey", js.undefined)
    
    @scala.inline
    def setUpdateArrows(value: Boolean): Self = this.set("updateArrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateArrows: Self = this.set("updateArrows", js.undefined)
  }
}
