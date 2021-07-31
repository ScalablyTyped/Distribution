package typings.winrtUwp.global.Windows.Globalization

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DayFormat
import typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat
import typings.winrtUwp.Windows.Globalization.DateTimeFormatting.HourFormat
import typings.winrtUwp.Windows.Globalization.DateTimeFormatting.MinuteFormat
import typings.winrtUwp.Windows.Globalization.DateTimeFormatting.MonthFormat
import typings.winrtUwp.Windows.Globalization.DateTimeFormatting.SecondFormat
import typings.winrtUwp.Windows.Globalization.DateTimeFormatting.YearFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables formatting of dates and times. */
object DateTimeFormatting {
  
  /** Formats dates and times. */
  @JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter")
  @js.native
  class DateTimeFormatter protected ()
    extends StObject
       with typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DateTimeFormatter {
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
  object DateTimeFormatter {
    
    @JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the DateTimeFormatter object that formats dates according to the user's choice of long date pattern. */
    /* static member */
    @JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter.longDate")
    @js.native
    def longDate: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DateTimeFormatter = js.native
    @scala.inline
    def longDate_=(x: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("longDate")(x.asInstanceOf[js.Any])
    
    /** Gets the DateTimeFormatter object that formats times according to the user's choice of long time pattern. */
    /* static member */
    @JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter.longTime")
    @js.native
    def longTime: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DateTimeFormatter = js.native
    @scala.inline
    def longTime_=(x: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("longTime")(x.asInstanceOf[js.Any])
    
    /** Gets the DateTimeFormatter object that formats dates according to the user's choice of short date pattern. */
    /* static member */
    @JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter.shortDate")
    @js.native
    def shortDate: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DateTimeFormatter = js.native
    @scala.inline
    def shortDate_=(x: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shortDate")(x.asInstanceOf[js.Any])
    
    /** Gets the DateTimeFormatter object that formats times according to the user's choice of short time pattern. */
    /* static member */
    @JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter.shortTime")
    @js.native
    def shortTime: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DateTimeFormatter = js.native
    @scala.inline
    def shortTime_=(x: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shortTime")(x.asInstanceOf[js.Any])
  }
  
  /** Specifies the intended format for the day in a DateTimeFormatter object. */
  @JSGlobal("Windows.Globalization.DateTimeFormatting.DayFormat")
  @js.native
  object DayFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DayFormat & Double] = js.native
    
    /* 1 */ val default: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DayFormat.default & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DayFormat.none & Double = js.native
  }
  
  /** Specifies the intended format for the day of the week in a DateTimeFormatter object. */
  @JSGlobal("Windows.Globalization.DateTimeFormatting.DayOfWeekFormat")
  @js.native
  object DayOfWeekFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat & Double
      ] = js.native
    
    /* 1 */ val default: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.default & Double = js.native
    
    /* 2 */ val abbreviated: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.abbreviated & Double = js.native
    
    /* 3 */ val full: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.full & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.none & Double = js.native
  }
  
  /** Specifies the intended format for the hour in a DateTimeFormatter object. */
  @JSGlobal("Windows.Globalization.DateTimeFormatting.HourFormat")
  @js.native
  object HourFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Globalization.DateTimeFormatting.HourFormat & Double] = js.native
    
    /* 1 */ val default: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.HourFormat.default & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.HourFormat.none & Double = js.native
  }
  
  /** Specifies the intended format for the minute in a DateTimeFormatter object. */
  @JSGlobal("Windows.Globalization.DateTimeFormatting.MinuteFormat")
  @js.native
  object MinuteFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Globalization.DateTimeFormatting.MinuteFormat & Double] = js.native
    
    /* 1 */ val default: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.MinuteFormat.default & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.MinuteFormat.none & Double = js.native
  }
  
  /** Specifies the intended format for the month in a DateTimeFormatter object. */
  @JSGlobal("Windows.Globalization.DateTimeFormatting.MonthFormat")
  @js.native
  object MonthFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Globalization.DateTimeFormatting.MonthFormat & Double] = js.native
    
    /* 1 */ val default: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.MonthFormat.default & Double = js.native
    
    /* 2 */ val abbreviated: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.MonthFormat.abbreviated & Double = js.native
    
    /* 3 */ val full: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.MonthFormat.full & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.MonthFormat.none & Double = js.native
    
    /* 4 */ val numeric: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.MonthFormat.numeric & Double = js.native
  }
  
  /** Specifies the intended format for the second in a DateTimeFormatter object. */
  @JSGlobal("Windows.Globalization.DateTimeFormatting.SecondFormat")
  @js.native
  object SecondFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Globalization.DateTimeFormatting.SecondFormat & Double] = js.native
    
    /* 1 */ val default: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.SecondFormat.default & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.SecondFormat.none & Double = js.native
  }
  
  /** Specifies the intended format for the year in a DateTimeFormatter object. */
  @JSGlobal("Windows.Globalization.DateTimeFormatting.YearFormat")
  @js.native
  object YearFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Globalization.DateTimeFormatting.YearFormat & Double] = js.native
    
    /* 1 */ val default: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.YearFormat.default & Double = js.native
    
    /* 2 */ val abbreviated: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.YearFormat.abbreviated & Double = js.native
    
    /* 3 */ val full: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.YearFormat.full & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Globalization.DateTimeFormatting.YearFormat.none & Double = js.native
  }
}
