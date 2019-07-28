package typings.timezonecomplete.distLibPeriodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PeriodDst extends js.Object

@JSImport("timezonecomplete/dist/lib/period", "PeriodDst")
@js.native
object PeriodDst extends js.Object {
  /**
    * End-of-enum marker
    */
  @js.native
  sealed trait MAX extends PeriodDst
  
  /**
    * Keep repeating in similar intervals measured in UTC,
    * unaffected by Daylight Saving Time.
    * E.g. a repetition of one hour will take one real hour
    * every time, even in a time zone with DST.
    * Leap seconds, leap days and month length
    * differences will still make the intervals different.
    */
  @js.native
  sealed trait RegularIntervals extends PeriodDst
  
  /**
    * Ensure that the time at which the intervals occur stay
    * at the same place in the day, local time. So e.g.
    * a period of one day, referenceing at 8:05AM Europe/Amsterdam time
    * will always reference at 8:05 Europe/Amsterdam. This means that
    * in UTC time, some intervals will be 25 hours and some
    * 23 hours during DST changes.
    * Another example: an hourly interval will be hourly in local time,
    * skipping an hour in UTC for a DST backward change.
    */
  @js.native
  sealed trait RegularLocalTime extends PeriodDst
  
  /* 2 */ val MAX: typings.timezonecomplete.distLibPeriodMod.PeriodDst.MAX with Double = js.native
  /* 0 */ val RegularIntervals: typings.timezonecomplete.distLibPeriodMod.PeriodDst.RegularIntervals with Double = js.native
  /* 1 */ val RegularLocalTime: typings.timezonecomplete.distLibPeriodMod.PeriodDst.RegularLocalTime with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PeriodDst with Double] = js.native
}

