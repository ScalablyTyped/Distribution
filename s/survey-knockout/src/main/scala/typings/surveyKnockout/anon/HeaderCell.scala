package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderCell extends js.Object {
  var cell: String = js.native
  var headerCell: String = js.native
  var root: String = js.native
}

object HeaderCell {
  @scala.inline
  def apply(cell: String, headerCell: String, root: String): HeaderCell = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], headerCell = headerCell.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderCell]
  }
  @scala.inline
  implicit class HeaderCellOps[Self <: HeaderCell] (val x: Self) extends AnyVal {
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
    def setCell(value: String): Self = this.set("cell", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderCell(value: String): Self = this.set("headerCell", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
  }
  
}

