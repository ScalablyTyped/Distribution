package typings.tabulatorTables.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellComponent extends StObject {
  
  /** You and programmatically cancel a cell edit that is currently in progress by calling the cancelEdit function. */
  def cancelEdit(): Unit = js.native
  
  /** If you are making manual adjustments to elements contained withing the cell, or the cell itself, it may sometimes be necessary to recalculate the height of all the cells in the row to make sure they remain aligned. Call the checkHeight function to check if the height of the cell has changed and normalize the row if it has. */
  def checkHeight(): Unit = js.native
  
  /** The clearEdited can be called on a Cell Component to clear the edited flag used by the isEdited function and mark the cell as unedited. */
  def clearEdited(): Unit = js.native
  
  /** The clearValidation can be called on a Cell Component to clear the invalid flag used by the isValid function and mark the cell as valid. */
  def clearValidation(): Unit = js.native
  
  /** You and programmatically cause a cell to open its editor element using the edit function. */
  def edit(): Unit = js.native
  def edit(ignoreEditable: Boolean): Unit = js.native
  
  /** The getColumn function returns the ColumnComponent for the column that contains the cell. */
  def getColumn(): ColumnComponent = js.native
  
  /** The getData function returns the data for the row that contains the cell. */
  def getData(): js.Object = js.native
  
  /** The getElement function returns the DOM node for the cell. */
  def getElement(): HTMLElement = js.native
  
  /** The getField function returns the field name for the column that contains the cell. */
  def getField(): String = js.native
  
  def getInitialValue(): Any = js.native
  
  /** The getOldValue function returns the previous value of the cell. Very useful in the event of cell update callbacks. */
  def getOldValue(): Any = js.native
  
  /** The getRow function returns the RowComponent for the row that contains the cell. */
  def getRow(): RowComponent = js.native
  
  /** The getTable function returns the Tabulator object for the table containing the cell. */
  def getTable(): Tabulator = js.native
  
  /** The getValue function returns the current value for the cell. */
  def getValue(): Any = js.native
  
  /** You can call the isEdited function on any Cell Component to see if it has been edited. it will return true if it has been edited or false if it has not. */
  def isEdited(): Boolean = js.native
  
  /** The isValid can be called on a Cell Component to check if a cell has previously passed a validation check without revalidating it. Returns true if the cell passes validation, or an array of failed validators if it fails validation. */
  def isValid(): Boolean | js.Array[Validator] = js.native
  
  /** down - move to the same cell in the row below */
  def navigateDown(): Unit = js.native
  
  /** left - next editable cell on the left, return false if none available on row */
  def navigateLeft(): Boolean = js.native
  
  /** next - next editable cell on the right, if none available move to left most editable cell on the row below */
  def navigateNext(): Boolean = js.native
  
  /** When a cell is being edited it is possible to move the editor focus from the current cell to one if its neighbors. There are a number of functions that can be called on the nav function to move the focus in different directions. */
  /** prev - next editable cell on the left, if none available move to the right most editable cell on the row above. */
  def navigatePrev(): Boolean = js.native
  
  /** right - next editable cell on the right, return false if none available on row */
  def navigateRight(): Boolean = js.native
  
  /** up - move to the same cell in the row above. */
  def navigateUp(): Unit = js.native
  
  def restoreInitialValue(): Any = js.native
  
  /** The restoreOldValue reverts the value of the cell back to its previous value, without triggering any of the cell edit callbacks. */
  def restoreOldValue(): Any = js.native
  
  /** You can change the value of the cell using the setValue function. The first parameter should be the new value for the cell, the second optional parameter will apply the column mutators to the value when set to true (default = true). */
  def setValue(value: Any): Unit = js.native
  def setValue(value: Any, mutate: Boolean): Unit = js.native
  
  /** You can validate a cell by calling the validate method on any Cell Component. Returns true if the cell passes validation, or an array of failed validators if it fails validation. */
  def validate(): Boolean | js.Array[Validator] = js.native
}
