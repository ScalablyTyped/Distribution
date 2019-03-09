package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnComponent extends _ColumnLookup {
  /** The delete function deletes the column, removing it from the table*/
  def delete(): scala.Unit
  /** The getCells function returns an array of CellComponent objects, one for each cell in the column.*/
  def getCells(): js.Array[CellComponent]
  /** The getDefinition function returns the column definition object for the column.*/
  def getDefinition(): ColumnDefinition
  /*The getElement function returns the DOM node for the colum*/
  def getElement(): stdLib.HTMLElement
  /** The getField function returns the field name for the column.*/
  def getField(): java.lang.String
  /** The getNextColumn function returns the Column Component for the next visible column in the table, if there is no next column it will return a value of false. */
  def getNextColumn(): ColumnComponent | tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`false`
  /** The getParentColumn function returns the ColumnComponent for the parent column of this column. if no parent exists, this function will return false */
  def getParentColumn(): ColumnComponent | tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`false`
  /** The getPrevColumn function returns the Column Component for the previous visible column in the table, if there is no previous column it will return a value of false. */
  def getPrevColumn(): ColumnComponent | tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`false`
  /** The getSubColumns function returns an array of ColumnComponent objects, one for each sub column of this column. */
  def getSubColumns(): js.Array[ColumnComponent]
  /** The getTable function returns the Tabulator object for the table containing the column */
  def getTable(): tabulatorDashTablesLib.Tabulator
  /** The getVisibility function returns a boolean to show if the column is visible, a value of true means it is visible.*/
  def getVisibility(): scala.Boolean
  /** The headerFilterFocus function will place focus on the header filter element for this column if it exists. */
  def headerFilterFocus(): scala.Unit
  /** The hide function hides the column if it is visible.*/
  def hide(): scala.Unit
  /** The reloadHeaderFilter function rebuilds the header filter element, updating any params passed into the editor used to generate the filter. */
  def reloadHeaderFilter(): scala.Unit
  /** The scrollTo function will scroll the table to the column if it is visible. */
  def scrollTo(): js.Promise[scala.Unit]
  /** The setHeaderFilterValue function set the value of the columns header filter element to the value provided in the first argument. */
  def setHeaderFilterValue(value: js.Any): scala.Unit
  /** The show function shows the column if it is hidden.*/
  def show(): scala.Unit
  /** The toggle function toggles the visibility of the column, switching between hidden and visible.*/
  def toggle(): scala.Unit
}

object ColumnComponent {
  @scala.inline
  def apply(
    delete: js.Function0[scala.Unit],
    getCells: js.Function0[js.Array[CellComponent]],
    getDefinition: js.Function0[ColumnDefinition],
    getElement: js.Function0[stdLib.HTMLElement],
    getField: js.Function0[java.lang.String],
    getNextColumn: js.Function0[ColumnComponent | tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`false`],
    getParentColumn: js.Function0[ColumnComponent | tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`false`],
    getPrevColumn: js.Function0[ColumnComponent | tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`false`],
    getSubColumns: js.Function0[js.Array[ColumnComponent]],
    getTable: js.Function0[tabulatorDashTablesLib.Tabulator],
    getVisibility: js.Function0[scala.Boolean],
    headerFilterFocus: js.Function0[scala.Unit],
    hide: js.Function0[scala.Unit],
    reloadHeaderFilter: js.Function0[scala.Unit],
    scrollTo: js.Function0[js.Promise[scala.Unit]],
    setHeaderFilterValue: js.Function1[js.Any, scala.Unit],
    show: js.Function0[scala.Unit],
    toggle: js.Function0[scala.Unit]
  ): ColumnComponent = {
    val __obj = js.Dynamic.literal(delete = delete, getCells = getCells, getDefinition = getDefinition, getElement = getElement, getField = getField, getNextColumn = getNextColumn, getParentColumn = getParentColumn, getPrevColumn = getPrevColumn, getSubColumns = getSubColumns, getTable = getTable, getVisibility = getVisibility, headerFilterFocus = headerFilterFocus, hide = hide, reloadHeaderFilter = reloadHeaderFilter, scrollTo = scrollTo, setHeaderFilterValue = setHeaderFilterValue, show = show, toggle = toggle)
  
    __obj.asInstanceOf[ColumnComponent]
  }
}

