package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowComponent extends js.Object {
  /** The delete function deletes the row, removing its data from the table
    *
    * The delete method returns a promise, this can be used to run any other commands that have to be run after the row has been deleted. By running them in the promise you ensure they are only run after the row has been deleted.
    */
  def delete(): js.Promise[scala.Unit] = js.native
  /** The deselect function will deselect the current row.*/
  def deselect(): scala.Unit = js.native
  /** You can freeze a row at the top of the table by calling the freeze function. This will insert the row above the scrolling portion of the table in the table header. */
  def freeze(): scala.Unit = js.native
  def getCell(column: java.lang.String): CellComponent = js.native
  def getCell(column: stdLib.HTMLElement): CellComponent = js.native
  /** The getCell function returns the CellComponent for the specified column from this row.*/
  def getCell(column: ColumnComponent): CellComponent = js.native
  /** The getCells function returns an array of CellComponent objects, one for each cell in the row.*/
  def getCells(): js.Array[CellComponent] = js.native
  /** The getData function returns the data object for the row.*/
  def getData(): js.Any = js.native
  /** The getElement function returns the DOM node for the row.*/
  def getElement(): stdLib.HTMLElement = js.native
  /** When using grouped rows, you can retrieve the group component for the current row using the getGroup function. */
  def getGroup(): GroupComponent = js.native
  /** The getIndex function returns the index value for the row. (this is the value from the defined index column, NOT the row's position in the table)*/
  def getIndex(): js.Any = js.native
  /** The getNextRow function returns the Row Component for the next visible row in the table, if there is no next row it will return a value of false */
  def getNextRow(): RowComponent | tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`false` = js.native
  /** Use the getPosition function to retrieve the numerical position of a row in the table. By default this will return the position of the row in all data, including data currently filtered out of the table.
    If you want to get the position of the row in the currently filtered/sorted data, you can pass a value of true to the optional first argument of the function. */
  def getPosition(): scala.Double = js.native
  def getPosition(filteredPosition: scala.Boolean): scala.Double = js.native
  /** The getNextRow function returns the Row Component for the previous visible row in the table, if there is no next row it will return a value of false */
  def getPrevRow(): RowComponent | tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`false` = js.native
  /** The getTable function returns the Tabulator object for the table containing the row. */
  def getTable(): tabulatorDashTablesLib.Tabulator = js.native
  /** When the tree structure is enabled the getTreeChildren function will return an array of Row Components for this rows children. */
  def getTreeChildren(): js.Array[RowComponent] = js.native
  /** When the tree structure is enabled the getTreeParent function will return the Row Component for the parent of this row. If no parent exists, a value of false will be returned. */
  def getTreeParent(): RowComponent | tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`false` = js.native
  /** The isSelected function will return a boolean representing the current selected state of the row. */
  def isSelected(): scala.Boolean = js.native
  def move(lookup: scala.Double): scala.Unit = js.native
  def move(lookup: scala.Double, belowTarget: scala.Boolean): scala.Unit = js.native
  def move(lookup: stdLib.HTMLElement): scala.Unit = js.native
  def move(lookup: stdLib.HTMLElement, belowTarget: scala.Boolean): scala.Unit = js.native
  /**  You can move a row next to another row using the move function.
    The first argument should be the target row that you want to move to, and can be any of the standard row component look up options.
    The second argument determines whether the row is moved to above or below the target row. A value of false will cause to the row to be placed below the target row, a value of true will result in the row being placed above the target*/
  def move(lookup: RowComponent): scala.Unit = js.native
  def move(lookup: RowComponent, belowTarget: scala.Boolean): scala.Unit = js.native
  /** If you are making manual adjustments to elements contained within the row, it may sometimes be necessary to recalculate the height of all the cells in the row to make sure they remain aligned. Call the normalizeHeight function to do this.*/
  def normalizeHeight(): scala.Unit = js.native
  /** The pageTo function will load the page for the row if it passes the current filters.*/
  def pageTo(): js.Promise[scala.Unit] = js.native
  /** If you want to re-format a row once it has been rendered to re-trigger the cell formatters and the rowFormatter callback, Call the reformat function. */
  def reformat(): scala.Unit = js.native
  /** The scrollTo function will scroll the table to the row if it passes the current filters.*/
  def scrollTo(): js.Promise[scala.Unit] = js.native
  /** The select function will select the current row.*/
  def select(): scala.Unit = js.native
  /** The deselect function will toggle the current row.*/
  def toggleSelect(): scala.Unit = js.native
  /** When the tree structure is enabled the treeCollapse function will collapse current row and hide its children */
  def treeCollapse(): scala.Unit = js.native
  /** When the tree structure is enabled the treeExpand function will expand current row and show its children. */
  def treeExpand(): scala.Unit = js.native
  /** When the tree structure is enabled the treeToggle function will toggle the collapsed state of the current row. */
  def treeToggle(): scala.Unit = js.native
  /** A frozen row can be unfrozen using the unfreeze function. This will remove the row from the table header and re-insert it back in the table. */
  def unfreeze(): scala.Unit = js.native
  /** You can update the data in the row using the update function. You should pass an object to the function containing any fields you wish to update. This object will not replace the row data, only the fields included in the object will be updated.*/
  def update(data: js.Object): js.Promise[scala.Unit] = js.native
}

