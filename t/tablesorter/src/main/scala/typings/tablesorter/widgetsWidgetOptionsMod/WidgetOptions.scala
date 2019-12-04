package typings.tablesorter.widgetsWidgetOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery.AjaxSettings
import typings.jquery.JQuery.Selector
import typings.jquery.JQuery.jqXHR
import typings.jquery.JQueryAjaxSettings
import typings.tablesorter.filteringFilterFunctionCollectionMod.FilterFunctionCollection
import typings.tablesorter.filteringFilterFunctionMod.FilterFunction
import typings.tablesorter.filteringFilterPlaceholdersMod.FilterPlaceholders
import typings.tablesorter.filteringFormatterFilterControlFactoryMod.FilterControlFactory
import typings.tablesorter.filteringMatchTypeSettingsMod.MatchTypeSettings
import typings.tablesorter.filteringSelectSourcesMod.SelectSources
import typings.tablesorter.pagingPageSizeMod.PageSize
import typings.tablesorter.pagingPagerClassesMod.PagerClasses
import typings.tablesorter.pagingPagerDataPartMod.PagerDataPart
import typings.tablesorter.pagingPagerInitialRowsMod.PagerInitialRows
import typings.tablesorter.pagingPagerOutputProcessorMod.PagerOutputProcessor
import typings.tablesorter.pagingPagerSelectorsMod.PagerSelectors
import typings.tablesorter.storageStorageTypeMod.StorageType
import typings.tablesorter.systemMappedSettingsMod.MappedSettings
import typings.tablesorter.systemTablesorterConfigurationStoreMod.TablesorterConfigurationStore
import typings.tablesorter.tablesorterMod._Global_.HTMLElement
import typings.tablesorter.tablesorterMod._Global_.JQuery
import typings.tablesorter.widgetsColumnWidgetOptionsMod.ColumnOptions
import typings.tablesorter.widgetsFilterOptionsMod.FilterOptions
import typings.tablesorter.widgetsPagerOptionsMod.PagerOptions
import typings.tablesorter.widgetsResizingOptionsMod.ResizingOptions
import typings.tablesorter.widgetsSaveSortOptionsMod.SaveSortOptions
import typings.tablesorter.widgetsStickyHeaderOptionsMod.StickyHeaderOptions
import typings.tablesorter.widgetsZebraOptionsMod.ZebraOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetOptions[TElement]
  extends ColumnOptions
     with FilterOptions[TElement]
     with ResizingOptions
     with SaveSortOptions
     with StickyHeaderOptions
     with PagerOptions[TElement]
     with ZebraOptions
     with /* option */ StringDictionary[js.Any]

