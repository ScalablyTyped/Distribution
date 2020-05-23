package typings.tablesorter

import org.scalablytyped.runtime.NumberDictionary
import typings.jquery.JQuery.Selector
import typings.tablesorter.coreThemeMod.CoreTheme
import typings.tablesorter.emptySortingMod.EmptySorting
import typings.tablesorter.globalizeSettingsMod.GlobalizeSettings
import typings.tablesorter.initializationEventHandlerMod.InitializationEventHandler
import typings.tablesorter.mappedSettingsMod.MappedSettings
import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import typings.tablesorter.numberSorterMod.NumberSorter
import typings.tablesorter.pagerConfigurationStoreMod.PagerConfigurationStore
import typings.tablesorter.parserMod.Parser
import typings.tablesorter.relativeSortDefinitionMod.RelativeSortDefinition
import typings.tablesorter.renderHeaderEventHandlerMod.RenderHeaderEventHandler
import typings.tablesorter.renderTemplateEventHandlerMod.RenderTemplateEventHandler
import typings.tablesorter.sortDefinitionMod.SortDefinition
import typings.tablesorter.sortOrderMod.SortOrder
import typings.tablesorter.stringSortingMod.StringSorting
import typings.tablesorter.tableSortingMod.TableSorting
import typings.tablesorter.tablesorterCacheMod.TablesorterCache
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
import typings.tablesorter.widgetOptionStoreMod.WidgetOptionStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/System/TablesorterConfigurationStore", JSImport.Namespace)
@js.native
object tablesorterConfigurationStoreMod extends js.Object {
  /* Inlined parent std.Required<tablesorter.tablesorter/System/TablesorterConfiguration.TablesorterConfiguration<TElement>> */
  @js.native
  trait TablesorterConfigurationStore[TElement] extends js.Object {
    /**
      * A jQuery-object which contains all filter-cells.
      */
    @JSName("$filters")
    var $filters: JQuery[HTMLElement] = js.native
    /**
      * The headers of the table.
      */
    @JSName("$headerIndexed")
    var $headerIndexed: js.Array[JQuery[HTMLElement]] = js.native
    /**
      * A jQuery-object containing all headers of the table.
      */
    @JSName("$headers")
    var $headers: JQuery[HTMLElement] = js.native
    /**
      * A jQuery-object containing the table itself.
      */
    @JSName("$table")
    var $table: JQuery[TElement] = js.native
    /**
      * A jQuery-object containing all sortable table-bodies.
      */
    @JSName("$tbodies")
    var $tbodies: JQuery[HTMLElement] = js.native
    /**
      * The cache of the tablesorter.
      */
    var cache: TablesorterCache = js.native
    var cancelSelection: Boolean = js.native
    var cehckboxVisible: Boolean = js.native
    var checkboxClass: String = js.native
    /**
      * The number of columns of the table.
      */
    var columns: Double = js.native
    var cssAsc: String = js.native
    var cssChildRow: String = js.native
    var cssDesc: String = js.native
    var cssHeader: String = js.native
    var cssHeaderRow: String = js.native
    var cssIcon: String = js.native
    var cssIconAsc: String = js.native
    var cssIconDesc: String = js.native
    var cssIconDisabled: String = js.native
    var cssIconNone: String = js.native
    var cssIgnoreRow: String = js.native
    var cssInfoBlock: String = js.native
    var cssNoSort: String = js.native
    var cssNone: String = js.native
    var cssProcessing: String = js.native
    var data: js.Object | js.Array[js.Array[_]] = js.native
    var dateFormat: String = js.native
    var dateRange: Double = js.native
    var debug: Boolean | String = js.native
    var delayInit: Boolean = js.native
    var duplicateSpan: Boolean = js.native
    var emptyTo: EmptySorting = js.native
    /**
      * The amount of filtered rows.
      */
    var filteredRows: Double = js.native
    var globalize: GlobalizeSettings | NumberDictionary[GlobalizeSettings] = js.native
    /**
      * The initial content of the headers.
      */
    var headerContent: js.Array[String] = js.native
    /**
      * The headers of the table.
      */
    var headerList: js.Array[HTMLElement] = js.native
    var headerTemplate: String = js.native
    var headers: NumberDictionary[TablesorterHeading] = js.native
    var ignoreCase: Boolean = js.native
    var ignoreChildRow: Boolean = js.native
    var imgAttr: String = js.native
    var initWidgets: Boolean = js.native
    @JSName("initialized")
    var initialized_Original: InitializationEventHandler[TElement] = js.native
    var namespace: String = js.native
    @JSName("numberSorter")
    var numberSorter_Original: NumberSorter = js.native
    @JSName("onRenderHeader")
    var onRenderHeader_Original: RenderHeaderEventHandler[TElement] = js.native
    @JSName("onRenderTemplate")
    var onRenderTemplate_Original: RenderTemplateEventHandler = js.native
    /**
      * Provides methods and settings for the `pager`-widget.
      */
    var pager: PagerConfigurationStore[TElement] = js.native
    /**
      * The parsers of the table.
      */
    var parsers: js.Array[Parser[TElement]] = js.native
    var pointerClick: String = js.native
    var pointerDown: String = js.native
    var pointerUp: String = js.native
    var resort: Boolean = js.native
    var selectorHeaders: Selector = js.native
    var selectorRemove: Selector = js.native
    var selectorSort: Selector = js.native
    var serverSideSorting: Boolean = js.native
    var showProcessing: Boolean = js.native
    var sortAppend: js.Array[SortDefinition] | NumberDictionary[js.Array[RelativeSortDefinition]] = js.native
    var sortForce: js.Array[SortDefinition] = js.native
    var sortInitialOrder: SortOrder = js.native
    var sortList: js.Array[SortDefinition] = js.native
    var sortLocaleCompare: Boolean = js.native
    var sortMultiSortKey: altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | x | y = js.native
    var sortReset: Boolean = js.native
    var sortResetKey: altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | x | y = js.native
    var sortRestart: Boolean = js.native
    var sortStable: Boolean = js.native
    /**
      * The sortings of the tablesorter.
      */
    var sortVars: js.Array[TableSorting] = js.native
    var stringTo: StringSorting = js.native
    var tabIndex: Boolean = js.native
    /**
      * The html-representation of the table.
      */
    var table: TElement = js.native
    var tableClass: String = js.native
    var textAttribute: String = js.native
    var textExtraction: basic | TextExtractor[TElement] | (MappedSettings[basic | TextExtractor[TElement]]) = js.native
    var textSorter: TextSorter[TElement] | MappedSettings[TextSorter[TElement]] = js.native
    var theme: CoreTheme | String = js.native
    /**
      * The total amount of rows.
      */
    var totalRows: Double = js.native
    var usNumberFormat: Boolean = js.native
    var widgetClass: String = js.native
    var widgetOptions: WidgetOptionStore[TElement] = js.native
    var widgets: js.Array[String] = js.native
    var widthFixed: Boolean = js.native
    def initialized(table: TElement): Unit = js.native
    def numberSorter(x: Double, y: Double, ascending: Boolean, maxValue: Double): Double = js.native
    def onRenderHeader(index: Double, config: TablesorterConfigurationStore[TElement], table: JQuery[TElement]): Unit = js.native
    def onRenderTemplate(index: Double, template: String): String = js.native
  }
  
}

