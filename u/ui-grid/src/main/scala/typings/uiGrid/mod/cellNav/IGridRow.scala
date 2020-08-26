package typings.uiGrid.mod.cellNav

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridRow extends js.Object {
  /**
    * Enable focus on a cell within this row. If set to false then no cells in this row can be focused
    * Group header rows, for example, would set this to false.
    * Defaults to true
    */
  var allowCellFocus: js.UndefOr[Boolean] = js.native
}

object IGridRow {
  @scala.inline
  def apply(): IGridRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridRow]
  }
  @scala.inline
  implicit class IGridRowOps[Self <: IGridRow] (val x: Self) extends AnyVal {
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
    def setAllowCellFocus(value: Boolean): Self = this.set("allowCellFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowCellFocus: Self = this.set("allowCellFocus", js.undefined)
  }
  
}

