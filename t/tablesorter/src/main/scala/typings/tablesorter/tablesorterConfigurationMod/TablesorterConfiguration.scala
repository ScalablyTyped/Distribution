package typings.tablesorter.tablesorterConfigurationMod

import org.scalablytyped.runtime.NumberDictionary
import typings.jquery.JQuery_.Selector
import typings.tablesorter.coreThemeMod.CoreTheme
import typings.tablesorter.emptySortingMod.EmptySorting
import typings.tablesorter.globalizeSettingsMod.GlobalizeSettings
import typings.tablesorter.initializationEventHandlerMod.InitializationEventHandler
import typings.tablesorter.mappedSettingsMod.MappedSettings
import typings.tablesorter.mod._Global_.JQuery
import typings.tablesorter.numberSorterMod.NumberSorter
import typings.tablesorter.relativeSortDefinitionMod.RelativeSortDefinition
import typings.tablesorter.renderHeaderEventHandlerMod.RenderHeaderEventHandler
import typings.tablesorter.renderTemplateEventHandlerMod.RenderTemplateEventHandler
import typings.tablesorter.sortDefinitionMod.SortDefinition
import typings.tablesorter.sortOrderMod.SortOrder
import typings.tablesorter.stringSortingMod.StringSorting
import typings.tablesorter.tablesorterConfigBaseMod.TablesorterConfigBase
import typings.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import typings.tablesorter.tablesorterHeadingMod.TablesorterHeading
import typings.tablesorter.tablesorterStrings.altKey
import typings.tablesorter.tablesorterStrings.basic
import typings.tablesorter.tablesorterStrings.button
import typings.tablesorter.tablesorterStrings.buttons
import typings.tablesorter.tablesorterStrings.clientX
import typings.tablesorter.tablesorterStrings.clientY
import typings.tablesorter.tablesorterStrings.ctrlKey
import typings.tablesorter.tablesorterStrings.metaKey
import typings.tablesorter.tablesorterStrings.movementX
import typings.tablesorter.tablesorterStrings.movementY
import typings.tablesorter.tablesorterStrings.offsetX
import typings.tablesorter.tablesorterStrings.offsetY
import typings.tablesorter.tablesorterStrings.pageX
import typings.tablesorter.tablesorterStrings.pageY
import typings.tablesorter.tablesorterStrings.relatedTarget
import typings.tablesorter.tablesorterStrings.screenX
import typings.tablesorter.tablesorterStrings.screenY
import typings.tablesorter.tablesorterStrings.shiftKey
import typings.tablesorter.tablesorterStrings.x
import typings.tablesorter.tablesorterStrings.y
import typings.tablesorter.textExtractorMod.TextExtractor
import typings.tablesorter.textSorterMod.TextSorter
import typings.tablesorter.widgetOptionsMod.WidgetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TablesorterConfiguration[TElement] extends TablesorterConfigBase {
  /**
    * A value indicating whether the selection of the text in the table headers should be disabled.
    */
  var cancelSelection: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether only visible rows should be affected by the checkbox located in the header.
    */
  var cehckboxVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * A class to add to checked rows.
    */
  var checkboxClass: js.UndefOr[String] = js.undefined
  /**
    * A class to add to table headers with ascending sort.
    */
  var cssAsc: js.UndefOr[String] = js.undefined
  /**
    * A class for indicating rows which should be attached to the above row.
    */
  var cssChildRow: js.UndefOr[String] = js.undefined
  /**
    * A class to add to table headers with descending sort.
    */
  var cssDesc: js.UndefOr[String] = js.undefined
  /**
    * A class to add to the table headers.
    */
  var cssHeader: js.UndefOr[String] = js.undefined
  /**
    * A class to add to the header-row.
    */
  var cssHeaderRow: js.UndefOr[String] = js.undefined
  /**
    * A class to add to the sort-icons.
    */
  var cssIcon: js.UndefOr[String] = js.undefined
  /**
    * A class to add to sort-icons for with ascending sorting.
    */
  var cssIconAsc: js.UndefOr[String] = js.undefined
  /**
    * A class to add to sort-icons with descending sorting.
    */
  var cssIconDesc: js.UndefOr[String] = js.undefined
  /**
    * A class to add to sort-icons with disabled sorting.
    */
  var cssIconDisabled: js.UndefOr[String] = js.undefined
  /**
    * A class to add to sort-icons without sorting.
    */
  var cssIconNone: js.UndefOr[String] = js.undefined
  /**
    * A class for indicating rows which should be ignored.
    */
  var cssIgnoreRow: js.UndefOr[String] = js.undefined
  /**
    * A class for indicating `tbody`s which should not be sortable.
    */
  var cssInfoBlock: js.UndefOr[String] = js.undefined
  /**
    * A class for indicating elements which don't cause a sort when clicking on them.
    */
  var cssNoSort: js.UndefOr[String] = js.undefined
  /**
    * A class to add to headers when no sort is applied.
    */
  var cssNone: js.UndefOr[String] = js.undefined
  /**
    * A class to add to the header-row while applying a processing the table.
    */
  var cssProcessing: js.UndefOr[String] = js.undefined
  /**
    * The storage for the `build-table` widget.
    */
  var data: js.UndefOr[js.Object | js.Array[js.Array[_]]] = js.undefined
  /**
    * The date-range for two-digit years.
    */
  var dateRange: js.UndefOr[Double] = js.undefined
  /**
    * Either value indicating whether debug-information should be printed or a set of plugin-names to print debug-information from.
    */
  var debug: js.UndefOr[Boolean | String] = js.undefined
  /**
    * A value indicating whether the table should be initialized upon the initial sort-action.
    */
  var delayInit: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether contents of spanned cells should be sortable and filterable in all table headers.
    */
  var duplicateSpan: js.UndefOr[Boolean] = js.undefined
  /**
    * The sorting to apply for empty cells.
    */
  var emptyTo: js.UndefOr[EmptySorting] = js.undefined
  /**
    * Either global `Globalize`-settings or per-column `Globalize`-settings to apply.
    */
  var globalize: js.UndefOr[GlobalizeSettings | NumberDictionary[GlobalizeSettings]] = js.undefined
  /**
    * A template for generating headers.
    *
    * ***Note:***
    *   * `{content}` is replaced by the actual content of the header
    *   * If `cssIcon` is set, `{icon}` is replaced by a tag for the icon
    *
    * This template may also contain html-code.
    */
  var headerTemplate: js.UndefOr[String] = js.undefined
  /**
    * Specific configurations for separate headers.
    */
  var headers: js.UndefOr[NumberDictionary[TablesorterHeading]] = js.undefined
  /**
    * A value indicating whether letter-case should be considered while sorting.
    */
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether changes to child-rows are ignored by the table-sorter.
    */
  var ignoreChildRow: js.UndefOr[Boolean] = js.undefined
  /**
    * The attribute to read the text-value from `img`-tags.
    */
  var imgAttr: js.UndefOr[String] = js.undefined
  /**
    * A value indicating whether widgets should be initialized.
    */
  var initWidgets: js.UndefOr[Boolean] = js.undefined
  /**
    * Processes the table after the initialization.
    */
  var initialized: js.UndefOr[InitializationEventHandler[TElement]] = js.undefined
  /**
    * The namespace of the table.
    */
  var namespace: js.UndefOr[String] = js.undefined
  /**
    * The number-sorting to apply.
    */
  var numberSorter: js.UndefOr[NumberSorter] = js.undefined
  /**
    * A function to execute after the content of the header is processed.
    *
    * @param index
    * The zero-based index of the current table header cell.
    *
    * @param config
    * The current configuration of the table.
    *
    * @param table
    * The jQuery-object of the table.
    */
  var onRenderHeader: js.UndefOr[RenderHeaderEventHandler[TElement]] = js.undefined
  /**
    * A function for processing the header.
    *
    * @param index
    * The zero-based index of the header.
    *
    * @param template
    * The rendered content of the header.
    *
    * @return
    * A manipulated version of the content of the header.
    */
  var onRenderTemplate: js.UndefOr[RenderTemplateEventHandler] = js.undefined
  /**
    * One or more events which should be considered as a `click`-event.
    */
  var pointerClick: js.UndefOr[String] = js.undefined
  /**
    * One or more events which should be considered as a `mousedown`-event.
    */
  var pointerDown: js.UndefOr[String] = js.undefined
  /**
    * One or more events which should be considered as a `mouseup`-event.
    */
  var pointerUp: js.UndefOr[String] = js.undefined
  /**
    * A value indicating whether the sorting should be reapplied after an update of the table-data.
    */
  var resort: js.UndefOr[Boolean] = js.undefined
  /**
    * A jQuery-selector for finding cells in the header-row.
    */
  var selectorHeaders: js.UndefOr[Selector] = js.undefined
  /**
    * A jQuery-selector for finding rows to remove prior to a table-update.
    */
  var selectorRemove: js.UndefOr[Selector] = js.undefined
  /**
    * A jQuery-selector to find clickable elements inside the result of `selectorHeaders` for triggering a sort.
    */
  var selectorSort: js.UndefOr[Selector] = js.undefined
  /**
    * A value indicating whether the sorting is performed by the server.
    */
  var serverSideSorting: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether a timer icon should be shown while applying sorting and filtering.
    */
  var showProcessing: js.UndefOr[Boolean] = js.undefined
  /**
    * Sortings to append to the current sorting.
    */
  var sortAppend: js.UndefOr[js.Array[SortDefinition] | NumberDictionary[js.Array[RelativeSortDefinition]]] = js.undefined
  /**
    * Sortings to prepend to the current sorting.
    */
  var sortForce: js.UndefOr[js.Array[SortDefinition]] = js.undefined
  /**
    * The initial sorting after the initialization of the table.
    */
  var sortList: js.UndefOr[js.Array[SortDefinition]] = js.undefined
  /**
    * A value indicating whether accent character should be converted to their equivalent characters during sort.
    */
  var sortLocaleCompare: js.UndefOr[Boolean] = js.undefined
  /**
    * The key which is used for selecting multiple columns.
    */
  var sortMultiSortKey: js.UndefOr[
    altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | x | y
  ] = js.undefined
  /**
    * A value indicating whether the user can reset a sorting of a column by clicking on it a third time.
    */
  var sortReset: js.UndefOr[Boolean] = js.undefined
  /**
    * The key to hold while clicking on a heading for reseting the sorting for the whole table.
    */
  var sortResetKey: js.UndefOr[
    altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | x | y
  ] = js.undefined
  /**
    * A value indicating whether sortings other than the ones in the `sortList` should be prevented.
    */
  var sortRestart: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether to apply the original sorting when two cells have the same value.
    */
  var sortStable: js.UndefOr[Boolean] = js.undefined
  /**
    * The sorting to apply to text cells in numeric columns.
    */
  var stringTo: js.UndefOr[StringSorting] = js.undefined
  /**
    * A value indicating whether tabbing through table headings is enabled.
    */
  var tabIndex: js.UndefOr[Boolean] = js.undefined
  /**
    * A class to add to the table.
    */
  var tableClass: js.UndefOr[String] = js.undefined
  /**
    * The `data-attribute` to automatically read text from cells.
    */
  var textAttribute: js.UndefOr[String] = js.undefined
  /**
    * The methods for extracting text from cells.
    */
  var textExtraction: js.UndefOr[
    basic | TextExtractor[TElement] | (MappedSettings[basic | TextExtractor[TElement]])
  ] = js.undefined
  /**
    * The text-sorting to apply.
    */
  var textSorter: js.UndefOr[TextSorter[TElement] | MappedSettings[TextSorter[TElement]]] = js.undefined
  /**
    * The theme to use.
    */
  var theme: js.UndefOr[CoreTheme | String] = js.undefined
  /**
    * A value indicating whether to use `en-US`-flavored numbers.
    */
  var usNumberFormat: js.UndefOr[Boolean] = js.undefined
  /**
    * The format of the class-names for automatically loading the widget with the id `{name}`.
    *
    * The default setting is `widget-{name}`.
    */
  var widgetClass: js.UndefOr[String] = js.undefined
  /**
    * The options for the widgets.
    */
  var widgetOptions: js.UndefOr[WidgetOptions[TElement]] = js.undefined
  /**
    * The widgets to initialize.
    */
  var widgets: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A value indicating whether the width of the columns should be fixed.
    */
  var widthFixed: js.UndefOr[Boolean] = js.undefined
}

