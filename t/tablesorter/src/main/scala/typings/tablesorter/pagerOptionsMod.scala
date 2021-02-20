package typings.tablesorter

import typings.jquery.JQuery.AjaxSettings
import typings.jquery.JQuery.jqXHR
import typings.jquery.JQueryAjaxSettings
import typings.tablesorter.ajaxDataProcessorMod.AjaxDataProcessor
import typings.tablesorter.ajaxErrorHandlerMod.AjaxErrorHandler
import typings.tablesorter.ajaxUrlProcessorMod.AjaxUrlProcessor
import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import typings.tablesorter.pageSizeMod.PageSize
import typings.tablesorter.pagerClassesMod.PagerClasses
import typings.tablesorter.pagerDataPartMod.PagerDataPart
import typings.tablesorter.pagerInitialRowsMod.PagerInitialRows
import typings.tablesorter.pagerOutputProcessorMod.PagerOutputProcessor
import typings.tablesorter.pagerSelectorsMod.PagerSelectors
import typings.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagerOptionsMod {
  
  @js.native
  trait PagerOptions[TElement] extends StObject {
    
    /**
      * Handles errors caused by an ajax-request.
      */
    var pager_ajaxError: js.UndefOr[AjaxErrorHandler[TElement]] = js.native
    
    /**
      * The settings for the api-interaction of the pager.
      */
    var pager_ajaxObject: js.UndefOr[JQueryAjaxSettings] = js.native
    
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
    var pager_ajaxProcessing: js.UndefOr[AjaxDataProcessor[TElement]] = js.native
    
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
    var pager_ajaxUrl: js.UndefOr[String] = js.native
    
    /**
      * A value indicating whether to split child-rows on page-breaks.
      */
    var pager_countChildRows: js.UndefOr[Boolean] = js.native
    
    /**
      * The css-classes to apply to the pager-controls.
      */
    var pager_css: js.UndefOr[PagerClasses] = js.native
    
    /**
      * Pre-processes the url for `ajax`.
      */
    var pager_customAjaxUrl: js.UndefOr[AjaxUrlProcessor[TElement]] = js.native
    
    /**
      * A value indicating whether the table should always have the same number of rows even if there is a lesser number of records to show.
      */
    var pager_fixedHeight: js.UndefOr[Boolean] = js.native
    
    /**
      * The initial amount of rows to show.
      */
    var pager_initialRows: js.UndefOr[PagerInitialRows] = js.native
    
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
    var pager_output: js.UndefOr[String | PagerOutputProcessor[TElement]] = js.native
    
    /**
      * The number of the first page to show after applying a filter.
      */
    var pager_pageReset: js.UndefOr[Double | Boolean] = js.native
    
    /**
      * A value indicating whether an ajax-request should be executed after the initialization of the table.
      */
    var pager_processAjaxOnInit: js.UndefOr[Boolean] = js.native
    
    /**
      * A value indicating whether to remove the rows while performing sortings for speed up.
      */
    var pager_removeRows: js.UndefOr[Boolean] = js.native
    
    /**
      * A value indicating whether to save the current page locally.
      */
    var pager_savePages: js.UndefOr[Boolean] = js.native
    
    /**
      * The selectors for for handling click-events.
      */
    var pager_selectors: js.UndefOr[PagerSelectors] = js.native
    
    /**
      * The initial page-size.
      */
    var pager_size: js.UndefOr[PageSize] = js.native
    
    /**
      * The number of the first page to show.
      */
    var pager_startPage: js.UndefOr[Double] = js.native
    
    /**
      * The key to of the local storage to save data to.
      */
    var pager_storageKey: js.UndefOr[String] = js.native
    
    /**
      * A value indicating whether the `pager_css.disabled` class should be applied to non-applicable buttons.
      */
    var pager_updateArrows: js.UndefOr[Boolean] = js.native
  }
  object PagerOptions {
    
    @scala.inline
    def apply[TElement](): PagerOptions[TElement] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagerOptions[TElement]]
    }
    
    @scala.inline
    implicit class PagerOptionsMutableBuilder[Self <: PagerOptions[_], TElement] (val x: Self with PagerOptions[TElement]) extends AnyVal {
      
      @scala.inline
      def setPager_ajaxError(
        value: (/* config */ TablesorterConfigurationStore[TElement], /* request */ jqXHR[js.Any], /* ajaxSettings */ AjaxSettings[js.Any], /* thrownError */ String) => String
      ): Self = StObject.set(x, "pager_ajaxError", js.Any.fromFunction4(value))
      
      @scala.inline
      def setPager_ajaxErrorUndefined: Self = StObject.set(x, "pager_ajaxError", js.undefined)
      
      @scala.inline
      def setPager_ajaxObject(value: JQueryAjaxSettings): Self = StObject.set(x, "pager_ajaxObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPager_ajaxObjectUndefined: Self = StObject.set(x, "pager_ajaxObject", js.undefined)
      
      @scala.inline
      def setPager_ajaxProcessing(
        value: (/* data */ js.Any, TElement, /* request */ jqXHR[js.Any]) => PagerDataPart[TElement] | js.Array[Double] | (js.Tuple3[
              Double, 
              JQuery[HTMLElement] | js.Array[js.Array[js.Any]], 
              js.UndefOr[js.Array[String]]
            ])
      ): Self = StObject.set(x, "pager_ajaxProcessing", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPager_ajaxProcessingUndefined: Self = StObject.set(x, "pager_ajaxProcessing", js.undefined)
      
      @scala.inline
      def setPager_ajaxUrl(value: String): Self = StObject.set(x, "pager_ajaxUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPager_ajaxUrlUndefined: Self = StObject.set(x, "pager_ajaxUrl", js.undefined)
      
      @scala.inline
      def setPager_countChildRows(value: Boolean): Self = StObject.set(x, "pager_countChildRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPager_countChildRowsUndefined: Self = StObject.set(x, "pager_countChildRows", js.undefined)
      
      @scala.inline
      def setPager_css(value: PagerClasses): Self = StObject.set(x, "pager_css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPager_cssUndefined: Self = StObject.set(x, "pager_css", js.undefined)
      
      @scala.inline
      def setPager_customAjaxUrl(value: (TElement, /* url */ String) => String): Self = StObject.set(x, "pager_customAjaxUrl", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPager_customAjaxUrlUndefined: Self = StObject.set(x, "pager_customAjaxUrl", js.undefined)
      
      @scala.inline
      def setPager_fixedHeight(value: Boolean): Self = StObject.set(x, "pager_fixedHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPager_fixedHeightUndefined: Self = StObject.set(x, "pager_fixedHeight", js.undefined)
      
      @scala.inline
      def setPager_initialRows(value: PagerInitialRows): Self = StObject.set(x, "pager_initialRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPager_initialRowsUndefined: Self = StObject.set(x, "pager_initialRows", js.undefined)
      
      @scala.inline
      def setPager_output(value: String | PagerOutputProcessor[TElement]): Self = StObject.set(x, "pager_output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPager_outputFunction2(value: (TElement, /* pager */ js.Any) => String): Self = StObject.set(x, "pager_output", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPager_outputUndefined: Self = StObject.set(x, "pager_output", js.undefined)
      
      @scala.inline
      def setPager_pageReset(value: Double | Boolean): Self = StObject.set(x, "pager_pageReset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPager_pageResetUndefined: Self = StObject.set(x, "pager_pageReset", js.undefined)
      
      @scala.inline
      def setPager_processAjaxOnInit(value: Boolean): Self = StObject.set(x, "pager_processAjaxOnInit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPager_processAjaxOnInitUndefined: Self = StObject.set(x, "pager_processAjaxOnInit", js.undefined)
      
      @scala.inline
      def setPager_removeRows(value: Boolean): Self = StObject.set(x, "pager_removeRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPager_removeRowsUndefined: Self = StObject.set(x, "pager_removeRows", js.undefined)
      
      @scala.inline
      def setPager_savePages(value: Boolean): Self = StObject.set(x, "pager_savePages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPager_savePagesUndefined: Self = StObject.set(x, "pager_savePages", js.undefined)
      
      @scala.inline
      def setPager_selectors(value: PagerSelectors): Self = StObject.set(x, "pager_selectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPager_selectorsUndefined: Self = StObject.set(x, "pager_selectors", js.undefined)
      
      @scala.inline
      def setPager_size(value: PageSize): Self = StObject.set(x, "pager_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPager_sizeUndefined: Self = StObject.set(x, "pager_size", js.undefined)
      
      @scala.inline
      def setPager_startPage(value: Double): Self = StObject.set(x, "pager_startPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPager_startPageUndefined: Self = StObject.set(x, "pager_startPage", js.undefined)
      
      @scala.inline
      def setPager_storageKey(value: String): Self = StObject.set(x, "pager_storageKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPager_storageKeyUndefined: Self = StObject.set(x, "pager_storageKey", js.undefined)
      
      @scala.inline
      def setPager_updateArrows(value: Boolean): Self = StObject.set(x, "pager_updateArrows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPager_updateArrowsUndefined: Self = StObject.set(x, "pager_updateArrows", js.undefined)
    }
  }
}
