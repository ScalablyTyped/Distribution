package typings.uiDashGrid.uiDashGridMod.cellNav

import typings.std.Number
import typings.uiDashGrid.uiDashGridMod.IGridColumnOf
import typings.uiDashGrid.uiDashGridMod.IGridRowOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowCol[TEntity] extends js.Object {
  var col: IGridColumnOf[TEntity]
  var row: IGridRowOf[TEntity]
  /**
    * Gets the intersection of where the row and column meet.
    * @returns The value from the grid data that this RowCol points to.  If the column has a cellFilter this
    *          will also apply the filter to it and return the value that the filter displays
    */
  def getIntersectionValueFiltered(): String | Number | js.Object
  /**
    * Gets the intersection of where the row and column meet
    * @returns The value from the grid data that this RowCol points to.  If the column has a cellFilter this
    *          will NOT return the filtered value.
    */
  def getIntersectionValueRaw(): String | Number | js.Object
}

object IRowCol {
  @scala.inline
  def apply[TEntity](
    col: IGridColumnOf[TEntity],
    getIntersectionValueFiltered: () => String | Number | js.Object,
    getIntersectionValueRaw: () => String | Number | js.Object,
    row: IGridRowOf[TEntity]
  ): IRowCol[TEntity] = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], getIntersectionValueFiltered = js.Any.fromFunction0(getIntersectionValueFiltered), getIntersectionValueRaw = js.Any.fromFunction0(getIntersectionValueRaw), row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRowCol[TEntity]]
  }
}

