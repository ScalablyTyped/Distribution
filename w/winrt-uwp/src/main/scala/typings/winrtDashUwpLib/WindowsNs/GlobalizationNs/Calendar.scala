package typings
package winrtDashUwpLib.WindowsNs.GlobalizationNs

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
  def this(languages: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]) = this()
  /**
    * Creates a Calendar object that is initialized with a language list, calendar, and clock.
    * @param languages The list of language identifiers, in priority order, representing the choice of languages. These are used for resolving patterns to strings. See Remarks.
    * @param calendar The calendar identifier to use.
    * @param clock The clock identifier to use.
    */
  def this(languages: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String], calendar: java.lang.String, clock: java.lang.String) = this()
  /**
    * Creates a Calendar object that is initialized with a language list, calendar, clock, and time zone.
    * @param languages The list of language identifiers, in priority order, representing the choice of languages. These are used for resolving patterns to strings. See Remarks.
    * @param calendar The calendar identifier to use.
    * @param clock The clock identifier to use.
    * @param timeZoneId An identifier from the IANA Time Zone Database which identifies the time zone that should be used (for example, "Americas/Los_Angeles" for Pacific Time).
    */
  def this(languages: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String], calendar: java.lang.String, clock: java.lang.String, timeZoneId: java.lang.String) = this()
  /** Gets or sets the day. */
  var day: scala.Double = js.native
  /** Gets the day of the week. */
  var dayOfWeek: DayOfWeek = js.native
  /** Gets or sets the era. */
  var era: scala.Double = js.native
  /** Gets the first Day of the current Month . */
  var firstDayInThisMonth: scala.Double = js.native
  /** Gets the first Era available in the calendar. */
  var firstEra: scala.Double = js.native
  /** Gets the first Hour of the current Period . */
  var firstHourInThisPeriod: scala.Double = js.native
  /** Gets the first Minute of the current Hour . */
  var firstMinuteInThisHour: scala.Double = js.native
  /** Gets the first Month of the current Year . */
  var firstMonthInThisYear: scala.Double = js.native
  /** Gets the first Period of the current Day . */
  var firstPeriodInThisDay: scala.Double = js.native
  /** Gets the first Second of the current Minute . */
  var firstSecondInThisMinute: scala.Double = js.native
  /** Gets the first Year of the current Era . */
  var firstYearInThisEra: scala.Double = js.native
  /** Gets or sets the hour. */
  var hour: scala.Double = js.native
  /** Gets a Boolean indicating if Daylight Saving Time is in effect for the date of this Calendar object. */
  var isDaylightSavingTime: scala.Boolean = js.native
  /** Gets the priority list of language identifiers that is used when formatting components as strings. */
  var languages: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** Gets the last Day of the current Month . */
  var lastDayInThisMonth: scala.Double = js.native
  /** Gets the last Era available in the calendar. */
  var lastEra: scala.Double = js.native
  /** Gets the last Hour of the current Period . */
  var lastHourInThisPeriod: scala.Double = js.native
  /** Gets the last Minute of the current Hour . */
  var lastMinuteInThisHour: scala.Double = js.native
  /** Gets the last Month of the current Year . */
  var lastMonthInThisYear: scala.Double = js.native
  /** Gets the last Period of the current Day . */
  var lastPeriodInThisDay: scala.Double = js.native
  /** Gets the last Second of the current Minute . */
  var lastSecondInThisMinute: scala.Double = js.native
  /** Gets the last Year of the current Era . */
  var lastYearInThisEra: scala.Double = js.native
  /** Gets or sets the minute. */
  var minute: scala.Double = js.native
  /** Gets or sets the month. */
  var month: scala.Double = js.native
  /** Gets or sets the nanosecond. */
  var nanosecond: scala.Double = js.native
  /** Gets the number of days in the current month of this Calendar object. */
  var numberOfDaysInThisMonth: scala.Double = js.native
  /** Gets the number of eras in this Calendar object. */
  var numberOfEras: scala.Double = js.native
  /** Gets the number of hours in the current day period of this Calendar object. */
  var numberOfHoursInThisPeriod: scala.Double = js.native
  /** Gets the number of Minute s in the current Hour . */
  var numberOfMinutesInThisHour: scala.Double = js.native
  /** Gets the number of months in the current year of this Calendar object. */
  var numberOfMonthsInThisYear: scala.Double = js.native
  /** Gets the number of periods in the current day of this Calendar object. */
  var numberOfPeriodsInThisDay: scala.Double = js.native
  /** Gets the number of Second s in the current Minute . */
  var numberOfSecondsInThisMinute: scala.Double = js.native
  /** Gets the number of years in the current era of this Calendar object. */
  var numberOfYearsInThisEra: scala.Double = js.native
  /** Gets or sets the numbering system that is used when formatting components as strings. */
  var numeralSystem: java.lang.String = js.native
  /** Gets or sets the period of the current day. */
  var period: scala.Double = js.native
  /** Gets the language that was most recently used to perform calendar formatting or operations. */
  var resolvedLanguage: java.lang.String = js.native
  /** Gets or sets the second. */
  var second: scala.Double = js.native
  /** Gets or sets the year. */
  var year: scala.Double = js.native
  /**
    * Increments or decrements the day.
    * @param days The number of days by which to increment the day (if the value is positive) or decrement the day (if the value is negative).
    */
  def addDays(days: scala.Double): scala.Unit = js.native
  /**
    * Increments or decrements the era.
    * @param eras The number of eras by which to increment the era (if the value is positive) or decrement the era (if the value is negative).
    */
  def addEras(eras: scala.Double): scala.Unit = js.native
  /**
    * Increments or decrements the hour.
    * @param hours The number of hours by which to increment the hour (if the value is positive) or decrement the hour (if the value is negative).
    */
  def addHours(hours: scala.Double): scala.Unit = js.native
  /**
    * Increments or decrements the minute.
    * @param minutes The number of minutes by which to increment the minute (if the value is positive) or decrement the minute (if the value is negative).
    */
  def addMinutes(minutes: scala.Double): scala.Unit = js.native
  /**
    * Increments or decrements the month.
    * @param months The number of months by which to increment the month (if the value is positive) or decrement the month (if the value is negative).
    */
  def addMonths(months: scala.Double): scala.Unit = js.native
  /**
    * Increments or decrements the nanosecond.
    * @param nanoseconds The number of nanoseconds by which to increment the nanosecond (if the value is positive) or decrement the nanosecond (if the value is negative).
    */
  def addNanoseconds(nanoseconds: scala.Double): scala.Unit = js.native
  /**
    * Increments or decrements the period.
    * @param periods The number of periods by which to increment the period (if the value is positive) or decrement the period (if the value is negative).
    */
  def addPeriods(periods: scala.Double): scala.Unit = js.native
  /**
    * Increments or decrements the second.
    * @param seconds The number of seconds by which to increment the second (if the value is positive) or decrement the second (if the value is negative).
    */
  def addSeconds(seconds: scala.Double): scala.Unit = js.native
  /**
    * Increments or decrements the day by the specified number of weeks.
    * @param weeks The number of weeks by which to increment the day (if the value is positive) or decrement the day (if the value is negative).
    */
  def addWeeks(weeks: scala.Double): scala.Unit = js.native
  /**
    * Increments or decrements the year.
    * @param years The number of years by which to increment the year (if the value is positive) or decrement the year (if the value is negative).
    */
  def addYears(years: scala.Double): scala.Unit = js.native
  /**
    * Sets a new calendar system to be used by this Calendar object.
    * @param value The calendar identifier to use.
    */
  def changeCalendarSystem(value: java.lang.String): scala.Unit = js.native
  /**
    * Sets a new clock to be used by this Calendar object.
    * @param value The clock identifier to use.
    */
  def changeClock(value: java.lang.String): scala.Unit = js.native
  /**
    * Sets a new time zone to be used by this Calendar object.
    * @param timeZoneId An identifier from the IANA Time Zone Database which identifies the time zone that should be used (for example, "Americas/Los_Angeles" for Pacific Time).
    */
  def changeTimeZone(timeZoneId: java.lang.String): scala.Unit = js.native
  /**
    * Compares this calendar to another Calendar object and indicates whether the date and time of one is earlier, equal to, or later than that of the other.
    * @param other The Calendar object to compare to the current calendar.
    * @return One of the following values:
    */
  def compare(other: Calendar): scala.Double = js.native
  /**
    * Compares this calendar to a DateTime object and indicates whether the date and time of one is earlier, equal to, or later than that of the other.
    * @param other The DateTime object to compare to the current calendar.
    * @return One of the following values:
    */
  def compareDateTime(other: stdLib.Date): scala.Double = js.native
  /**
    * Copies the values from another Calendar object into this Calendar.
    * @param other The Calendar object to be copied.
    */
  def copyTo(other: Calendar): scala.Unit = js.native
  /**
    * Returns a string representation of the day, optionally zero-padded.
    * @param minDigits The minimum number of integer digits to be displayed. If the day does not have enough integer digits, it will be padded with zeros to the correct amount. For example, for the day 3, a parameter of 1 returns 3, and a parameter of 2 returns 03.
    * @return A string representation of the day.
    */
  def dayAsPaddedString(minDigits: scala.Double): java.lang.String = js.native
  /**
    * Returns a string that contains the numeric representation of the day.
    * @return A string representation of the day.
    */
  def dayAsString(): java.lang.String = js.native
  /**
    * Returns a string representation of the day of the week suitable for stand-alone display.
    * @return A string representation of the day of the week, using the most common abbreviation available.
    */
  def dayOfWeekAsSoloString(): java.lang.String = js.native
  /**
    * Returns a string representation of the day of the week suitable for stand-alone display.
    * @param idealLength A positive integer specifying the ideal length, in characters, for the returned string, or 0 specifying the most common abbreviation available.
    * @return A string representation of the day of the week.
    */
  def dayOfWeekAsSoloString(idealLength: scala.Double): java.lang.String = js.native
  /**
    * Returns a string representation of the day of the week suitable for inclusion with other date components.
    * @return A string representation of the day of the week, using the most common abbreviation available.
    */
  def dayOfWeekAsString(): java.lang.String = js.native
  /**
    * Returns a string representation of the day of the week suitable for inclusion with other date components.
    * @param idealLength A positive integer specifying the ideal length, in characters, for the returned string, or 0 specifying the most common abbreviation available.
    * @return A string representation of the day of the week.
    */
  def dayOfWeekAsString(idealLength: scala.Double): java.lang.String = js.native
  /**
    * Returns a string representation of the era.
    * @return A string representation of the era, using the most common abbreviation available.
    */
  def eraAsString(): java.lang.String = js.native
  /**
    * Returns a string representation of the era. The string chosen is closest in length to the ideal length.
    * @param idealLength A positive integer specifying the ideal length, in characters, for the returned string, or 0 specifying the most common abbreviation available.
    * @return A string representation of the era.
    */
  def eraAsString(idealLength: scala.Double): java.lang.String = js.native
  /**
    * Gets the calendar system that is used by this Calendar object.
    * @return The identifier of the calendar system.
    */
  def getCalendarSystem(): java.lang.String = js.native
  /**
    * Gets the clock that is used by this Calendar object.
    * @return The identifier of the clock.
    */
  def getClock(): java.lang.String = js.native
  /**
    * Builds a date and time, given the components of this Calendar object.
    * @return The DateTime representing the date and time of this Calendar .
    */
  def getDateTime(): stdLib.Date = js.native
  /**
    * Gets the identifier that identifies the time zone that is used by this Calendar object.
    * @return The identifier from the IANA Time Zone Database that identifies the time zone that is used by this Calendar object. (An example is "Americas/Los_Angeles" for Pacific Time.)
    */
  def getTimeZone(): java.lang.String = js.native
  /**
    * Returns a string representation of the hour, optionally zero-padded.
    * @param minDigits The minimum number of integer digits to be displayed. If the hour does not have enough integer digits, it will be padded with zeros to the correct amount. For example, for the hour 3, a parameter of 1 returns 3, and a parameter of 2 returns 03.
    * @return A string representation of the hour.
    */
  def hourAsPaddedString(minDigits: scala.Double): java.lang.String = js.native
  /**
    * Returns a string that contains the numeric representation of the hour.
    * @return A string representation of the hour.
    */
  def hourAsString(): java.lang.String = js.native
  /**
    * Returns a string representation of the minute, optionally zero-padded.
    * @param minDigits The minimum number of integer digits to be displayed. If the minute does not have enough integer digits, it will be padded with zeros to the correct amount. For example, for the minute 3, a parameter of 1 returns 3, and a parameter of 2 returns 03.
    * @return A string representation of the minute.
    */
  def minuteAsPaddedString(minDigits: scala.Double): java.lang.String = js.native
  /**
    * Returns a string that contains the numeric representation of the minute.
    * @return A string representation of the minute.
    */
  def minuteAsString(): java.lang.String = js.native
  /**
    * Returns a string that contains the numeric representation of the month.
    * @return A string representation of the month.
    */
  def monthAsNumericString(): java.lang.String = js.native
  /**
    * Returns a string representation of the month, optionally zero-padded.
    * @param minDigits The minimum number of integer digits to be displayed. If the month does not have enough integer digits, it will be padded with zeros to the correct amount. For example, for the month 3, a parameter of 1 returns 3, and a parameter of 2 returns 03.
    * @return A string representation of the month.
    */
  def monthAsPaddedNumericString(minDigits: scala.Double): java.lang.String = js.native
  /**
    * Returns a string representation of the month suitable for stand-alone display.
    * @return A string representation of the month, using the most common abbreviation available.
    */
  def monthAsSoloString(): java.lang.String = js.native
  /**
    * Returns a string representation of the month suitable for stand-alone display.
    * @param idealLength A positive integer specifying the ideal length, in characters, for the returned string, or 0 specifying the most common abbreviation available.
    * @return A string representation of the month.
    */
  def monthAsSoloString(idealLength: scala.Double): java.lang.String = js.native
  /**
    * Returns a string representation of the month suitable for inclusion with other date components.
    * @return A string representation of the month, using the most common abbreviation available.
    */
  def monthAsString(): java.lang.String = js.native
  /**
    * Returns a string representation of the month suitable for inclusion with other date components.
    * @param idealLength A positive integer specifying the ideal length, in characters, for the returned string, or 0 specifying the most common abbreviation available.
    * @return A string representation of the month.
    */
  def monthAsString(idealLength: scala.Double): java.lang.String = js.native
  /**
    * Returns a string representation of the nanosecond, optionally zero-padded.
    * @param minDigits The minimum number of integer digits to be displayed. If the nanosecond does not have enough integer digits, it will be padded with zeros to the correct amount. For example, for the nanosecond 42, a parameter of 1 or 2 returns 42, and a parameter of 3 returns 042.
    * @return A string representation of the nanosecond.
    */
  def nanosecondAsPaddedString(minDigits: scala.Double): java.lang.String = js.native
  /**
    * Returns a string that contains the numeric representation of the nanosecond.
    * @return A string representation of the nanosecond.
    */
  def nanosecondAsString(): java.lang.String = js.native
  /**
    * Returns a string representation of the day period, such as AM or PM, that uses the most common abbreviation available.
    * @return A string representation of the day period.
    */
  def periodAsString(): java.lang.String = js.native
  /**
    * Returns a string representation of the day period, such as AM or PM.
    * @param idealLength A positive integer that specifies the ideal length, in characters, for the returned string; or a zero that specifies the most common abbreviation available.
    * @return A string representation for the day period.
    */
  def periodAsString(idealLength: scala.Double): java.lang.String = js.native
  /**
    * Returns a string representation of the second, optionally zero-padded.
    * @param minDigits The minimum number of integer digits to be displayed. If the second does not have enough integer digits, it will be padded with zeros to the correct amount. For example, for the second 3, a parameter of 1 returns 3, and a parameter of 2 returns 03.
    * @return A string representation of the second.
    */
  def secondAsPaddedString(minDigits: scala.Double): java.lang.String = js.native
  /**
    * Returns a string that contains the numeric representation of the second.
    * @return A string representation of the second.
    */
  def secondAsString(): java.lang.String = js.native
  /**
    * Sets all the date and time fields to the date and time represented by the DateTime parameter.
    * @param value The DateTime that is used to set all of the date and time fields.
    */
  def setDateTime(value: stdLib.Date): scala.Unit = js.native
  /** Sets the components of this Calendar object to the latest date and time that are supported. */
  def setToMax(): scala.Unit = js.native
  /** Sets the components of this Calendar object to the earliest date and time that are supported. */
  def setToMin(): scala.Unit = js.native
  /** Sets the components of this Calendar object to the current date and time. */
  def setToNow(): scala.Unit = js.native
  /**
    * Returns the full time zone name applicable at the instant of time that this Calendar object represents.
    * @return The full time zone name. This usually differs depending on whether the time zone is observing Daylight Saving Time or not. It also may differ due to historical changes. (An example is "Americas/Los_Angeles" for Pacific Time.)
    */
  def timeZoneAsString(): java.lang.String = js.native
  /**
    * Returns the abbreviated time zone name applicable at the instant of time that this Calendar object represents.
    * @param idealLength The desired length of the abbreviation to be returned. Use 0 to request the abbreviation in most common use.
    * @return The time zone abbreviation that is closest in length to idealLength. If there is a tie, the shorter abbreviation is returned. If idealLength is 0, the abbreviation in most common use is returned. (An example is "Americas/Los_Angeles" for Pacific Time.)
    */
  def timeZoneAsString(idealLength: scala.Double): java.lang.String = js.native
  /**
    * Returns a string representation of the year, optionally zero-padded.
    * @param minDigits The minimum number of integer digits to be displayed. If the year does not have enough integer digits, it will be padded with zeros to the correct amount. For example, for the year 42, a parameter of 1 or 2 returns 42, and a parameter of 3 returns 042.
    * @return A string representation of the year.
    */
  def yearAsPaddedString(minDigits: scala.Double): java.lang.String = js.native
  /**
    * Returns a string representation of the year without any initial zero padding.
    * @return A string representation of the year.
    */
  def yearAsString(): java.lang.String = js.native
  /**
    * Returns a string representation of the year, optionally truncated.
    * @param remainingDigits A positive integer that represents the number of least significant digits that should be included. For example, for the year 1234, a parameter of 2 returns 34, and a parameter of 4 or larger returns 1234.
    * @return A string representation of the year.
    */
  def yearAsTruncatedString(remainingDigits: scala.Double): java.lang.String = js.native
}

