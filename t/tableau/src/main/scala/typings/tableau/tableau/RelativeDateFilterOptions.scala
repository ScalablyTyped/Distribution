package typings.tableau.tableau

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelativeDateFilterOptions extends js.Object {
  /** The UTC date from which to filter. */
  var anchorDate: Date = js.native
  /** Year, quarter, month, etc. */
  var periodType: PeriodType = js.native
  /** The number used when the rangeType is LASTN or NEXTN. */
  var rangeN: Double = js.native
  /** LAST, LASTN, NEXT, etc. */
  var rangeType: DateRangeType = js.native
}

object RelativeDateFilterOptions {
  @scala.inline
  def apply(anchorDate: Date, periodType: PeriodType, rangeN: Double, rangeType: DateRangeType): RelativeDateFilterOptions = {
    val __obj = js.Dynamic.literal(anchorDate = anchorDate.asInstanceOf[js.Any], periodType = periodType.asInstanceOf[js.Any], rangeN = rangeN.asInstanceOf[js.Any], rangeType = rangeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeDateFilterOptions]
  }
  @scala.inline
  implicit class RelativeDateFilterOptionsOps[Self <: RelativeDateFilterOptions] (val x: Self) extends AnyVal {
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
    def setAnchorDate(value: Date): Self = this.set("anchorDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeriodType(value: PeriodType): Self = this.set("periodType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRangeN(value: Double): Self = this.set("rangeN", value.asInstanceOf[js.Any])
    @scala.inline
    def setRangeType(value: DateRangeType): Self = this.set("rangeType", value.asInstanceOf[js.Any])
  }
  
}

