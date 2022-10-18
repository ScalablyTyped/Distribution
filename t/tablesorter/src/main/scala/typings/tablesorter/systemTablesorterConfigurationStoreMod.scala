package typings.tablesorter

import org.scalablytyped.runtime.NumberDictionary
import typings.jquery.JQuery.Selector
import typings.std.Element
import typings.tablesorter.designCoreThemeMod.CoreTheme
import typings.tablesorter.globalizationGlobalizeSettingsMod.GlobalizeSettings
import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import typings.tablesorter.pagingPagerConfigurationStoreMod.PagerConfigurationStore
import typings.tablesorter.parsingParserMod.Parser
import typings.tablesorter.parsingTextExtractorMod.TextExtractor
import typings.tablesorter.sortingEmptySortingMod.EmptySorting
import typings.tablesorter.sortingNumberSorterMod.NumberSorter
import typings.tablesorter.sortingRelativeSortDefinitionMod.RelativeSortDefinition
import typings.tablesorter.sortingSortDefinitionMod.SortDefinition
import typings.tablesorter.sortingSortOrderMod.SortOrder
import typings.tablesorter.sortingStringSortingMod.StringSorting
import typings.tablesorter.sortingTableSortingMod.TableSorting
import typings.tablesorter.sortingTextSorterMod.TextSorter
import typings.tablesorter.systemInitializationEventHandlerMod.InitializationEventHandler
import typings.tablesorter.systemMappedSettingsMod.MappedSettings
import typings.tablesorter.systemRenderHeaderEventHandlerMod.RenderHeaderEventHandler
import typings.tablesorter.systemRenderTemplateEventHandlerMod.RenderTemplateEventHandler
import typings.tablesorter.systemTablesorterCacheMod.TablesorterCache
import typings.tablesorter.systemTablesorterHeadingMod.TablesorterHeading
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
import typings.tablesorter.widgetsWidgetOptionStoreMod.WidgetOptionStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemTablesorterConfigurationStoreMod {
  
  /* Inlined parent std.Required<tablesorter.tablesorter/System/TablesorterConfiguration.TablesorterConfiguration<TElement>> */
  trait TablesorterConfigurationStore[TElement] extends StObject {
    
    /**
      * A jQuery-object which contains all filter-cells.
      */
    @JSName("$filters")
    var $filters: JQuery[HTMLElement]
    
    /**
      * The headers of the table.
      */
    @JSName("$headerIndexed")
    var $headerIndexed: js.Array[JQuery[HTMLElement]]
    
    /**
      * A jQuery-object containing all headers of the table.
      */
    @JSName("$headers")
    var $headers: JQuery[HTMLElement]
    
    /**
      * A jQuery-object containing the table itself.
      */
    @JSName("$table")
    var $table: JQuery[TElement]
    
    /**
      * A jQuery-object containing all sortable table-bodies.
      */
    @JSName("$tbodies")
    var $tbodies: JQuery[HTMLElement]
    
    /**
      * The cache of the tablesorter.
      */
    var cache: TablesorterCache
    
    var cancelSelection: Boolean
    
    var cehckboxVisible: Boolean
    
    var checkboxClass: String
    
    /**
      * The number of columns of the table.
      */
    var columns: Double
    
    var cssAsc: String
    
    var cssChildRow: String
    
    var cssDesc: String
    
    var cssHeader: String
    
    var cssHeaderRow: String
    
    var cssIcon: String
    
    var cssIconAsc: String
    
    var cssIconDesc: String
    
    var cssIconDisabled: String
    
    var cssIconNone: String
    
    var cssIgnoreRow: String
    
    var cssInfoBlock: String
    
    var cssNoSort: String
    
    var cssNone: String
    
    var cssProcessing: String
    
    var data: js.Object | js.Array[js.Array[Any]]
    
    var dateFormat: String
    
    var dateRange: Double
    
    var debug: Boolean | String
    
    var delayInit: Boolean
    
    var duplicateSpan: Boolean
    
    var emptyTo: EmptySorting
    
    /**
      * The amount of filtered rows.
      */
    var filteredRows: Double
    
    var globalize: GlobalizeSettings | NumberDictionary[GlobalizeSettings]
    
    /**
      * The initial content of the headers.
      */
    var headerContent: js.Array[String]
    
    /**
      * The headers of the table.
      */
    var headerList: js.Array[HTMLElement]
    
    var headerTemplate: String
    
    var headers: NumberDictionary[TablesorterHeading]
    
    var ignoreCase: Boolean
    
    var ignoreChildRow: Boolean
    
    var imgAttr: String
    
    var initWidgets: Boolean
    
    def initialized(table: TElement): Unit
    @JSName("initialized")
    var initialized_Original: InitializationEventHandler[TElement]
    
    var namespace: String
    
    def numberSorter(x: Double, y: Double, ascending: Boolean, maxValue: Double): Double
    @JSName("numberSorter")
    var numberSorter_Original: NumberSorter
    
    def onRenderHeader(index: Double, config: TablesorterConfigurationStore[TElement], table: JQuery[TElement]): Unit
    @JSName("onRenderHeader")
    var onRenderHeader_Original: RenderHeaderEventHandler[TElement]
    
    def onRenderTemplate(index: Double, template: String): String
    @JSName("onRenderTemplate")
    var onRenderTemplate_Original: RenderTemplateEventHandler
    
    /**
      * Provides methods and settings for the `pager`-widget.
      */
    var pager: PagerConfigurationStore[TElement]
    
    /**
      * The parsers of the table.
      */
    var parsers: js.Array[Parser[TElement]]
    
    var pointerClick: String
    
    var pointerDown: String
    
    var pointerUp: String
    
    var resort: Boolean
    
    var selectorHeaders: Selector
    
    var selectorRemove: Selector
    
    var selectorSort: Selector
    
    var serverSideSorting: Boolean
    
    var showProcessing: Boolean
    
    var sortAppend: js.Array[SortDefinition] | NumberDictionary[js.Array[RelativeSortDefinition]]
    
    var sortForce: js.Array[SortDefinition]
    
    var sortInitialOrder: SortOrder
    
    var sortList: js.Array[SortDefinition]
    
    var sortLocaleCompare: Boolean
    
    var sortMultiSortKey: altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | x | y
    
    var sortReset: Boolean
    
    var sortResetKey: altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | x | y
    
    var sortRestart: Boolean
    
    var sortStable: Boolean
    
    /**
      * The sortings of the tablesorter.
      */
    var sortVars: js.Array[TableSorting]
    
    var stringTo: StringSorting
    
    var tabIndex: Boolean
    
    /**
      * The html-representation of the table.
      */
    var table: TElement
    
    var tableClass: String
    
    var textAttribute: String
    
    var textExtraction: basic | TextExtractor[TElement] | (MappedSettings[basic | TextExtractor[TElement]])
    
    var textSorter: TextSorter[TElement] | MappedSettings[TextSorter[TElement]]
    
    var theme: CoreTheme | String
    
    /**
      * The total amount of rows.
      */
    var totalRows: Double
    
    var usNumberFormat: Boolean
    
    var widgetClass: String
    
    var widgetOptions: WidgetOptionStore[TElement]
    
    var widgets: js.Array[String]
    
    var widthFixed: Boolean
  }
  object TablesorterConfigurationStore {
    
    inline def apply[TElement](
      $filters: JQuery[HTMLElement],
      $headerIndexed: js.Array[JQuery[HTMLElement]],
      $headers: JQuery[HTMLElement],
      $table: JQuery[TElement],
      $tbodies: JQuery[HTMLElement],
      cache: TablesorterCache,
      cancelSelection: Boolean,
      cehckboxVisible: Boolean,
      checkboxClass: String,
      columns: Double,
      cssAsc: String,
      cssChildRow: String,
      cssDesc: String,
      cssHeader: String,
      cssHeaderRow: String,
      cssIcon: String,
      cssIconAsc: String,
      cssIconDesc: String,
      cssIconDisabled: String,
      cssIconNone: String,
      cssIgnoreRow: String,
      cssInfoBlock: String,
      cssNoSort: String,
      cssNone: String,
      cssProcessing: String,
      data: js.Object | js.Array[js.Array[Any]],
      dateFormat: String,
      dateRange: Double,
      debug: Boolean | String,
      delayInit: Boolean,
      duplicateSpan: Boolean,
      emptyTo: EmptySorting,
      filteredRows: Double,
      globalize: GlobalizeSettings | NumberDictionary[GlobalizeSettings],
      headerContent: js.Array[String],
      headerList: js.Array[HTMLElement],
      headerTemplate: String,
      headers: NumberDictionary[TablesorterHeading],
      ignoreCase: Boolean,
      ignoreChildRow: Boolean,
      imgAttr: String,
      initWidgets: Boolean,
      initialized: TElement => Unit,
      namespace: String,
      numberSorter: (/* x */ Double, /* y */ Double, /* ascending */ Boolean, /* maxValue */ Double) => Double,
      onRenderHeader: (/* index */ Double, /* config */ TablesorterConfigurationStore[TElement], /* table */ JQuery[TElement]) => Unit,
      onRenderTemplate: (/* index */ Double, /* template */ String) => String,
      pager: PagerConfigurationStore[TElement],
      parsers: js.Array[Parser[TElement]],
      pointerClick: String,
      pointerDown: String,
      pointerUp: String,
      resort: Boolean,
      selectorHeaders: Selector,
      selectorRemove: Selector,
      selectorSort: Selector,
      serverSideSorting: Boolean,
      showProcessing: Boolean,
      sortAppend: js.Array[SortDefinition] | NumberDictionary[js.Array[RelativeSortDefinition]],
      sortForce: js.Array[SortDefinition],
      sortInitialOrder: SortOrder,
      sortList: js.Array[SortDefinition],
      sortLocaleCompare: Boolean,
      sortMultiSortKey: altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | x | y,
      sortReset: Boolean,
      sortResetKey: altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | x | y,
      sortRestart: Boolean,
      sortStable: Boolean,
      sortVars: js.Array[TableSorting],
      stringTo: StringSorting,
      tabIndex: Boolean,
      table: TElement,
      tableClass: String,
      textAttribute: String,
      textExtraction: basic | TextExtractor[TElement] | (MappedSettings[basic | TextExtractor[TElement]]),
      textSorter: TextSorter[TElement] | MappedSettings[TextSorter[TElement]],
      theme: CoreTheme | String,
      totalRows: Double,
      usNumberFormat: Boolean,
      widgetClass: String,
      widgetOptions: WidgetOptionStore[TElement],
      widgets: js.Array[String],
      widthFixed: Boolean
    ): TablesorterConfigurationStore[TElement] = {
      val __obj = js.Dynamic.literal($filters = $filters.asInstanceOf[js.Any], $headerIndexed = $headerIndexed.asInstanceOf[js.Any], $headers = $headers.asInstanceOf[js.Any], $table = $table.asInstanceOf[js.Any], $tbodies = $tbodies.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cancelSelection = cancelSelection.asInstanceOf[js.Any], cehckboxVisible = cehckboxVisible.asInstanceOf[js.Any], checkboxClass = checkboxClass.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], cssAsc = cssAsc.asInstanceOf[js.Any], cssChildRow = cssChildRow.asInstanceOf[js.Any], cssDesc = cssDesc.asInstanceOf[js.Any], cssHeader = cssHeader.asInstanceOf[js.Any], cssHeaderRow = cssHeaderRow.asInstanceOf[js.Any], cssIcon = cssIcon.asInstanceOf[js.Any], cssIconAsc = cssIconAsc.asInstanceOf[js.Any], cssIconDesc = cssIconDesc.asInstanceOf[js.Any], cssIconDisabled = cssIconDisabled.asInstanceOf[js.Any], cssIconNone = cssIconNone.asInstanceOf[js.Any], cssIgnoreRow = cssIgnoreRow.asInstanceOf[js.Any], cssInfoBlock = cssInfoBlock.asInstanceOf[js.Any], cssNoSort = cssNoSort.asInstanceOf[js.Any], cssNone = cssNone.asInstanceOf[js.Any], cssProcessing = cssProcessing.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], dateRange = dateRange.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], delayInit = delayInit.asInstanceOf[js.Any], duplicateSpan = duplicateSpan.asInstanceOf[js.Any], emptyTo = emptyTo.asInstanceOf[js.Any], filteredRows = filteredRows.asInstanceOf[js.Any], globalize = globalize.asInstanceOf[js.Any], headerContent = headerContent.asInstanceOf[js.Any], headerList = headerList.asInstanceOf[js.Any], headerTemplate = headerTemplate.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ignoreCase = ignoreCase.asInstanceOf[js.Any], ignoreChildRow = ignoreChildRow.asInstanceOf[js.Any], imgAttr = imgAttr.asInstanceOf[js.Any], initWidgets = initWidgets.asInstanceOf[js.Any], initialized = js.Any.fromFunction1(initialized), namespace = namespace.asInstanceOf[js.Any], numberSorter = js.Any.fromFunction4(numberSorter), onRenderHeader = js.Any.fromFunction3(onRenderHeader), onRenderTemplate = js.Any.fromFunction2(onRenderTemplate), pager = pager.asInstanceOf[js.Any], parsers = parsers.asInstanceOf[js.Any], pointerClick = pointerClick.asInstanceOf[js.Any], pointerDown = pointerDown.asInstanceOf[js.Any], pointerUp = pointerUp.asInstanceOf[js.Any], resort = resort.asInstanceOf[js.Any], selectorHeaders = selectorHeaders.asInstanceOf[js.Any], selectorRemove = selectorRemove.asInstanceOf[js.Any], selectorSort = selectorSort.asInstanceOf[js.Any], serverSideSorting = serverSideSorting.asInstanceOf[js.Any], showProcessing = showProcessing.asInstanceOf[js.Any], sortAppend = sortAppend.asInstanceOf[js.Any], sortForce = sortForce.asInstanceOf[js.Any], sortInitialOrder = sortInitialOrder.asInstanceOf[js.Any], sortList = sortList.asInstanceOf[js.Any], sortLocaleCompare = sortLocaleCompare.asInstanceOf[js.Any], sortMultiSortKey = sortMultiSortKey.asInstanceOf[js.Any], sortReset = sortReset.asInstanceOf[js.Any], sortResetKey = sortResetKey.asInstanceOf[js.Any], sortRestart = sortRestart.asInstanceOf[js.Any], sortStable = sortStable.asInstanceOf[js.Any], sortVars = sortVars.asInstanceOf[js.Any], stringTo = stringTo.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], tableClass = tableClass.asInstanceOf[js.Any], textAttribute = textAttribute.asInstanceOf[js.Any], textExtraction = textExtraction.asInstanceOf[js.Any], textSorter = textSorter.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], totalRows = totalRows.asInstanceOf[js.Any], usNumberFormat = usNumberFormat.asInstanceOf[js.Any], widgetClass = widgetClass.asInstanceOf[js.Any], widgetOptions = widgetOptions.asInstanceOf[js.Any], widgets = widgets.asInstanceOf[js.Any], widthFixed = widthFixed.asInstanceOf[js.Any])
      __obj.asInstanceOf[TablesorterConfigurationStore[TElement]]
    }
    
    extension [Self <: TablesorterConfigurationStore[?], TElement](x: Self & TablesorterConfigurationStore[TElement]) {
      
      inline def set$filters(value: JQuery[HTMLElement]): Self = StObject.set(x, "$filters", value.asInstanceOf[js.Any])
      
      inline def set$headerIndexed(value: js.Array[JQuery[HTMLElement]]): Self = StObject.set(x, "$headerIndexed", value.asInstanceOf[js.Any])
      
      inline def set$headerIndexedVarargs(value: JQuery[HTMLElement]*): Self = StObject.set(x, "$headerIndexed", js.Array(value*))
      
      inline def set$headers(value: JQuery[HTMLElement]): Self = StObject.set(x, "$headers", value.asInstanceOf[js.Any])
      
      inline def set$table(value: JQuery[TElement]): Self = StObject.set(x, "$table", value.asInstanceOf[js.Any])
      
      inline def set$tbodies(value: JQuery[HTMLElement]): Self = StObject.set(x, "$tbodies", value.asInstanceOf[js.Any])
      
      inline def setCache(value: TablesorterCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCancelSelection(value: Boolean): Self = StObject.set(x, "cancelSelection", value.asInstanceOf[js.Any])
      
      inline def setCehckboxVisible(value: Boolean): Self = StObject.set(x, "cehckboxVisible", value.asInstanceOf[js.Any])
      
      inline def setCheckboxClass(value: String): Self = StObject.set(x, "checkboxClass", value.asInstanceOf[js.Any])
      
      inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setCssAsc(value: String): Self = StObject.set(x, "cssAsc", value.asInstanceOf[js.Any])
      
      inline def setCssChildRow(value: String): Self = StObject.set(x, "cssChildRow", value.asInstanceOf[js.Any])
      
      inline def setCssDesc(value: String): Self = StObject.set(x, "cssDesc", value.asInstanceOf[js.Any])
      
      inline def setCssHeader(value: String): Self = StObject.set(x, "cssHeader", value.asInstanceOf[js.Any])
      
      inline def setCssHeaderRow(value: String): Self = StObject.set(x, "cssHeaderRow", value.asInstanceOf[js.Any])
      
      inline def setCssIcon(value: String): Self = StObject.set(x, "cssIcon", value.asInstanceOf[js.Any])
      
      inline def setCssIconAsc(value: String): Self = StObject.set(x, "cssIconAsc", value.asInstanceOf[js.Any])
      
      inline def setCssIconDesc(value: String): Self = StObject.set(x, "cssIconDesc", value.asInstanceOf[js.Any])
      
      inline def setCssIconDisabled(value: String): Self = StObject.set(x, "cssIconDisabled", value.asInstanceOf[js.Any])
      
      inline def setCssIconNone(value: String): Self = StObject.set(x, "cssIconNone", value.asInstanceOf[js.Any])
      
      inline def setCssIgnoreRow(value: String): Self = StObject.set(x, "cssIgnoreRow", value.asInstanceOf[js.Any])
      
      inline def setCssInfoBlock(value: String): Self = StObject.set(x, "cssInfoBlock", value.asInstanceOf[js.Any])
      
      inline def setCssNoSort(value: String): Self = StObject.set(x, "cssNoSort", value.asInstanceOf[js.Any])
      
      inline def setCssNone(value: String): Self = StObject.set(x, "cssNone", value.asInstanceOf[js.Any])
      
      inline def setCssProcessing(value: String): Self = StObject.set(x, "cssProcessing", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object | js.Array[js.Array[Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Array[Any]*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateRange(value: Double): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean | String): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDelayInit(value: Boolean): Self = StObject.set(x, "delayInit", value.asInstanceOf[js.Any])
      
      inline def setDuplicateSpan(value: Boolean): Self = StObject.set(x, "duplicateSpan", value.asInstanceOf[js.Any])
      
      inline def setEmptyTo(value: EmptySorting): Self = StObject.set(x, "emptyTo", value.asInstanceOf[js.Any])
      
      inline def setFilteredRows(value: Double): Self = StObject.set(x, "filteredRows", value.asInstanceOf[js.Any])
      
      inline def setGlobalize(value: GlobalizeSettings | NumberDictionary[GlobalizeSettings]): Self = StObject.set(x, "globalize", value.asInstanceOf[js.Any])
      
      inline def setHeaderContent(value: js.Array[String]): Self = StObject.set(x, "headerContent", value.asInstanceOf[js.Any])
      
      inline def setHeaderContentVarargs(value: String*): Self = StObject.set(x, "headerContent", js.Array(value*))
      
      inline def setHeaderList(value: js.Array[HTMLElement]): Self = StObject.set(x, "headerList", value.asInstanceOf[js.Any])
      
      inline def setHeaderListVarargs(value: HTMLElement*): Self = StObject.set(x, "headerList", js.Array(value*))
      
      inline def setHeaderTemplate(value: String): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: NumberDictionary[TablesorterHeading]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      inline def setIgnoreChildRow(value: Boolean): Self = StObject.set(x, "ignoreChildRow", value.asInstanceOf[js.Any])
      
      inline def setImgAttr(value: String): Self = StObject.set(x, "imgAttr", value.asInstanceOf[js.Any])
      
      inline def setInitWidgets(value: Boolean): Self = StObject.set(x, "initWidgets", value.asInstanceOf[js.Any])
      
      inline def setInitialized(value: TElement => Unit): Self = StObject.set(x, "initialized", js.Any.fromFunction1(value))
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNumberSorter(value: (/* x */ Double, /* y */ Double, /* ascending */ Boolean, /* maxValue */ Double) => Double): Self = StObject.set(x, "numberSorter", js.Any.fromFunction4(value))
      
      inline def setOnRenderHeader(
        value: (/* index */ Double, /* config */ TablesorterConfigurationStore[TElement], /* table */ JQuery[TElement]) => Unit
      ): Self = StObject.set(x, "onRenderHeader", js.Any.fromFunction3(value))
      
      inline def setOnRenderTemplate(value: (/* index */ Double, /* template */ String) => String): Self = StObject.set(x, "onRenderTemplate", js.Any.fromFunction2(value))
      
      inline def setPager(value: PagerConfigurationStore[TElement]): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
      
      inline def setParsers(value: js.Array[Parser[TElement]]): Self = StObject.set(x, "parsers", value.asInstanceOf[js.Any])
      
      inline def setParsersVarargs(value: Parser[TElement]*): Self = StObject.set(x, "parsers", js.Array(value*))
      
      inline def setPointerClick(value: String): Self = StObject.set(x, "pointerClick", value.asInstanceOf[js.Any])
      
      inline def setPointerDown(value: String): Self = StObject.set(x, "pointerDown", value.asInstanceOf[js.Any])
      
      inline def setPointerUp(value: String): Self = StObject.set(x, "pointerUp", value.asInstanceOf[js.Any])
      
      inline def setResort(value: Boolean): Self = StObject.set(x, "resort", value.asInstanceOf[js.Any])
      
      inline def setSelectorHeaders(value: Selector): Self = StObject.set(x, "selectorHeaders", value.asInstanceOf[js.Any])
      
      inline def setSelectorRemove(value: Selector): Self = StObject.set(x, "selectorRemove", value.asInstanceOf[js.Any])
      
      inline def setSelectorSort(value: Selector): Self = StObject.set(x, "selectorSort", value.asInstanceOf[js.Any])
      
      inline def setServerSideSorting(value: Boolean): Self = StObject.set(x, "serverSideSorting", value.asInstanceOf[js.Any])
      
      inline def setShowProcessing(value: Boolean): Self = StObject.set(x, "showProcessing", value.asInstanceOf[js.Any])
      
      inline def setSortAppend(value: js.Array[SortDefinition] | NumberDictionary[js.Array[RelativeSortDefinition]]): Self = StObject.set(x, "sortAppend", value.asInstanceOf[js.Any])
      
      inline def setSortAppendVarargs(value: SortDefinition*): Self = StObject.set(x, "sortAppend", js.Array(value*))
      
      inline def setSortForce(value: js.Array[SortDefinition]): Self = StObject.set(x, "sortForce", value.asInstanceOf[js.Any])
      
      inline def setSortForceVarargs(value: SortDefinition*): Self = StObject.set(x, "sortForce", js.Array(value*))
      
      inline def setSortInitialOrder(value: SortOrder): Self = StObject.set(x, "sortInitialOrder", value.asInstanceOf[js.Any])
      
      inline def setSortList(value: js.Array[SortDefinition]): Self = StObject.set(x, "sortList", value.asInstanceOf[js.Any])
      
      inline def setSortListVarargs(value: SortDefinition*): Self = StObject.set(x, "sortList", js.Array(value*))
      
      inline def setSortLocaleCompare(value: Boolean): Self = StObject.set(x, "sortLocaleCompare", value.asInstanceOf[js.Any])
      
      inline def setSortMultiSortKey(
        value: altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | typings.tablesorter.tablesorterStrings.x | y
      ): Self = StObject.set(x, "sortMultiSortKey", value.asInstanceOf[js.Any])
      
      inline def setSortReset(value: Boolean): Self = StObject.set(x, "sortReset", value.asInstanceOf[js.Any])
      
      inline def setSortResetKey(
        value: altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | typings.tablesorter.tablesorterStrings.x | y
      ): Self = StObject.set(x, "sortResetKey", value.asInstanceOf[js.Any])
      
      inline def setSortRestart(value: Boolean): Self = StObject.set(x, "sortRestart", value.asInstanceOf[js.Any])
      
      inline def setSortStable(value: Boolean): Self = StObject.set(x, "sortStable", value.asInstanceOf[js.Any])
      
      inline def setSortVars(value: js.Array[TableSorting]): Self = StObject.set(x, "sortVars", value.asInstanceOf[js.Any])
      
      inline def setSortVarsVarargs(value: TableSorting*): Self = StObject.set(x, "sortVars", js.Array(value*))
      
      inline def setStringTo(value: StringSorting): Self = StObject.set(x, "stringTo", value.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: Boolean): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTable(value: TElement): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableClass(value: String): Self = StObject.set(x, "tableClass", value.asInstanceOf[js.Any])
      
      inline def setTextAttribute(value: String): Self = StObject.set(x, "textAttribute", value.asInstanceOf[js.Any])
      
      inline def setTextExtraction(value: basic | TextExtractor[TElement] | (MappedSettings[basic | TextExtractor[TElement]])): Self = StObject.set(x, "textExtraction", value.asInstanceOf[js.Any])
      
      inline def setTextExtractionFunction3(value: (/* cell */ Element, TElement, /* index */ Double) => String): Self = StObject.set(x, "textExtraction", js.Any.fromFunction3(value))
      
      inline def setTextSorter(value: TextSorter[TElement] | MappedSettings[TextSorter[TElement]]): Self = StObject.set(x, "textSorter", value.asInstanceOf[js.Any])
      
      inline def setTextSorterFunction5(
        value: (/* x */ String, /* y */ String, /* ascending */ Boolean, /* index */ Double, TElement) => Double
      ): Self = StObject.set(x, "textSorter", js.Any.fromFunction5(value))
      
      inline def setTheme(value: CoreTheme | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTotalRows(value: Double): Self = StObject.set(x, "totalRows", value.asInstanceOf[js.Any])
      
      inline def setUsNumberFormat(value: Boolean): Self = StObject.set(x, "usNumberFormat", value.asInstanceOf[js.Any])
      
      inline def setWidgetClass(value: String): Self = StObject.set(x, "widgetClass", value.asInstanceOf[js.Any])
      
      inline def setWidgetOptions(value: WidgetOptionStore[TElement]): Self = StObject.set(x, "widgetOptions", value.asInstanceOf[js.Any])
      
      inline def setWidgets(value: js.Array[String]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
      
      inline def setWidgetsVarargs(value: String*): Self = StObject.set(x, "widgets", js.Array(value*))
      
      inline def setWidthFixed(value: Boolean): Self = StObject.set(x, "widthFixed", value.asInstanceOf[js.Any])
    }
  }
}
