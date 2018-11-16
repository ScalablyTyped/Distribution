package typings
package timezonecompleteLib.timezonecompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "Period")
@js.native
class Period protected ()
  extends timezonecompleteLib.distLibPeriodMod.Period {
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
  def this(reference: timezonecompleteLib.distLibDatetimeMod.DateTime, interval: timezonecompleteLib.distLibDurationMod.Duration) = this()
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
  def this(reference: timezonecompleteLib.distLibDatetimeMod.DateTime, amount: scala.Double, unit: timezonecompleteLib.distLibBasicsMod.TimeUnit) = this()
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
  def this(reference: timezonecompleteLib.distLibDatetimeMod.DateTime, interval: timezonecompleteLib.distLibDurationMod.Duration, dst: timezonecompleteLib.distLibPeriodMod.PeriodDst) = this()
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
  def this(reference: timezonecompleteLib.distLibDatetimeMod.DateTime, amount: scala.Double, unit: timezonecompleteLib.distLibBasicsMod.TimeUnit, dst: timezonecompleteLib.distLibPeriodMod.PeriodDst) = this()
}

