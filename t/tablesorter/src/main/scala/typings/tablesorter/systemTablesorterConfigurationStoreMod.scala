package typings.tablesorter

import typings.tablesorter.pagingPagerConfigurationStoreMod.PagerConfigurationStore
import typings.tablesorter.parsingParserMod.Parser
import typings.tablesorter.sortingTableSortingMod.TableSorting
import typings.tablesorter.systemTablesorterCacheMod.TablesorterCache
import typings.tablesorter.tablesorterMod._Global_.HTMLElement
import typings.tablesorter.tablesorterMod._Global_.JQuery
import typings.tablesorter.widgetsWidgetOptionStoreMod.WidgetOptionStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/System/TablesorterConfigurationStore", JSImport.Namespace)
@js.native
object systemTablesorterConfigurationStoreMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof tablesorter.tablesorter/System/TablesorterConfiguration.TablesorterConfiguration<TElement> ]: -? tablesorter.tablesorter/System/TablesorterConfiguration.TablesorterConfiguration<TElement>[P]} */ @js.native
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
    /**
      * The number of columns of the table.
      */
    var columns: Double = js.native
    /**
      * The amount of filtered rows.
      */
    var filteredRows: Double = js.native
    /**
      * The initial content of the headers.
      */
    var headerContent: js.Array[String] = js.native
    /**
      * The headers of the table.
      */
    var headerList: js.Array[HTMLElement] = js.native
    /**
      * Provides methods and settings for the `pager`-widget.
      */
    var pager: PagerConfigurationStore[TElement] = js.native
    /**
      * The parsers of the table.
      */
    var parsers: js.Array[Parser[TElement]] = js.native
    /**
      * The sortings of the tablesorter.
      */
    var sortVars: js.Array[TableSorting] = js.native
    /**
      * The html-representation of the table.
      */
    var table: TElement = js.native
    /**
      * The total amount of rows.
      */
    var totalRows: Double = js.native
    var widgetOptions: WidgetOptionStore[TElement] = js.native
  }
  
}

