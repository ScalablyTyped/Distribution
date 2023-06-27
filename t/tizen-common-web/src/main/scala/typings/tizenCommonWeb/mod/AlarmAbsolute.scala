package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web", "AlarmAbsolute")
@js.native
open class AlarmAbsolute protected () extends Alarm_ {
  def this(date: js.Date) = this()
  // tslint:disable-line:unified-signatures
  def this(date: js.Date, daysOfTheWeek: js.Array[ByDayValue]) = this()
  // tslint:disable-line:unified-signatures
  def this(date: js.Date, period: Double) = this()
  
  // tslint:disable-line:unified-signatures
  /**
    * An attribute to store the absolute date/time when the alarm is initially triggered.
    *
    * This attribute is precise to the second. Milliseconds will be ignored.
    */
  val date: js.Date = js.native
  
  /**
    * An attribute to store the days of the week associated with the recurrence rule.
    *
    * By default, this attribute is set to an empty array.
    * The _period_ and _daysOfTheWeek_ attributes are mutually exclusive.
    */
  val daysOfTheWeek: js.Array[ByDayValue] = js.native
  
  /**
    * Returns the date / time of the next alarm trigger.
    *
    * If the alarm has expired, this method returns null. The returned date is precise to the second.
    *
    * @returns The date/time of the next alarm trigger.
    *
    * @throws WebAPIException with error type UnknownError, if the method cannot be completed because of an unknown error.
    */
  def getNextScheduledDate(): js.Date | Null = js.native
  
  /**
    * An attribute to store the duration in seconds between each trigger of the alarm.
    *
    * By default, this attribute is set to null, indicating that this alarm does not repeat.
    * The _period_ and _daysOfTheWeek_ attributes are mutually exclusive.
    * @note _deprecated_ 4.0 Since Tizen 4.0 constructor AlarmAbsolute(Date date, long period) is deprecated, thus this attribute should not be used.
    */
  val period: Double | Null = js.native
}
