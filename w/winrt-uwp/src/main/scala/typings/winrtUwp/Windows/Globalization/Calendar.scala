package typings.winrtUwp.Windows.Globalization

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manipulates the representation of a date and time within a given calendar and clock. */
@JSGlobal("Windows.Globalization.Calendar")
@js.native
/** Creates a Calendar object and initializes it to the current date and time. */
class Calendar () extends js.Object {
  /**
    * Creates a Calendar object that is initialized with a language list.
    * @param languages The list of language identifiers, in priority order, that represents the choice of languages. These are used for resolving patterns to strings. See Remarks.
    */
  def this(languages: IIterable[String]) = this()
  /**
    * Creates a Calendar object that is initialized with a language list, calendar, and clock.
    * @param languages The list of language identifiers, in priority order, representing the choice of languages. These are used for resolving patterns to strings. See Remarks.
    * @param calendar The calendar identifier to use.
    * @param clock The clock identifier to use.
    */
  def this(languages: IIterable[String], calendar: String, clock: String) = this()
  /**
    * Creates a Calendar object that is initialized with a language list, calendar, clock, and time zone.
    * @param languages The list of language identifiers, in priority order, representing the choice of languages. These are used for resolving patterns to strings. See Remarks.
    * @param calendar The calendar identifier to use.
    * @param clock The clock identifier to use.
    * @param timeZoneId An identifier from the IANA Time Zone Database which identifies the time zone that should be used (for example, "Americas/Los_Angeles" for Pacific Time).
    */
  def this(languages: IIterable[String], calendar: String, clock: String, timeZoneId: String) = this()
  /** Gets or sets the day. */
  var day: Double = js.native
  /** Gets the day of the week. */
  var dayOfWeek: DayOfWeek = js.native
  /** Gets or sets the era. */
  var era: Double = js.native
  /** Gets the first Day of the current Month . */
  var firstDayInThisMonth: Double = js.native
  /** Gets the first Era available in the calendar. */
  var firstEra: Double = js.native
  /** Gets the first Hour of the current Period . */
  var firstHourInThisPeriod: Double = js.native
  /** Gets the first Minute of the current Hour . */
  var firstMinuteInThisHour: Double = js.native
  /** Gets the first Month of the current Year . */
  var firstMonthInThisYear: Double = js.native
  /** Gets the first Period of the current Day . */
  var firstPeriodInThisDay: Double = js.native
  /** Gets the first Second of the current Minute . */
  var firstSecondInThisMinute: Double = js.native
  /** Gets the first Year of the current Era . */
  var firstYearInThisEra: Double = js.native
  /** Gets or sets the hour. */
  var hour: Double = js.native
  /** Gets a Boolean indicating if Daylight Saving Time is in effect for the date of this Calendar object. */
  var isDaylightSavingTime: Boolean = js.native
  /** Gets the priority list of language identifiers that is used when formatting components as strings. */
  var languages: IVectorView[String] = js.native
  /** Gets the last Day of the current Month . */
  var lastDayInThisMonth: Double = js.native
  /** Gets the last Era available in the calendar. */
  var lastEra: Double = js.native
  /** Gets the last Hour of the current Period . */
  var lastHourInThisPeriod: Double = js.native
  /** Gets the last Minute of the current Hour . */
  var lastMinuteInThisHour: Double = js.native
  /** Gets the last Month of the current Year . */
  var lastMonthInThisYear: Double = js.native
  /** Gets the last Period of the current Day . */
  var lastPeriodInThisDay: Double = js.native
  /** Gets the last Second of the current Minute . */
  var lastSecondInThisMinute: Double = js.native
  /** Gets the last Year of the current Era . */
  var lastYearInThisEra: Double = js.native
  /** Gets or sets the minute. */
  var minute: Double = js.native
  /** Gets or sets the month. */
  var month: Double = js.native
  /** Gets or sets the nanosecond. */
  var nanosecond: Double = js.native
  /** Gets the number of days in the current month of this Calendar object. */
  var numberOfDaysInThisMonth: Double = js.native
  /** Gets the number of eras in this Calendar object. */
  var numberOfEras: Double = js.native
  /** Gets the number of hours in the current day period of this Calendar object. */
  var numberOfHoursInThisPeriod: Double = js.native
  /** Gets the number of Minute s in the current Hour . */
  var numberOfMinutesInThisHour: Double = js.native
  /** Gets the number of months in the current year of this Calendar object. */
  var numberOfMonthsInThisYear: Double = js.native
  /** Gets the number of periods in the current day of this Calendar object. */
  var numberOfPeriodsInThisDay: Double = js.native
  /** Gets the number of Second s in the current Minute . */
  var numberOfSecondsInThisMinute: Double = js.native
  /** Gets the number of years in the current era of this Calendar object. */
  var numberOfYearsInThisEra: Double = js.native
  /** Gets or sets the numbering system that is used when formatting components as strings. */
  var numeralSystem: String = js.native
  /** Gets or sets the period of the current day. */
  var period: Double = js.native
  /** Gets the language that was most recently used to perform calendar formatting or operations. */
  var resolvedLanguage: String = js.native
  /** Gets or sets the second. */
  var second: Double = js.native
  /** Gets or sets the year. */
  var year: Double = js.native
  /**
    * Increments or decrements the day.
    * @param days The number of days by which to increment the day (if the value is positive) or decrement the day (if the value is negative).
    */
  def addDays(days: Double): Unit = js.native
  /**
    * Increments or decrements the era.
    * @param eras The number of eras by which to increment the era (if the value is positive) or decrement the era (if the value is negative).
    */
  def addEras(eras: Double): Unit = js.native
  /**
    * Increments or decrements the hour.
    * @param hours The number of hours by which to increment the hour (if the value is positive) or decrement the hour (if the value is negative).
    */
  def addHours(hours: Double): Unit = js.native
  /**
    * Increments or decrements the minute.
    * @param minutes The number of minutes by which to increment the minute (if the value is positive) or decrement the minute (if the value is negative).
    */
  def addMinutes(minutes: Double): Unit = js.native
  /**
    * Increments or decrements the month.
    * @param months The number of months by which to increment the month (if the value is positive) or decrement the month (if the value is negative).
    */
  def addMonths(months: Double): Unit = js.native
  /**
    * Increments or decrements the nanosecond.
    * @param nanoseconds The number of nanoseconds by which to increment the nanosecond (if the value is positive) or decrement the nanosecond (if the value is negative).
    */
  def addNanoseconds(nanoseconds: Double): Unit = js.native
  /**
    * Increments or decrements the period.
    * @param periods The number of periods by which to increment the period (if the value is positive) or decrement the period (if the value is negative).
    */
  def addPeriods(periods: Double): Unit = js.native
  /**
    * Increments or decrements the second.
    * @param seconds The number of seconds by which to increment the second (if the value is positive) or decrement the second (if the value is negative).
    */
  def addSeconds(seconds: Double): Unit = js.native
  /**
    * Increments or decrements the day by the specified number of weeks.
    * @param weeks The number of weeks by which to increment the day (if the value is positive) or decrement the day (if the value is negative).
    */
  def addWeeks(weeks: Double): Unit = js.native
  /**
    * Increments or decrements the year.
    * @param years The number of years by which to increment the year (if the value is positive) or decrement the year (if the value is negative).
    */
  def addYears(years: Double): Unit = js.native
  /**
    * Sets a new calendar system to be used by this Calendar object.
    * @param value The calendar identifier to use.
    */
  def changeCalendarSystem(value: String): Unit = js.native
  /**
    * Sets a new clock to be used by this Calendar object.
    * @param value The clock identifier to use.
    */
  def changeClock(value: String): Unit = js.native
  /**
    * Sets a new time zone to be used by this Calendar object.
    * @param timeZoneId An identifier from the IANA Time Zone Database which identifies the time zone that should be used (for example, "Americas/Los_Angeles" for Pacific Time).
    */
  def changeTimeZone(timeZoneId: String): Unit = js.native
  /**
    * Compares this calendar to another Calendar object and indicates whether the date and time of one is earlier, equal to, or later than that of the other.
    * @param other The Calendar object to compare to the current calendar.
    * @return One of the following values:
    */
  def compare(other: Calendar): Double = js.native
  /**
    * Compares this calendar to a DateTime object and indicates whether the date and time of one is earlier, equal to, or later than that of the other.
    * @param other The DateTime object to compare to the current calendar.
    * @return One of the following values:
    */
  def compareDateTime(other: Date): Double = js.native
  /**
    * Copies the values from another Calendar object into this Calendar.
    * @param other The Calendar object to be copied.
    */
  def copyTo(other: Calendar): Unit = js.native
  /**
    * Returns a string representation of the day, optionally zero-padded.
    * @param minDigits The minimum number of integer digits to be displayed. If the day does not have enough integer digits, it will be padded with zeros to the correct amount. For example, for the day 3, a parameter of 1 returns 3, and a parameter of 2 returns 03.
    * @return A string representation of the day.
    */
  def dayAsPaddedString(minDigits: Double): String = js.native
  /**
    * Returns a string that contains the numeric representation of the day.
    * @return A string representation of the day.
    */
  def dayAsString(): String = js.native
  /**
    * Returns a string representation of the day of the week suitable for stand-alone display.
    * @return A string representation of the day of the week, using the most common abbreviation available.
    */
  def dayOfWeekAsSoloString(): String = js.native
  /**
    * Returns a string representation of the day of the week suitable for stand-alone display.
    * @param idealLength A positive integer specifying the ideal length, in characters, for the returned string, or 0 specifying the most common abbreviation available.
    * @return A string representation of the day of the week.
    */
  def dayOfWeekAsSoloString(idealLength: Double): String = js.native
  /**
    * Returns a string representation of the day of the week suitable for inclusion with other date components.
    * @return A string representation of the day of the week, using the most common abbreviation available.
    */
  def dayOfWeekAsString(): String = js.native
  /**
    * Returns a string representation of the day of the week suitable for inclusion with other date components.
    * @param idealLength A positive integer specifying the ideal length, in characters, for the returned string, or 0 specifying the most common abbreviation available.
    * @return A string representation of the day of the week.
    */
  def dayOfWeekAsString(idealLength: Double): String = js.native
  /**
    * Returns a string representation of the era.
    * @return A string representation of the era, using the most common abbreviation available.
    */
  def eraAsString(): String = js.native
  /**
    * Returns a string representation of the era. The string chosen is closest in length to the ideal length.
    * @param idealLength A positive integer specifying the ideal length, in characters, for the returned string, or 0 specifying the most common abbreviation available.
    * @return A string representation of the era.
    */
  def eraAsString(idealLength: Double): String = js.native
  /**
    * Gets the calendar system that is used by this Calendar object.
    * @return The identifier of the calendar system.
    */
  def getCalendarSystem(): String = js.native
  /**
    * Gets the clock that is used by this Calendar object.
    * @return The identifier of the clock.
    */
  def getClock(): String = js.native
  /**
    * Builds a date and time, given the components of this Calendar object.
    * @return The DateTime representing the date and time of this Calendar .
    */
  def getDateTime(): Date = js.native
  /**
    * Gets the identifier that identifies the time zone that is used by this Calendar object.
    * @return The identifier from the IANA Time Zone Database that identifies the time zone that is used by this Calendar object. (An example is "Americas/Los_Angeles" for Pacific Time.)
    */
  def getTimeZone(): String = js.native
  /**
    * Returns a string representation of the hour, optionally zero-padded.
    * @param minDigits The minimum number of integer digits to be displayed. If the hour does not have enough integer digits, it will be padded with zeros to the correct amount. For example, for the hour 3, a parameter of 1 returns 3, and a parameter of 2 returns 03.
    * @return A string representation of the hour.
    */
  def hourAsPaddedString(minDigits: Double): String = js.native
  /**
    * Returns a string that contains the numeric representation of the hour.
    * @return A string representation of the hour.
    */
  def hourAsString(): String = js.native
  /**
    * Returns a string representation of the minute, optionally zero-padded.
    * @param minDigits The minimum number of integer digits to be displayed. If the minute does not have enough integer digits, it will be padded with zeros to the correct amount. For example, for the minute 3, a parameter of 1 returns 3, and a parameter of 2 returns 03.
    * @return A string representation of the minute.
    */
  def minuteAsPaddedString(minDigits: Double): String = js.native
  /**
    * Returns a string that contains the numeric representation of the minute.
    * @return A string representation of the minute.
    */
  def minuteAsString(): String = js.native
  /**
    * Returns a string that contains the numeric representation of the month.
    * @return A string representation of the month.
    */
  def monthAsNumericString(): String = js.native
  /**
    * Returns a string representation of the month, optionally zero-padded.
    * @param minDigits The minimum number of integer digits to be displayed. If the month does not have enough integer digits, it will be padded with zeros to the correct amount. For example, for the month 3, a parameter of 1 returns 3, and a parameter of 2 returns 03.
    * @return A string representation of the month.
    */
  def monthAsPaddedNumericString(minDigits: Double): String = js.native
  /**
    * Returns a string representation of the month suitable for stand-alone display.
    * @return A string representation of the month, using the most common abbreviation available.
    */
  def monthAsSoloString(): String = js.native
  /**
    * Returns a string representation of the month suitable for stand-alone display.
    * @param idealLength A positive integer specifying the ideal length, in characters, for the returned string, or 0 specifying the most common abbreviation available.
    * @return A string representation of the month.
    */
  def monthAsSoloString(idealLength: Double): String = js.native
  /**
    * Returns a string representation of the month suitable for inclusion with other date components.
    * @return A string representation of the month, using the most common abbreviation available.
    */
  def monthAsString(): String = js.native
  /**
    * Returns a string representation of the month suitable for inclusion with other date components.
    * @param idealLength A positive integer specifying the ideal length, in characters, for the returned string, or 0 specifying the most common abbreviation available.
    * @return A string representation of the month.
    */
  def monthAsString(idealLength: Double): String = js.native
  /**
    * Returns a string representation of the nanosecond, optionally zero-padded.
    * @param minDigits The minimum number of integer digits to be displayed. If the nanosecond does not have enough integer digits, it will be padded with zeros to the correct amount. For example, for the nanosecond 42, a parameter of 1 or 2 returns 42, and a parameter of 3 returns 042.
    * @return A string representation of the nanosecond.
    */
  def nanosecondAsPaddedString(minDigits: Double): String = js.native
  /**
    * Returns a string that contains the numeric representation of the nanosecond.
    * @return A string representation of the nanosecond.
    */
  def nanosecondAsString(): String = js.native
  /**
    * Returns a string representation of the day period, such as AM or PM, that uses the most common abbreviation available.
    * @return A string representation of the day period.
    */
  def periodAsString(): String = js.native
  /**
    * Returns a string representation of the day period, such as AM or PM.
    * @param idealLength A positive integer that specifies the ideal length, in characters, for the returned string; or a zero that specifies the most common abbreviation available.
    * @return A string representation for the day period.
    */
  def periodAsString(idealLength: Double): String = js.native
  /**
    * Returns a string representation of the second, optionally zero-padded.
    * @param minDigits The minimum number of integer digits to be displayed. If the second does not have enough integer digits, it will be padded with zeros to the correct amount. For example, for the second 3, a parameter of 1 returns 3, and a parameter of 2 returns 03.
    * @return A string representation of the second.
    */
  def secondAsPaddedString(minDigits: Double): String = js.native
  /**
    * Returns a string that contains the numeric representation of the second.
    * @return A string representation of the second.
    */
  def secondAsString(): String = js.native
  /**
    * Sets all the date and time fields to the date and time represented by the DateTime parameter.
    * @param value The DateTime that is used to set all of the date and time fields.
    */
  def setDateTime(value: Date): Unit = js.native
  /** Sets the components of this Calendar object to the latest date and time that are supported. */
  def setToMax(): Unit = js.native
  /** Sets the components of this Calendar object to the earliest date and time that are supported. */
  def setToMin(): Unit = js.native
  /** Sets the components of this Calendar object to the current date and time. */
  def setToNow(): Unit = js.native
  /**
    * Returns the full time zone name applicable at the instant of time that this Calendar object represents.
    * @return The full time zone name. This usually differs depending on whether the time zone is observing Daylight Saving Time or not. It also may differ due to historical changes. (An example is "Americas/Los_Angeles" for Pacific Time.)
    */
  def timeZoneAsString(): String = js.native
  /**
    * Returns the abbreviated time zone name applicable at the instant of time that this Calendar object represents.
    * @param idealLength The desired length of the abbreviation to be returned. Use 0 to request the abbreviation in most common use.
    * @return The time zone abbreviation that is closest in length to idealLength. If there is a tie, the shorter abbreviation is returned. If idealLength is 0, the abbreviation in most common use is returned. (An example is "Americas/Los_Angeles" for Pacific Time.)
    */
  def timeZoneAsString(idealLength: Double): String = js.native
  /**
    * Returns a string representation of the year, optionally zero-padded.
    * @param minDigits The minimum number of integer digits to be displayed. If the year does not have enough integer digits, it will be padded with zeros to the correct amount. For example, for the year 42, a parameter of 1 or 2 returns 42, and a parameter of 3 returns 042.
    * @return A string representation of the year.
    */
  def yearAsPaddedString(minDigits: Double): String = js.native
  /**
    * Returns a string representation of the year without any initial zero padding.
    * @return A string representation of the year.
    */
  def yearAsString(): String = js.native
  /**
    * Returns a string representation of the year, optionally truncated.
    * @param remainingDigits A positive integer that represents the number of least significant digits that should be included. For example, for the year 1234, a parameter of 2 returns 34, and a parameter of 4 or larger returns 1234.
    * @return A string representation of the year.
    */
  def yearAsTruncatedString(remainingDigits: Double): String = js.native
}

