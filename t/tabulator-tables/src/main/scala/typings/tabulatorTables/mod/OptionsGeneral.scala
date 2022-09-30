package typings.tabulatorTables.mod

import typings.std.HTMLElement
import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import typings.tabulatorTables.tabulatorTablesStrings.blocking
import typings.tabulatorTables.tabulatorTablesStrings.highlight
import typings.tabulatorTables.tabulatorTablesStrings.manual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsGeneral extends StObject {
  
  // Not listed in options--------------------
  /** Tabulator will automatically attempt to redraw the data contained in the table if the containing element for the table is resized. To disable this functionality, set the autoResize property to false. */
  var autoResize: js.UndefOr[Boolean] = js.undefined
  
  /** The dataChanged callback is triggered whenever the table data is changed by the user. Triggers for this include editing any cell in the table, adding a row and deleting a row. */
  var dataChanged: js.UndefOr[js.Function1[/* data */ Any, Unit]] = js.undefined
  
  /** The dataSorted callback is triggered after the table dataset is sorted. */
  var dataSorted: js.UndefOr[
    js.Function2[/* sorters */ js.Array[SorterFromTable], /* rows */ js.Array[RowComponent], Unit]
  ] = js.undefined
  
  /** The dataSorting callback is triggered whenever a sort event occurs, before sorting happens. */
  var dataSorting: js.UndefOr[js.Function1[/* sorters */ js.Array[SorterFromTable], Unit]] = js.undefined
  
  /** Footer  element to display for the table. */
  var footerElement: js.UndefOr[String | HTMLElement] = js.undefined
  
  /** Sets the height of the containing element, can be set to any valid height css value. If set to false (the default), the height of the table will resize to fit the table data. */
  var height: js.UndefOr[String | Double | `false`] = js.undefined
  
  /** The htmlImported callback is triggered when Tabulator finishes importing data from an HTML table. */
  var htmlImported: js.UndefOr[EmptyCallback] = js.undefined
  
  /** The htmlImporting callback is triggered when Tabulator starts importing data from an HTML table. */
  var htmlImporting: js.UndefOr[EmptyCallback] = js.undefined
  
  /** Setting the invalidOptionWarnings option to false will disable console warning messages for invalid properties in the table constructor and column definition object. */
  var invalidOptionWarnings: js.UndefOr[Boolean] = js.undefined
  
  /** Keybinding configuration object. */
  var keybindings: js.UndefOr[`false` | KeyBinding] = js.undefined
  
  /** Can be set to any valid CSS value. By setting this you can allow your table to expand to fit the data, but not overflow its parent element. When there are too many rows to fit in the available space, the vertical scroll bar will be shown. This has the added benefit of improving load times on larger tables */
  var maxHeight: js.UndefOr[String | Double] = js.undefined
  
  /** With a variable table height you can set the minimum height of the table either defined in the min-height CSS property for the element or set it using the minHeight option in the table constructor, this can be set to any valid CSS value. */
  var minHeight: js.UndefOr[String | Double] = js.undefined
  
  /** Whenever a page has been loaded, the pageLoaded callback is called, passing the current page number as an argument. */
  var pageLoaded: js.UndefOr[js.Function1[/* pageno */ Double, Unit]] = js.undefined
  
  /** placeholder element to display on empty table. */
  var placeholder: js.UndefOr[String | HTMLElement] = js.undefined
  
  /**
    * The reactivity systems allow Tabulator to watch arrays and objects passed into the table for changes and then automatically update the table.
    *
    * This approach means you no longer need to worry about calling a number of different functions on the table to make changes, you simply update the array or object you originally passed into the table and Tabulator will take care of the rest.
    *
    * You can enable reactive data by setting the reactiveData option to true in the table constructor, and then passing your data array to the data option.
    *
    * Once the table is built any changes to the array will automatically be replicated to the table without needing to call any functions on the table itself
    */
  var reactiveData: js.UndefOr[Boolean] = js.undefined
  
  /** The renderComplete callback is triggered after the table has been rendered. */
  var renderComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var renderHorizontal: js.UndefOr[RenderMode] = js.undefined
  
  /**
    * The renderStarted callback is triggered whenever all the rows in the table are about to be rendered. This can include:
    * - Data is loaded into the table when setData is called
    * - A page is loaded through any form of pagination
    * - Rows are added to the table during progressive rendering
    * - Columns are changed by setColumns
    * - The data is filtered
    * - The data is sorted
    * - The redraw function is called
    */
  var renderStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var renderVertical: js.UndefOr[RenderMode] = js.undefined
  
  /** Manually set the size of the virtual DOM buffer. */
  var renderVerticalBuffer: js.UndefOr[Boolean | Double] = js.undefined
  
  /** Callback is triggered when the table is horizontally scrolled. */
  var scrollHorizontal: js.UndefOr[js.Function1[/* left */ Any, Unit]] = js.undefined
  
  /** Callback is triggered when the table is vertically scrolled. */
  var scrollVertical: js.UndefOr[js.Function1[/* top */ Any, Unit]] = js.undefined
  
  /** When a the tabulator constructor is called, the tableBuilding callback will triggered. */
  var tableBuilding: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** When a the tabulator constructor is called and the table has finished being rendered, the tableBuilt callback will triggered: */
  var tableBuilt: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var textDirection: js.UndefOr[TextDirection] = js.undefined
  
  /**
    * There are now three different validation modes available to customize the validation experience:
    *
    * blocking - if a user enters an invalid value while editing, they are blocked from leaving the cell until a valid value is entered (default)
    *
    * highlight - if a user enters an invalid value, then the edit will complete as usual and they are allowed to exit the cell but a highlight is applied to the cell using the tabulator-validation-fail class
    *
    * manual - no validation is automatically performed on edit, but it can be triggered by calling the validate function on the table or any Component Object
    */
  var validationMode: js.UndefOr[blocking | highlight | manual] = js.undefined
}
object OptionsGeneral {
  
