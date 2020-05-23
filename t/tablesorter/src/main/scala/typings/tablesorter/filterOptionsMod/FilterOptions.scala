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
import typings.tablesorter.selectSourcesMod.SelectSources
import typings.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterOptions[TElement] extends js.Object {
  /**
    * A set of classes to apply to the filter-cells.
    */
  var filter_cellFilter: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * A value indicating whether only the filtered column of child-rows should be considered when filtering.
    */
  var filter_childByColumn: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether child-rows should be considered when filtering.
    */
  var filter_childRows: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether siblings should be displayed when filtering.
    */
  var filter_childWithSibs: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether searches using the `{index}:{query}` in the anyMatch-textbox is allowed.
    */
  var filter_columnAnyMatch: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether filtering is enabled.
    */
  var filter_columnFilters: js.UndefOr[Boolean] = js.undefined
  /**
    * A CSS class which is applied to each filter-cell.
    */
  var filter_cssFilter: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * The attribute-name which is used for querying the default filter-value.
    */
  var filter_defaultAttrib: js.UndefOr[String] = js.undefined
  /**
    * The default filters to apply.
    */
  var filter_defaultFilter: js.UndefOr[MappedSettings[String]] = js.undefined
  /**
    * A set of filters to prevent.
    */
  var filter_excludeFilter: js.UndefOr[MappedSettings[String]] = js.undefined
  /**
    * The jQuery-selector for querying the external search-box.
    */
  var filter_external: js.UndefOr[Selector] = js.undefined
  /**
    * The template for generating the ARIA-label of the filter-control.
    */
  var filter_filterLabel: js.UndefOr[String] = js.undefined
  /**
    * A CSS class which is applied for each cel which is filtered.
    */
  var filter_filteredRow: js.UndefOr[String] = js.undefined
  /**
    * The filter-controls to apply.
    */
  var filter_formatter: js.UndefOr[MappedSettings[FilterControlFactory]] = js.undefined
  /**
    * A set of filter-functions to apply for the columns.
    */
  var filter_functions: js.UndefOr[MappedSettings[FilterFunctionCollection[TElement] | FilterFunction[TElement]]] = js.undefined
  /**
    * A value indicating whether the filter-controls should be hidden when the table is empty.
    */
  var filter_hideEmpty: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether the filter should hide automatically.
    */
  var filter_hideFilters: js.UndefOr[
    Boolean | (js.Function1[/* config */ TablesorterConfigurationStore[TElement], Boolean])
  ] = js.undefined
  /**
    * A value indicating whether the letter-case should be ignored.
    */
  var filter_ignoreCase: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether a search should be performed without having to hit `Enter`.
    */
  var filter_liveSearch: js.UndefOr[Boolean | Double | (MappedSettings[Boolean | Double])] = js.undefined
  /**
    * The match-types to apply to the controls.
    */
  var filter_matchType: js.UndefOr[MatchTypeSettings] = js.undefined
  /**
    * A class for indicating whether only visible entries should be available in `select`-controls.
    */
  var filter_onlyAvail: js.UndefOr[String] = js.undefined
  /**
    * The placeholders to set initially.
    */
  var filter_placeholder: js.UndefOr[FilterPlaceholders] = js.undefined
  /**
    * A jQuery-selector for querying the button for resetting the filter.
    */
  var filter_reset: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
  /**
    * A value indicating whether the filter should be resetted when `ESC` is hit.
    */
  var filter_resetOnEsc: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether the filters should be saved to the client.
    */
  var filter_saveFilters: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of miliseconds to wait before performing a search.
    */
  var filter_searchDelay: js.UndefOr[Double] = js.undefined
  /**
    * A value indicating whether only filtered rows should be considered while searching.
    */
  var filter_searchFiltered: js.UndefOr[Boolean] = js.undefined
  /**
    * The sources for the select-controls.
    */
  var filter_selectSource: js.UndefOr[SelectSources[TElement] | MappedSettings[SelectSources[TElement]]] = js.undefined
  /**
    * The character for separating display-name and value inside the `filter_selectSource`.
    */
  var filter_selectSourceSeparator: js.UndefOr[String] = js.undefined
  /**
    * A value indicating whether filtering is performed server-side.
    */
  var filter_serversideFiltering: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether searches should be performed with the `starts with`-logic.
    */
  var filter_startsWith: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether filtering should be perormed using parsed data.
    */
  var filter_useParsedData: js.UndefOr[Boolean] = js.undefined
}

