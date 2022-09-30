package typings.tabulatorTables.mod

import typings.std.HTMLElement
import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import typings.tabulatorTables.tabulatorTablesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowComponent
  extends StObject
     with CalculationComponent {
  
  /**
    * Add child rows to a data tree row
    *
    * The first argument should be a row data object. If you do not pass data for a column, it will be left empty. To create a blank row (ie for a user to fill in), pass an empty object to the function.
    *
    * The second argument is optional and determines whether the row is added to the top or bottom of the array of child rows. A value of true will add the row to the top of the array, a value of false will add the row to the bottom of the array. If the parameter is not set the row will be placed according to the addRowPos global option.
    *
    * If you want to add the row next to an existing row you can pass an optional third argument to the function that will position the new row next to the specified row (above or below based on the value of the second argument). This argument will take any of the standard row component look up options. This must be a row that has the same parent as the row you want to add
    */
  def addTreeChild(rowData: js.Object): Unit = js.native
  def addTreeChild(rowData: js.Object, position: Boolean): Unit = js.native
  def addTreeChild(rowData: js.Object, position: Boolean, existingRow: RowComponent): Unit = js.native
  def addTreeChild(rowData: js.Object, position: Unit, existingRow: RowComponent): Unit = js.native
  
  /**
    * The delete function deletes the row, removing its data from the table
    *
    * The delete method returns a promise, this can be used to run any other commands that have to be run after the row has been deleted. By running them in the promise you ensure they are only run after the row has been deleted.
    */
  def delete(): js.Promise[Unit] = js.native
  
  /** The deselect function will deselect the current row. */
  def deselect(): Unit = js.native
  
  /** You can freeze a row at the top of the table by calling the freeze function. This will insert the row above the scrolling portion of the table in the table header. */
  def freeze(): Unit = js.native
  
  /** When using grouped rows, you can retrieve the group component for the current row using the getGroup function. */
  def getGroup(): GroupComponent = js.native
  
  /** The getIndex function returns the index value for the row. (this is the value from the defined index column, NOT the row's position in the table). */
  def getIndex(): Any = js.native
  
  /** The getNextRow function returns the Row Component for the next visible row in the table, if there is no next row it will return a value of false. */
  def getNextRow(): RowComponent | `false` = js.native
  
  /**
    * Use the getPosition function to retrieve the numerical position of a row in the table. By default this will return the position of the row in all data, including data currently filtered out of the table.
    *
    * If you want to get the position of the row in the currently filtered/sorted data, you can pass a value of true to the optional first argument of the function.
    */
  def getPosition(): Double | `false` = js.native
  def getPosition(filteredPosition: Boolean): Double | `false` = js.native
  
  /** The getNextRow function returns the Row Component for the previous visible row in the table, if there is no next row it will return a value of false. */
  def getPrevRow(): RowComponent | `false` = js.native
  
  /** When the tree structure is enabled the getTreeChildren function will return an array of Row Components for this rows children. */
  def getTreeChildren(): js.Array[RowComponent] = js.native
  
  /** When the tree structure is enabled the getTreeParent function will return the Row Component for the parent of this row. If no parent exists, a value of false will be returned. */
  def getTreeParent(): RowComponent | `false` = js.native
  
  /** The isFrozen function on a Row Component will return a boolean representing the current frozen state of the row. */
  def isFrozen(): Boolean = js.native
  
  /** The isSelected function will return a boolean representing the current selected state of the row. */
  def isSelected(): Boolean = js.native
  
  /** Returns a value indicating if the current row is expanded. */
  def isTreeExpanded(): Boolean = js.native
  
  def move(lookup: Double): Unit = js.native
  def move(lookup: Double, belowTarget: Boolean): Unit = js.native
  def move(lookup: HTMLElement): Unit = js.native
  def move(lookup: HTMLElement, belowTarget: Boolean): Unit = js.native
  /**
    * You can move a row next to another row using the move function.
    *
    * The first argument should be the target row that you want to move to, and can be any of the standard row component look up options.
    *
    * The second argument determines whether the row is moved to above or below the target row. A value of false will cause to the row to be placed below the target row, a value of true will result in the row being placed above the target
    */
  def move(lookup: RowComponent): Unit = js.native
  def move(lookup: RowComponent, belowTarget: Boolean): Unit = js.native
  
  /** If you are making manual adjustments to elements contained within the row, it may sometimes be necessary to recalculate the height of all the cells in the row to make sure they remain aligned. Call the normalizeHeight function to do this. */
  def normalizeHeight(): Unit = js.native
  
  /** The pageTo function will load the page for the row if it passes the current filters. */
  def pageTo(): js.Promise[Unit] = js.native
  
  /** If you want to re-format a row once it has been rendered to re-trigger the cell formatters and the rowFormatter callback, Call the reformat function. */
  def reformat(): Unit = js.native
  
  /** The scrollTo function will scroll the table to the row if it passes the current filters. */
  def scrollTo(): js.Promise[Unit] = js.native
  
  /** The select function will select the current row. */
  def select(): Unit = js.native
  
  /** The deselect function will toggle the current row. */
  def toggleSelect(): Unit = js.native
  
  /** When the tree structure is enabled the treeCollapse function will collapse current row and hide its children. */
  def treeCollapse(): Unit = js.native
  
  /** When the tree structure is enabled the treeExpand function will expand current row and show its children. */
  def treeExpand(): Unit = js.native
  
  /** When the tree structure is enabled the treeToggle function will toggle the collapsed state of the current row. */
  def treeToggle(): Unit = js.native
  
  /** A frozen row can be unfrozen using the unfreeze function. This will remove the row from the table header and re-insert it back in the table. */
  def unfreeze(): Unit = js.native
  
  /** You can update the data in the row using the update function. You should pass an object to the function containing any fields you wish to update. This object will not replace the row data, only the fields included in the object will be updated. */
  def update(data: js.Object): js.Promise[Unit] = js.native
  
  /**
    * You can validate the whole table in one go by calling the validate method on the table instance.
    *
    * This will return a value of true if every cell passes validation, if any cells fail, then it will return an array of Cell Components representing each cell in that row that has failed validation.
    */
  def validate(): `true` | js.Array[CellComponent] = js.native
}
