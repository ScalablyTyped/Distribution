package typings.winrt.global.Windows

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Globalization.DateTimeFormatting.DayFormat
import typings.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat
import typings.winrt.Windows.Globalization.DateTimeFormatting.HourFormat
import typings.winrt.Windows.Globalization.DateTimeFormatting.MinuteFormat
import typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat
import typings.winrt.Windows.Globalization.DateTimeFormatting.SecondFormat
import typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Globalization {
  
  @JSGlobal("Windows.Globalization.ApplicationLanguages")
  @js.native
  class ApplicationLanguages ()
    extends typings.winrt.Windows.Globalization.ApplicationLanguages
  /* static members */
  object ApplicationLanguages {
    
    @JSGlobal("Windows.Globalization.ApplicationLanguages")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Globalization.ApplicationLanguages.languages")
    @js.native
    def languages: IVectorView[String] = js.native
    @scala.inline
    def languages_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("languages")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Globalization.ApplicationLanguages.manifestLanguages")
    @js.native
    def manifestLanguages: IVectorView[String] = js.native
    @scala.inline
    def manifestLanguages_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("manifestLanguages")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Globalization.ApplicationLanguages.primaryLanguageOverride")
    @js.native
    def primaryLanguageOverride: String = js.native
    @scala.inline
    def primaryLanguageOverride_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primaryLanguageOverride")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Globalization.Calendar")
  @js.native
  class Calendar ()
    extends typings.winrt.Windows.Globalization.Calendar {
    def this(languages: IIterable[String]) = this()
    def this(languages: IIterable[String], calendar: String, clock: String) = this()
  }
  
  @JSGlobal("Windows.Globalization.CalendarIdentifiers")
  @js.native
  class CalendarIdentifiers ()
    extends typings.winrt.Windows.Globalization.CalendarIdentifiers
  /* static members */
  object CalendarIdentifiers {
    
    @JSGlobal("Windows.Globalization.CalendarIdentifiers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Globalization.CalendarIdentifiers.gregorian")
    @js.native
    def gregorian: String = js.native
    @scala.inline
    def gregorian_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gregorian")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Globalization.CalendarIdentifiers.hebrew")
    @js.native
    def hebrew: String = js.native
    @scala.inline
    def hebrew_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hebrew")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Globalization.CalendarIdentifiers.hijri")
    @js.native
    def hijri: String = js.native
    @scala.inline
    def hijri_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hijri")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Globalization.CalendarIdentifiers.japanese")
    @js.native
    def japanese: String = js.native
    @scala.inline
    def japanese_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("japanese")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Globalization.CalendarIdentifiers.julian")
    @js.native
    def julian: String = js.native
    @scala.inline
    def julian_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("julian")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Globalization.CalendarIdentifiers.korean")
    @js.native
    def korean: String = js.native
    @scala.inline
    def korean_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("korean")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Globalization.CalendarIdentifiers.taiwan")
    @js.native
    def taiwan: String = js.native
    @scala.inline
    def taiwan_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("taiwan")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Globalization.CalendarIdentifiers.thai")
    @js.native
    def thai: String = js.native
    @scala.inline
    def thai_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("thai")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Globalization.CalendarIdentifiers.umAlQura")
    @js.native
    def umAlQura: String = js.native
    @scala.inline
    def umAlQura_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("umAlQura")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Globalization.ClockIdentifiers")
  @js.native
  class ClockIdentifiers ()
    extends typings.winrt.Windows.Globalization.ClockIdentifiers
  /* static members */
  object ClockIdentifiers {
    
    @JSGlobal("Windows.Globalization.ClockIdentifiers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Globalization.ClockIdentifiers.twelveHour")
    @js.native
    def twelveHour: String = js.native
    @scala.inline
    def twelveHour_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("twelveHour")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Globalization.ClockIdentifiers.twentyFourHour")
    @js.native
    def twentyFourHour: String = js.native
    @scala.inline
    def twentyFourHour_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("twentyFourHour")(x.asInstanceOf[js.Any])
  }
  
  object Collation {
    
    @JSGlobal("Windows.Globalization.Collation.CharacterGrouping")
    @js.native
    class CharacterGrouping ()
      extends typings.winrt.Windows.Globalization.Collation.CharacterGrouping
    
    @JSGlobal("Windows.Globalization.Collation.CharacterGroupings")
    @js.native
    class CharacterGroupings ()
      extends typings.winrt.Windows.Globalization.Collation.CharacterGroupings
  }
  
  object DateTimeFormatting {
    
    @JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter")
    @js.native
    class DateTimeFormatter protected ()
      extends typings.winrt.Windows.Globalization.DateTimeFormatting.DateTimeFormatter {
      def this(formatTemplate: String) = this()
      def this(formatTemplate: String, languages: IIterable[String]) = this()
      def this(hourFormat: HourFormat, minuteFormat: MinuteFormat, secondFormat: SecondFormat) = this()
      def this(
        yearFormat: YearFormat,
        monthFormat: MonthFormat,
        dayFormat: DayFormat,
        dayOfWeekFormat: DayOfWeekFormat
      ) = this()
      def this(
        formatTemplate: String,
        languages: IIterable[String],
        geographicRegion: String,
        calendar: String,
        clock: String
      ) = this()
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
    object DateTimeFormatter {
      
      @JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter.longDate")
      @js.native
      def longDate: typings.winrt.Windows.Globalization.DateTimeFormatting.DateTimeFormatter = js.native
      @scala.inline
      def longDate_=(x: typings.winrt.Windows.Globalization.DateTimeFormatting.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("longDate")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter.longTime")
      @js.native
      def longTime: typings.winrt.Windows.Globalization.DateTimeFormatting.DateTimeFormatter = js.native
      @scala.inline
      def longTime_=(x: typings.winrt.Windows.Globalization.DateTimeFormatting.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("longTime")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter.shortDate")
      @js.native
      def shortDate: typings.winrt.Windows.Globalization.DateTimeFormatting.DateTimeFormatter = js.native
      @scala.inline
      def shortDate_=(x: typings.winrt.Windows.Globalization.DateTimeFormatting.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shortDate")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter.shortTime")
      @js.native
      def shortTime: typings.winrt.Windows.Globalization.DateTimeFormatting.DateTimeFormatter = js.native
      @scala.inline
      def shortTime_=(x: typings.winrt.Windows.Globalization.DateTimeFormatting.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shortTime")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Windows.Globalization.DateTimeFormatting.DayFormat")
    @js.native
    object DayFormat extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Globalization.DateTimeFormatting.DayFormat with Double] = js.native
      
      /* 1 */ val default: typings.winrt.Windows.Globalization.DateTimeFormatting.DayFormat.default with Double = js.native
      
      /* 0 */ val none: typings.winrt.Windows.Globalization.DateTimeFormatting.DayFormat.none with Double = js.native
    }
    
    @JSGlobal("Windows.Globalization.DateTimeFormatting.DayOfWeekFormat")
    @js.native
    object DayOfWeekFormat extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat with Double
          ] = js.native
      
      /* 1 */ val default: typings.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.default with Double = js.native
      
      /* 2 */ val abbreviated: typings.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.abbreviated with Double = js.native
      
      /* 3 */ val full: typings.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.full with Double = js.native
      
      /* 0 */ val none: typings.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.none with Double = js.native
    }
    
    @JSGlobal("Windows.Globalization.DateTimeFormatting.HourFormat")
    @js.native
    object HourFormat extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Globalization.DateTimeFormatting.HourFormat with Double] = js.native
      
      /* 1 */ val default: typings.winrt.Windows.Globalization.DateTimeFormatting.HourFormat.default with Double = js.native
      
      /* 0 */ val none: typings.winrt.Windows.Globalization.DateTimeFormatting.HourFormat.none with Double = js.native
    }
    
    @JSGlobal("Windows.Globalization.DateTimeFormatting.MinuteFormat")
    @js.native
    object MinuteFormat extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Globalization.DateTimeFormatting.MinuteFormat with Double] = js.native
      
      /* 1 */ val default: typings.winrt.Windows.Globalization.DateTimeFormatting.MinuteFormat.default with Double = js.native
      
      /* 0 */ val none: typings.winrt.Windows.Globalization.DateTimeFormatting.MinuteFormat.none with Double = js.native
    }
    
    @JSGlobal("Windows.Globalization.DateTimeFormatting.MonthFormat")
    @js.native
    object MonthFormat extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat with Double] = js.native
      
      /* 1 */ val default: typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat.default with Double = js.native
      
      /* 2 */ val abbreviated: typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat.abbreviated with Double = js.native
      
      /* 3 */ val full: typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat.full with Double = js.native
      
      /* 0 */ val none: typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat.none with Double = js.native
      
      /* 4 */ val numeric: typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat.numeric with Double = js.native
    }
    
    @JSGlobal("Windows.Globalization.DateTimeFormatting.SecondFormat")
    @js.native
    object SecondFormat extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Globalization.DateTimeFormatting.SecondFormat with Double] = js.native
      
      /* 1 */ val default: typings.winrt.Windows.Globalization.DateTimeFormatting.SecondFormat.default with Double = js.native
      
      /* 0 */ val none: typings.winrt.Windows.Globalization.DateTimeFormatting.SecondFormat.none with Double = js.native
    }
    
    @JSGlobal("Windows.Globalization.DateTimeFormatting.YearFormat")
    @js.native
    object YearFormat extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat with Double] = js.native
      
      /* 1 */ val default: typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat.default with Double = js.native
      
      /* 2 */ val abbreviated: typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat.abbreviated with Double = js.native
      
      /* 3 */ val full: typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat.full with Double = js.native
      
      /* 0 */ val none: typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat.none with Double = js.native
    }
  }
  
  @JSGlobal("Windows.Globalization.DayOfWeek")
  @js.native
  object DayOfWeek extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Globalization.DayOfWeek with Double] = js.native
    
    /* 5 */ val friday: typings.winrt.Windows.Globalization.DayOfWeek.friday with Double = js.native
    
    /* 1 */ val monday: typings.winrt.Windows.Globalization.DayOfWeek.monday with Double = js.native
    
    /* 6 */ val saturday: typings.winrt.Windows.Globalization.DayOfWeek.saturday with Double = js.native
    
    /* 0 */ val sunday: typings.winrt.Windows.Globalization.DayOfWeek.sunday with Double = js.native
    
    /* 4 */ val thursday: typings.winrt.Windows.Globalization.DayOfWeek.thursday with Double = js.native
    
    /* 2 */ val tuesday: typings.winrt.Windows.Globalization.DayOfWeek.tuesday with Double = js.native
    
    /* 3 */ val wednesday: typings.winrt.Windows.Globalization.DayOfWeek.wednesday with Double = js.native
  }
  
  object Fonts {
    
    @JSGlobal("Windows.Globalization.Fonts.LanguageFont")
    @js.native
    class LanguageFont ()
      extends typings.winrt.Windows.Globalization.Fonts.LanguageFont
    
    @JSGlobal("Windows.Globalization.Fonts.LanguageFontGroup")
    @js.native
    class LanguageFontGroup protected ()
      extends typings.winrt.Windows.Globalization.Fonts.LanguageFontGroup {
      def this(languageTag: String) = this()
    }
  }
  
  @JSGlobal("Windows.Globalization.GeographicRegion")
  @js.native
  class GeographicRegion ()
    extends typings.winrt.Windows.Globalization.GeographicRegion {
    def this(geographicRegionCode: String) = this()
  }
  /* static members */
  object GeographicRegion {
    
    @JSGlobal("Windows.Globalization.GeographicRegion.isSupported")
    @js.native
    def isSupported(geographicRegionCode: String): Boolean = js.native
  }
  
  @JSGlobal("Windows.Globalization.Language")
  @js.native
  class Language protected ()
    extends typings.winrt.Windows.Globalization.Language {
    def this(languageTag: String) = this()
  }
  /* static members */
  object Language {
    
    @JSGlobal("Windows.Globalization.Language")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Globalization.Language.currentInputMethodLanguageTag")
    @js.native
    def currentInputMethodLanguageTag: String = js.native
    @scala.inline
    def currentInputMethodLanguageTag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentInputMethodLanguageTag")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Globalization.Language.isWellFormed")
    @js.native
    def isWellFormed(languageTag: String): Boolean = js.native
  }
  
  object NumberFormatting {
    
    @JSGlobal("Windows.Globalization.NumberFormatting.CurrencyFormatter")
    @js.native
    class CurrencyFormatter protected ()
      extends typings.winrt.Windows.Globalization.NumberFormatting.CurrencyFormatter {
      def this(currencyCode: String) = this()
      def this(currencyCode: String, languages: IIterable[String], geographicRegion: String) = this()
    }
    
    @JSGlobal("Windows.Globalization.NumberFormatting.DecimalFormatter")
    @js.native
    class DecimalFormatter ()
      extends typings.winrt.Windows.Globalization.NumberFormatting.DecimalFormatter {
      def this(languages: IIterable[String], geographicRegion: String) = this()
    }
    
    @JSGlobal("Windows.Globalization.NumberFormatting.PercentFormatter")
    @js.native
    class PercentFormatter ()
      extends typings.winrt.Windows.Globalization.NumberFormatting.PercentFormatter {
      def this(languages: IIterable[String], geographicRegion: String) = this()
    }
    
    @JSGlobal("Windows.Globalization.NumberFormatting.PermilleFormatter")
    @js.native
    class PermilleFormatter ()
      extends typings.winrt.Windows.Globalization.NumberFormatting.PermilleFormatter {
      def this(languages: IIterable[String], geographicRegion: String) = this()
    }
  }
}
