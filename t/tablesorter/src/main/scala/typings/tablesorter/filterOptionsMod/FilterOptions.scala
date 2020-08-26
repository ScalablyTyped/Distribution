package typings.tablesorter.filterOptionsMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterOptions[TElement] extends js.Object {
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
  implicit class FilterOptionsOps[Self <: FilterOptions[_], TElement] (val x: Self with FilterOptions[TElement]) extends AnyVal {
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
    def setFilter_cellFilterVarargs(value: String*): Self = this.set("filter_cellFilter", js.Array(value :_*))
    @scala.inline
    def setFilter_cellFilter(value: String | js.Array[String]): Self = this.set("filter_cellFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_cellFilter: Self = this.set("filter_cellFilter", js.undefined)
    @scala.inline
    def setFilter_childByColumn(value: Boolean): Self = this.set("filter_childByColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_childByColumn: Self = this.set("filter_childByColumn", js.undefined)
    @scala.inline
    def setFilter_childRows(value: Boolean): Self = this.set("filter_childRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_childRows: Self = this.set("filter_childRows", js.undefined)
    @scala.inline
    def setFilter_childWithSibs(value: Boolean): Self = this.set("filter_childWithSibs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_childWithSibs: Self = this.set("filter_childWithSibs", js.undefined)
    @scala.inline
    def setFilter_columnAnyMatch(value: Boolean): Self = this.set("filter_columnAnyMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_columnAnyMatch: Self = this.set("filter_columnAnyMatch", js.undefined)
    @scala.inline
    def setFilter_columnFilters(value: Boolean): Self = this.set("filter_columnFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_columnFilters: Self = this.set("filter_columnFilters", js.undefined)
    @scala.inline
    def setFilter_cssFilterVarargs(value: String*): Self = this.set("filter_cssFilter", js.Array(value :_*))
    @scala.inline
    def setFilter_cssFilter(value: String | js.Array[String]): Self = this.set("filter_cssFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_cssFilter: Self = this.set("filter_cssFilter", js.undefined)
    @scala.inline
    def setFilter_defaultAttrib(value: String): Self = this.set("filter_defaultAttrib", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_defaultAttrib: Self = this.set("filter_defaultAttrib", js.undefined)
    @scala.inline
    def setFilter_defaultFilter(value: MappedSettings[String]): Self = this.set("filter_defaultFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_defaultFilter: Self = this.set("filter_defaultFilter", js.undefined)
    @scala.inline
    def setFilter_excludeFilter(value: MappedSettings[String]): Self = this.set("filter_excludeFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_excludeFilter: Self = this.set("filter_excludeFilter", js.undefined)
    @scala.inline
    def setFilter_external(value: Selector): Self = this.set("filter_external", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_external: Self = this.set("filter_external", js.undefined)
    @scala.inline
    def setFilter_filterLabel(value: String): Self = this.set("filter_filterLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_filterLabel: Self = this.set("filter_filterLabel", js.undefined)
    @scala.inline
    def setFilter_filteredRow(value: String): Self = this.set("filter_filteredRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_filteredRow: Self = this.set("filter_filteredRow", js.undefined)
    @scala.inline
    def setFilter_formatter(value: MappedSettings[FilterControlFactory]): Self = this.set("filter_formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_formatter: Self = this.set("filter_formatter", js.undefined)
    @scala.inline
    def setFilter_functions(value: MappedSettings[FilterFunctionCollection[TElement] | FilterFunction[TElement]]): Self = this.set("filter_functions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_functions: Self = this.set("filter_functions", js.undefined)
    @scala.inline
    def setFilter_hideEmpty(value: Boolean): Self = this.set("filter_hideEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_hideEmpty: Self = this.set("filter_hideEmpty", js.undefined)
    @scala.inline
    def setFilter_hideFiltersFunction1(value: /* config */ TablesorterConfigurationStore[TElement] => Boolean): Self = this.set("filter_hideFilters", js.Any.fromFunction1(value))
    @scala.inline
    def setFilter_hideFilters(value: Boolean | (js.Function1[/* config */ TablesorterConfigurationStore[TElement], Boolean])): Self = this.set("filter_hideFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_hideFilters: Self = this.set("filter_hideFilters", js.undefined)
    @scala.inline
    def setFilter_ignoreCase(value: Boolean): Self = this.set("filter_ignoreCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_ignoreCase: Self = this.set("filter_ignoreCase", js.undefined)
    @scala.inline
    def setFilter_liveSearch(value: Boolean | Double | (MappedSettings[Boolean | Double])): Self = this.set("filter_liveSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_liveSearch: Self = this.set("filter_liveSearch", js.undefined)
    @scala.inline
    def setFilter_matchType(value: MatchTypeSettings): Self = this.set("filter_matchType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_matchType: Self = this.set("filter_matchType", js.undefined)
    @scala.inline
    def setFilter_onlyAvail(value: String): Self = this.set("filter_onlyAvail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_onlyAvail: Self = this.set("filter_onlyAvail", js.undefined)
    @scala.inline
    def setFilter_placeholder(value: FilterPlaceholders): Self = this.set("filter_placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_placeholder: Self = this.set("filter_placeholder", js.undefined)
    @scala.inline
    def setFilter_reset(value: Selector | JQuery[HTMLElement]): Self = this.set("filter_reset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_reset: Self = this.set("filter_reset", js.undefined)
    @scala.inline
    def setFilter_resetOnEsc(value: Boolean): Self = this.set("filter_resetOnEsc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_resetOnEsc: Self = this.set("filter_resetOnEsc", js.undefined)
    @scala.inline
    def setFilter_saveFilters(value: Boolean): Self = this.set("filter_saveFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_saveFilters: Self = this.set("filter_saveFilters", js.undefined)
    @scala.inline
    def setFilter_searchDelay(value: Double): Self = this.set("filter_searchDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_searchDelay: Self = this.set("filter_searchDelay", js.undefined)
    @scala.inline
    def setFilter_searchFiltered(value: Boolean): Self = this.set("filter_searchFiltered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_searchFiltered: Self = this.set("filter_searchFiltered", js.undefined)
    @scala.inline
    def setFilter_selectSourceVarargs(value: (String | SelectSource)*): Self = this.set("filter_selectSource", js.Array(value :_*))
    @scala.inline
    def setFilter_selectSourceFunction3(value: (TElement, /* index */ Double, /* onlyAvail */ Boolean) => ValidSelectSources): Self = this.set("filter_selectSource", js.Any.fromFunction3(value))
    @scala.inline
    def setFilter_selectSource(value: SelectSources[TElement] | MappedSettings[SelectSources[TElement]]): Self = this.set("filter_selectSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_selectSource: Self = this.set("filter_selectSource", js.undefined)
    @scala.inline
    def setFilter_selectSourceNull: Self = this.set("filter_selectSource", null)
    @scala.inline
    def setFilter_selectSourceSeparator(value: String): Self = this.set("filter_selectSourceSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_selectSourceSeparator: Self = this.set("filter_selectSourceSeparator", js.undefined)
    @scala.inline
    def setFilter_serversideFiltering(value: Boolean): Self = this.set("filter_serversideFiltering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_serversideFiltering: Self = this.set("filter_serversideFiltering", js.undefined)
    @scala.inline
    def setFilter_startsWith(value: Boolean): Self = this.set("filter_startsWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_startsWith: Self = this.set("filter_startsWith", js.undefined)
    @scala.inline
    def setFilter_useParsedData(value: Boolean): Self = this.set("filter_useParsedData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_useParsedData: Self = this.set("filter_useParsedData", js.undefined)
  }
  
}

