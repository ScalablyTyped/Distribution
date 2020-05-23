package typings.tablesorter.widgetOptionStoreMod

import typings.jquery.JQuery.AjaxSettings
import typings.jquery.JQuery.Selector
import typings.jquery.JQuery.jqXHR
import typings.jquery.JQueryAjaxSettings
import typings.tablesorter.filterControlFactoryMod.FilterControlFactory
import typings.tablesorter.filterFunctionCollectionMod.FilterFunctionCollection
import typings.tablesorter.filterFunctionMod.FilterFunction
import typings.tablesorter.filterPlaceholdersMod.FilterPlaceholders
import typings.tablesorter.mappedSettingsMod.MappedSettings
import typings.tablesorter.matchTypeSettingsMod.MatchTypeSettings
import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import typings.tablesorter.pageSizeMod.PageSize
import typings.tablesorter.pagerClassesMod.PagerClasses
import typings.tablesorter.pagerDataPartMod.PagerDataPart
import typings.tablesorter.pagerInitialRowsMod.PagerInitialRows
import typings.tablesorter.pagerOutputProcessorMod.PagerOutputProcessor
import typings.tablesorter.pagerSelectorsMod.PagerSelectors
import typings.tablesorter.selectSourcesMod.SelectSources
import typings.tablesorter.storageTypeMod.StorageType
import typings.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import typings.tablesorter.widgetOptionsMod.WidgetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetOptionStore[TElement] extends WidgetOptions[TElement] {
  /**
    * The jQuery-object containing the cloned table for the sticky headers.
    */
  @JSName("$sticky")
  var $sticky: JQuery[HTMLElement]
  /**
    * A jQuery-object containing all filters which are bound to all columns.
    */
  @JSName("filter_$anyMatch")
  var filter_$anyMatch: JQuery[HTMLElement]
  /**
    * A jQuery-object containing all external filters.
    */
  @JSName("filter_$externalFilters")
  var filter_$externalFilters: JQuery[HTMLElement]
  /**
    * A value indicating whether the filters have initialized.
    */
  var filter_initialized: Boolean
}

