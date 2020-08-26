package typings.uiGrid.mod.edit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridRow extends js.Object {
  /** enable editing on row, grouping for example might disable editing on group header rows */
  var enableCellEdit: js.UndefOr[Boolean] = js.native
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
    def setEnableCellEdit(value: Boolean): Self = this.set("enableCellEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCellEdit: Self = this.set("enableCellEdit", js.undefined)
  }
  
}

