package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelativeDateFilter
  extends Filter
     with ConcreteFilter {
  /** The date period of the filter. See PeriodType Enum for the values in the enum. */
  def getPeriod(): PeriodType = js.native
  /** The range of the date filter (years, months, etc.). See DateRangeType Enum for the values in the enum. */
  def getRange(): DateRangeType = js.native
  /** When getRange returns LASTN or NEXTN, this is the N value (how many years, months, etc.). */
  def getRangeN(): Double = js.native
}

object RelativeDateFilter {
  @scala.inline
  def apply(
    getFieldAsync: () => js.Promise[Field],
    getFieldName: () => String,
    getFilterType: () => FilterType,
    getPeriod: () => PeriodType,
    getRange: () => DateRangeType,
    getRangeN: () => Double,
    getWorksheet: () => Worksheet
  ): RelativeDateFilter = {
    val __obj = js.Dynamic.literal(getFieldAsync = js.Any.fromFunction0(getFieldAsync), getFieldName = js.Any.fromFunction0(getFieldName), getFilterType = js.Any.fromFunction0(getFilterType), getPeriod = js.Any.fromFunction0(getPeriod), getRange = js.Any.fromFunction0(getRange), getRangeN = js.Any.fromFunction0(getRangeN), getWorksheet = js.Any.fromFunction0(getWorksheet))
    __obj.asInstanceOf[RelativeDateFilter]
  }
  @scala.inline
  implicit class RelativeDateFilterOps[Self <: RelativeDateFilter] (val x: Self) extends AnyVal {
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
    def setGetPeriod(value: () => PeriodType): Self = this.set("getPeriod", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRange(value: () => DateRangeType): Self = this.set("getRange", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRangeN(value: () => Double): Self = this.set("getRangeN", js.Any.fromFunction0(value))
  }
  
}

