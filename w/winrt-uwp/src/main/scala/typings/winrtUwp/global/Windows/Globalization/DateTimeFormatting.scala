package typings.winrtUwp.global.Windows.Globalization

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DayFormat
import typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat
import typings.winrtUwp.Windows.Globalization.DateTimeFormatting.HourFormat
import typings.winrtUwp.Windows.Globalization.DateTimeFormatting.MinuteFormat
import typings.winrtUwp.Windows.Globalization.DateTimeFormatting.MonthFormat
import typings.winrtUwp.Windows.Globalization.DateTimeFormatting.SecondFormat
import typings.winrtUwp.Windows.Globalization.DateTimeFormatting.YearFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables formatting of dates and times. */
@JSGlobal("Windows.Globalization.DateTimeFormatting")
@js.native
object DateTimeFormatting extends js.Object {
  /** Formats dates and times. */
  @js.native
  class DateTimeFormatter protected ()
    extends typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DateTimeFormatter {
    /**
      * Creates a DateTimeFormatter object that is initialized by a format template string.
      * @param formatTemplate A format template string that specifies the requested components. The order of the components is irrelevant. This can also be a format pattern. See the remarks for the DateTimeFormatter class for a list of valid format templates and format patterns.
      */
    def this(formatTemplate: String) = this()
    /**
      * Creates a DateTimeFormatter object that is initialized by a format template string and language list.
      * @param formatTemplate A format template string that specifies the requested components. The order of the components is irrelevant. This can also be a format pattern. See the remarks for the DateTimeFormatter class for a list of valid format templates and format patterns.
      * @param languages The list of language identifiers, in priority order, that represent the choice of languages. These identifiers are used for resolving the template to a pattern and for formatting. See Remarks.
      */
    def this(formatTemplate: String, languages: IIterable[String]) = this()
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
    def this(
      yearFormat: YearFormat,
      monthFormat: MonthFormat,
      dayFormat: DayFormat,
      dayOfWeekFormat: DayOfWeekFormat
    ) = this()
    /**
      * Creates a DateTimeFormatter object that is initialized by a format template string, language list, geographic region, calendar, and clock.
      * @param formatTemplate A format template string that specifies the requested components. The order of the components is irrelevant. This can also be a format pattern. See the remarks for the DateTimeFormatter class for a list of valid format templates and format patterns.
      * @param languages The list of language identifiers, in priority order, that represent the choice of languages. These identifiers are used for resolving the template to a pattern, and for formatting. See Remarks.
      * @param geographicRegion The identifier for the geographic region. This identifier is used for resolving the template to a pattern.
      * @param calendar The calendar identifier to use.
      * @param clock The clock identifier to use.
      */
    def this(
      formatTemplate: String,
      languages: IIterable[String],
      geographicRegion: String,
      calendar: String,
      clock: String
    ) = this()
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
    def this(
      yearFormat: YearFormat,
      monthFormat: MonthFormat,
      dayFormat: DayFormat,
      dayOfWeekFormat: DayOfWeekFormat,
      hourFormat: HourFormat,
      minuteFormat: MinuteFormat,
      secondFormat: SecondFormat,
      languages: IIterable[String]
    ) = this()
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
    def this(
      yearFormat: YearFormat,
      monthFormat: MonthFormat,
      dayFormat: DayFormat,
      dayOfWeekFormat: DayOfWeekFormat,
      hourFormat: HourFormat,
      minuteFormat: MinuteFormat,
      secondFormat: SecondFormat,
      languages: IIterable[String],
      geographicRegion: String,
      calendar: String,
      clock: String
    ) = this()
  }
  
  /* static members */
  @js.native
  object DateTimeFormatter extends js.Object {
    /** Gets the DateTimeFormatter object that formats dates according to the user's choice of long date pattern. */
    var longDate: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DateTimeFormatter = js.native
    /** Gets the DateTimeFormatter object that formats times according to the user's choice of long time pattern. */
    var longTime: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DateTimeFormatter = js.native
    /** Gets the DateTimeFormatter object that formats dates according to the user's choice of short date pattern. */
    var shortDate: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DateTimeFormatter = js.native
    /** Gets the DateTimeFormatter object that formats times according to the user's choice of short time pattern. */
    var shortTime: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DateTimeFormatter = js.native
  }
  
  /** Specifies the intended format for the day in a DateTimeFormatter object. */
  @js.native
  object DayFormat extends js.Object {
    /* 1 */ val default: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DayFormat.default with Double = js.native
    /* 0 */ val none: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DayFormat.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DayFormat with Double] = js.native
  }
  
  /** Specifies the intended format for the day of the week in a DateTimeFormatter object. */
  @js.native
  object DayOfWeekFormat extends js.Object {
    /* 2 */ val abbreviated: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.abbreviated with Double = js.native
    /* 1 */ val default: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.default with Double = js.native
    /* 3 */ val full: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.full with Double = js.native
    /* 0 */ val none: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat with Double
      ] = js.native
  }
  
  /** Specifies the intended format for the hour in a DateTimeFormatter object. */
  @js.native
  object HourFormat extends js.Object {
    /* 1 */ val default: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.HourFormat.default with Double = js.native
    /* 0 */ val none: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.HourFormat.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Globalization.DateTimeFormatting.HourFormat with Double] = js.native
  }
  
  /** Specifies the intended format for the minute in a DateTimeFormatter object. */
  @js.native
  object MinuteFormat extends js.Object {
    /* 1 */ val default: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.MinuteFormat.default with Double = js.native
    /* 0 */ val none: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.MinuteFormat.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Globalization.DateTimeFormatting.MinuteFormat with Double
      ] = js.native
  }
  
  /** Specifies the intended format for the month in a DateTimeFormatter object. */
  @js.native
  object MonthFormat extends js.Object {
    /* 2 */ val abbreviated: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.MonthFormat.abbreviated with Double = js.native
    /* 1 */ val default: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.MonthFormat.default with Double = js.native
    /* 3 */ val full: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.MonthFormat.full with Double = js.native
    /* 0 */ val none: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.MonthFormat.none with Double = js.native
    /* 4 */ val numeric: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.MonthFormat.numeric with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Globalization.DateTimeFormatting.MonthFormat with Double
      ] = js.native
  }
  
  /** Specifies the intended format for the second in a DateTimeFormatter object. */
  @js.native
  object SecondFormat extends js.Object {
    /* 1 */ val default: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.SecondFormat.default with Double = js.native
    /* 0 */ val none: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.SecondFormat.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Globalization.DateTimeFormatting.SecondFormat with Double
      ] = js.native
  }
  
  /** Specifies the intended format for the year in a DateTimeFormatter object. */
  @js.native
  object YearFormat extends js.Object {
    /* 2 */ val abbreviated: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.YearFormat.abbreviated with Double = js.native
    /* 1 */ val default: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.YearFormat.default with Double = js.native
    /* 3 */ val full: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.YearFormat.full with Double = js.native
    /* 0 */ val none: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.YearFormat.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Globalization.DateTimeFormatting.YearFormat with Double] = js.native
  }
  
}

