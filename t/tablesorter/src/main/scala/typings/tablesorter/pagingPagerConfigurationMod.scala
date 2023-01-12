package typings.tablesorter

import typings.jquery.JQuery.AjaxSettings
import typings.jquery.JQuery.Selector
import typings.jquery.JQuery.jqXHR
import typings.jquery.JQueryAjaxSettings
import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import typings.tablesorter.pagingAjaxDataProcessorMod.AjaxDataProcessor
import typings.tablesorter.pagingAjaxErrorHandlerMod.AjaxErrorHandler
import typings.tablesorter.pagingAjaxUrlProcessorMod.AjaxUrlProcessor
import typings.tablesorter.pagingPageSizeMod.PageSize
import typings.tablesorter.pagingPagerDataPartMod.PagerDataPart
import typings.tablesorter.pagingPagerInitialRowsMod.PagerInitialRows
import typings.tablesorter.pagingPagerOutputProcessorMod.PagerOutputProcessor
import typings.tablesorter.systemTablesorterConfigurationStoreMod.TablesorterConfigurationStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagingPagerConfigurationMod {
  
  trait PagerConfiguration[TElement] extends StObject {
    
    /**
      * Handles errors caused by an ajax-request.
      */
    var ajaxError: js.UndefOr[AjaxErrorHandler[TElement]] = js.undefined
    
    /**
      * The settings for the api-interaction of the pager.
      */
    var ajaxObject: js.UndefOr[JQueryAjaxSettings] = js.undefined
    
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
    var ajaxProcessing: js.UndefOr[AjaxDataProcessor[TElement]] = js.undefined
    
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
    var ajaxUrl: js.UndefOr[String] = js.undefined
    
    /**
      * The selector for querying the pager-container.
      */
    var container: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
    
    /**
      * A value indicating whether to split child-rows on page-breaks.
      */
    var countChildRows: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The css-class to apply to disabled pager-controls.
      */
    var cssDisabled: js.UndefOr[String] = js.undefined
    
    /**
      * The css-class to apply to the table-row which displays the error-message in case of an ajax-error.
      */
    var cssErrorRow: js.UndefOr[String] = js.undefined
    
    /**
      * The selector for querying the control to jump to the first page.
      */
    var cssFirst: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
    
    /**
      * The selector for querying the dropdown-control to jump to a specific page.
      */
    var cssGoto: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
    
    /**
      * The selector for querying the control to jump to the last page.
      */
    var cssLast: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
    
    /**
      * The selector for querying the control to jump to the next page.
      */
    var cssNext: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
    
    /**
      * The selector for querying the container to print the output to.
      */
    var cssPageDisplay: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
    
    /**
      * The selector for querying the control to set the page-size.
      */
    var cssPageSize: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
    
    /**
      * The selector for querying the control to jump to the previous page.
      */
    var cssPrev: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
    
    /**
      * Pre-processes the url for `ajax`.
      */
    var customAjaxUrl: js.UndefOr[AjaxUrlProcessor[TElement]] = js.undefined
    
    /**
      * A value indicating whether the table should always have the same number of rows even if there is a lesser number of records to show.
      */
    var fixedHeight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The initial amount of rows to show.
      */
    var initialRows: js.UndefOr[PagerInitialRows] = js.undefined
    
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
    var output: js.UndefOr[String | PagerOutputProcessor[TElement]] = js.undefined
    
    /**
      * The number of the first page to show.
      */
    var page: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of the first page to show after applying a filter.
      */
    var pageReset: js.UndefOr[Double | Boolean] = js.undefined
    
    /**
      * A value indicating whether an ajax-request should be executed after the initialization of the table.
      */
    var processAjaxOnInit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A value indicating whether to remove the rows while performing sortings for speed up.
      */
    var removeRows: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A value indicating whether to save the current page locally.
      */
    var savePages: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The initial page-size.
      */
    var size: js.UndefOr[PageSize] = js.undefined
    
    /**
      * The key to of the local storage to save data to.
      */
    var storageKey: js.UndefOr[String] = js.undefined
    
    /**
      * A value indicating whether the `cssDisabled` class should be applied to non-applicable buttons.
      */
    var updateArrows: js.UndefOr[Boolean] = js.undefined
  }
  object PagerConfiguration {
    
    inline def apply[TElement](): PagerConfiguration[TElement] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagerConfiguration[TElement]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PagerConfiguration[?], TElement] (val x: Self & PagerConfiguration[TElement]) extends AnyVal {
      
      inline def setAjaxError(
        value: (/* config */ TablesorterConfigurationStore[TElement], /* request */ jqXHR[Any], /* ajaxSettings */ AjaxSettings[Any], /* thrownError */ String) => String
      ): Self = StObject.set(x, "ajaxError", js.Any.fromFunction4(value))
      
      inline def setAjaxErrorUndefined: Self = StObject.set(x, "ajaxError", js.undefined)
      
      inline def setAjaxObject(value: JQueryAjaxSettings): Self = StObject.set(x, "ajaxObject", value.asInstanceOf[js.Any])
      
      inline def setAjaxObjectUndefined: Self = StObject.set(x, "ajaxObject", js.undefined)
      
      inline def setAjaxProcessing(
        value: (/* data */ Any, TElement, /* request */ jqXHR[Any]) => PagerDataPart[TElement] | js.Array[Double] | (js.Tuple3[Double, JQuery[HTMLElement] | js.Array[js.Array[Any]], js.UndefOr[js.Array[String]]])
      ): Self = StObject.set(x, "ajaxProcessing", js.Any.fromFunction3(value))
      
      inline def setAjaxProcessingUndefined: Self = StObject.set(x, "ajaxProcessing", js.undefined)
      
      inline def setAjaxUrl(value: String): Self = StObject.set(x, "ajaxUrl", value.asInstanceOf[js.Any])
      
      inline def setAjaxUrlUndefined: Self = StObject.set(x, "ajaxUrl", js.undefined)
      
      inline def setContainer(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setCountChildRows(value: Boolean): Self = StObject.set(x, "countChildRows", value.asInstanceOf[js.Any])
      
      inline def setCountChildRowsUndefined: Self = StObject.set(x, "countChildRows", js.undefined)
      
      inline def setCssDisabled(value: String): Self = StObject.set(x, "cssDisabled", value.asInstanceOf[js.Any])
      
      inline def setCssDisabledUndefined: Self = StObject.set(x, "cssDisabled", js.undefined)
      
      inline def setCssErrorRow(value: String): Self = StObject.set(x, "cssErrorRow", value.asInstanceOf[js.Any])
      
      inline def setCssErrorRowUndefined: Self = StObject.set(x, "cssErrorRow", js.undefined)
      
      inline def setCssFirst(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "cssFirst", value.asInstanceOf[js.Any])
      
      inline def setCssFirstUndefined: Self = StObject.set(x, "cssFirst", js.undefined)
      
      inline def setCssGoto(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "cssGoto", value.asInstanceOf[js.Any])
      
      inline def setCssGotoUndefined: Self = StObject.set(x, "cssGoto", js.undefined)
      
      inline def setCssLast(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "cssLast", value.asInstanceOf[js.Any])
      
      inline def setCssLastUndefined: Self = StObject.set(x, "cssLast", js.undefined)
      
      inline def setCssNext(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "cssNext", value.asInstanceOf[js.Any])
      
      inline def setCssNextUndefined: Self = StObject.set(x, "cssNext", js.undefined)
      
      inline def setCssPageDisplay(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "cssPageDisplay", value.asInstanceOf[js.Any])
      
      inline def setCssPageDisplayUndefined: Self = StObject.set(x, "cssPageDisplay", js.undefined)
      
      inline def setCssPageSize(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "cssPageSize", value.asInstanceOf[js.Any])
      
      inline def setCssPageSizeUndefined: Self = StObject.set(x, "cssPageSize", js.undefined)
      
      inline def setCssPrev(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "cssPrev", value.asInstanceOf[js.Any])
      
      inline def setCssPrevUndefined: Self = StObject.set(x, "cssPrev", js.undefined)
      
      inline def setCustomAjaxUrl(value: (TElement, /* url */ String) => String): Self = StObject.set(x, "customAjaxUrl", js.Any.fromFunction2(value))
      
      inline def setCustomAjaxUrlUndefined: Self = StObject.set(x, "customAjaxUrl", js.undefined)
      
      inline def setFixedHeight(value: Boolean): Self = StObject.set(x, "fixedHeight", value.asInstanceOf[js.Any])
      
      inline def setFixedHeightUndefined: Self = StObject.set(x, "fixedHeight", js.undefined)
      
      inline def setInitialRows(value: PagerInitialRows): Self = StObject.set(x, "initialRows", value.asInstanceOf[js.Any])
      
      inline def setInitialRowsUndefined: Self = StObject.set(x, "initialRows", js.undefined)
      
      inline def setOutput(value: String | PagerOutputProcessor[TElement]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputFunction2(value: (TElement, /* pager */ Any) => String): Self = StObject.set(x, "output", js.Any.fromFunction2(value))
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageReset(value: Double | Boolean): Self = StObject.set(x, "pageReset", value.asInstanceOf[js.Any])
      
      inline def setPageResetUndefined: Self = StObject.set(x, "pageReset", js.undefined)
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setProcessAjaxOnInit(value: Boolean): Self = StObject.set(x, "processAjaxOnInit", value.asInstanceOf[js.Any])
      
      inline def setProcessAjaxOnInitUndefined: Self = StObject.set(x, "processAjaxOnInit", js.undefined)
      
      inline def setRemoveRows(value: Boolean): Self = StObject.set(x, "removeRows", value.asInstanceOf[js.Any])
      
      inline def setRemoveRowsUndefined: Self = StObject.set(x, "removeRows", js.undefined)
      
      inline def setSavePages(value: Boolean): Self = StObject.set(x, "savePages", value.asInstanceOf[js.Any])
      
      inline def setSavePagesUndefined: Self = StObject.set(x, "savePages", js.undefined)
      
      inline def setSize(value: PageSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
      
      inline def setStorageKeyUndefined: Self = StObject.set(x, "storageKey", js.undefined)
      
      inline def setUpdateArrows(value: Boolean): Self = StObject.set(x, "updateArrows", value.asInstanceOf[js.Any])
      
      inline def setUpdateArrowsUndefined: Self = StObject.set(x, "updateArrows", js.undefined)
    }
  }
}
