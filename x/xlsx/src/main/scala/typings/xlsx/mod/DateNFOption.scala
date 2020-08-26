package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateNFOption extends js.Object {
  /** Use specified date format */
  var dateNF: js.UndefOr[NumberFormat] = js.native
}

object DateNFOption {
  @scala.inline
  def apply(): DateNFOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateNFOption]
  }
  @scala.inline
  implicit class DateNFOptionOps[Self <: DateNFOption] (val x: Self) extends AnyVal {
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
    def setDateNF(value: NumberFormat): Self = this.set("dateNF", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateNF: Self = this.set("dateNF", js.undefined)
  }
  
}

