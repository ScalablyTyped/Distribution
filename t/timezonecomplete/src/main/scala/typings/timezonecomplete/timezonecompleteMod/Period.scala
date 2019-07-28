package typings.timezonecomplete.timezonecompleteMod

import typings.timezonecomplete.distLibPeriodMod.PeriodJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "Period")
@js.native
class Period protected ()
  extends typings.timezonecomplete.distLibPeriodMod.Period {
  /**
    * Constructor
    * LIMITATION: if dst equals RegularLocalTime, and unit is Second, Minute or Hour,
    * then the amount must be a factor of 24. So 120 seconds is allowed while 121 seconds is not.
    * This is due to the enormous processing power required by these cases. They are not
    * implemented and you will get an assert.
    *
    * @param json period represented as JSON object
    */
  def this(json: PeriodJson) = this()
  /**
    * Constructor
    * LIMITATION: if dst equals RegularLocalTime, and unit is Second, Minute or Hour,
    * then the amount must be a factor of 24. So 120 seconds is allowed while 121 seconds is not.
    * This is due to the enormous processing power required by these cases. They are not
    * implemented and you will get an assert.
    *
    * @param reference The reference date of the period. If the period is in Months or Years, and
    *                  the day is 29 or 30 or 31, the results are maximised to end-of-month.
    * @param interval The interval of the period
    * @param dst Specifies how to handle Daylight Saving Time. Not relevant
    *            if the time zone of the reference datetime does not have DST.
    *            Defaults to RegularLocalTime.
    */
  def this(
    reference: typings.timezonecomplete.distLibDatetimeMod.DateTime,
    interval: typings.timezonecomplete.distLibDurationMod.Duration
  ) = this()
  /**
    * Constructor
    * LIMITATION: if dst equals RegularLocalTime, and unit is Second, Minute or Hour,
    * then the amount must be a factor of 24. So 120 seconds is allowed while 121 seconds is not.
    * This is due to the enormous processing power required by these cases. They are not
    * implemented and you will get an assert.
    *
    * @param reference The reference of the period. If the period is in Months or Years, and
    *                  the day is 29 or 30 or 31, the results are maximised to end-of-month.
    * @param amount The amount of units.
    * @param unit The unit.
    * @param dst Specifies how to handle Daylight Saving Time. Not relevant
    *              if the time zone of the reference datetime does not have DST.
    *              Defaults to RegularLocalTime.
    */
  def this(
    reference: typings.timezonecomplete.distLibDatetimeMod.DateTime,
    amount: Double,
    unit: typings.timezonecomplete.distLibBasicsMod.TimeUnit
  ) = this()
  def this(
    reference: typings.timezonecomplete.distLibDatetimeMod.DateTime,
    interval: typings.timezonecomplete.distLibDurationMod.Duration,
    dst: typings.timezonecomplete.distLibPeriodMod.PeriodDst
  ) = this()
  def this(
    reference: typings.timezonecomplete.distLibDatetimeMod.DateTime,
    amount: Double,
    unit: typings.timezonecomplete.distLibBasicsMod.TimeUnit,
    dst: typings.timezonecomplete.distLibPeriodMod.PeriodDst
  ) = this()
}