object WidgetOptions {
  @scala.inline
  def apply[TElement](
    StringDictionary: /* option */ StringDictionary[js.Any] = null,
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
    filter_searchDelay: Int | Double = null,
    filter_searchFiltered: js.UndefOr[Boolean] = js.undefined,
    filter_selectSource: SelectSources[TElement] | MappedSettings[SelectSources[TElement]] = null,
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
    pager_startPage: Int | Double = null,
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
    stickyHeaders_zindex: Int | Double = null,
    storage_fixedUrl: String = null,
    storage_group: String = null,
    storage_page: String = null,
    storage_storageType: StorageType = null,
    storage_tableId: String = null,
    zebra: js.Tuple2[String, String] = null
  ): WidgetOptions[TElement] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(columns_tfoot)) __obj.updateDynamic("columns_tfoot")(columns_tfoot.asInstanceOf[js.Any])
    if (!js.isUndefined(columns_thead)) __obj.updateDynamic("columns_thead")(columns_thead.asInstanceOf[js.Any])
    if (filter_cellFilter != null) __obj.updateDynamic("filter_cellFilter")(filter_cellFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_childByColumn)) __obj.updateDynamic("filter_childByColumn")(filter_childByColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_childRows)) __obj.updateDynamic("filter_childRows")(filter_childRows.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_childWithSibs)) __obj.updateDynamic("filter_childWithSibs")(filter_childWithSibs.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_columnAnyMatch)) __obj.updateDynamic("filter_columnAnyMatch")(filter_columnAnyMatch.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_columnFilters)) __obj.updateDynamic("filter_columnFilters")(filter_columnFilters.asInstanceOf[js.Any])
    if (filter_cssFilter != null) __obj.updateDynamic("filter_cssFilter")(filter_cssFilter.asInstanceOf[js.Any])
    if (filter_defaultAttrib != null) __obj.updateDynamic("filter_defaultAttrib")(filter_defaultAttrib.asInstanceOf[js.Any])
    if (filter_defaultFilter != null) __obj.updateDynamic("filter_defaultFilter")(filter_defaultFilter.asInstanceOf[js.Any])
    if (filter_excludeFilter != null) __obj.updateDynamic("filter_excludeFilter")(filter_excludeFilter.asInstanceOf[js.Any])
    if (filter_external != null) __obj.updateDynamic("filter_external")(filter_external.asInstanceOf[js.Any])
    if (filter_filterLabel != null) __obj.updateDynamic("filter_filterLabel")(filter_filterLabel.asInstanceOf[js.Any])
    if (filter_filteredRow != null) __obj.updateDynamic("filter_filteredRow")(filter_filteredRow.asInstanceOf[js.Any])
    if (filter_formatter != null) __obj.updateDynamic("filter_formatter")(filter_formatter.asInstanceOf[js.Any])
    if (filter_functions != null) __obj.updateDynamic("filter_functions")(filter_functions.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_hideEmpty)) __obj.updateDynamic("filter_hideEmpty")(filter_hideEmpty.asInstanceOf[js.Any])
    if (filter_hideFilters != null) __obj.updateDynamic("filter_hideFilters")(filter_hideFilters.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_ignoreCase)) __obj.updateDynamic("filter_ignoreCase")(filter_ignoreCase.asInstanceOf[js.Any])
    if (filter_liveSearch != null) __obj.updateDynamic("filter_liveSearch")(filter_liveSearch.asInstanceOf[js.Any])
    if (filter_matchType != null) __obj.updateDynamic("filter_matchType")(filter_matchType.asInstanceOf[js.Any])
    if (filter_onlyAvail != null) __obj.updateDynamic("filter_onlyAvail")(filter_onlyAvail.asInstanceOf[js.Any])
    if (filter_placeholder != null) __obj.updateDynamic("filter_placeholder")(filter_placeholder.asInstanceOf[js.Any])
    if (filter_reset != null) __obj.updateDynamic("filter_reset")(filter_reset.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_resetOnEsc)) __obj.updateDynamic("filter_resetOnEsc")(filter_resetOnEsc.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_saveFilters)) __obj.updateDynamic("filter_saveFilters")(filter_saveFilters.asInstanceOf[js.Any])
    if (filter_searchDelay != null) __obj.updateDynamic("filter_searchDelay")(filter_searchDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_searchFiltered)) __obj.updateDynamic("filter_searchFiltered")(filter_searchFiltered.asInstanceOf[js.Any])
    if (filter_selectSource != null) __obj.updateDynamic("filter_selectSource")(filter_selectSource.asInstanceOf[js.Any])
    if (filter_selectSourceSeparator != null) __obj.updateDynamic("filter_selectSourceSeparator")(filter_selectSourceSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_serversideFiltering)) __obj.updateDynamic("filter_serversideFiltering")(filter_serversideFiltering.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_startsWith)) __obj.updateDynamic("filter_startsWith")(filter_startsWith.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_useParsedData)) __obj.updateDynamic("filter_useParsedData")(filter_useParsedData.asInstanceOf[js.Any])
    if (pager_ajaxError != null) __obj.updateDynamic("pager_ajaxError")(js.Any.fromFunction4(pager_ajaxError))
    if (pager_ajaxObject != null) __obj.updateDynamic("pager_ajaxObject")(pager_ajaxObject.asInstanceOf[js.Any])
    if (pager_ajaxProcessing != null) __obj.updateDynamic("pager_ajaxProcessing")(js.Any.fromFunction3(pager_ajaxProcessing))
    if (pager_ajaxUrl != null) __obj.updateDynamic("pager_ajaxUrl")(pager_ajaxUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(pager_countChildRows)) __obj.updateDynamic("pager_countChildRows")(pager_countChildRows.asInstanceOf[js.Any])
    if (pager_css != null) __obj.updateDynamic("pager_css")(pager_css.asInstanceOf[js.Any])
    if (pager_customAjaxUrl != null) __obj.updateDynamic("pager_customAjaxUrl")(js.Any.fromFunction2(pager_customAjaxUrl))
    if (!js.isUndefined(pager_fixedHeight)) __obj.updateDynamic("pager_fixedHeight")(pager_fixedHeight.asInstanceOf[js.Any])
    if (pager_initialRows != null) __obj.updateDynamic("pager_initialRows")(pager_initialRows.asInstanceOf[js.Any])
    if (pager_output != null) __obj.updateDynamic("pager_output")(pager_output.asInstanceOf[js.Any])
    if (pager_pageReset != null) __obj.updateDynamic("pager_pageReset")(pager_pageReset.asInstanceOf[js.Any])
    if (!js.isUndefined(pager_processAjaxOnInit)) __obj.updateDynamic("pager_processAjaxOnInit")(pager_processAjaxOnInit.asInstanceOf[js.Any])
    if (!js.isUndefined(pager_removeRows)) __obj.updateDynamic("pager_removeRows")(pager_removeRows.asInstanceOf[js.Any])
    if (!js.isUndefined(pager_savePages)) __obj.updateDynamic("pager_savePages")(pager_savePages.asInstanceOf[js.Any])
    if (pager_selectors != null) __obj.updateDynamic("pager_selectors")(pager_selectors.asInstanceOf[js.Any])
    if (pager_size != null) __obj.updateDynamic("pager_size")(pager_size.asInstanceOf[js.Any])
    if (pager_startPage != null) __obj.updateDynamic("pager_startPage")(pager_startPage.asInstanceOf[js.Any])
    if (pager_storageKey != null) __obj.updateDynamic("pager_storageKey")(pager_storageKey.asInstanceOf[js.Any])
    if (!js.isUndefined(pager_updateArrows)) __obj.updateDynamic("pager_updateArrows")(pager_updateArrows.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable_addLastColumn)) __obj.updateDynamic("resizable_addLastColumn")(resizable_addLastColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable_includeFooter)) __obj.updateDynamic("resizable_includeFooter")(resizable_includeFooter.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable_targetLast)) __obj.updateDynamic("resizable_targetLast")(resizable_targetLast.asInstanceOf[js.Any])
    if (resizable_throttle != null) __obj.updateDynamic("resizable_throttle")(resizable_throttle.asInstanceOf[js.Any])
    if (resizable_widths != null) __obj.updateDynamic("resizable_widths")(resizable_widths.asInstanceOf[js.Any])
    if (!js.isUndefined(saveSort)) __obj.updateDynamic("saveSort")(saveSort.asInstanceOf[js.Any])
    if (stickyHeaders != null) __obj.updateDynamic("stickyHeaders")(stickyHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyHeaders_addResizeEvent)) __obj.updateDynamic("stickyHeaders_addResizeEvent")(stickyHeaders_addResizeEvent.asInstanceOf[js.Any])
    if (stickyHeaders_appendTo != null) __obj.updateDynamic("stickyHeaders_appendTo")(stickyHeaders_appendTo.asInstanceOf[js.Any])
    if (stickyHeaders_attachTo != null) __obj.updateDynamic("stickyHeaders_attachTo")(stickyHeaders_attachTo.asInstanceOf[js.Any])
    if (stickyHeaders_cloneId != null) __obj.updateDynamic("stickyHeaders_cloneId")(stickyHeaders_cloneId.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyHeaders_filteredToTop)) __obj.updateDynamic("stickyHeaders_filteredToTop")(stickyHeaders_filteredToTop.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyHeaders_includeCaption)) __obj.updateDynamic("stickyHeaders_includeCaption")(stickyHeaders_includeCaption.asInstanceOf[js.Any])
    if (stickyHeaders_offset != null) __obj.updateDynamic("stickyHeaders_offset")(stickyHeaders_offset.asInstanceOf[js.Any])
    if (stickyHeaders_xScroll != null) __obj.updateDynamic("stickyHeaders_xScroll")(stickyHeaders_xScroll.asInstanceOf[js.Any])
    if (stickyHeaders_yScroll != null) __obj.updateDynamic("stickyHeaders_yScroll")(stickyHeaders_yScroll.asInstanceOf[js.Any])
    if (stickyHeaders_zindex != null) __obj.updateDynamic("stickyHeaders_zindex")(stickyHeaders_zindex.asInstanceOf[js.Any])
    if (storage_fixedUrl != null) __obj.updateDynamic("storage_fixedUrl")(storage_fixedUrl.asInstanceOf[js.Any])
    if (storage_group != null) __obj.updateDynamic("storage_group")(storage_group.asInstanceOf[js.Any])
    if (storage_page != null) __obj.updateDynamic("storage_page")(storage_page.asInstanceOf[js.Any])
    if (storage_storageType != null) __obj.updateDynamic("storage_storageType")(storage_storageType.asInstanceOf[js.Any])
    if (storage_tableId != null) __obj.updateDynamic("storage_tableId")(storage_tableId.asInstanceOf[js.Any])
    if (zebra != null) __obj.updateDynamic("zebra")(zebra.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetOptions[TElement]]
  }
}