  inline def apply(): OptionsGeneral = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsGeneral]
  }
  
  extension [Self <: OptionsGeneral](x: Self) {
    
    inline def setAutoResize(value: Boolean): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
    
    inline def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
    
    inline def setDataChanged(value: /* data */ Any => Unit): Self = StObject.set(x, "dataChanged", js.Any.fromFunction1(value))
    
    inline def setDataChangedUndefined: Self = StObject.set(x, "dataChanged", js.undefined)
    
    inline def setDataSorted(value: (/* sorters */ js.Array[SorterFromTable], /* rows */ js.Array[RowComponent]) => Unit): Self = StObject.set(x, "dataSorted", js.Any.fromFunction2(value))
    
    inline def setDataSortedUndefined: Self = StObject.set(x, "dataSorted", js.undefined)
    
    inline def setDataSorting(value: /* sorters */ js.Array[SorterFromTable] => Unit): Self = StObject.set(x, "dataSorting", js.Any.fromFunction1(value))
    
    inline def setDataSortingUndefined: Self = StObject.set(x, "dataSorting", js.undefined)
    
    inline def setFooterElement(value: String | HTMLElement): Self = StObject.set(x, "footerElement", value.asInstanceOf[js.Any])
    
    inline def setFooterElementUndefined: Self = StObject.set(x, "footerElement", js.undefined)
    
    inline def setHeight(value: String | Double | `false`): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHtmlImported(value: /* callback */ js.Function0[Unit] => Unit): Self = StObject.set(x, "htmlImported", js.Any.fromFunction1(value))
    
    inline def setHtmlImportedUndefined: Self = StObject.set(x, "htmlImported", js.undefined)
    
    inline def setHtmlImporting(value: /* callback */ js.Function0[Unit] => Unit): Self = StObject.set(x, "htmlImporting", js.Any.fromFunction1(value))
    
    inline def setHtmlImportingUndefined: Self = StObject.set(x, "htmlImporting", js.undefined)
    
    inline def setInvalidOptionWarnings(value: Boolean): Self = StObject.set(x, "invalidOptionWarnings", value.asInstanceOf[js.Any])
    
    inline def setInvalidOptionWarningsUndefined: Self = StObject.set(x, "invalidOptionWarnings", js.undefined)
    
    inline def setKeybindings(value: `false` | KeyBinding): Self = StObject.set(x, "keybindings", value.asInstanceOf[js.Any])
    
    inline def setKeybindingsUndefined: Self = StObject.set(x, "keybindings", js.undefined)
    
    inline def setMaxHeight(value: String | Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMinHeight(value: String | Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setPageLoaded(value: /* pageno */ Double => Unit): Self = StObject.set(x, "pageLoaded", js.Any.fromFunction1(value))
    
    inline def setPageLoadedUndefined: Self = StObject.set(x, "pageLoaded", js.undefined)
    
    inline def setPlaceholder(value: String | HTMLElement): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setReactiveData(value: Boolean): Self = StObject.set(x, "reactiveData", value.asInstanceOf[js.Any])
    
    inline def setReactiveDataUndefined: Self = StObject.set(x, "reactiveData", js.undefined)
    
    inline def setRenderComplete(value: () => Unit): Self = StObject.set(x, "renderComplete", js.Any.fromFunction0(value))
    
    inline def setRenderCompleteUndefined: Self = StObject.set(x, "renderComplete", js.undefined)
    
    inline def setRenderHorizontal(value: RenderMode): Self = StObject.set(x, "renderHorizontal", value.asInstanceOf[js.Any])
    
    inline def setRenderHorizontalUndefined: Self = StObject.set(x, "renderHorizontal", js.undefined)
    
    inline def setRenderStarted(value: () => Unit): Self = StObject.set(x, "renderStarted", js.Any.fromFunction0(value))
    
    inline def setRenderStartedUndefined: Self = StObject.set(x, "renderStarted", js.undefined)
    
    inline def setRenderVertical(value: RenderMode): Self = StObject.set(x, "renderVertical", value.asInstanceOf[js.Any])
    
    inline def setRenderVerticalBuffer(value: Boolean | Double): Self = StObject.set(x, "renderVerticalBuffer", value.asInstanceOf[js.Any])
    
    inline def setRenderVerticalBufferUndefined: Self = StObject.set(x, "renderVerticalBuffer", js.undefined)
    
    inline def setRenderVerticalUndefined: Self = StObject.set(x, "renderVertical", js.undefined)
    
    inline def setScrollHorizontal(value: /* left */ Any => Unit): Self = StObject.set(x, "scrollHorizontal", js.Any.fromFunction1(value))
    
    inline def setScrollHorizontalUndefined: Self = StObject.set(x, "scrollHorizontal", js.undefined)
    
    inline def setScrollVertical(value: /* top */ Any => Unit): Self = StObject.set(x, "scrollVertical", js.Any.fromFunction1(value))
    
    inline def setScrollVerticalUndefined: Self = StObject.set(x, "scrollVertical", js.undefined)
    
    inline def setTableBuilding(value: () => Unit): Self = StObject.set(x, "tableBuilding", js.Any.fromFunction0(value))
    
    inline def setTableBuildingUndefined: Self = StObject.set(x, "tableBuilding", js.undefined)
    
    inline def setTableBuilt(value: () => Unit): Self = StObject.set(x, "tableBuilt", js.Any.fromFunction0(value))
    
    inline def setTableBuiltUndefined: Self = StObject.set(x, "tableBuilt", js.undefined)
    
    inline def setTextDirection(value: TextDirection): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
    
    inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
    
    inline def setValidationMode(value: blocking | highlight | manual): Self = StObject.set(x, "validationMode", value.asInstanceOf[js.Any])
    
    inline def setValidationModeUndefined: Self = StObject.set(x, "validationMode", js.undefined)
  }
}
