package typings.table.mod

import typings.table.tableStrings.center
import typings.table.tableStrings.left
import typings.table.tableStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableColumns extends js.Object {
  var alignment: js.UndefOr[left | center | right] = js.native
  var paddingLeft: js.UndefOr[Double] = js.native
  var paddingRight: js.UndefOr[Double] = js.native
  var truncate: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
  var wrapWord: js.UndefOr[Boolean] = js.native
}

object TableColumns {
  @scala.inline
  def apply(): TableColumns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableColumns]
  }
  @scala.inline
  implicit class TableColumnsOps[Self <: TableColumns] (val x: Self) extends AnyVal {
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
    def setAlignment(value: left | center | right): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setPaddingLeft(value: Double): Self = this.set("paddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingLeft: Self = this.set("paddingLeft", js.undefined)
    @scala.inline
    def setPaddingRight(value: Double): Self = this.set("paddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingRight: Self = this.set("paddingRight", js.undefined)
    @scala.inline
    def setTruncate(value: Double): Self = this.set("truncate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncate: Self = this.set("truncate", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWrapWord(value: Boolean): Self = this.set("wrapWord", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapWord: Self = this.set("wrapWord", js.undefined)
  }
  
}

