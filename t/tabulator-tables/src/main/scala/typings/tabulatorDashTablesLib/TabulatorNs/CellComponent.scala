package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellComponent extends js.Object {
  /** You and programatically cancel a cell edit that is currently in progress by calling the cancelEdit function */
  def cancelEdit(): scala.Unit = js.native
  /** If you are making manual adjustments to elements contained withing the cell, or the cell itself, it may sometimes be necessary to recalculate the height of all the cells in the row to make sure they remain aligned. Call the checkHeight function to check if the height of the cell has changed and normalize the row if it has. */
  def checkHeight(): scala.Unit = js.native
  /** You and programatically cause a cell to open its editor element using the edit function */
  def edit(): scala.Unit = js.native
  def edit(ignoreEditable: scala.Boolean): scala.Unit = js.native
  /** The getColumn function returns the ColumnComponent for the column that contains the cell. */
  def getColumn(): ColumnComponent = js.native
  /** The getData function returns the data for the row that contains the cell. */
  def getData(): js.Object = js.native
  /** The getElement function returns the DOM node for the cell. */
  def getElement(): stdLib.HTMLElement = js.native
  /** The getField function returns the field name for the column that contains the cell. */
  def getField(): java.lang.String = js.native
  /** The getOldValue function returns the previous value of the cell. Very usefull in the event of cell update callbacks. */
  def getOldValue(): js.Any = js.native
  /** The getRow function returns the RowComponent for the row that contains the cell. */
  def getRow(): RowComponent = js.native
  /** The getTable function returns the Tabulator object for the table containing the cell. */
  def getTable(): tabulatorDashTablesLib.Tabulator = js.native
  /** The getValue function returns the current value for the cell. */
  def getValue(): js.Any = js.native
  /** When a cell is being edited it is possible to move the editor focus from the current cell to one if its neighbours. There are a number of functions that can be called on the nav function to move the focus in different directions. */
  def nav(): CellNavigation = js.native
  /** The restoreOldValue reverts the value of the cell back to its previous value, without triggering any of the cell edit callbacks. */
  def restoreOldValue(): js.Any = js.native
  /** You can change the value of the cell using the setValue function. The first parameter should be the new value for the cell, the second optional parameter will apply the column mutators to the value when set to true (default = true). */
  def setValue(value: js.Any): scala.Unit = js.native
  def setValue(value: js.Any, mutate: scala.Boolean): scala.Unit = js.native
}

