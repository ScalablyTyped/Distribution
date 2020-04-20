package typings.timezonecomplete.periodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeriodJson extends js.Object {
  /**
    * Interval as a timezonecomplete duration string
    */
  var duration: String
  /**
    * Daylight saving time handling
    */
  var periodDst: PeriodDstJson
  /**
    * Reference date as iso timestamp + time zone
    */
  var reference: String
}

object PeriodJson {
  @scala.inline
  def apply(duration: String, periodDst: PeriodDstJson, reference: String): PeriodJson = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], periodDst = periodDst.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeriodJson]
  }
}

