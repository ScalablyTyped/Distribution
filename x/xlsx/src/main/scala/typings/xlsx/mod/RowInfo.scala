package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowInfo extends js.Object {
  /* --- visibility --- */
  /** if true, the column is hidden */
  var hidden: js.UndefOr[Boolean] = js.native
  /** height in points */
  var hpt: js.UndefOr[Double] = js.native
  /* --- row height --- */
  /** height in screen pixels */
  var hpx: js.UndefOr[Double] = js.native
  /** outline / group level */
  var level: js.UndefOr[Double] = js.native
}

object RowInfo {
  @scala.inline
  def apply(): RowInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowInfo]
  }
  @scala.inline
  implicit class RowInfoOps[Self <: RowInfo] (val x: Self) extends AnyVal {
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
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setHpt(value: Double): Self = this.set("hpt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHpt: Self = this.set("hpt", js.undefined)
    @scala.inline
    def setHpx(value: Double): Self = this.set("hpx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHpx: Self = this.set("hpx", js.undefined)
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
  }
  
}

