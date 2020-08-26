package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkSheet extends Sheet {
  /** AutoFilter info */
  @JSName("!autofilter")
  var Exclamationmarkautofilter: js.UndefOr[AutoFilterInfo] = js.native
  /** Column Info */
  @JSName("!cols")
  var Exclamationmarkcols: js.UndefOr[js.Array[ColInfo]] = js.native
  /** Merge Ranges */
  @JSName("!merges")
  var Exclamationmarkmerges: js.UndefOr[js.Array[Range]] = js.native
  /** Worksheet Protection info */
  @JSName("!protect")
  var Exclamationmarkprotect: js.UndefOr[ProtectInfo] = js.native
  /** Row Info */
  @JSName("!rows")
  var Exclamationmarkrows: js.UndefOr[js.Array[RowInfo]] = js.native
}

object WorkSheet {
  @scala.inline
  def apply(): WorkSheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkSheet]
  }
  @scala.inline
  implicit class WorkSheetOps[Self <: WorkSheet] (val x: Self) extends AnyVal {
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
    def setExclamationmarkautofilter(value: AutoFilterInfo): Self = this.set("!autofilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclamationmarkautofilter: Self = this.set("!autofilter", js.undefined)
    @scala.inline
    def setExclamationmarkcolsVarargs(value: ColInfo*): Self = this.set("!cols", js.Array(value :_*))
    @scala.inline
    def setExclamationmarkcols(value: js.Array[ColInfo]): Self = this.set("!cols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclamationmarkcols: Self = this.set("!cols", js.undefined)
    @scala.inline
    def setExclamationmarkmergesVarargs(value: Range*): Self = this.set("!merges", js.Array(value :_*))
    @scala.inline
    def setExclamationmarkmerges(value: js.Array[Range]): Self = this.set("!merges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclamationmarkmerges: Self = this.set("!merges", js.undefined)
    @scala.inline
    def setExclamationmarkprotect(value: ProtectInfo): Self = this.set("!protect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclamationmarkprotect: Self = this.set("!protect", js.undefined)
    @scala.inline
    def setExclamationmarkrowsVarargs(value: RowInfo*): Self = this.set("!rows", js.Array(value :_*))
    @scala.inline
    def setExclamationmarkrows(value: js.Array[RowInfo]): Self = this.set("!rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclamationmarkrows: Self = this.set("!rows", js.undefined)
  }
  
}

