package typings.tabulatorTables.Tabulator

import typings.std.HTMLElement
import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import typings.tabulatorTables.tabulatorTablesStrings.blocking
import typings.tabulatorTables.tabulatorTablesStrings.highlight
import typings.tabulatorTables.tabulatorTablesStrings.hover
import typings.tabulatorTables.tabulatorTablesStrings.load
import typings.tabulatorTables.tabulatorTablesStrings.manual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsGeneral extends js.Object {
  
  // Not listed in options--------------------
  /** Tabulator will automatically attempt to redraw the data contained in the table if the containing element for the table is resized. To disable this functionality, set the autoResize property to false */
  var autoResize: js.UndefOr[Boolean] = js.native
  
  /** The dataChanged callback is triggered whenever the table data is changed by the user. Triggers for this include editing any cell in the table, adding a row and deleting a row. */
  var dataChanged: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  
  /** The dataLoaded callback is triggered when a new set of data is loaded into the table. */
  var dataLoaded: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  
  /** The dataLoading callback is triggered whenever new data is loaded into the table. */
  var dataLoading: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  
  /** The dataSorted callback is triggered after the table dataset is sorted. */
  var dataSorted: js.UndefOr[
    js.Function2[/* sorters */ js.Array[Sorter], /* rows */ js.Array[RowComponent], Unit]
  ] = js.native
  
  /** The dataSorting callback is triggered whenever a sort event occurs, before sorting happens. */
  var dataSorting: js.UndefOr[js.Function1[/* sorters */ js.Array[Sorter], Unit]] = js.native
  
  /** Footer  element to display for the table     */
  var footerElement: js.UndefOr[String | HTMLElement] = js.native
  
  /** Sets the height of the containing element, can be set to any valid height css value. If set to false (the default), the height of the table will resize to fit the table data.     */
  var height: js.UndefOr[String | Double | `false`] = js.native
  
  /** The htmlImported callback is triggered when Tabulator finishes importing data from an HTML table. */
  var htmlImported: js.UndefOr[EmptyCallback] = js.native
  
  /** The htmlImporting callback is triggered when Tabulator starts importing data from an HTML table. */
  var htmlImporting: js.UndefOr[EmptyCallback] = js.native
  
  /** Setting the invalidOptionWarnings option to false will disable console warning messages for invalid properties in the table constructor and column definition object */
  var invalidOptionWarnings: js.UndefOr[Boolean] = js.native
  
  /** Keybinding configuration object     */
  var keybindings: js.UndefOr[`false` | KeyBinding] = js.native
  
  /** Can be set to any valid CSS value. By setting this you can allow your table to expand to fit the data, but not overflow its parent element. Whene there are too many rows to fit in the available space, the vertical scroll bar will be shown. This has the added benefit of improving load times on larger tables */
  var maxHeight: js.UndefOr[String | Double] = js.native
  
  /** With a variable table height you can set the minimum height of the table either defined in the min-height CSS property for the element or set it using the minHeight option in the table constructor, this can be set to any valid CSS value  */
  var minHeight: js.UndefOr[String | Double] = js.native
  
  /** Whenever a page has been loaded, the pageLoaded callback is called, passing the current page number as an argument. */
  var pageLoaded: js.UndefOr[js.Function1[/* pageno */ Double, Unit]] = js.native
  
  /** placeholder element to display on empty table     */
  var placeholder: js.UndefOr[String | HTMLElement] = js.native
  
  /** * The reactivity systems allow Tabulator to watch arrays and objects passed into the table for changes and then automatically update the table.
    This approach means you no longer need to worry about calling a number of different functions on the table to make changes, you simply update the array or object you originally passed into the table and Tabulator will take care of the rest.
    You can enable reactive data by setting the reactiveData option to true in the table constructor, and then passing your data array to the data option.
    Once the table is built any changes to the array will automatically be replicated to the table without needing to call any functions on the table itself*/
  var reactiveData: js.UndefOr[Boolean] = js.native
  
  /** The renderComplete callback is triggered after the table has been rendered */
  var renderComplete: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** The renderStarted callback is triggered whenever all the rows in the table are about to be rendered. This can include:
    Data is loaded into the table when setData is called
    A page is loaded through any form of pagination
    Rows are added to the table during progressive rendering
    Columns are changed by setColumns
    The data is filtered
    The data is sorted
    The redraw function is called */
  var renderStarted: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** Callback is triggered when the table is horizontally scrolled. */
  var scrollHorizontal: js.UndefOr[js.Function1[/* left */ js.Any, Unit]] = js.native
  
  /** Callback is triggered when the table is vertically scrolled. */
  var scrollVertical: js.UndefOr[js.Function1[/* top */ js.Any, Unit]] = js.native
  
  /** When a the tabulator constructor is called, the tableBuilding callback will triggered */
  var tableBuilding: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** When a the tabulator constructor is called and the table has finished being rendered, the tableBuilt callback will triggered: */
  var tableBuilt: js.UndefOr[js.Function0[Unit]] = js.native
  
  var textDirection: js.UndefOr[TextDirection] = js.native
  
  /** When to regenerate cell tooltip value     */
  var tooltipGenerationMode: js.UndefOr[load | hover] = js.native
  
  /** Function to generate tooltips for cells     */
  var tooltips: js.UndefOr[GlobalTooltipOption] = js.native
  
  /**There are now three different validation modes available to customise the validation experience:
    blocking - if a user enters an invalid value while editing, they are blocked from leaving the cell until a valid value is entered (default)
    
    highlight - if a user enters an invalid value, then the edit will complete as usual and they are allowed to exit the cell but a highlight is applied to the cell using the tabulator-validation-fail class
    
    manual - no vaildation is automatically performed on edit, but it can be triggered by calling the validate funtion on the table or any Component Object */
  var validationMode: js.UndefOr[blocking | highlight | manual] = js.native
  
  /** Enable rendering using the Virtual DOM engine     */
  var virtualDom: js.UndefOr[Boolean] = js.native
  
  /** Manually set the size of the virtual DOM buffer     */
  var virtualDomBuffer: js.UndefOr[Boolean | Double] = js.native
  
  var virtualDomHoz: js.UndefOr[Boolean] = js.native
}
object OptionsGeneral {
  