object WidgetOptionStore {
  @scala.inline
  def apply[TElement](
    $sticky: JQuery[HTMLElement],
    filter_$anyMatch: JQuery[HTMLElement],
    filter_$externalFilters: JQuery[HTMLElement],
    filter_initialized: Boolean,
    columns: js.Array[String] = null,
    columns_tfoot: js.UndefOr[Boolean] = js.undefined,
    columns_thead: js.UndefOr[Boolean] = js.undefined,
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
    filter_useParsedData: js.UndefOr[Boolean] = js.undefined,
    pager_ajaxError: (/* config */ TablesorterConfigurationStore[TElement], /* request */ jqXHR[js.Any], /* ajaxSettings */ AjaxSettings[js.Any], /* thrownError */ String) => String = null,
    pager_ajaxObject: JQueryAjaxSettings = null,
    pager_ajaxProcessing: (/* data */ js.Any, TElement, /* request */ jqXHR[js.Any]) => PagerDataPart[TElement] | js.Array[Double] | (js.Tuple3[
      Double, 
      JQuery[HTMLElement] | js.Array[js.Array[js.Any]], 
      js.UndefOr[js.Array[String]]
    ]) = null,
    pager_ajaxUrl: String = null,
    pager_countChildRows: js.UndefOr[Boolean] = js.undefined,
    pager_css: PagerClasses = null,
    pager_customAjaxUrl: (TElement, /* url */ String) => String = null,
    pager_fixedHeight: js.UndefOr[Boolean] = js.undefined,
    pager_initialRows: PagerInitialRows = null,
    pager_output: String | PagerOutputProcessor[TElement] = null,
    pager_pageReset: Double | Boolean = null,
    pager_processAjaxOnInit: js.UndefOr[Boolean] = js.undefined,
    pager_removeRows: js.UndefOr[Boolean] = js.undefined,
    pager_savePages: js.UndefOr[Boolean] = js.undefined,
    pager_selectors: PagerSelectors = null,
    pager_size: PageSize = null,
    pager_startPage: js.UndefOr[Double] = js.undefined,
    pager_storageKey: String = null,
    pager_updateArrows: js.UndefOr[Boolean] = js.undefined,
    resizable: js.UndefOr[Boolean] = js.undefined,
    resizable_addLastColumn: js.UndefOr[Boolean] = js.undefined,
    resizable_includeFooter: js.UndefOr[Boolean] = js.undefined,
    resizable_targetLast: js.UndefOr[Boolean] = js.undefined,
    resizable_throttle: Boolean | Double = null,
    resizable_widths: js.Array[String] = null,
    saveSort: js.UndefOr[Boolean] = js.undefined,
    stickyHeaders: String = null,
    stickyHeaders_addResizeEvent: js.UndefOr[Boolean] = js.undefined,
    stickyHeaders_appendTo: Selector | JQuery[HTMLElement] = null,
    stickyHeaders_attachTo: Selector | JQuery[HTMLElement] = null,
    stickyHeaders_cloneId: String = null,
    stickyHeaders_filteredToTop: js.UndefOr[Boolean] = js.undefined,
    stickyHeaders_includeCaption: js.UndefOr[Boolean] = js.undefined,
    stickyHeaders_offset: Double | Selector | JQuery[HTMLElement] = null,
    stickyHeaders_xScroll: Selector | JQuery[HTMLElement] = null,
    stickyHeaders_yScroll: Selector | JQuery[HTMLElement] = null,
    stickyHeaders_zindex: js.UndefOr[Double] = js.undefined,
    storage_fixedUrl: String = null,
    storage_group: String = null,
    storage_page: String = null,
    storage_storageType: StorageType = null,
    storage_tableId: String = null,
    zebra: js.Tuple2[String, String] = null
  ): WidgetOptionStore[TElement] = {
    val __obj = js.Dynamic.literal($sticky = $sticky.asInstanceOf[js.Any], filter_$anyMatch = filter_$anyMatch.asInstanceOf[js.Any], filter_$externalFilters = filter_$externalFilters.asInstanceOf[js.Any], filter_initialized = filter_initialized.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(columns_tfoot)) __obj.updateDynamic("columns_tfoot")(columns_tfoot.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columns_thead)) __obj.updateDynamic("columns_thead")(columns_thead.get.asInstanceOf[js.Any])
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
    if (pager_ajaxError != null) __obj.updateDynamic("pager_ajaxError")(js.Any.fromFunction4(pager_ajaxError))
    if (pager_ajaxObject != null) __obj.updateDynamic("pager_ajaxObject")(pager_ajaxObject.asInstanceOf[js.Any])
    if (pager_ajaxProcessing != null) __obj.updateDynamic("pager_ajaxProcessing")(js.Any.fromFunction3(pager_ajaxProcessing))
    if (pager_ajaxUrl != null) __obj.updateDynamic("pager_ajaxUrl")(pager_ajaxUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(pager_countChildRows)) __obj.updateDynamic("pager_countChildRows")(pager_countChildRows.get.asInstanceOf[js.Any])
    if (pager_css != null) __obj.updateDynamic("pager_css")(pager_css.asInstanceOf[js.Any])
    if (pager_customAjaxUrl != null) __obj.updateDynamic("pager_customAjaxUrl")(js.Any.fromFunction2(pager_customAjaxUrl))
    if (!js.isUndefined(pager_fixedHeight)) __obj.updateDynamic("pager_fixedHeight")(pager_fixedHeight.get.asInstanceOf[js.Any])
    if (pager_initialRows != null) __obj.updateDynamic("pager_initialRows")(pager_initialRows.asInstanceOf[js.Any])
    if (pager_output != null) __obj.updateDynamic("pager_output")(pager_output.asInstanceOf[js.Any])
    if (pager_pageReset != null) __obj.updateDynamic("pager_pageReset")(pager_pageReset.asInstanceOf[js.Any])
    if (!js.isUndefined(pager_processAjaxOnInit)) __obj.updateDynamic("pager_processAjaxOnInit")(pager_processAjaxOnInit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pager_removeRows)) __obj.updateDynamic("pager_removeRows")(pager_removeRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pager_savePages)) __obj.updateDynamic("pager_savePages")(pager_savePages.get.asInstanceOf[js.Any])
    if (pager_selectors != null) __obj.updateDynamic("pager_selectors")(pager_selectors.asInstanceOf[js.Any])
    if (pager_size != null) __obj.updateDynamic("pager_size")(pager_size.asInstanceOf[js.Any])
    if (!js.isUndefined(pager_startPage)) __obj.updateDynamic("pager_startPage")(pager_startPage.get.asInstanceOf[js.Any])
    if (pager_storageKey != null) __obj.updateDynamic("pager_storageKey")(pager_storageKey.asInstanceOf[js.Any])
    if (!js.isUndefined(pager_updateArrows)) __obj.updateDynamic("pager_updateArrows")(pager_updateArrows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable_addLastColumn)) __obj.updateDynamic("resizable_addLastColumn")(resizable_addLastColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable_includeFooter)) __obj.updateDynamic("resizable_includeFooter")(resizable_includeFooter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable_targetLast)) __obj.updateDynamic("resizable_targetLast")(resizable_targetLast.get.asInstanceOf[js.Any])
    if (resizable_throttle != null) __obj.updateDynamic("resizable_throttle")(resizable_throttle.asInstanceOf[js.Any])
    if (resizable_widths != null) __obj.updateDynamic("resizable_widths")(resizable_widths.asInstanceOf[js.Any])
    if (!js.isUndefined(saveSort)) __obj.updateDynamic("saveSort")(saveSort.get.asInstanceOf[js.Any])
    if (stickyHeaders != null) __obj.updateDynamic("stickyHeaders")(stickyHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyHeaders_addResizeEvent)) __obj.updateDynamic("stickyHeaders_addResizeEvent")(stickyHeaders_addResizeEvent.get.asInstanceOf[js.Any])
    if (stickyHeaders_appendTo != null) __obj.updateDynamic("stickyHeaders_appendTo")(stickyHeaders_appendTo.asInstanceOf[js.Any])
    if (stickyHeaders_attachTo != null) __obj.updateDynamic("stickyHeaders_attachTo")(stickyHeaders_attachTo.asInstanceOf[js.Any])
    if (stickyHeaders_cloneId != null) __obj.updateDynamic("stickyHeaders_cloneId")(stickyHeaders_cloneId.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyHeaders_filteredToTop)) __obj.updateDynamic("stickyHeaders_filteredToTop")(stickyHeaders_filteredToTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyHeaders_includeCaption)) __obj.updateDynamic("stickyHeaders_includeCaption")(stickyHeaders_includeCaption.get.asInstanceOf[js.Any])
    if (stickyHeaders_offset != null) __obj.updateDynamic("stickyHeaders_offset")(stickyHeaders_offset.asInstanceOf[js.Any])
    if (stickyHeaders_xScroll != null) __obj.updateDynamic("stickyHeaders_xScroll")(stickyHeaders_xScroll.asInstanceOf[js.Any])
    if (stickyHeaders_yScroll != null) __obj.updateDynamic("stickyHeaders_yScroll")(stickyHeaders_yScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyHeaders_zindex)) __obj.updateDynamic("stickyHeaders_zindex")(stickyHeaders_zindex.get.asInstanceOf[js.Any])
    if (storage_fixedUrl != null) __obj.updateDynamic("storage_fixedUrl")(storage_fixedUrl.asInstanceOf[js.Any])
    if (storage_group != null) __obj.updateDynamic("storage_group")(storage_group.asInstanceOf[js.Any])
    if (storage_page != null) __obj.updateDynamic("storage_page")(storage_page.asInstanceOf[js.Any])
    if (storage_storageType != null) __obj.updateDynamic("storage_storageType")(storage_storageType.asInstanceOf[js.Any])
    if (storage_tableId != null) __obj.updateDynamic("storage_tableId")(storage_tableId.asInstanceOf[js.Any])
    if (zebra != null) __obj.updateDynamic("zebra")(zebra.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetOptionStore[TElement]]
  }
}

