package typings.timezonecomplete.distLibPeriodMod

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
    val __obj = js.Dynamic.literal(duration = duration, periodDst = periodDst, reference = reference)
  
    __obj.asInstanceOf[PeriodJson]
  }
}