  @scala.inline
  def apply(): OptionsGeneral = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsGeneral]
  }
  
  @scala.inline
  implicit class OptionsGeneralOps[Self <: OptionsGeneral] (val x: Self) extends AnyVal {
    
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
    def setAutoResize(value: Boolean): Self = this.set("autoResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoResize: Self = this.set("autoResize", js.undefined)
    
    @scala.inline
    def setDataChanged(value: /* data */ js.Any => Unit): Self = this.set("dataChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataChanged: Self = this.set("dataChanged", js.undefined)
    
    @scala.inline
    def setDataLoaded(value: /* data */ js.Any => Unit): Self = this.set("dataLoaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataLoaded: Self = this.set("dataLoaded", js.undefined)
    
    @scala.inline
    def setDataLoading(value: /* data */ js.Any => Unit): Self = this.set("dataLoading", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataLoading: Self = this.set("dataLoading", js.undefined)
    
    @scala.inline
    def setDataSorted(value: (/* sorters */ js.Array[Sorter], /* rows */ js.Array[RowComponent]) => Unit): Self = this.set("dataSorted", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDataSorted: Self = this.set("dataSorted", js.undefined)
    
    @scala.inline
    def setDataSorting(value: /* sorters */ js.Array[Sorter] => Unit): Self = this.set("dataSorting", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataSorting: Self = this.set("dataSorting", js.undefined)
    
    @scala.inline
    def setFooterElement(value: String | HTMLElement): Self = this.set("footerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterElement: Self = this.set("footerElement", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double | `false`): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHtmlImported(value: /* callback */ js.Function0[Unit] => Unit): Self = this.set("htmlImported", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHtmlImported: Self = this.set("htmlImported", js.undefined)
    
    @scala.inline
    def setHtmlImporting(value: /* callback */ js.Function0[Unit] => Unit): Self = this.set("htmlImporting", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHtmlImporting: Self = this.set("htmlImporting", js.undefined)
    
    @scala.inline
    def setInvalidOptionWarnings(value: Boolean): Self = this.set("invalidOptionWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidOptionWarnings: Self = this.set("invalidOptionWarnings", js.undefined)
    
    @scala.inline
    def setKeybindings(value: `false` | KeyBinding): Self = this.set("keybindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeybindings: Self = this.set("keybindings", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: String | Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMinHeight(value: String | Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setPageLoaded(value: /* pageno */ Double => Unit): Self = this.set("pageLoaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePageLoaded: Self = this.set("pageLoaded", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String | HTMLElement): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setReactiveData(value: Boolean): Self = this.set("reactiveData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReactiveData: Self = this.set("reactiveData", js.undefined)
    
    @scala.inline
    def setRenderComplete(value: () => Unit): Self = this.set("renderComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderComplete: Self = this.set("renderComplete", js.undefined)
    
    @scala.inline
    def setRenderStarted(value: () => Unit): Self = this.set("renderStarted", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderStarted: Self = this.set("renderStarted", js.undefined)
    
    @scala.inline
    def setScrollHorizontal(value: /* left */ js.Any => Unit): Self = this.set("scrollHorizontal", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScrollHorizontal: Self = this.set("scrollHorizontal", js.undefined)
    
    @scala.inline
    def setScrollVertical(value: /* top */ js.Any => Unit): Self = this.set("scrollVertical", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScrollVertical: Self = this.set("scrollVertical", js.undefined)
    
    @scala.inline
    def setTableBuilding(value: () => Unit): Self = this.set("tableBuilding", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteTableBuilding: Self = this.set("tableBuilding", js.undefined)
    
    @scala.inline
    def setTableBuilt(value: () => Unit): Self = this.set("tableBuilt", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteTableBuilt: Self = this.set("tableBuilt", js.undefined)
    
    @scala.inline
    def setTextDirection(value: TextDirection): Self = this.set("textDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDirection: Self = this.set("textDirection", js.undefined)
    
    @scala.inline
    def setTooltipGenerationMode(value: load | hover): Self = this.set("tooltipGenerationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipGenerationMode: Self = this.set("tooltipGenerationMode", js.undefined)
    
    @scala.inline
    def setTooltipsFunction1(value: /* cell */ CellComponent => String): Self = this.set("tooltips", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTooltips(value: GlobalTooltipOption): Self = this.set("tooltips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltips: Self = this.set("tooltips", js.undefined)
    
    @scala.inline
    def setValidationMode(value: blocking | highlight | manual): Self = this.set("validationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationMode: Self = this.set("validationMode", js.undefined)
    
    @scala.inline
    def setVirtualDom(value: Boolean): Self = this.set("virtualDom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualDom: Self = this.set("virtualDom", js.undefined)
    
    @scala.inline
    def setVirtualDomBuffer(value: Boolean | Double): Self = this.set("virtualDomBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualDomBuffer: Self = this.set("virtualDomBuffer", js.undefined)
    
    @scala.inline
    def setVirtualDomHoz(value: Boolean): Self = this.set("virtualDomHoz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualDomHoz: Self = this.set("virtualDomHoz", js.undefined)
  }
}
