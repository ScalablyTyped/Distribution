package typings.winrtUwp.Windows.Globalization

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables formatting of dates and times. */
object DateTimeFormatting {
  
  @js.native
  sealed trait DayFormat extends StObject
  /** Specifies the intended format for the day in a DateTimeFormatter object. */
  @JSGlobal("Windows.Globalization.DateTimeFormatting.DayFormat")
  @js.native
  object DayFormat extends StObject {
    
    /** Display the day in the most natural way. This will depend on the context, such as the language or calendar (for example, for the Hebrew calendar and Hebrew language, use the Hebrew numbering system). */
    @js.native
    sealed trait default
      extends StObject
         with DayFormat
    
    /** Do not display the day. */
    @js.native
    sealed trait none
      extends StObject
         with DayFormat
  }
  
  @js.native
  sealed trait DayOfWeekFormat extends StObject
  /** Specifies the intended format for the day of the week in a DateTimeFormatter object. */
  @JSGlobal("Windows.Globalization.DateTimeFormatting.DayOfWeekFormat")
  @js.native
  object DayOfWeekFormat extends StObject {
    
    /** Display the day of the week in the most natural way. It may be abbreviated or full depending on the context, such as the language or calendar that is being used. */
    @js.native
    sealed trait default
      extends StObject
         with DayOfWeekFormat
    
    /** Display an abbreviated version of the day of the week (for example, "Thur" for Thursday). */
    @js.native
    sealed trait abbreviated
      extends StObject
         with DayOfWeekFormat
    
    /** Display the day of the week in its entirety (for example, "Thursday"). */
    @js.native
    sealed trait full
      extends StObject
         with DayOfWeekFormat
    
    /** Do not display the day of the week. */
    @js.native
    sealed trait none
      extends StObject
         with DayOfWeekFormat
  }
  
  @js.native
  sealed trait HourFormat extends StObject
  /** Specifies the intended format for the hour in a DateTimeFormatter object. */
  @JSGlobal("Windows.Globalization.DateTimeFormatting.HourFormat")
  @js.native
  object HourFormat extends StObject {
    
    /** Display the hour in the most natural way. This will depend on the context, such as the language or clock that is being used. */
    @js.native
    sealed trait default
      extends StObject
         with HourFormat
    
    /** Do not display the hour. */
    @js.native
    sealed trait none
      extends StObject
         with HourFormat
  }
  
  @js.native
  sealed trait MinuteFormat extends StObject
  /** Specifies the intended format for the minute in a DateTimeFormatter object. */
  @JSGlobal("Windows.Globalization.DateTimeFormatting.MinuteFormat")
  @js.native
  object MinuteFormat extends StObject {
    
    /** Display the minute in the most natural way. This will depend on the context, such as the language or clock that is being used. */
    @js.native
    sealed trait default
      extends StObject
         with MinuteFormat
    
    /** Do not display the minute. */
    @js.native
    sealed trait none
      extends StObject
         with MinuteFormat
  }
  
  @js.native
  sealed trait MonthFormat extends StObject
  /** Specifies the intended format for the month in a DateTimeFormatter object. */
  @JSGlobal("Windows.Globalization.DateTimeFormatting.MonthFormat")
  @js.native
  object MonthFormat extends StObject {
    
    /** Display the month in the most natural way. It may be abbreviated, full, or numeric depending on the context, such as the language or calendar that is being used. */
    @js.native
    sealed trait default
      extends StObject
         with MonthFormat
    
    /** Display an abbreviated version of the month (for example, "Sep" for September). */
    @js.native
    sealed trait abbreviated
      extends StObject
         with MonthFormat
    
    /** Display the month in its entirety (for example, "September"). */
    @js.native
    sealed trait full
      extends StObject
         with MonthFormat
    
    /** Do not display the month. */
    @js.native
    sealed trait none
      extends StObject
         with MonthFormat
    
    /** Display the month as a number (for example, "9" for September). */
    @js.native
    sealed trait numeric
      extends StObject
         with MonthFormat
  }
  
  @js.native
  sealed trait SecondFormat extends StObject
  /** Specifies the intended format for the second in a DateTimeFormatter object. */
  @JSGlobal("Windows.Globalization.DateTimeFormatting.SecondFormat")
  @js.native
  object SecondFormat extends StObject {
    
    /** Display the second in the most natural way. This will depend on the context, such as the language or clock that is being used. */
    @js.native
    sealed trait default
      extends StObject
         with SecondFormat
    
    /** Do not display the second. */
    @js.native
    sealed trait none
      extends StObject
         with SecondFormat
  }
  
  @js.native
  sealed trait YearFormat extends StObject
  /** Specifies the intended format for the year in a DateTimeFormatter object. */
  @JSGlobal("Windows.Globalization.DateTimeFormatting.YearFormat")
  @js.native
  object YearFormat extends StObject {
    
    /** Display the year in the most natural way. It may be abbreviated or full depending on the context, such as the language or calendar that is being used. */
    @js.native
    sealed trait default
      extends StObject
         with YearFormat
    
    /** Display an abbreviated version of the year (for example, "11" for Gregorian 2011). */
    @js.native
    sealed trait abbreviated
      extends StObject
         with YearFormat
    
    /** Display the year in its entirety (for example, "2011" for Gregorian 2011). */
    @js.native
    sealed trait full
      extends StObject
         with YearFormat
    
    /** Do not display the year. */
    @js.native
    sealed trait none
      extends StObject
         with YearFormat
  }
  
  /** Formats dates and times. */
  @js.native
  trait DateTimeFormatter extends StObject {
    
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
    def format(datetime: js.Date, timeZoneId: String): String = js.native
    /**
      * Returns a string representation of the provided date and time.
      * @param value The date and time to be formatted.
      * @return A string that represents the date and time.
      */
    def format(value: js.Date): String = js.native
    
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
}
