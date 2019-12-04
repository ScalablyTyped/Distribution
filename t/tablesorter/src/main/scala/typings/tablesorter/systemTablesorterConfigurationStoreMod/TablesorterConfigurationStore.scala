package typings.tablesorter.systemTablesorterConfigurationStoreMod

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

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof tablesorter.tablesorter/System/TablesorterConfiguration.TablesorterConfiguration<TElement> ]: -? tablesorter.tablesorter/System/TablesorterConfiguration.TablesorterConfiguration<TElement>[P]} */ trait TablesorterConfigurationStore[TElement] extends js.Object {
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
  /**
    * The number of columns of the table.
    */
  var columns: Double
  /**
    * The amount of filtered rows.
    */
  var filteredRows: Double
  /**
    * The initial content of the headers.
    */
  var headerContent: js.Array[String]
  /**
    * The headers of the table.
    */
  var headerList: js.Array[HTMLElement]
  /**
    * Provides methods and settings for the `pager`-widget.
    */
  var pager: PagerConfigurationStore[TElement]
  /**
    * The parsers of the table.
    */
  var parsers: js.Array[Parser[TElement]]
  /**
    * The sortings of the tablesorter.
    */
  var sortVars: js.Array[TableSorting]
  /**
    * The html-representation of the table.
    */
  var table: TElement
  /**
    * The total amount of rows.
    */
  var totalRows: Double
  var widgetOptions: WidgetOptionStore[TElement]
}

object TablesorterConfigurationStore {
  @scala.inline
  def apply[TElement](
    $filters: JQuery[HTMLElement],
    $headerIndexed: js.Array[JQuery[HTMLElement]],
    $headers: JQuery[HTMLElement],
    $table: JQuery[TElement],
    $tbodies: JQuery[HTMLElement],
    cache: TablesorterCache,
    columns: Double,
    filteredRows: Double,
    headerContent: js.Array[String],
    headerList: js.Array[HTMLElement],
    pager: PagerConfigurationStore[TElement],
    parsers: js.Array[Parser[TElement]],
    sortVars: js.Array[TableSorting],
    table: TElement,
    totalRows: Double,
    widgetOptions: WidgetOptionStore[TElement]
  ): TablesorterConfigurationStore[TElement] = {
    val __obj = js.Dynamic.literal($filters = $filters.asInstanceOf[js.Any], $headerIndexed = $headerIndexed.asInstanceOf[js.Any], $headers = $headers.asInstanceOf[js.Any], $table = $table.asInstanceOf[js.Any], $tbodies = $tbodies.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], filteredRows = filteredRows.asInstanceOf[js.Any], headerContent = headerContent.asInstanceOf[js.Any], headerList = headerList.asInstanceOf[js.Any], pager = pager.asInstanceOf[js.Any], parsers = parsers.asInstanceOf[js.Any], sortVars = sortVars.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], totalRows = totalRows.asInstanceOf[js.Any], widgetOptions = widgetOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TablesorterConfigurationStore[TElement]]
  }
}

