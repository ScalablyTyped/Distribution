package typings.tablesorter

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tablesorterConfigurationMod {
  
  trait TablesorterConfiguration[TElement]
    extends StObject
       with TablesorterConfigBase {
    
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
    var data: js.UndefOr[js.Object | js.Array[js.Array[js.Any]]] = js.undefined
    
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
    def apply[TElement](): TablesorterConfiguration[TElement] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TablesorterConfiguration[TElement]]
    }
    
    @scala.inline
    implicit class TablesorterConfigurationMutableBuilder[Self <: TablesorterConfiguration[?], TElement] (val x: Self & TablesorterConfiguration[TElement]) extends AnyVal {
      
      @scala.inline
      def setCancelSelection(value: Boolean): Self = StObject.set(x, "cancelSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelSelectionUndefined: Self = StObject.set(x, "cancelSelection", js.undefined)
      
      @scala.inline
      def setCehckboxVisible(value: Boolean): Self = StObject.set(x, "cehckboxVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCehckboxVisibleUndefined: Self = StObject.set(x, "cehckboxVisible", js.undefined)
      
      @scala.inline
      def setCheckboxClass(value: String): Self = StObject.set(x, "checkboxClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckboxClassUndefined: Self = StObject.set(x, "checkboxClass", js.undefined)
      
      @scala.inline
      def setCssAsc(value: String): Self = StObject.set(x, "cssAsc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssAscUndefined: Self = StObject.set(x, "cssAsc", js.undefined)
      
      @scala.inline
      def setCssChildRow(value: String): Self = StObject.set(x, "cssChildRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssChildRowUndefined: Self = StObject.set(x, "cssChildRow", js.undefined)
      
      @scala.inline
      def setCssDesc(value: String): Self = StObject.set(x, "cssDesc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssDescUndefined: Self = StObject.set(x, "cssDesc", js.undefined)
      
      @scala.inline
      def setCssHeader(value: String): Self = StObject.set(x, "cssHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssHeaderRow(value: String): Self = StObject.set(x, "cssHeaderRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssHeaderRowUndefined: Self = StObject.set(x, "cssHeaderRow", js.undefined)
      
      @scala.inline
      def setCssHeaderUndefined: Self = StObject.set(x, "cssHeader", js.undefined)
      
      @scala.inline
      def setCssIcon(value: String): Self = StObject.set(x, "cssIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssIconAsc(value: String): Self = StObject.set(x, "cssIconAsc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssIconAscUndefined: Self = StObject.set(x, "cssIconAsc", js.undefined)
      
      @scala.inline
      def setCssIconDesc(value: String): Self = StObject.set(x, "cssIconDesc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssIconDescUndefined: Self = StObject.set(x, "cssIconDesc", js.undefined)
      
      @scala.inline
      def setCssIconDisabled(value: String): Self = StObject.set(x, "cssIconDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssIconDisabledUndefined: Self = StObject.set(x, "cssIconDisabled", js.undefined)
      
      @scala.inline
      def setCssIconNone(value: String): Self = StObject.set(x, "cssIconNone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssIconNoneUndefined: Self = StObject.set(x, "cssIconNone", js.undefined)
      
      @scala.inline
      def setCssIconUndefined: Self = StObject.set(x, "cssIcon", js.undefined)
      
      @scala.inline
      def setCssIgnoreRow(value: String): Self = StObject.set(x, "cssIgnoreRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssIgnoreRowUndefined: Self = StObject.set(x, "cssIgnoreRow", js.undefined)
      
      @scala.inline
      def setCssInfoBlock(value: String): Self = StObject.set(x, "cssInfoBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssInfoBlockUndefined: Self = StObject.set(x, "cssInfoBlock", js.undefined)
      
      @scala.inline
      def setCssNoSort(value: String): Self = StObject.set(x, "cssNoSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssNoSortUndefined: Self = StObject.set(x, "cssNoSort", js.undefined)
      
      @scala.inline
      def setCssNone(value: String): Self = StObject.set(x, "cssNone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssNoneUndefined: Self = StObject.set(x, "cssNone", js.undefined)
      
      @scala.inline
      def setCssProcessing(value: String): Self = StObject.set(x, "cssProcessing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssProcessingUndefined: Self = StObject.set(x, "cssProcessing", js.undefined)
      
      @scala.inline
      def setData(value: js.Object | js.Array[js.Array[js.Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDateRange(value: Double): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean | String): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDelayInit(value: Boolean): Self = StObject.set(x, "delayInit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayInitUndefined: Self = StObject.set(x, "delayInit", js.undefined)
      
      @scala.inline
      def setDuplicateSpan(value: Boolean): Self = StObject.set(x, "duplicateSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuplicateSpanUndefined: Self = StObject.set(x, "duplicateSpan", js.undefined)
      
      @scala.inline
      def setEmptyTo(value: EmptySorting): Self = StObject.set(x, "emptyTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyToUndefined: Self = StObject.set(x, "emptyTo", js.undefined)
      
      @scala.inline
      def setGlobalize(value: GlobalizeSettings | NumberDictionary[GlobalizeSettings]): Self = StObject.set(x, "globalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalizeUndefined: Self = StObject.set(x, "globalize", js.undefined)
      
      @scala.inline
      def setHeaderTemplate(value: String): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
      
      @scala.inline
      def setHeaders(value: NumberDictionary[TablesorterHeading]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
      
      @scala.inline
      def setIgnoreChildRow(value: Boolean): Self = StObject.set(x, "ignoreChildRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreChildRowUndefined: Self = StObject.set(x, "ignoreChildRow", js.undefined)
      
      @scala.inline
      def setImgAttr(value: String): Self = StObject.set(x, "imgAttr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgAttrUndefined: Self = StObject.set(x, "imgAttr", js.undefined)
      
      @scala.inline
      def setInitWidgets(value: Boolean): Self = StObject.set(x, "initWidgets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitWidgetsUndefined: Self = StObject.set(x, "initWidgets", js.undefined)
      
      @scala.inline
      def setInitialized(value: TElement => Unit): Self = StObject.set(x, "initialized", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitializedUndefined: Self = StObject.set(x, "initialized", js.undefined)
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      @scala.inline
      def setNumberSorter(value: (/* x */ Double, /* y */ Double, /* ascending */ Boolean, /* maxValue */ Double) => Double): Self = StObject.set(x, "numberSorter", js.Any.fromFunction4(value))
      
      @scala.inline
      def setNumberSorterUndefined: Self = StObject.set(x, "numberSorter", js.undefined)
      
      @scala.inline
      def setOnRenderHeader(
        value: (/* index */ Double, /* config */ TablesorterConfigurationStore[TElement], /* table */ JQuery[TElement]) => Unit
      ): Self = StObject.set(x, "onRenderHeader", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnRenderHeaderUndefined: Self = StObject.set(x, "onRenderHeader", js.undefined)
      
      @scala.inline
      def setOnRenderTemplate(value: (/* index */ Double, /* template */ String) => String): Self = StObject.set(x, "onRenderTemplate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderTemplateUndefined: Self = StObject.set(x, "onRenderTemplate", js.undefined)
      
      @scala.inline
      def setPointerClick(value: String): Self = StObject.set(x, "pointerClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerClickUndefined: Self = StObject.set(x, "pointerClick", js.undefined)
      
      @scala.inline
      def setPointerDown(value: String): Self = StObject.set(x, "pointerDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerDownUndefined: Self = StObject.set(x, "pointerDown", js.undefined)
      
      @scala.inline
      def setPointerUp(value: String): Self = StObject.set(x, "pointerUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerUpUndefined: Self = StObject.set(x, "pointerUp", js.undefined)
      
      @scala.inline
      def setResort(value: Boolean): Self = StObject.set(x, "resort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResortUndefined: Self = StObject.set(x, "resort", js.undefined)
      
      @scala.inline
      def setSelectorHeaders(value: Selector): Self = StObject.set(x, "selectorHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorHeadersUndefined: Self = StObject.set(x, "selectorHeaders", js.undefined)
      
      @scala.inline
      def setSelectorRemove(value: Selector): Self = StObject.set(x, "selectorRemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorRemoveUndefined: Self = StObject.set(x, "selectorRemove", js.undefined)
      
      @scala.inline
      def setSelectorSort(value: Selector): Self = StObject.set(x, "selectorSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorSortUndefined: Self = StObject.set(x, "selectorSort", js.undefined)
      
      @scala.inline
      def setServerSideSorting(value: Boolean): Self = StObject.set(x, "serverSideSorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerSideSortingUndefined: Self = StObject.set(x, "serverSideSorting", js.undefined)
      
      @scala.inline
      def setShowProcessing(value: Boolean): Self = StObject.set(x, "showProcessing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowProcessingUndefined: Self = StObject.set(x, "showProcessing", js.undefined)
      
      @scala.inline
      def setSortAppend(value: js.Array[SortDefinition] | NumberDictionary[js.Array[RelativeSortDefinition]]): Self = StObject.set(x, "sortAppend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortAppendUndefined: Self = StObject.set(x, "sortAppend", js.undefined)
      
      @scala.inline
      def setSortAppendVarargs(value: SortDefinition*): Self = StObject.set(x, "sortAppend", js.Array(value :_*))
      
      @scala.inline
      def setSortForce(value: js.Array[SortDefinition]): Self = StObject.set(x, "sortForce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortForceUndefined: Self = StObject.set(x, "sortForce", js.undefined)
      
      @scala.inline
      def setSortForceVarargs(value: SortDefinition*): Self = StObject.set(x, "sortForce", js.Array(value :_*))
      
      @scala.inline
      def setSortList(value: js.Array[SortDefinition]): Self = StObject.set(x, "sortList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortListUndefined: Self = StObject.set(x, "sortList", js.undefined)
      
      @scala.inline
      def setSortListVarargs(value: SortDefinition*): Self = StObject.set(x, "sortList", js.Array(value :_*))
      
      @scala.inline
      def setSortLocaleCompare(value: Boolean): Self = StObject.set(x, "sortLocaleCompare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortLocaleCompareUndefined: Self = StObject.set(x, "sortLocaleCompare", js.undefined)
      
      @scala.inline
      def setSortMultiSortKey(
        value: altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | typings.tablesorter.tablesorterStrings.x | y
      ): Self = StObject.set(x, "sortMultiSortKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortMultiSortKeyUndefined: Self = StObject.set(x, "sortMultiSortKey", js.undefined)
      
      @scala.inline
      def setSortReset(value: Boolean): Self = StObject.set(x, "sortReset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortResetKey(
        value: altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | typings.tablesorter.tablesorterStrings.x | y
      ): Self = StObject.set(x, "sortResetKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortResetKeyUndefined: Self = StObject.set(x, "sortResetKey", js.undefined)
      
      @scala.inline
      def setSortResetUndefined: Self = StObject.set(x, "sortReset", js.undefined)
      
      @scala.inline
      def setSortRestart(value: Boolean): Self = StObject.set(x, "sortRestart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortRestartUndefined: Self = StObject.set(x, "sortRestart", js.undefined)
      
      @scala.inline
      def setSortStable(value: Boolean): Self = StObject.set(x, "sortStable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortStableUndefined: Self = StObject.set(x, "sortStable", js.undefined)
      
      @scala.inline
      def setStringTo(value: StringSorting): Self = StObject.set(x, "stringTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringToUndefined: Self = StObject.set(x, "stringTo", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Boolean): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTableClass(value: String): Self = StObject.set(x, "tableClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableClassUndefined: Self = StObject.set(x, "tableClass", js.undefined)
      
      @scala.inline
      def setTextAttribute(value: String): Self = StObject.set(x, "textAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAttributeUndefined: Self = StObject.set(x, "textAttribute", js.undefined)
      
      @scala.inline
      def setTextExtraction(value: basic | TextExtractor[TElement] | (MappedSettings[basic | TextExtractor[TElement]])): Self = StObject.set(x, "textExtraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextExtractionFunction3(value: (/* cell */ Element, TElement, /* index */ Double) => String): Self = StObject.set(x, "textExtraction", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTextExtractionUndefined: Self = StObject.set(x, "textExtraction", js.undefined)
      
      @scala.inline
      def setTextSorter(value: TextSorter[TElement] | MappedSettings[TextSorter[TElement]]): Self = StObject.set(x, "textSorter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextSorterFunction5(
        value: (/* x */ String, /* y */ String, /* ascending */ Boolean, /* index */ Double, TElement) => Double
      ): Self = StObject.set(x, "textSorter", js.Any.fromFunction5(value))
      
      @scala.inline
      def setTextSorterUndefined: Self = StObject.set(x, "textSorter", js.undefined)
      
      @scala.inline
      def setTheme(value: CoreTheme | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setUsNumberFormat(value: Boolean): Self = StObject.set(x, "usNumberFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsNumberFormatUndefined: Self = StObject.set(x, "usNumberFormat", js.undefined)
      
      @scala.inline
      def setWidgetClass(value: String): Self = StObject.set(x, "widgetClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidgetClassUndefined: Self = StObject.set(x, "widgetClass", js.undefined)
      
      @scala.inline
      def setWidgetOptions(value: WidgetOptions[TElement]): Self = StObject.set(x, "widgetOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidgetOptionsUndefined: Self = StObject.set(x, "widgetOptions", js.undefined)
      
      @scala.inline
      def setWidgets(value: js.Array[String]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidgetsUndefined: Self = StObject.set(x, "widgets", js.undefined)
      
      @scala.inline
      def setWidgetsVarargs(value: String*): Self = StObject.set(x, "widgets", js.Array(value :_*))
      
      @scala.inline
      def setWidthFixed(value: Boolean): Self = StObject.set(x, "widthFixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthFixedUndefined: Self = StObject.set(x, "widthFixed", js.undefined)
    }
  }
}
