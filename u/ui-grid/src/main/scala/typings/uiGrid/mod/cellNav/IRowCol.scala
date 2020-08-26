package typings.uiGrid.mod.cellNav

import typings.std.Number
import typings.uiGrid.mod.IGridColumnOf
import typings.uiGrid.mod.IGridRowOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRowCol[TEntity] extends js.Object {
  var col: IGridColumnOf[TEntity] = js.native
  var row: IGridRowOf[TEntity] = js.native
  /**
    * Gets the intersection of where the row and column meet.
    * @returns The value from the grid data that this RowCol points to.  If the column has a cellFilter this
    *          will also apply the filter to it and return the value that the filter displays
    */
  def getIntersectionValueFiltered(): String | Number | js.Object = js.native
  /**
    * Gets the intersection of where the row and column meet
    * @returns The value from the grid data that this RowCol points to.  If the column has a cellFilter this
    *          will NOT return the filtered value.
    */
  def getIntersectionValueRaw(): String | Number | js.Object = js.native
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
  @scala.inline
  implicit class IRowColOps[Self <: IRowCol[_], TEntity] (val x: Self with IRowCol[TEntity]) extends AnyVal {
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
    def setCol(value: IGridColumnOf[TEntity]): Self = this.set("col", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetIntersectionValueFiltered(value: () => String | Number | js.Object): Self = this.set("getIntersectionValueFiltered", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIntersectionValueRaw(value: () => String | Number | js.Object): Self = this.set("getIntersectionValueRaw", js.Any.fromFunction0(value))
    @scala.inline
    def setRow(value: IGridRowOf[TEntity]): Self = this.set("row", value.asInstanceOf[js.Any])
  }
  
}

