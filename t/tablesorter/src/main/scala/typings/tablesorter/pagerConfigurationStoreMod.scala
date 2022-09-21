package typings.tablesorter

import typings.jquery.JQuery.Ajax.SuccessCallback
import typings.jquery.JQuery.Ajax.SuccessTextStatus
import typings.jquery.JQuery.jqXHR
import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import typings.tablesorter.pagerConfigurationMod.PagerConfiguration
import typings.tablesorter.pagerDataPartMod.PagerDataPart
import typings.tablesorter.pagerMemoryMod.PagerMemory
import typings.tablesorter.sortDefinitionMod.SortDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagerConfigurationStoreMod {
  
  trait PagerConfigurationStore[TElement]
    extends StObject
       with PagerConfiguration[TElement] {
    
    /**
      * The jQuery-object which contains the container-control.
      */
    @JSName("$container")
    var $container: JQuery[HTMLElement]
    
    /**
      * The jQuery-object which contains the control for jumping to pages.
      */
    @JSName("$goto")
    var $goto: JQuery[HTMLElement]
    
    /**
      * The jQuery-object which contains the size-control.
      */
    @JSName("$size")
    var $size: JQuery[HTMLElement]
    
    /**
      * A value indicating whether ajax is enabled.
      */
    var ajax: Boolean
    
    /**
      * The number of performed ajax-request.
      */
    var ajaxCounter: Double
    
    /**
      * The result of the ajax-request.
      */
    var ajaxData: PagerDataPart[TElement] | js.Array[Double] | (js.Tuple3[Double, JQuery[HTMLElement] | js.Array[js.Array[Any]], js.UndefOr[js.Array[String]]])
    
    /**
      * The url to query data from.
      */
    @JSName("ajaxUrl")
    var ajaxUrl_PagerConfigurationStore: String
    
    /**
      * The index of the cached rows which are being displayed.
      */
    var cachedIndex: js.Array[Double]
    
    /**
      * The applied filters.
      */
    var currentFilters: js.Array[String]
    
    /**
      * The number of the last row being displayed.
      */
    var endRow: Double
    
    /**
      * The amount of filtered pages.
      */
    var filteredPages: Double
    
    /**
      * The amount of filtered rows.
      */
    var filteredRows: Double
    
    /**
      * A value indicating whether the pager is initialized.
      */
    var initialized: Boolean
    
    /**
      * A value indicating whether the pager is initializing.
      */
    var initializing: Boolean
    
    /**
      * A value indicating whether the pager is disabled.
      */
    var isDisabled: Boolean
    
    /**
      * The last memorized settings of the `pager`.
      */
    var last: PagerMemory
    
    /**
      * The old success-callback of the ajax-settings.
      */
    def oldAjaxSuccess(data: Any, textStatus: SuccessTextStatus, jqXHR: jqXHR[Any]): Unit
    /**
      * The old success-callback of the ajax-settings.
      */
    @JSName("oldAjaxSuccess")
    var oldAjaxSuccess_Original: SuccessCallback[Any]
    
    /**
      * The optional url to query data from.
      */
    var optAjaxUrl: String
    
    @JSName("page")
    var page_PagerConfigurationStore: Double
    
    /**
      * The regex for identifying filtered rows.
      */
    var regexFiltered: js.RegExp
    
    /**
      * The regex for identifying rows.
      */
    var regexRows: js.RegExp
    
    /**
      * The initial settings of the pager.
      */
    var settings: PagerConfiguration[TElement]
    
    @JSName("size")
    var size_PagerConfigurationStore: Double
    
    /**
      * The sorting to apply.
      */
    var sortList: js.Array[SortDefinition]
    
    /**
      * The number of the first row being displayed.
      */
    var startRow: Double
    
    /**
      * The total amount of pages.
      */
    var totalPages: Double
    
    /**
      * The total amount of rows.
      */
    var totalRows: Double
  }
  object PagerConfigurationStore {
    
    inline def apply[TElement](
      $container: JQuery[HTMLElement],
      $goto: JQuery[HTMLElement],
      $size: JQuery[HTMLElement],
      ajax: Boolean,
      ajaxCounter: Double,
      ajaxData: PagerDataPart[TElement] | js.Array[Double] | (js.Tuple3[Double, JQuery[HTMLElement] | js.Array[js.Array[Any]], js.UndefOr[js.Array[String]]]),
      ajaxUrl: String,
      cachedIndex: js.Array[Double],
      currentFilters: js.Array[String],
      endRow: Double,
      filteredPages: Double,
      filteredRows: Double,
      initialized: Boolean,
      initializing: Boolean,
      isDisabled: Boolean,
      last: PagerMemory,
      oldAjaxSuccess: SuccessCallback[Any],
      optAjaxUrl: String,
      page: Double,
      regexFiltered: js.RegExp,
      regexRows: js.RegExp,
      settings: PagerConfiguration[TElement],
      size: Double,
      sortList: js.Array[SortDefinition],
      startRow: Double,
      totalPages: Double,
      totalRows: Double
    ): PagerConfigurationStore[TElement] = {
      val __obj = js.Dynamic.literal($container = $container.asInstanceOf[js.Any], $goto = $goto.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], ajax = ajax.asInstanceOf[js.Any], ajaxCounter = ajaxCounter.asInstanceOf[js.Any], ajaxData = ajaxData.asInstanceOf[js.Any], ajaxUrl = ajaxUrl.asInstanceOf[js.Any], cachedIndex = cachedIndex.asInstanceOf[js.Any], currentFilters = currentFilters.asInstanceOf[js.Any], endRow = endRow.asInstanceOf[js.Any], filteredPages = filteredPages.asInstanceOf[js.Any], filteredRows = filteredRows.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], initializing = initializing.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], oldAjaxSuccess = oldAjaxSuccess.asInstanceOf[js.Any], optAjaxUrl = optAjaxUrl.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], regexFiltered = regexFiltered.asInstanceOf[js.Any], regexRows = regexRows.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sortList = sortList.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any], totalRows = totalRows.asInstanceOf[js.Any])
      __obj.asInstanceOf[PagerConfigurationStore[TElement]]
    }
    
    extension [Self <: PagerConfigurationStore[?], TElement](x: Self & PagerConfigurationStore[TElement]) {
      
      inline def set$container(value: JQuery[HTMLElement]): Self = StObject.set(x, "$container", value.asInstanceOf[js.Any])
      
      inline def set$goto(value: JQuery[HTMLElement]): Self = StObject.set(x, "$goto", value.asInstanceOf[js.Any])
      
      inline def set$size(value: JQuery[HTMLElement]): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      inline def setAjax(value: Boolean): Self = StObject.set(x, "ajax", value.asInstanceOf[js.Any])
      
      inline def setAjaxCounter(value: Double): Self = StObject.set(x, "ajaxCounter", value.asInstanceOf[js.Any])
      
      inline def setAjaxData(
        value: PagerDataPart[TElement] | js.Array[Double] | (js.Tuple3[Double, JQuery[HTMLElement] | js.Array[js.Array[Any]], js.UndefOr[js.Array[String]]])
      ): Self = StObject.set(x, "ajaxData", value.asInstanceOf[js.Any])
      
      inline def setAjaxDataVarargs(value: Double*): Self = StObject.set(x, "ajaxData", js.Array(value*))
      
      inline def setAjaxUrl(value: String): Self = StObject.set(x, "ajaxUrl", value.asInstanceOf[js.Any])
      
      inline def setCachedIndex(value: js.Array[Double]): Self = StObject.set(x, "cachedIndex", value.asInstanceOf[js.Any])
      
      inline def setCachedIndexVarargs(value: Double*): Self = StObject.set(x, "cachedIndex", js.Array(value*))
      
      inline def setCurrentFilters(value: js.Array[String]): Self = StObject.set(x, "currentFilters", value.asInstanceOf[js.Any])
      
      inline def setCurrentFiltersVarargs(value: String*): Self = StObject.set(x, "currentFilters", js.Array(value*))
      
      inline def setEndRow(value: Double): Self = StObject.set(x, "endRow", value.asInstanceOf[js.Any])
      
      inline def setFilteredPages(value: Double): Self = StObject.set(x, "filteredPages", value.asInstanceOf[js.Any])
      
      inline def setFilteredRows(value: Double): Self = StObject.set(x, "filteredRows", value.asInstanceOf[js.Any])
      
      inline def setInitialized(value: Boolean): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
      
      inline def setInitializing(value: Boolean): Self = StObject.set(x, "initializing", value.asInstanceOf[js.Any])
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setLast(value: PagerMemory): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setOldAjaxSuccess(value: SuccessCallback[Any]): Self = StObject.set(x, "oldAjaxSuccess", value.asInstanceOf[js.Any])
      
      inline def setOptAjaxUrl(value: String): Self = StObject.set(x, "optAjaxUrl", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setRegexFiltered(value: js.RegExp): Self = StObject.set(x, "regexFiltered", value.asInstanceOf[js.Any])
      
      inline def setRegexRows(value: js.RegExp): Self = StObject.set(x, "regexRows", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: PagerConfiguration[TElement]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSortList(value: js.Array[SortDefinition]): Self = StObject.set(x, "sortList", value.asInstanceOf[js.Any])
      
      inline def setSortListVarargs(value: SortDefinition*): Self = StObject.set(x, "sortList", js.Array(value*))
      
      inline def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
      
      inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
      
      inline def setTotalRows(value: Double): Self = StObject.set(x, "totalRows", value.asInstanceOf[js.Any])
    }
  }
}
