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

