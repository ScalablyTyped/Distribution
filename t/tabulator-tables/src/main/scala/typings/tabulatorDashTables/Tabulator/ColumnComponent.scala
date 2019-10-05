package typings.tabulatorDashTables.Tabulator

import typings.std.HTMLElement
import typings.tabulatorDashTables.tabulatorDashTablesNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnComponent extends _ColumnLookup {
  /** The delete function deletes the column, removing it from the table*/
  def delete(): Unit
  /** The getCells function returns an array of CellComponent objects, one for each cell in the column.*/
  def getCells(): js.Array[CellComponent]
  /** The getDefinition function returns the column definition object for the column.*/
  def getDefinition(): ColumnDefinition
  /*The getElement function returns the DOM node for the colum*/
  def getElement(): HTMLElement
  /** The getField function returns the field name for the column.*/
  def getField(): String
  /** The getNextColumn function returns the Column Component for the next visible column in the table, if there is no next column it will return a value of false. */
  def getNextColumn(): ColumnComponent | `false`
  /** The getParentColumn function returns the ColumnComponent for the parent column of this column. if no parent exists, this function will return false */
  def getParentColumn(): ColumnComponent | `false`
  /** The getPrevColumn function returns the Column Component for the previous visible column in the table, if there is no previous column it will return a value of false. */
  def getPrevColumn(): ColumnComponent | `false`
  /** The getSubColumns function returns an array of ColumnComponent objects, one for each sub column of this column. */
  def getSubColumns(): js.Array[ColumnComponent]
  /** The getTable function returns the Tabulator object for the table containing the column */
  def getTable(): typings.tabulatorDashTables.Tabulator
  /** The getVisibility function returns a boolean to show if the column is visible, a value of true means it is visible.*/
  def getVisibility(): Boolean
  /** The headerFilterFocus function will place focus on the header filter element for this column if it exists. */
  def headerFilterFocus(): Unit
  /** The hide function hides the column if it is visible.*/
  def hide(): Unit
  /**You can move a column component next to another column using the move function */
  def move(toColumn: ColumnLookup, after: Boolean): Unit
  /** The reloadHeaderFilter function rebuilds the header filter element, updating any params passed into the editor used to generate the filter. */
  def reloadHeaderFilter(): Unit
  /** The scrollTo function will scroll the table to the column if it is visible. */
  def scrollTo(): js.Promise[Unit]
  /** The setHeaderFilterValue function set the value of the columns header filter element to the value provided in the first argument. */
  def setHeaderFilterValue(value: js.Any): Unit
  /** The show function shows the column if it is hidden.*/
  def show(): Unit
  /** The toggle function toggles the visibility of the column, switching between hidden and visible.*/
  def toggle(): Unit
}

object ColumnComponent {
  @scala.inline
  def apply(
    delete: () => Unit,
    getCells: () => js.Array[CellComponent],
    getDefinition: () => ColumnDefinition,
    getElement: () => HTMLElement,
    getField: () => String,
    getNextColumn: () => ColumnComponent | `false`,
    getParentColumn: () => ColumnComponent | `false`,
    getPrevColumn: () => ColumnComponent | `false`,
    getSubColumns: () => js.Array[ColumnComponent],
    getTable: () => typings.tabulatorDashTables.Tabulator,
    getVisibility: () => Boolean,
    headerFilterFocus: () => Unit,
    hide: () => Unit,
    move: (ColumnLookup, Boolean) => Unit,
    reloadHeaderFilter: () => Unit,
    scrollTo: () => js.Promise[Unit],
    setHeaderFilterValue: js.Any => Unit,
    show: () => Unit,
    toggle: () => Unit
  ): ColumnComponent = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), getCells = js.Any.fromFunction0(getCells), getDefinition = js.Any.fromFunction0(getDefinition), getElement = js.Any.fromFunction0(getElement), getField = js.Any.fromFunction0(getField), getNextColumn = js.Any.fromFunction0(getNextColumn), getParentColumn = js.Any.fromFunction0(getParentColumn), getPrevColumn = js.Any.fromFunction0(getPrevColumn), getSubColumns = js.Any.fromFunction0(getSubColumns), getTable = js.Any.fromFunction0(getTable), getVisibility = js.Any.fromFunction0(getVisibility), headerFilterFocus = js.Any.fromFunction0(headerFilterFocus), hide = js.Any.fromFunction0(hide), move = js.Any.fromFunction2(move), reloadHeaderFilter = js.Any.fromFunction0(reloadHeaderFilter), scrollTo = js.Any.fromFunction0(scrollTo), setHeaderFilterValue = js.Any.fromFunction1(setHeaderFilterValue), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
  
    __obj.asInstanceOf[ColumnComponent]
  }
}

