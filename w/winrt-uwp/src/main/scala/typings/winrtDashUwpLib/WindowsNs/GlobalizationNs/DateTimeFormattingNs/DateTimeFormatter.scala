package typings
package winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Formats dates and times. */
@JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter")
@js.native
class DateTimeFormatter protected () extends js.Object {
  /**
    * Creates a DateTimeFormatter object that is initialized by a format template string.
    * @param formatTemplate A format template string that specifies the requested components. The order of the components is irrelevant. This can also be a format pattern. See the remarks for the DateTimeFormatter class for a list of valid format templates and format patterns.
    */
  def this(formatTemplate: java.lang.String) = this()
  /**
    * Creates a DateTimeFormatter object that is initialized by a format template string and language list.
    * @param formatTemplate A format template string that specifies the requested components. The order of the components is irrelevant. This can also be a format pattern. See the remarks for the DateTimeFormatter class for a list of valid format templates and format patterns.
    * @param languages The list of language identifiers, in priority order, that represent the choice of languages. These identifiers are used for resolving the template to a pattern and for formatting. See Remarks.
    */
  def this(formatTemplate: java.lang.String, languages: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]) = this()
  /**
    * Creates a DateTimeFormatter object that is initialized with hour, minute, and second formats.
    * @param hourFormat The desired hour format to include in the template.
    * @param minuteFormat The desired minute format to include in the template.
    * @param secondFormat The desired second format to include in the template.
    */
  def this(hourFormat: HourFormat, minuteFormat: MinuteFormat, secondFormat: SecondFormat) = this()
  /**
    * Creates a DateTimeFormatter object that is initialized with year, month, day, and day of week formats.
    * @param yearFormat The desired year format to include in the template.
    * @param monthFormat The desired month format to include in the template.
    * @param dayFormat The desired day format to include in the template.
    * @param dayOfWeekFormat The desired day of week format to include in the template.
    */
  def this(yearFormat: YearFormat, monthFormat: MonthFormat, dayFormat: DayFormat, dayOfWeekFormat: DayOfWeekFormat) = this()
  /**
    * Creates a DateTimeFormatter object that is initialized by a format template string, language list, geographic region, calendar, and clock.
    * @param formatTemplate A format template string that specifies the requested components. The order of the components is irrelevant. This can also be a format pattern. See the remarks for the DateTimeFormatter class for a list of valid format templates and format patterns.
    * @param languages The list of language identifiers, in priority order, that represent the choice of languages. These identifiers are used for resolving the template to a pattern, and for formatting. See Remarks.
    * @param geographicRegion The identifier for the geographic region. This identifier is used for resolving the template to a pattern.
    * @param calendar The calendar identifier to use.
    * @param clock The clock identifier to use.
    */
  def this(formatTemplate: java.lang.String, languages: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String], geographicRegion: java.lang.String, calendar: java.lang.String, clock: java.lang.String) = this()
  /**
    * Creates a DateTimeFormatter object that is initialized with year, month, day, day of week, hour, minute, and second formats, and a language list.
    * @param yearFormat The year format to include in the template.
    * @param monthFormat The month format to include in the template.
    * @param dayFormat The day format to include in the template.
    * @param dayOfWeekFormat The day of week format to include in the template.
    * @param hourFormat The hour format to include in the template.
    * @param minuteFormat The minute format to include in the template.
    * @param secondFormat The second format to include in the template.
    * @param languages The list of language identifiers, in priority order, that represent the choice of languages. These identifiers are used for resolving the template to a pattern and for formatting. See Remarks.
    */
  def this(yearFormat: YearFormat, monthFormat: MonthFormat, dayFormat: DayFormat, dayOfWeekFormat: DayOfWeekFormat, hourFormat: HourFormat, minuteFormat: MinuteFormat, secondFormat: SecondFormat, languages: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]) = this()
  /**
    * Creates a DateTimeFormatter object with all formats and identifiers specified.
    * @param yearFormat The desired year format to include in the template.
    * @param monthFormat The desired month format to include in the template.
    * @param dayFormat The desired day format to include in the template.
    * @param dayOfWeekFormat The desired day of week format to include in the template.
    * @param hourFormat The desired hour format to include in the template.
    * @param minuteFormat The desired minute format to include in the template.
    * @param secondFormat The desired second format to include in the template.
    * @param languages The list of language identifiers, in priority order, that represent the choice of languages. These identifiers are used for resolving the template to a pattern, and for formatting. See Remarks.
    * @param geographicRegion The identifier for the geographic region. This identifier is used for resolving the template to a pattern.
    * @param calendar The calendar identifier to use.
    * @param clock The clock identifier to use.
    */
  def this(yearFormat: YearFormat, monthFormat: MonthFormat, dayFormat: DayFormat, dayOfWeekFormat: DayOfWeekFormat, hourFormat: HourFormat, minuteFormat: MinuteFormat, secondFormat: SecondFormat, languages: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String], geographicRegion: java.lang.String, calendar: java.lang.String, clock: java.lang.String) = this()
  /** Gets the calendar that is used when formatting dates. */
  var calendar: java.lang.String = js.native
  /** Gets the clock that is used when formatting times. */
  var clock: java.lang.String = js.native
  /** Gets or sets the region that is used when formatting dates and times. */
  var geographicRegion: java.lang.String = js.native
  /** Gets the DayFormat in the template. */
  var includeDay: DayFormat = js.native
  /** Gets the DayOfWeekFormat in the template. */
  var includeDayOfWeek: DayOfWeekFormat = js.native
  /** Gets the HourFormat in the template. */
  var includeHour: HourFormat = js.native
  /** Gets the MinuteFormat in the template. */
  var includeMinute: MinuteFormat = js.native
  /** Gets the MonthFormat in the template. */
  var includeMonth: MonthFormat = js.native
  /** Gets the SecondFormat in the template. */
  var includeSecond: SecondFormat = js.native
  /** Gets the YearFormat in the template. */
  var includeYear: YearFormat = js.native
  /** Gets the priority list of language identifiers that is used when formatting dates and times. */
  var languages: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** Gets or sets the numbering system that is used to format dates and times. */
  var numeralSystem: java.lang.String = js.native
  /** Gets the patterns corresponding to this template that are used when formatting dates and times. */
  var patterns: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** Gets the geographic region that was most recently used to format dates and times. */
  var resolvedGeographicRegion: java.lang.String = js.native
  /** Gets the language that was most recently used to format dates and times. */
  var resolvedLanguage: java.lang.String = js.native
  /** Gets a string representation of this format template. */
  var template: java.lang.String = js.native
  /**
    * Returns a string that represents the given date and time in the given time zone, conforming to the template the formatter is currently using.
    * @param datetime The date and time to be formatted.
    * @param timeZoneId An identifier from the IANA Time Zone Database which identifies the time zone that should be used (for example, "Americas/Los_Angeles" for Pacific Time).
    * @return A string that represents the date, time, and time zone.
    */
  def format(datetime: stdLib.Date, timeZoneId: java.lang.String): java.lang.String = js.native
  /**
    * Returns a string representation of the provided date and time.
    * @param value The date and time to be formatted.
    * @return A string that represents the date and time.
    */
  def format(value: stdLib.Date): java.lang.String = js.native
}

/* static members */
@JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter")
@js.native
object DateTimeFormatter extends js.Object {
  /** Gets the DateTimeFormatter object that formats dates according to the user's choice of long date pattern. */
  var longDate: winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DateTimeFormatter = js.native
  /** Gets the DateTimeFormatter object that formats times according to the user's choice of long time pattern. */
  var longTime: winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DateTimeFormatter = js.native
  /** Gets the DateTimeFormatter object that formats dates according to the user's choice of short date pattern. */
  var shortDate: winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DateTimeFormatter = js.native
  /** Gets the DateTimeFormatter object that formats times according to the user's choice of short time pattern. */
  var shortTime: winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DateTimeFormatter = js.native
}

