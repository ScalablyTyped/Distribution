package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelativeDateFilterOptions extends js.Object {
  /** The UTC date from which to filter. */
  var anchorDate: stdLib.Date
  /** Year, quarter, month, etc. */
  var periodType: PeriodType
  /** The number used when the rangeType is LASTN or NEXTN. */
  var rangeN: scala.Double
  /** LAST, LASTN, NEXT, etc. */
  var rangeType: DateRangeType
}

object RelativeDateFilterOptions {
  @scala.inline
  def apply(anchorDate: stdLib.Date, periodType: PeriodType, rangeN: scala.Double, rangeType: DateRangeType): RelativeDateFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("anchorDate")(anchorDate)
    __obj.updateDynamic("periodType")(periodType)
    __obj.updateDynamic("rangeN")(rangeN)
    __obj.updateDynamic("rangeType")(rangeType)
    __obj.asInstanceOf[RelativeDateFilterOptions]
  }
}