object TablesorterConfiguration {
  @scala.inline
  def apply[TElement](
    cancelSelection: js.UndefOr[Boolean] = js.undefined,
    cehckboxVisible: js.UndefOr[Boolean] = js.undefined,
    checkboxClass: String = null,
    cssAsc: String = null,
    cssChildRow: String = null,
    cssDesc: String = null,
    cssHeader: String = null,
    cssHeaderRow: String = null,
    cssIcon: String = null,
    cssIconAsc: String = null,
    cssIconDesc: String = null,
    cssIconDisabled: String = null,
    cssIconNone: String = null,
    cssIgnoreRow: String = null,
    cssInfoBlock: String = null,
    cssNoSort: String = null,
    cssNone: String = null,
    cssProcessing: String = null,
    data: js.Object | js.Array[js.Array[_]] = null,
    dateFormat: String = null,
    dateRange: Int | Double = null,
    debug: Boolean | String = null,
    delayInit: js.UndefOr[Boolean] = js.undefined,
    duplicateSpan: js.UndefOr[Boolean] = js.undefined,
    emptyTo: EmptySorting = null,
    globalize: GlobalizeSettings | NumberDictionary[GlobalizeSettings] = null,
    headerTemplate: String = null,
    headers: NumberDictionary[TablesorterHeading] = null,
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    ignoreChildRow: js.UndefOr[Boolean] = js.undefined,
    imgAttr: String = null,
    initWidgets: js.UndefOr[Boolean] = js.undefined,
    initialized: TElement => Unit = null,
    namespace: String = null,
    numberSorter: (/* x */ Double, /* y */ Double, /* ascending */ Boolean, /* maxValue */ Double) => Double = null,
    onRenderHeader: (/* index */ Double, /* config */ TablesorterConfigurationStore[TElement], /* table */ JQuery[TElement]) => Unit = null,
    onRenderTemplate: (/* index */ Double, /* template */ String) => String = null,
    pointerClick: String = null,
    pointerDown: String = null,
    pointerUp: String = null,
    resort: js.UndefOr[Boolean] = js.undefined,
    selectorHeaders: Selector = null,
    selectorRemove: Selector = null,
    selectorSort: Selector = null,
    serverSideSorting: js.UndefOr[Boolean] = js.undefined,
    showProcessing: js.UndefOr[Boolean] = js.undefined,
    sortAppend: js.Array[SortDefinition] | NumberDictionary[js.Array[RelativeSortDefinition]] = null,
    sortForce: js.Array[SortDefinition] = null,
    sortInitialOrder: SortOrder = null,
    sortList: js.Array[SortDefinition] = null,
    sortLocaleCompare: js.UndefOr[Boolean] = js.undefined,
    sortMultiSortKey: altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | x | y = null,
    sortReset: js.UndefOr[Boolean] = js.undefined,
    sortResetKey: altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | x | y = null,
    sortRestart: js.UndefOr[Boolean] = js.undefined,
    sortStable: js.UndefOr[Boolean] = js.undefined,
    stringTo: StringSorting = null,
    tabIndex: js.UndefOr[Boolean] = js.undefined,
    tableClass: String = null,
    textAttribute: String = null,
    textExtraction: basic | TextExtractor[TElement] | (MappedSettings[basic | TextExtractor[TElement]]) = null,
    textSorter: TextSorter[TElement] | MappedSettings[TextSorter[TElement]] = null,
    theme: CoreTheme | String = null,
    usNumberFormat: js.UndefOr[Boolean] = js.undefined,
    widgetClass: String = null,
    widgetOptions: WidgetOptions[TElement] = null,
    widgets: js.Array[String] = null,
    widthFixed: js.UndefOr[Boolean] = js.undefined
  ): TablesorterConfiguration[TElement] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancelSelection)) __obj.updateDynamic("cancelSelection")(cancelSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(cehckboxVisible)) __obj.updateDynamic("cehckboxVisible")(cehckboxVisible.asInstanceOf[js.Any])
    if (checkboxClass != null) __obj.updateDynamic("checkboxClass")(checkboxClass.asInstanceOf[js.Any])
    if (cssAsc != null) __obj.updateDynamic("cssAsc")(cssAsc.asInstanceOf[js.Any])
    if (cssChildRow != null) __obj.updateDynamic("cssChildRow")(cssChildRow.asInstanceOf[js.Any])
    if (cssDesc != null) __obj.updateDynamic("cssDesc")(cssDesc.asInstanceOf[js.Any])
    if (cssHeader != null) __obj.updateDynamic("cssHeader")(cssHeader.asInstanceOf[js.Any])
    if (cssHeaderRow != null) __obj.updateDynamic("cssHeaderRow")(cssHeaderRow.asInstanceOf[js.Any])
    if (cssIcon != null) __obj.updateDynamic("cssIcon")(cssIcon.asInstanceOf[js.Any])
    if (cssIconAsc != null) __obj.updateDynamic("cssIconAsc")(cssIconAsc.asInstanceOf[js.Any])
    if (cssIconDesc != null) __obj.updateDynamic("cssIconDesc")(cssIconDesc.asInstanceOf[js.Any])
    if (cssIconDisabled != null) __obj.updateDynamic("cssIconDisabled")(cssIconDisabled.asInstanceOf[js.Any])
    if (cssIconNone != null) __obj.updateDynamic("cssIconNone")(cssIconNone.asInstanceOf[js.Any])
    if (cssIgnoreRow != null) __obj.updateDynamic("cssIgnoreRow")(cssIgnoreRow.asInstanceOf[js.Any])
    if (cssInfoBlock != null) __obj.updateDynamic("cssInfoBlock")(cssInfoBlock.asInstanceOf[js.Any])
    if (cssNoSort != null) __obj.updateDynamic("cssNoSort")(cssNoSort.asInstanceOf[js.Any])
    if (cssNone != null) __obj.updateDynamic("cssNone")(cssNone.asInstanceOf[js.Any])
    if (cssProcessing != null) __obj.updateDynamic("cssProcessing")(cssProcessing.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(delayInit)) __obj.updateDynamic("delayInit")(delayInit.asInstanceOf[js.Any])
    if (!js.isUndefined(duplicateSpan)) __obj.updateDynamic("duplicateSpan")(duplicateSpan.asInstanceOf[js.Any])
    if (emptyTo != null) __obj.updateDynamic("emptyTo")(emptyTo.asInstanceOf[js.Any])
    if (globalize != null) __obj.updateDynamic("globalize")(globalize.asInstanceOf[js.Any])
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreChildRow)) __obj.updateDynamic("ignoreChildRow")(ignoreChildRow.asInstanceOf[js.Any])
    if (imgAttr != null) __obj.updateDynamic("imgAttr")(imgAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(initWidgets)) __obj.updateDynamic("initWidgets")(initWidgets.asInstanceOf[js.Any])
    if (initialized != null) __obj.updateDynamic("initialized")(js.Any.fromFunction1(initialized))
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (numberSorter != null) __obj.updateDynamic("numberSorter")(js.Any.fromFunction4(numberSorter))
    if (onRenderHeader != null) __obj.updateDynamic("onRenderHeader")(js.Any.fromFunction3(onRenderHeader))
    if (onRenderTemplate != null) __obj.updateDynamic("onRenderTemplate")(js.Any.fromFunction2(onRenderTemplate))
    if (pointerClick != null) __obj.updateDynamic("pointerClick")(pointerClick.asInstanceOf[js.Any])
    if (pointerDown != null) __obj.updateDynamic("pointerDown")(pointerDown.asInstanceOf[js.Any])
    if (pointerUp != null) __obj.updateDynamic("pointerUp")(pointerUp.asInstanceOf[js.Any])
    if (!js.isUndefined(resort)) __obj.updateDynamic("resort")(resort.asInstanceOf[js.Any])
    if (selectorHeaders != null) __obj.updateDynamic("selectorHeaders")(selectorHeaders.asInstanceOf[js.Any])
    if (selectorRemove != null) __obj.updateDynamic("selectorRemove")(selectorRemove.asInstanceOf[js.Any])
    if (selectorSort != null) __obj.updateDynamic("selectorSort")(selectorSort.asInstanceOf[js.Any])
    if (!js.isUndefined(serverSideSorting)) __obj.updateDynamic("serverSideSorting")(serverSideSorting.asInstanceOf[js.Any])
    if (!js.isUndefined(showProcessing)) __obj.updateDynamic("showProcessing")(showProcessing.asInstanceOf[js.Any])
    if (sortAppend != null) __obj.updateDynamic("sortAppend")(sortAppend.asInstanceOf[js.Any])
    if (sortForce != null) __obj.updateDynamic("sortForce")(sortForce.asInstanceOf[js.Any])
    if (sortInitialOrder != null) __obj.updateDynamic("sortInitialOrder")(sortInitialOrder.asInstanceOf[js.Any])
    if (sortList != null) __obj.updateDynamic("sortList")(sortList.asInstanceOf[js.Any])
    if (!js.isUndefined(sortLocaleCompare)) __obj.updateDynamic("sortLocaleCompare")(sortLocaleCompare.asInstanceOf[js.Any])
    if (sortMultiSortKey != null) __obj.updateDynamic("sortMultiSortKey")(sortMultiSortKey.asInstanceOf[js.Any])
    if (!js.isUndefined(sortReset)) __obj.updateDynamic("sortReset")(sortReset.asInstanceOf[js.Any])
    if (sortResetKey != null) __obj.updateDynamic("sortResetKey")(sortResetKey.asInstanceOf[js.Any])
    if (!js.isUndefined(sortRestart)) __obj.updateDynamic("sortRestart")(sortRestart.asInstanceOf[js.Any])
    if (!js.isUndefined(sortStable)) __obj.updateDynamic("sortStable")(sortStable.asInstanceOf[js.Any])
    if (stringTo != null) __obj.updateDynamic("stringTo")(stringTo.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tableClass != null) __obj.updateDynamic("tableClass")(tableClass.asInstanceOf[js.Any])
    if (textAttribute != null) __obj.updateDynamic("textAttribute")(textAttribute.asInstanceOf[js.Any])
    if (textExtraction != null) __obj.updateDynamic("textExtraction")(textExtraction.asInstanceOf[js.Any])
    if (textSorter != null) __obj.updateDynamic("textSorter")(textSorter.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(usNumberFormat)) __obj.updateDynamic("usNumberFormat")(usNumberFormat.asInstanceOf[js.Any])
    if (widgetClass != null) __obj.updateDynamic("widgetClass")(widgetClass.asInstanceOf[js.Any])
    if (widgetOptions != null) __obj.updateDynamic("widgetOptions")(widgetOptions.asInstanceOf[js.Any])
    if (widgets != null) __obj.updateDynamic("widgets")(widgets.asInstanceOf[js.Any])
    if (!js.isUndefined(widthFixed)) __obj.updateDynamic("widthFixed")(widthFixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[TablesorterConfiguration[TElement]]
  }
}

