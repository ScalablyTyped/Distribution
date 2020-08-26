package typings.textMaskAddons.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePipeYears extends js.Object {
  var maxYear: Double = js.native
  var minYear: Double = js.native
}

object DatePipeYears {
  @scala.inline
  def apply(maxYear: Double, minYear: Double): DatePipeYears = {
    val __obj = js.Dynamic.literal(maxYear = maxYear.asInstanceOf[js.Any], minYear = minYear.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePipeYears]
  }
  @scala.inline
  implicit class DatePipeYearsOps[Self <: DatePipeYears] (val x: Self) extends AnyVal {
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
    def setMaxYear(value: Double): Self = this.set("maxYear", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinYear(value: Double): Self = this.set("minYear", value.asInstanceOf[js.Any])
  }
  
}

