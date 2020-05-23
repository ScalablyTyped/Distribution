package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelativeDateFilter
  extends Filter
     with ConcreteFilter {
  /** The date period of the filter. See PeriodType Enum for the values in the enum. */
  def getPeriod(): PeriodType
  /** The range of the date filter (years, months, etc.). See DateRangeType Enum for the values in the enum. */
  def getRange(): DateRangeType
  /** When getRange returns LASTN or NEXTN, this is the N value (how many years, months, etc.). */
  def getRangeN(): Double
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
}

