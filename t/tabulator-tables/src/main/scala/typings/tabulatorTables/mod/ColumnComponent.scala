package typings.tabulatorTables.mod

import typings.std.HTMLElement
import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import typings.tabulatorTables.tabulatorTablesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnComponent
  extends StObject
     with _ColumnLookup {
  
  /** The delete function deletes the column, removing it from the table. */
  def delete(): js.Promise[Unit] = js.native
  
  /** The getCells function returns an array of CellComponent objects, one for each cell in the column. */
  def getCells(): js.Array[CellComponent] = js.native
  
  /** The getDefinition function returns the column definition object for the column. */
  def getDefinition(): ColumnDefinition = js.native
  
  /** The getElement function returns the DOM node for the colum. */
  def getElement(): HTMLElement = js.native
  
  /** The getField function returns the field name for the column. */
  def getField(): String = js.native
  
  /** Get the current header filter value of a column. */
  def getHeaderFilterValue(): Any = js.native
  
  /** The getNextColumn function returns the Column Component for the next visible column in the table, if there is no next column it will return a value of false. */
  def getNextColumn(): ColumnComponent | `false` = js.native
  
  /** The getParentColumn function returns the ColumnComponent for the parent column of this column. if no parent exists, this function will return false. */
  def getParentColumn(): ColumnComponent | `false` = js.native
  
  /** The getPrevColumn function returns the Column Component for the previous visible column in the table, if there is no previous column it will return a value of false. */
  def getPrevColumn(): ColumnComponent | `false` = js.native
  
  /** The getSubColumns function returns an array of ColumnComponent objects, one for each sub column of this column. */
  def getSubColumns(): js.Array[ColumnComponent] = js.native
  
  /** The getTable function returns the Tabulator object for the table containing the column. */
  def getTable(): Tabulator = js.native
  
  /** Returns the width of the column in pixels */
  def getWidth(): Double = js.native
  
  /** The headerFilterFocus function will place focus on the header filter element for this column if it exists. */
  def headerFilterFocus(): Unit = js.native
  
  /** The hide function hides the column if it is visible. */
  def hide(): Unit = js.native
  
  /** The isVisible function returns a boolean to show if the column is visible, a value of true means it is visible. */
  def isVisible(): Boolean = js.native
  
  /** You can move a column component next to another column using the move function. */
  def move(toColumn: ColumnLookup, after: Boolean): Unit = js.native
  
  def popup(contents: String, position: PopupPosition): Unit = js.native
  
  /** The reloadHeaderFilter function rebuilds the header filter element, updating any params passed into the editor used to generate the filter. */
  def reloadHeaderFilter(): Unit = js.native
  
  /** The scrollTo function will scroll the table to the column if it is visible. */
  def scrollTo(): js.Promise[Unit] = js.native
  
  /** The setHeaderFilterValue function set the value of the columns header filter element to the value provided in the first argument. */
  def setHeaderFilterValue(value: Any): Unit = js.native
  
  /** You can set the width of a column using the setWidth function, passing the width of the column in pixes as an integer as the first argument.Passing a value of true to the function will resize the column to fit its contents */
  def setWidth(width: Double): Unit = js.native
  @JSName("setWidth")
  def setWidth_true(width: `true`): Unit = js.native
  
  /** The show function shows the column if it is hidden. */
  def show(): Unit = js.native
  
  /** The toggle function toggles the visibility of the column, switching between hidden and visible. */
  def toggle(): Unit = js.native
  
  /** Update the definition of a column. It is worth noting that using this function actually replaces the old column with a totally new column component, therefore any references to the previous column component will no longer work after this function has been run. The function will return a promise that will resolve when the column has been updated, passing in the updated column component as an argument. */
  def updateDefinition(definition: ColumnDefinition): js.Promise[ColumnComponent] = js.native
  
  /**
    * You can validate a column
    *
    * This will return a value of true if every cell passes validation, if any cells fail, then it will return an array of Cell Components representing each cell in that column that has failed validation.
    */
  def validate(): `true` | js.Array[CellComponent] = js.native
}
