package typings.summernote.mod.global.Summernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertTableMaxSizeOptions extends js.Object {
  var col: Double = js.native
  var row: Double = js.native
}

object InsertTableMaxSizeOptions {
  @scala.inline
  def apply(col: Double, row: Double): InsertTableMaxSizeOptions = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertTableMaxSizeOptions]
  }
  @scala.inline
  implicit class InsertTableMaxSizeOptionsOps[Self <: InsertTableMaxSizeOptions] (val x: Self) extends AnyVal {
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
    def setCol(value: Double): Self = this.set("col", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
  }
  
}

