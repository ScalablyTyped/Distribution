package typings.tablesorter.tablesorterConfigurationMod

import org.scalablytyped.runtime.NumberDictionary
import typings.jquery.JQuery.Selector
import typings.std.Element
import typings.tablesorter.coreThemeMod.CoreTheme
import typings.tablesorter.emptySortingMod.EmptySorting
import typings.tablesorter.globalizeSettingsMod.GlobalizeSettings
import typings.tablesorter.initializationEventHandlerMod.InitializationEventHandler
import typings.tablesorter.mappedSettingsMod.MappedSettings
import typings.tablesorter.mod.global.JQuery
import typings.tablesorter.numberSorterMod.NumberSorter
import typings.tablesorter.relativeSortDefinitionMod.RelativeSortDefinition
import typings.tablesorter.renderHeaderEventHandlerMod.RenderHeaderEventHandler
import typings.tablesorter.renderTemplateEventHandlerMod.RenderTemplateEventHandler
import typings.tablesorter.sortDefinitionMod.SortDefinition
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

@js.native
trait TablesorterConfiguration[TElement] extends TablesorterConfigBase {
  /**
    * A value indicating whether the selection of the text in the table headers should be disabled.
    */
  var cancelSelection: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether only visible rows should be affected by the checkbox located in the header.
    */
  var cehckboxVisible: js.UndefOr[Boolean] = js.native
  /**
    * A class to add to checked rows.
    */
  var checkboxClass: js.UndefOr[String] = js.native
  /**
    * A class to add to table headers with ascending sort.
    */
  var cssAsc: js.UndefOr[String] = js.native
  /**
    * A class for indicating rows which should be attached to the above row.
    */
  var cssChildRow: js.UndefOr[String] = js.native
  /**
    * A class to add to table headers with descending sort.
    */
  var cssDesc: js.UndefOr[String] = js.native
  /**
    * A class to add to the table headers.
    */
  var cssHeader: js.UndefOr[String] = js.native
  /**
    * A class to add to the header-row.
    */
  var cssHeaderRow: js.UndefOr[String] = js.native
  /**
    * A class to add to the sort-icons.
    */
  var cssIcon: js.UndefOr[String] = js.native
  /**
    * A class to add to sort-icons for with ascending sorting.
    */
  var cssIconAsc: js.UndefOr[String] = js.native
  /**
    * A class to add to sort-icons with descending sorting.
    */
  var cssIconDesc: js.UndefOr[String] = js.native
  /**
    * A class to add to sort-icons with disabled sorting.
    */
  var cssIconDisabled: js.UndefOr[String] = js.native
  /**
    * A class to add to sort-icons without sorting.
    */
  var cssIconNone: js.UndefOr[String] = js.native
  /**
    * A class for indicating rows which should be ignored.
    */
  var cssIgnoreRow: js.UndefOr[String] = js.native
  /**
    * A class for indicating `tbody`s which should not be sortable.
    */
  var cssInfoBlock: js.UndefOr[String] = js.native
  /**
    * A class for indicating elements which don't cause a sort when clicking on them.
    */
  var cssNoSort: js.UndefOr[String] = js.native
  /**
    * A class to add to headers when no sort is applied.
    */
  var cssNone: js.UndefOr[String] = js.native
  /**
    * A class to add to the header-row while applying a processing the table.
    */
  var cssProcessing: js.UndefOr[String] = js.native
  /**
    * The storage for the `build-table` widget.
    */
  var data: js.UndefOr[js.Object | js.Array[js.Array[_]]] = js.native
  /**
    * The date-range for two-digit years.
    */
  var dateRange: js.UndefOr[Double] = js.native
  /**
    * Either value indicating whether debug-information should be printed or a set of plugin-names to print debug-information from.
    */
  var debug: js.UndefOr[Boolean | String] = js.native
  /**
    * A value indicating whether the table should be initialized upon the initial sort-action.
    */
  var delayInit: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether contents of spanned cells should be sortable and filterable in all table headers.
    */
  var duplicateSpan: js.UndefOr[Boolean] = js.native
  /**
    * The sorting to apply for empty cells.
    */
  var emptyTo: js.UndefOr[EmptySorting] = js.native
  /**
    * Either global `Globalize`-settings or per-column `Globalize`-settings to apply.
    */
  var globalize: js.UndefOr[GlobalizeSettings | NumberDictionary[GlobalizeSettings]] = js.native
  /**
    * A template for generating headers.
    *
    * ***Note:***
    *   * `{content}` is replaced by the actual content of the header
    *   * If `cssIcon` is set, `{icon}` is replaced by a tag for the icon
    *
    * This template may also contain html-code.
    */
  var headerTemplate: js.UndefOr[String] = js.native
  /**
    * Specific configurations for separate headers.
    */
  var headers: js.UndefOr[NumberDictionary[TablesorterHeading]] = js.native
  /**
    * A value indicating whether letter-case should be considered while sorting.
    */
  var ignoreCase: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether changes to child-rows are ignored by the table-sorter.
    */
  var ignoreChildRow: js.UndefOr[Boolean] = js.native
  /**
    * The attribute to read the text-value from `img`-tags.
    */
  var imgAttr: js.UndefOr[String] = js.native
  /**
    * A value indicating whether widgets should be initialized.
    */
  var initWidgets: js.UndefOr[Boolean] = js.native
  /**
    * Processes the table after the initialization.
    */
  var initialized: js.UndefOr[InitializationEventHandler[TElement]] = js.native
  /**
    * The namespace of the table.
    */
  var namespace: js.UndefOr[String] = js.native
  /**
    * The number-sorting to apply.
    */
  var numberSorter: js.UndefOr[NumberSorter] = js.native
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
  var onRenderHeader: js.UndefOr[RenderHeaderEventHandler[TElement]] = js.native
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
  var onRenderTemplate: js.UndefOr[RenderTemplateEventHandler] = js.native
  /**
    * One or more events which should be considered as a `click`-event.
    */
  var pointerClick: js.UndefOr[String] = js.native
  /**
    * One or more events which should be considered as a `mousedown`-event.
    */
  var pointerDown: js.UndefOr[String] = js.native
  /**
    * One or more events which should be considered as a `mouseup`-event.
    */
  var pointerUp: js.UndefOr[String] = js.native
  /**
    * A value indicating whether the sorting should be reapplied after an update of the table-data.
    */
  var resort: js.UndefOr[Boolean] = js.native
  /**
    * A jQuery-selector for finding cells in the header-row.
    */
  var selectorHeaders: js.UndefOr[Selector] = js.native
  /**
    * A jQuery-selector for finding rows to remove prior to a table-update.
    */
  var selectorRemove: js.UndefOr[Selector] = js.native
  /**
    * A jQuery-selector to find clickable elements inside the result of `selectorHeaders` for triggering a sort.
    */
  var selectorSort: js.UndefOr[Selector] = js.native
  /**
    * A value indicating whether the sorting is performed by the server.
    */
  var serverSideSorting: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether a timer icon should be shown while applying sorting and filtering.
    */
  var showProcessing: js.UndefOr[Boolean] = js.native
  /**
    * Sortings to append to the current sorting.
    */
  var sortAppend: js.UndefOr[js.Array[SortDefinition] | NumberDictionary[js.Array[RelativeSortDefinition]]] = js.native
  /**
    * Sortings to prepend to the current sorting.
    */
  var sortForce: js.UndefOr[js.Array[SortDefinition]] = js.native
  /**
    * The initial sorting after the initialization of the table.
    */
  var sortList: js.UndefOr[js.Array[SortDefinition]] = js.native
  /**
    * A value indicating whether accent character should be converted to their equivalent characters during sort.
    */
  var sortLocaleCompare: js.UndefOr[Boolean] = js.native
  /**
    * The key which is used for selecting multiple columns.
    */
  var sortMultiSortKey: js.UndefOr[
    altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | x | y
  ] = js.native
  /**
    * A value indicating whether the user can reset a sorting of a column by clicking on it a third time.
    */
  var sortReset: js.UndefOr[Boolean] = js.native
  /**
    * The key to hold while clicking on a heading for reseting the sorting for the whole table.
    */
  var sortResetKey: js.UndefOr[
    altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | x | y
  ] = js.native
  /**
    * A value indicating whether sortings other than the ones in the `sortList` should be prevented.
    */
  var sortRestart: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether to apply the original sorting when two cells have the same value.
    */
  var sortStable: js.UndefOr[Boolean] = js.native
  /**
    * The sorting to apply to text cells in numeric columns.
    */
  var stringTo: js.UndefOr[StringSorting] = js.native
  /**
    * A value indicating whether tabbing through table headings is enabled.
    */
  var tabIndex: js.UndefOr[Boolean] = js.native
  /**
    * A class to add to the table.
    */
  var tableClass: js.UndefOr[String] = js.native
  /**
    * The `data-attribute` to automatically read text from cells.
    */
  var textAttribute: js.UndefOr[String] = js.native
  /**
    * The methods for extracting text from cells.
    */
  var textExtraction: js.UndefOr[
    basic | TextExtractor[TElement] | (MappedSettings[basic | TextExtractor[TElement]])
  ] = js.native
  /**
    * The text-sorting to apply.
    */
  var textSorter: js.UndefOr[TextSorter[TElement] | MappedSettings[TextSorter[TElement]]] = js.native
  /**
    * The theme to use.
    */
  var theme: js.UndefOr[CoreTheme | String] = js.native
  /**
    * A value indicating whether to use `en-US`-flavored numbers.
    */
  var usNumberFormat: js.UndefOr[Boolean] = js.native
  /**
    * The format of the class-names for automatically loading the widget with the id `{name}`.
    *
    * The default setting is `widget-{name}`.
    */
  var widgetClass: js.UndefOr[String] = js.native
  /**
    * The options for the widgets.
    */
  var widgetOptions: js.UndefOr[WidgetOptions[TElement]] = js.native
  /**
    * The widgets to initialize.
    */
  var widgets: js.UndefOr[js.Array[String]] = js.native
  /**
    * A value indicating whether the width of the columns should be fixed.
    */
  var widthFixed: js.UndefOr[Boolean] = js.native
}

