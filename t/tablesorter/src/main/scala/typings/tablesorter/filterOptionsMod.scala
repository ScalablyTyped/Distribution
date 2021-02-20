package typings.tablesorter

import typings.jquery.JQuery.Selector
import typings.tablesorter.filterControlFactoryMod.FilterControlFactory
import typings.tablesorter.filterFunctionCollectionMod.FilterFunctionCollection
import typings.tablesorter.filterFunctionMod.FilterFunction
import typings.tablesorter.filterPlaceholdersMod.FilterPlaceholders
import typings.tablesorter.mappedSettingsMod.MappedSettings
import typings.tablesorter.matchTypeSettingsMod.MatchTypeSettings
import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import typings.tablesorter.selectSourceMod.SelectSource
import typings.tablesorter.selectSourcesMod.SelectSources
import typings.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import typings.tablesorter.validSelectSourcesMod.ValidSelectSources
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterOptionsMod {
  
  @js.native
  trait FilterOptions[TElement] extends StObject {
    
    /**
      * A set of classes to apply to the filter-cells.
      */
    var filter_cellFilter: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * A value indicating whether only the filtered column of child-rows should be considered when filtering.
      */
    var filter_childByColumn: js.UndefOr[Boolean] = js.native
    
    /**
      * A value indicating whether child-rows should be considered when filtering.
      */
    var filter_childRows: js.UndefOr[Boolean] = js.native
    
    /**
      * A value indicating whether siblings should be displayed when filtering.
      */
    var filter_childWithSibs: js.UndefOr[Boolean] = js.native
    
    /**
      * A value indicating whether searches using the `{index}:{query}` in the anyMatch-textbox is allowed.
      */
    var filter_columnAnyMatch: js.UndefOr[Boolean] = js.native
    
    /**
      * A value indicating whether filtering is enabled.
      */
    var filter_columnFilters: js.UndefOr[Boolean] = js.native
    
    /**
      * A CSS class which is applied to each filter-cell.
      */
    var filter_cssFilter: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * The attribute-name which is used for querying the default filter-value.
      */
    var filter_defaultAttrib: js.UndefOr[String] = js.native
    
    /**
      * The default filters to apply.
      */
    var filter_defaultFilter: js.UndefOr[MappedSettings[String]] = js.native
    
    /**
      * A set of filters to prevent.
      */
    var filter_excludeFilter: js.UndefOr[MappedSettings[String]] = js.native
    
    /**
      * The jQuery-selector for querying the external search-box.
      */
    var filter_external: js.UndefOr[Selector] = js.native
    
    /**
      * The template for generating the ARIA-label of the filter-control.
      */
    var filter_filterLabel: js.UndefOr[String] = js.native
    
    /**
      * A CSS class which is applied for each cel which is filtered.
      */
    var filter_filteredRow: js.UndefOr[String] = js.native
    
    /**
      * The filter-controls to apply.
      */
    var filter_formatter: js.UndefOr[MappedSettings[FilterControlFactory]] = js.native
    
    /**
      * A set of filter-functions to apply for the columns.
      */
    var filter_functions: js.UndefOr[MappedSettings[FilterFunctionCollection[TElement] | FilterFunction[TElement]]] = js.native
    
    /**
      * A value indicating whether the filter-controls should be hidden when the table is empty.
      */
    var filter_hideEmpty: js.UndefOr[Boolean] = js.native
    
    /**
      * A value indicating whether the filter should hide automatically.
      */
    var filter_hideFilters: js.UndefOr[
        Boolean | (js.Function1[/* config */ TablesorterConfigurationStore[TElement], Boolean])
      ] = js.native
    
    /**
      * A value indicating whether the letter-case should be ignored.
      */
    var filter_ignoreCase: js.UndefOr[Boolean] = js.native
    
    /**
      * A value indicating whether a search should be performed without having to hit `Enter`.
      */
    var filter_liveSearch: js.UndefOr[Boolean | Double | (MappedSettings[Boolean | Double])] = js.native
    
    /**
      * The match-types to apply to the controls.
      */
    var filter_matchType: js.UndefOr[MatchTypeSettings] = js.native
    
    /**
      * A class for indicating whether only visible entries should be available in `select`-controls.
      */
    var filter_onlyAvail: js.UndefOr[String] = js.native
    
    /**
      * The placeholders to set initially.
      */
    var filter_placeholder: js.UndefOr[FilterPlaceholders] = js.native
    
    /**
      * A jQuery-selector for querying the button for resetting the filter.
      */
    var filter_reset: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
    
    /**
      * A value indicating whether the filter should be resetted when `ESC` is hit.
      */
    var filter_resetOnEsc: js.UndefOr[Boolean] = js.native
    
    /**
      * A value indicating whether the filters should be saved to the client.
      */
    var filter_saveFilters: js.UndefOr[Boolean] = js.native
    
    /**
      * The number of miliseconds to wait before performing a search.
      */
    var filter_searchDelay: js.UndefOr[Double] = js.native
    
    /**
      * A value indicating whether only filtered rows should be considered while searching.
      */
    var filter_searchFiltered: js.UndefOr[Boolean] = js.native
    
    /**
      * The sources for the select-controls.
      */
    var filter_selectSource: js.UndefOr[SelectSources[TElement] | MappedSettings[SelectSources[TElement]]] = js.native
    
    /**
      * The character for separating display-name and value inside the `filter_selectSource`.
      */
    var filter_selectSourceSeparator: js.UndefOr[String] = js.native
    
    /**
      * A value indicating whether filtering is performed server-side.
      */
    var filter_serversideFiltering: js.UndefOr[Boolean] = js.native
    
    /**
      * A value indicating whether searches should be performed with the `starts with`-logic.
      */
    var filter_startsWith: js.UndefOr[Boolean] = js.native
    
    /**
      * A value indicating whether filtering should be perormed using parsed data.
      */
    var filter_useParsedData: js.UndefOr[Boolean] = js.native
  }
  object FilterOptions {
    
    @scala.inline
    def apply[TElement](): FilterOptions[TElement] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterOptions[TElement]]
    }
    
    @scala.inline
    implicit class FilterOptionsMutableBuilder[Self <: FilterOptions[_], TElement] (val x: Self with FilterOptions[TElement]) extends AnyVal {
      
      @scala.inline
      def setFilter_cellFilter(value: String | js.Array[String]): Self = StObject.set(x, "filter_cellFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_cellFilterUndefined: Self = StObject.set(x, "filter_cellFilter", js.undefined)
      
      @scala.inline
      def setFilter_cellFilterVarargs(value: String*): Self = StObject.set(x, "filter_cellFilter", js.Array(value :_*))
      
      @scala.inline
      def setFilter_childByColumn(value: Boolean): Self = StObject.set(x, "filter_childByColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_childByColumnUndefined: Self = StObject.set(x, "filter_childByColumn", js.undefined)
      
      @scala.inline
      def setFilter_childRows(value: Boolean): Self = StObject.set(x, "filter_childRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_childRowsUndefined: Self = StObject.set(x, "filter_childRows", js.undefined)
      
      @scala.inline
      def setFilter_childWithSibs(value: Boolean): Self = StObject.set(x, "filter_childWithSibs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_childWithSibsUndefined: Self = StObject.set(x, "filter_childWithSibs", js.undefined)
      
      @scala.inline
      def setFilter_columnAnyMatch(value: Boolean): Self = StObject.set(x, "filter_columnAnyMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_columnAnyMatchUndefined: Self = StObject.set(x, "filter_columnAnyMatch", js.undefined)
      
      @scala.inline
      def setFilter_columnFilters(value: Boolean): Self = StObject.set(x, "filter_columnFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_columnFiltersUndefined: Self = StObject.set(x, "filter_columnFilters", js.undefined)
      
      @scala.inline
      def setFilter_cssFilter(value: String | js.Array[String]): Self = StObject.set(x, "filter_cssFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_cssFilterUndefined: Self = StObject.set(x, "filter_cssFilter", js.undefined)
      
      @scala.inline
      def setFilter_cssFilterVarargs(value: String*): Self = StObject.set(x, "filter_cssFilter", js.Array(value :_*))
      
      @scala.inline
      def setFilter_defaultAttrib(value: String): Self = StObject.set(x, "filter_defaultAttrib", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_defaultAttribUndefined: Self = StObject.set(x, "filter_defaultAttrib", js.undefined)
      
      @scala.inline
      def setFilter_defaultFilter(value: MappedSettings[String]): Self = StObject.set(x, "filter_defaultFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_defaultFilterUndefined: Self = StObject.set(x, "filter_defaultFilter", js.undefined)
      
      @scala.inline
      def setFilter_excludeFilter(value: MappedSettings[String]): Self = StObject.set(x, "filter_excludeFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_excludeFilterUndefined: Self = StObject.set(x, "filter_excludeFilter", js.undefined)
      
      @scala.inline
      def setFilter_external(value: Selector): Self = StObject.set(x, "filter_external", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_externalUndefined: Self = StObject.set(x, "filter_external", js.undefined)
      
      @scala.inline
      def setFilter_filterLabel(value: String): Self = StObject.set(x, "filter_filterLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_filterLabelUndefined: Self = StObject.set(x, "filter_filterLabel", js.undefined)
      
      @scala.inline
      def setFilter_filteredRow(value: String): Self = StObject.set(x, "filter_filteredRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_filteredRowUndefined: Self = StObject.set(x, "filter_filteredRow", js.undefined)
      
      @scala.inline
      def setFilter_formatter(value: MappedSettings[FilterControlFactory]): Self = StObject.set(x, "filter_formatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_formatterUndefined: Self = StObject.set(x, "filter_formatter", js.undefined)
      
      @scala.inline
      def setFilter_functions(value: MappedSettings[FilterFunctionCollection[TElement] | FilterFunction[TElement]]): Self = StObject.set(x, "filter_functions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_functionsUndefined: Self = StObject.set(x, "filter_functions", js.undefined)
      
      @scala.inline
      def setFilter_hideEmpty(value: Boolean): Self = StObject.set(x, "filter_hideEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_hideEmptyUndefined: Self = StObject.set(x, "filter_hideEmpty", js.undefined)
      
      @scala.inline
      def setFilter_hideFilters(value: Boolean | (js.Function1[/* config */ TablesorterConfigurationStore[TElement], Boolean])): Self = StObject.set(x, "filter_hideFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_hideFiltersFunction1(value: /* config */ TablesorterConfigurationStore[TElement] => Boolean): Self = StObject.set(x, "filter_hideFilters", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilter_hideFiltersUndefined: Self = StObject.set(x, "filter_hideFilters", js.undefined)
      
      @scala.inline
      def setFilter_ignoreCase(value: Boolean): Self = StObject.set(x, "filter_ignoreCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_ignoreCaseUndefined: Self = StObject.set(x, "filter_ignoreCase", js.undefined)
      
      @scala.inline
      def setFilter_liveSearch(value: Boolean | Double | (MappedSettings[Boolean | Double])): Self = StObject.set(x, "filter_liveSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_liveSearchUndefined: Self = StObject.set(x, "filter_liveSearch", js.undefined)
      
      @scala.inline
      def setFilter_matchType(value: MatchTypeSettings): Self = StObject.set(x, "filter_matchType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_matchTypeUndefined: Self = StObject.set(x, "filter_matchType", js.undefined)
      
      @scala.inline
      def setFilter_onlyAvail(value: String): Self = StObject.set(x, "filter_onlyAvail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_onlyAvailUndefined: Self = StObject.set(x, "filter_onlyAvail", js.undefined)
      
      @scala.inline
      def setFilter_placeholder(value: FilterPlaceholders): Self = StObject.set(x, "filter_placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_placeholderUndefined: Self = StObject.set(x, "filter_placeholder", js.undefined)
      
      @scala.inline
      def setFilter_reset(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "filter_reset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_resetOnEsc(value: Boolean): Self = StObject.set(x, "filter_resetOnEsc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_resetOnEscUndefined: Self = StObject.set(x, "filter_resetOnEsc", js.undefined)
      
      @scala.inline
      def setFilter_resetUndefined: Self = StObject.set(x, "filter_reset", js.undefined)
      
      @scala.inline
      def setFilter_saveFilters(value: Boolean): Self = StObject.set(x, "filter_saveFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_saveFiltersUndefined: Self = StObject.set(x, "filter_saveFilters", js.undefined)
      
      @scala.inline
      def setFilter_searchDelay(value: Double): Self = StObject.set(x, "filter_searchDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_searchDelayUndefined: Self = StObject.set(x, "filter_searchDelay", js.undefined)
      
      @scala.inline
      def setFilter_searchFiltered(value: Boolean): Self = StObject.set(x, "filter_searchFiltered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_searchFilteredUndefined: Self = StObject.set(x, "filter_searchFiltered", js.undefined)
      
      @scala.inline
      def setFilter_selectSource(value: SelectSources[TElement] | MappedSettings[SelectSources[TElement]]): Self = StObject.set(x, "filter_selectSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_selectSourceFunction3(value: (TElement, /* index */ Double, /* onlyAvail */ Boolean) => ValidSelectSources): Self = StObject.set(x, "filter_selectSource", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFilter_selectSourceNull: Self = StObject.set(x, "filter_selectSource", null)
      
      @scala.inline
      def setFilter_selectSourceSeparator(value: String): Self = StObject.set(x, "filter_selectSourceSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_selectSourceSeparatorUndefined: Self = StObject.set(x, "filter_selectSourceSeparator", js.undefined)
      
      @scala.inline
      def setFilter_selectSourceUndefined: Self = StObject.set(x, "filter_selectSource", js.undefined)
      
      @scala.inline
      def setFilter_selectSourceVarargs(value: (String | SelectSource)*): Self = StObject.set(x, "filter_selectSource", js.Array(value :_*))
      
      @scala.inline
      def setFilter_serversideFiltering(value: Boolean): Self = StObject.set(x, "filter_serversideFiltering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_serversideFilteringUndefined: Self = StObject.set(x, "filter_serversideFiltering", js.undefined)
      
      @scala.inline
      def setFilter_startsWith(value: Boolean): Self = StObject.set(x, "filter_startsWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_startsWithUndefined: Self = StObject.set(x, "filter_startsWith", js.undefined)
      
      @scala.inline
      def setFilter_useParsedData(value: Boolean): Self = StObject.set(x, "filter_useParsedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_useParsedDataUndefined: Self = StObject.set(x, "filter_useParsedData", js.undefined)
    }
  }
}
