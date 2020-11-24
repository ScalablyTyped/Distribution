package typings.winrtUwp.Windows.Globalization.DateTimeFormatting

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Formats dates and times. */
@js.native
trait DateTimeFormatter extends js.Object {
  
  /** Gets the calendar that is used when formatting dates. */
  var calendar: String = js.native
  
  /** Gets the clock that is used when formatting times. */
  var clock: String = js.native
  
  /**
    * Returns a string that represents the given date and time in the given time zone, conforming to the template the formatter is currently using.
    * @param datetime The date and time to be formatted.
    * @param timeZoneId An identifier from the IANA Time Zone Database which identifies the time zone that should be used (for example, "Americas/Los_Angeles" for Pacific Time).
    * @return A string that represents the date, time, and time zone.
    */
  def format(datetime: Date, timeZoneId: String): String = js.native
  /**
    * Returns a string representation of the provided date and time.
    * @param value The date and time to be formatted.
    * @return A string that represents the date and time.
    */
  def format(value: Date): String = js.native
  
  /** Gets or sets the region that is used when formatting dates and times. */
  var geographicRegion: String = js.native
  
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
  var languages: IVectorView[String] = js.native
  
  /** Gets or sets the numbering system that is used to format dates and times. */
  var numeralSystem: String = js.native
  
  /** Gets the patterns corresponding to this template that are used when formatting dates and times. */
  var patterns: IVectorView[String] = js.native
  
  /** Gets the geographic region that was most recently used to format dates and times. */
  var resolvedGeographicRegion: String = js.native
  
  /** Gets the language that was most recently used to format dates and times. */
  var resolvedLanguage: String = js.native
  
  /** Gets a string representation of this format template. */
  var template: String = js.native
}