object TablesorterConfiguration {
  @scala.inline
  def apply[TElement](): TablesorterConfiguration[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TablesorterConfiguration[TElement]]
  }
  @scala.inline
  implicit class TablesorterConfigurationOps[Self <: TablesorterConfiguration[_], TElement] (val x: Self with TablesorterConfiguration[TElement]) extends AnyVal {
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
    def setCancelSelection(value: Boolean): Self = this.set("cancelSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelSelection: Self = this.set("cancelSelection", js.undefined)
    @scala.inline
    def setCehckboxVisible(value: Boolean): Self = this.set("cehckboxVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCehckboxVisible: Self = this.set("cehckboxVisible", js.undefined)
    @scala.inline
    def setCheckboxClass(value: String): Self = this.set("checkboxClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckboxClass: Self = this.set("checkboxClass", js.undefined)
    @scala.inline
    def setCssAsc(value: String): Self = this.set("cssAsc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssAsc: Self = this.set("cssAsc", js.undefined)
    @scala.inline
    def setCssChildRow(value: String): Self = this.set("cssChildRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssChildRow: Self = this.set("cssChildRow", js.undefined)
    @scala.inline
    def setCssDesc(value: String): Self = this.set("cssDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssDesc: Self = this.set("cssDesc", js.undefined)
    @scala.inline
    def setCssHeader(value: String): Self = this.set("cssHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssHeader: Self = this.set("cssHeader", js.undefined)
    @scala.inline
    def setCssHeaderRow(value: String): Self = this.set("cssHeaderRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssHeaderRow: Self = this.set("cssHeaderRow", js.undefined)
    @scala.inline
    def setCssIcon(value: String): Self = this.set("cssIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssIcon: Self = this.set("cssIcon", js.undefined)
    @scala.inline
    def setCssIconAsc(value: String): Self = this.set("cssIconAsc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssIconAsc: Self = this.set("cssIconAsc", js.undefined)
    @scala.inline
    def setCssIconDesc(value: String): Self = this.set("cssIconDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssIconDesc: Self = this.set("cssIconDesc", js.undefined)
    @scala.inline
    def setCssIconDisabled(value: String): Self = this.set("cssIconDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssIconDisabled: Self = this.set("cssIconDisabled", js.undefined)
    @scala.inline
    def setCssIconNone(value: String): Self = this.set("cssIconNone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssIconNone: Self = this.set("cssIconNone", js.undefined)
    @scala.inline
    def setCssIgnoreRow(value: String): Self = this.set("cssIgnoreRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssIgnoreRow: Self = this.set("cssIgnoreRow", js.undefined)
    @scala.inline
    def setCssInfoBlock(value: String): Self = this.set("cssInfoBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssInfoBlock: Self = this.set("cssInfoBlock", js.undefined)
    @scala.inline
    def setCssNoSort(value: String): Self = this.set("cssNoSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssNoSort: Self = this.set("cssNoSort", js.undefined)
    @scala.inline
    def setCssNone(value: String): Self = this.set("cssNone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssNone: Self = this.set("cssNone", js.undefined)
    @scala.inline
    def setCssProcessing(value: String): Self = this.set("cssProcessing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssProcessing: Self = this.set("cssProcessing", js.undefined)
    @scala.inline
    def setDataVarargs(value: js.Array[js.Any]*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Object | js.Array[js.Array[_]]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDateRange(value: Double): Self = this.set("dateRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateRange: Self = this.set("dateRange", js.undefined)
    @scala.inline
    def setDebug(value: Boolean | String): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDelayInit(value: Boolean): Self = this.set("delayInit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayInit: Self = this.set("delayInit", js.undefined)
    @scala.inline
    def setDuplicateSpan(value: Boolean): Self = this.set("duplicateSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuplicateSpan: Self = this.set("duplicateSpan", js.undefined)
    @scala.inline
    def setEmptyTo(value: EmptySorting): Self = this.set("emptyTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyTo: Self = this.set("emptyTo", js.undefined)
    @scala.inline
    def setGlobalize(value: GlobalizeSettings | NumberDictionary[GlobalizeSettings]): Self = this.set("globalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalize: Self = this.set("globalize", js.undefined)
    @scala.inline
    def setHeaderTemplate(value: String): Self = this.set("headerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTemplate: Self = this.set("headerTemplate", js.undefined)
    @scala.inline
    def setHeaders(value: NumberDictionary[TablesorterHeading]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreCase: Self = this.set("ignoreCase", js.undefined)
    @scala.inline
    def setIgnoreChildRow(value: Boolean): Self = this.set("ignoreChildRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreChildRow: Self = this.set("ignoreChildRow", js.undefined)
    @scala.inline
    def setImgAttr(value: String): Self = this.set("imgAttr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImgAttr: Self = this.set("imgAttr", js.undefined)
    @scala.inline
    def setInitWidgets(value: Boolean): Self = this.set("initWidgets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitWidgets: Self = this.set("initWidgets", js.undefined)
    @scala.inline
    def setInitialized(value: TElement => Unit): Self = this.set("initialized", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInitialized: Self = this.set("initialized", js.undefined)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setNumberSorter(value: (/* x */ Double, /* y */ Double, /* ascending */ Boolean, /* maxValue */ Double) => Double): Self = this.set("numberSorter", js.Any.fromFunction4(value))
    @scala.inline
    def deleteNumberSorter: Self = this.set("numberSorter", js.undefined)
    @scala.inline
    def setOnRenderHeader(
      value: (/* index */ Double, /* config */ TablesorterConfigurationStore[TElement], /* table */ JQuery[TElement]) => Unit
    ): Self = this.set("onRenderHeader", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnRenderHeader: Self = this.set("onRenderHeader", js.undefined)
    @scala.inline
    def setOnRenderTemplate(value: (/* index */ Double, /* template */ String) => String): Self = this.set("onRenderTemplate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderTemplate: Self = this.set("onRenderTemplate", js.undefined)
    @scala.inline
    def setPointerClick(value: String): Self = this.set("pointerClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointerClick: Self = this.set("pointerClick", js.undefined)
    @scala.inline
    def setPointerDown(value: String): Self = this.set("pointerDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointerDown: Self = this.set("pointerDown", js.undefined)
    @scala.inline
    def setPointerUp(value: String): Self = this.set("pointerUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointerUp: Self = this.set("pointerUp", js.undefined)
    @scala.inline
    def setResort(value: Boolean): Self = this.set("resort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResort: Self = this.set("resort", js.undefined)
    @scala.inline
    def setSelectorHeaders(value: Selector): Self = this.set("selectorHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectorHeaders: Self = this.set("selectorHeaders", js.undefined)
    @scala.inline
    def setSelectorRemove(value: Selector): Self = this.set("selectorRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectorRemove: Self = this.set("selectorRemove", js.undefined)
    @scala.inline
    def setSelectorSort(value: Selector): Self = this.set("selectorSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectorSort: Self = this.set("selectorSort", js.undefined)
    @scala.inline
    def setServerSideSorting(value: Boolean): Self = this.set("serverSideSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerSideSorting: Self = this.set("serverSideSorting", js.undefined)
    @scala.inline
    def setShowProcessing(value: Boolean): Self = this.set("showProcessing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowProcessing: Self = this.set("showProcessing", js.undefined)
    @scala.inline
    def setSortAppendVarargs(value: SortDefinition*): Self = this.set("sortAppend", js.Array(value :_*))
    @scala.inline
    def setSortAppend(value: js.Array[SortDefinition] | NumberDictionary[js.Array[RelativeSortDefinition]]): Self = this.set("sortAppend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortAppend: Self = this.set("sortAppend", js.undefined)
    @scala.inline
    def setSortForceVarargs(value: SortDefinition*): Self = this.set("sortForce", js.Array(value :_*))
    @scala.inline
    def setSortForce(value: js.Array[SortDefinition]): Self = this.set("sortForce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortForce: Self = this.set("sortForce", js.undefined)
    @scala.inline
    def setSortListVarargs(value: SortDefinition*): Self = this.set("sortList", js.Array(value :_*))
    @scala.inline
    def setSortList(value: js.Array[SortDefinition]): Self = this.set("sortList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortList: Self = this.set("sortList", js.undefined)
    @scala.inline
    def setSortLocaleCompare(value: Boolean): Self = this.set("sortLocaleCompare", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortLocaleCompare: Self = this.set("sortLocaleCompare", js.undefined)
    @scala.inline
    def setSortMultiSortKey(
      value: altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | typings.tablesorter.tablesorterStrings.x | y
    ): Self = this.set("sortMultiSortKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortMultiSortKey: Self = this.set("sortMultiSortKey", js.undefined)
    @scala.inline
    def setSortReset(value: Boolean): Self = this.set("sortReset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortReset: Self = this.set("sortReset", js.undefined)
    @scala.inline
    def setSortResetKey(
      value: altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | typings.tablesorter.tablesorterStrings.x | y
    ): Self = this.set("sortResetKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortResetKey: Self = this.set("sortResetKey", js.undefined)
    @scala.inline
    def setSortRestart(value: Boolean): Self = this.set("sortRestart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortRestart: Self = this.set("sortRestart", js.undefined)
    @scala.inline
    def setSortStable(value: Boolean): Self = this.set("sortStable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortStable: Self = this.set("sortStable", js.undefined)
    @scala.inline
    def setStringTo(value: StringSorting): Self = this.set("stringTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringTo: Self = this.set("stringTo", js.undefined)
    @scala.inline
    def setTabIndex(value: Boolean): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTableClass(value: String): Self = this.set("tableClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableClass: Self = this.set("tableClass", js.undefined)
    @scala.inline
    def setTextAttribute(value: String): Self = this.set("textAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAttribute: Self = this.set("textAttribute", js.undefined)
    @scala.inline
    def setTextExtractionFunction3(value: (/* cell */ Element, TElement, /* index */ Double) => String): Self = this.set("textExtraction", js.Any.fromFunction3(value))
    @scala.inline
    def setTextExtraction(value: basic | TextExtractor[TElement] | (MappedSettings[basic | TextExtractor[TElement]])): Self = this.set("textExtraction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextExtraction: Self = this.set("textExtraction", js.undefined)
    @scala.inline
    def setTextSorterFunction5(
      value: (/* x */ String, /* y */ String, /* ascending */ Boolean, /* index */ Double, TElement) => Double
    ): Self = this.set("textSorter", js.Any.fromFunction5(value))
    @scala.inline
    def setTextSorter(value: TextSorter[TElement] | MappedSettings[TextSorter[TElement]]): Self = this.set("textSorter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextSorter: Self = this.set("textSorter", js.undefined)
    @scala.inline
    def setTheme(value: CoreTheme | String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setUsNumberFormat(value: Boolean): Self = this.set("usNumberFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsNumberFormat: Self = this.set("usNumberFormat", js.undefined)
    @scala.inline
    def setWidgetClass(value: String): Self = this.set("widgetClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidgetClass: Self = this.set("widgetClass", js.undefined)
    @scala.inline
    def setWidgetOptions(value: WidgetOptions[TElement]): Self = this.set("widgetOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidgetOptions: Self = this.set("widgetOptions", js.undefined)
    @scala.inline
    def setWidgetsVarargs(value: String*): Self = this.set("widgets", js.Array(value :_*))
    @scala.inline
    def setWidgets(value: js.Array[String]): Self = this.set("widgets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidgets: Self = this.set("widgets", js.undefined)
    @scala.inline
    def setWidthFixed(value: Boolean): Self = this.set("widthFixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidthFixed: Self = this.set("widthFixed", js.undefined)
  }
  
}