object FilterOptions {
  @scala.inline
  def apply[TElement](
    filter_cellFilter: String | js.Array[String] = null,
    filter_childByColumn: js.UndefOr[Boolean] = js.undefined,
    filter_childRows: js.UndefOr[Boolean] = js.undefined,
    filter_childWithSibs: js.UndefOr[Boolean] = js.undefined,
    filter_columnAnyMatch: js.UndefOr[Boolean] = js.undefined,
    filter_columnFilters: js.UndefOr[Boolean] = js.undefined,
    filter_cssFilter: String | js.Array[String] = null,
    filter_defaultAttrib: String = null,
    filter_defaultFilter: MappedSettings[String] = null,
    filter_excludeFilter: MappedSettings[String] = null,
    filter_external: Selector = null,
    filter_filterLabel: String = null,
    filter_filteredRow: String = null,
    filter_formatter: MappedSettings[FilterControlFactory] = null,
    filter_functions: MappedSettings[FilterFunctionCollection[TElement] | FilterFunction[TElement]] = null,
    filter_hideEmpty: js.UndefOr[Boolean] = js.undefined,
    filter_hideFilters: Boolean | (js.Function1[/* config */ TablesorterConfigurationStore[TElement], Boolean]) = null,
    filter_ignoreCase: js.UndefOr[Boolean] = js.undefined,
    filter_liveSearch: Boolean | Double | (MappedSettings[Boolean | Double]) = null,
    filter_matchType: MatchTypeSettings = null,
    filter_onlyAvail: String = null,
    filter_placeholder: FilterPlaceholders = null,
    filter_reset: Selector | JQuery[HTMLElement] = null,
    filter_resetOnEsc: js.UndefOr[Boolean] = js.undefined,
    filter_saveFilters: js.UndefOr[Boolean] = js.undefined,
    filter_searchDelay: js.UndefOr[Double] = js.undefined,
    filter_searchFiltered: js.UndefOr[Boolean] = js.undefined,
    filter_selectSource: js.UndefOr[Null | SelectSources[TElement] | MappedSettings[SelectSources[TElement]]] = js.undefined,
    filter_selectSourceSeparator: String = null,
    filter_serversideFiltering: js.UndefOr[Boolean] = js.undefined,
    filter_startsWith: js.UndefOr[Boolean] = js.undefined,
    filter_useParsedData: js.UndefOr[Boolean] = js.undefined
  ): FilterOptions[TElement] = {
    val __obj = js.Dynamic.literal()
    if (filter_cellFilter != null) __obj.updateDynamic("filter_cellFilter")(filter_cellFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_childByColumn)) __obj.updateDynamic("filter_childByColumn")(filter_childByColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_childRows)) __obj.updateDynamic("filter_childRows")(filter_childRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_childWithSibs)) __obj.updateDynamic("filter_childWithSibs")(filter_childWithSibs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_columnAnyMatch)) __obj.updateDynamic("filter_columnAnyMatch")(filter_columnAnyMatch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_columnFilters)) __obj.updateDynamic("filter_columnFilters")(filter_columnFilters.get.asInstanceOf[js.Any])
    if (filter_cssFilter != null) __obj.updateDynamic("filter_cssFilter")(filter_cssFilter.asInstanceOf[js.Any])
    if (filter_defaultAttrib != null) __obj.updateDynamic("filter_defaultAttrib")(filter_defaultAttrib.asInstanceOf[js.Any])
    if (filter_defaultFilter != null) __obj.updateDynamic("filter_defaultFilter")(filter_defaultFilter.asInstanceOf[js.Any])
    if (filter_excludeFilter != null) __obj.updateDynamic("filter_excludeFilter")(filter_excludeFilter.asInstanceOf[js.Any])
    if (filter_external != null) __obj.updateDynamic("filter_external")(filter_external.asInstanceOf[js.Any])
    if (filter_filterLabel != null) __obj.updateDynamic("filter_filterLabel")(filter_filterLabel.asInstanceOf[js.Any])
    if (filter_filteredRow != null) __obj.updateDynamic("filter_filteredRow")(filter_filteredRow.asInstanceOf[js.Any])
    if (filter_formatter != null) __obj.updateDynamic("filter_formatter")(filter_formatter.asInstanceOf[js.Any])
    if (filter_functions != null) __obj.updateDynamic("filter_functions")(filter_functions.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_hideEmpty)) __obj.updateDynamic("filter_hideEmpty")(filter_hideEmpty.get.asInstanceOf[js.Any])
    if (filter_hideFilters != null) __obj.updateDynamic("filter_hideFilters")(filter_hideFilters.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_ignoreCase)) __obj.updateDynamic("filter_ignoreCase")(filter_ignoreCase.get.asInstanceOf[js.Any])
    if (filter_liveSearch != null) __obj.updateDynamic("filter_liveSearch")(filter_liveSearch.asInstanceOf[js.Any])
    if (filter_matchType != null) __obj.updateDynamic("filter_matchType")(filter_matchType.asInstanceOf[js.Any])
    if (filter_onlyAvail != null) __obj.updateDynamic("filter_onlyAvail")(filter_onlyAvail.asInstanceOf[js.Any])
    if (filter_placeholder != null) __obj.updateDynamic("filter_placeholder")(filter_placeholder.asInstanceOf[js.Any])
    if (filter_reset != null) __obj.updateDynamic("filter_reset")(filter_reset.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_resetOnEsc)) __obj.updateDynamic("filter_resetOnEsc")(filter_resetOnEsc.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_saveFilters)) __obj.updateDynamic("filter_saveFilters")(filter_saveFilters.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_searchDelay)) __obj.updateDynamic("filter_searchDelay")(filter_searchDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_searchFiltered)) __obj.updateDynamic("filter_searchFiltered")(filter_searchFiltered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_selectSource)) __obj.updateDynamic("filter_selectSource")(filter_selectSource.asInstanceOf[js.Any])
    if (filter_selectSourceSeparator != null) __obj.updateDynamic("filter_selectSourceSeparator")(filter_selectSourceSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_serversideFiltering)) __obj.updateDynamic("filter_serversideFiltering")(filter_serversideFiltering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_startsWith)) __obj.updateDynamic("filter_startsWith")(filter_startsWith.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_useParsedData)) __obj.updateDynamic("filter_useParsedData")(filter_useParsedData.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOptions[TElement]]
  }
}

