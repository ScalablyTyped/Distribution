package typings.titanium.TitaniumNs.CalendarNs

import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import typings.titanium.daysOfTheWeekDictionary
import typings.titanium.recurrenceEndDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object that is used to describe the recurrence pattern for a recurring event.
		 */
trait RecurrenceRule extends Proxy {
  /**
  			 * Identifier for the recurrence rule's calendar.
  			 */
  val calendarID: String
  /**
  			 * The days of the month that the event occurs, as an array of number objects.
  			 * Values can be from 1 to 31 and from -1 to -31. This parameter is only valid for
  			 * recurrence rules of type
  			 * [RECURRENCEFREQUENCY_MONTHLY](Titanium.Calendar.RECURRENCEFREQUENCY_MONTHLY).
  			 */
  val daysOfTheMonth: js.Array[Double]
  /**
  			 * The days of the week that the event occurs, as an Dictionay of `daysOfWeek` and `Week`.
  			 */
  val daysOfTheWeek: daysOfTheWeekDictionary
  /**
  			 * The days of the year that the event occurs, as an array of number objects.
  			 * Values can be from 1 to 366 and from -1 to -366. This parameter is only valid for
  			 * recurrence rules of type [RECURRENCEFREQUENCY_YEARLY](Titanium.Calendar.RECURRENCEFREQUENCY_YEARLY).
  			 */
  val daysOfTheYear: js.Array[Double]
  /**
  			 * End of a recurrence rule.
  			 */
  val end: recurrenceEndDictionary
  /**
  			 * Frequency of the recurrence rule.
  			 */
  val frequency: Double
  /**
  			 * The interval between instances of this recurrence. For example, a weekly
  			 * recurrence rule with an interval of 2 occurs every other week. Must be greater than 0.
  			 */
  val interval: Double
  /**
  			 * The months of the year that the event occurs, as an array of Number objects.
  			 * Values can be from 1 to 12. This parameter is only valid for recurrence rules of
  			 * type [RECURRENCEFREQUENCY_YEARLY](Titanium.Calendar.RECURRENCEFREQUENCY_YEARLY).
  			 */
  val monthsOfTheYear: js.Array[Double]
  /**
  			 * An array of ordinal numbers that filters which recurrences to include in the
  			 * recurrence rule's frequency. For example, a yearly recurrence rule that has a
  			 * [daysOfTheWeek](Titanium.Calendar.RecurrenceRule.daysOfTheWeek) value that specifies
  			 * Monday through Friday, and a `setPositions` array containing 2 and -1, occurs only
  			 * on the second weekday and last weekday of every year.
  			 */
  val setPositions: js.Array[Double]
  /**
  			 * The weeks of the year that the event occurs, as an array of number objects.
  			 * Values can be from 1 to 53 and from -1 to -53. This parameter is only valid for
  			 * recurrence rules of type [RECURRENCEFREQUENCY_YEARLY](Titanium.Calendar.RECURRENCEFREQUENCY_YEARLY).
  			 */
  val weeksOfTheYear: js.Array[Double]
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.calendarID> property.
  			 */
  def getCalendarID(): String
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.daysOfTheMonth> property.
  			 */
  def getDaysOfTheMonth(): js.Array[Double]
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.daysOfTheWeek> property.
  			 */
  def getDaysOfTheWeek(): daysOfTheWeekDictionary
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.daysOfTheYear> property.
  			 */
  def getDaysOfTheYear(): js.Array[Double]
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.end> property.
  			 */
  def getEnd(): recurrenceEndDictionary
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.frequency> property.
  			 */
  def getFrequency(): Double
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.interval> property.
  			 */
  def getInterval(): Double
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.monthsOfTheYear> property.
  			 */
  def getMonthsOfTheYear(): js.Array[Double]
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.setPositions> property.
  			 */
  def getSetPositions(): js.Array[Double]
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.weeksOfTheYear> property.
  			 */
  def getWeeksOfTheYear(): js.Array[Double]
}

object RecurrenceRule {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    calendarID: String,
    daysOfTheMonth: js.Array[Double],
    daysOfTheWeek: daysOfTheWeekDictionary,
    daysOfTheYear: js.Array[Double],
    end: recurrenceEndDictionary,
    fireEvent: (String, js.Any) => Unit,
    frequency: Double,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getCalendarID: () => String,
    getDaysOfTheMonth: () => js.Array[Double],
    getDaysOfTheWeek: () => daysOfTheWeekDictionary,
    getDaysOfTheYear: () => js.Array[Double],
    getEnd: () => recurrenceEndDictionary,
    getFrequency: () => Double,
    getInterval: () => Double,
    getMonthsOfTheYear: () => js.Array[Double],
    getSetPositions: () => js.Array[Double],
    getWeeksOfTheYear: () => js.Array[Double],
    interval: Double,
    monthsOfTheYear: js.Array[Double],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit,
    setPositions: js.Array[Double],
    weeksOfTheYear: js.Array[Double],
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): RecurrenceRule = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, calendarID = calendarID, daysOfTheMonth = daysOfTheMonth, daysOfTheWeek = daysOfTheWeek, daysOfTheYear = daysOfTheYear, end = end, fireEvent = js.Any.fromFunction2(fireEvent), frequency = frequency, getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getCalendarID = js.Any.fromFunction0(getCalendarID), getDaysOfTheMonth = js.Any.fromFunction0(getDaysOfTheMonth), getDaysOfTheWeek = js.Any.fromFunction0(getDaysOfTheWeek), getDaysOfTheYear = js.Any.fromFunction0(getDaysOfTheYear), getEnd = js.Any.fromFunction0(getEnd), getFrequency = js.Any.fromFunction0(getFrequency), getInterval = js.Any.fromFunction0(getInterval), getMonthsOfTheYear = js.Any.fromFunction0(getMonthsOfTheYear), getSetPositions = js.Any.fromFunction0(getSetPositions), getWeeksOfTheYear = js.Any.fromFunction0(getWeeksOfTheYear), interval = interval, monthsOfTheYear = monthsOfTheYear, removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setPositions = setPositions, weeksOfTheYear = weeksOfTheYear)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[RecurrenceRule]
  }
}

