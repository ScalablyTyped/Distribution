package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.RelativeDateFilter")
@js.native
class RelativeDateFilter ()
  extends Filter
     with ConcreteFilter {
  /** The date period of the filter. See PeriodType Enum for the values in the enum. */
  def getPeriod(): PeriodType = js.native
  /** The range of the date filter (years, months, etc.). See DateRangeType Enum for the values in the enum. */
  def getRange(): DateRangeType = js.native
  /** When getRange returns LASTN or NEXTN, this is the N value (how many years, months, etc.). */
  def getRangeN(): Double = js.native
}

