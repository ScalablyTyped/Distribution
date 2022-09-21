package typings.winrt.global.Windows

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Globalization.DateTimeFormatting.DayFormat
import typings.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat
import typings.winrt.Windows.Globalization.DateTimeFormatting.HourFormat
import typings.winrt.Windows.Globalization.DateTimeFormatting.MinuteFormat
import typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat
import typings.winrt.Windows.Globalization.DateTimeFormatting.SecondFormat
import typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat
import typings.winrt.Windows.UI.Text.FontStretch
import typings.winrt.Windows.UI.Text.FontStyle
import typings.winrt.Windows.UI.Text.FontWeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Globalization {
  
  @JSGlobal("Windows.Globalization.ApplicationLanguages")
  @js.native
  open class ApplicationLanguages ()
    extends StObject
       with typings.winrt.Windows.Globalization.ApplicationLanguages
  /* static members */
  object ApplicationLanguages {
    
    @JSGlobal("Windows.Globalization.ApplicationLanguages")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Globalization.ApplicationLanguages.languages")
    @js.native
    def languages: IVectorView[String] = js.native
    inline def languages_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("languages")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Globalization.ApplicationLanguages.manifestLanguages")
    @js.native
    def manifestLanguages: IVectorView[String] = js.native
    inline def manifestLanguages_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("manifestLanguages")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Globalization.ApplicationLanguages.primaryLanguageOverride")
    @js.native
    def primaryLanguageOverride: String = js.native
    inline def primaryLanguageOverride_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primaryLanguageOverride")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Globalization.Calendar")
  @js.native
  open class Calendar ()
    extends StObject
       with typings.winrt.Windows.Globalization.Calendar {
    def this(languages: IIterable[String]) = this()
    def this(languages: IIterable[String], calendar: String, clock: String) = this()
  }
  
  @JSGlobal("Windows.Globalization.CalendarIdentifiers")
  @js.native
  open class CalendarIdentifiers ()
    extends StObject
       with typings.winrt.Windows.Globalization.CalendarIdentifiers
  /* static members */
  object CalendarIdentifiers {
    
    @JSGlobal("Windows.Globalization.CalendarIdentifiers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Globalization.CalendarIdentifiers.gregorian")
    @js.native
    def gregorian: String = js.native
    inline def gregorian_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gregorian")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Globalization.CalendarIdentifiers.hebrew")
    @js.native
    def hebrew: String = js.native
    inline def hebrew_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hebrew")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Globalization.CalendarIdentifiers.hijri")
    @js.native
    def hijri: String = js.native
    inline def hijri_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hijri")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Globalization.CalendarIdentifiers.japanese")
    @js.native
    def japanese: String = js.native
    inline def japanese_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("japanese")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Globalization.CalendarIdentifiers.julian")
    @js.native
    def julian: String = js.native
    inline def julian_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("julian")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Globalization.CalendarIdentifiers.korean")
    @js.native
    def korean: String = js.native
    inline def korean_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("korean")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Globalization.CalendarIdentifiers.taiwan")
    @js.native
    def taiwan: String = js.native
    inline def taiwan_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("taiwan")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Globalization.CalendarIdentifiers.thai")
    @js.native
    def thai: String = js.native
    inline def thai_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("thai")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Globalization.CalendarIdentifiers.umAlQura")
    @js.native
    def umAlQura: String = js.native
    inline def umAlQura_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("umAlQura")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Globalization.ClockIdentifiers")
  @js.native
  open class ClockIdentifiers ()
    extends StObject
       with typings.winrt.Windows.Globalization.ClockIdentifiers
  /* static members */
  object ClockIdentifiers {
    
    @JSGlobal("Windows.Globalization.ClockIdentifiers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Globalization.ClockIdentifiers.twelveHour")
    @js.native
    def twelveHour: String = js.native
    inline def twelveHour_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("twelveHour")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Globalization.ClockIdentifiers.twentyFourHour")
    @js.native
    def twentyFourHour: String = js.native
    inline def twentyFourHour_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("twentyFourHour")(x.asInstanceOf[js.Any])
  }
  
  object Collation {
    
    @JSGlobal("Windows.Globalization.Collation.CharacterGrouping")
    @js.native
    open class CharacterGrouping ()
      extends StObject
         with typings.winrt.Windows.Globalization.Collation.CharacterGrouping {
      
      /* CompleteClass */
      var first: String = js.native
      
      /* CompleteClass */
      var label: String = js.native
    }
    
    @JSGlobal("Windows.Globalization.Collation.CharacterGroupings")
    @js.native
    open class CharacterGroupings ()
      extends StObject
         with typings.winrt.Windows.Globalization.Collation.CharacterGroupings {
      
      /* CompleteClass */
      override def first(): IIterator[typings.winrt.Windows.Globalization.Collation.CharacterGrouping] = js.native
    }
  }
  
  object DateTimeFormatting {
    
    @JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter")
    @js.native
    open class DateTimeFormatter protected ()
      extends StObject
         with typings.winrt.Windows.Globalization.DateTimeFormatting.DateTimeFormatter {
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
      
      /* CompleteClass */
      var calendar: String = js.native
      
      /* CompleteClass */
      var clock: String = js.native
      
      /* CompleteClass */
      override def format(value: js.Date): String = js.native
      
      /* CompleteClass */
      var geographicRegion: String = js.native
      
      /* CompleteClass */
      var includeDay: DayFormat = js.native
      
      /* CompleteClass */
      var includeDayOfWeek: DayOfWeekFormat = js.native
      
      /* CompleteClass */
      var includeHour: HourFormat = js.native
      
      /* CompleteClass */
      var includeMinute: MinuteFormat = js.native
      
      /* CompleteClass */
      var includeMonth: MonthFormat = js.native
      
      /* CompleteClass */
      var includeSecond: SecondFormat = js.native
      
      /* CompleteClass */
      var includeYear: YearFormat = js.native
      
      /* CompleteClass */
      var languages: IVectorView[String] = js.native
      
      /* CompleteClass */
      var numeralSystem: String = js.native
      
      /* CompleteClass */
      var patterns: IVectorView[String] = js.native
      
      /* CompleteClass */
      var resolvedGeographicRegion: String = js.native
      
      /* CompleteClass */
      var resolvedLanguage: String = js.native
      
      /* CompleteClass */
      var template: String = js.native
    }
    /* static members */
    object DateTimeFormatter {
      
      @JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter.longDate")
      @js.native
      def longDate: typings.winrt.Windows.Globalization.DateTimeFormatting.DateTimeFormatter = js.native
      inline def longDate_=(x: typings.winrt.Windows.Globalization.DateTimeFormatting.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("longDate")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter.longTime")
      @js.native
      def longTime: typings.winrt.Windows.Globalization.DateTimeFormatting.DateTimeFormatter = js.native
      inline def longTime_=(x: typings.winrt.Windows.Globalization.DateTimeFormatting.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("longTime")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter.shortDate")
      @js.native
      def shortDate: typings.winrt.Windows.Globalization.DateTimeFormatting.DateTimeFormatter = js.native
      inline def shortDate_=(x: typings.winrt.Windows.Globalization.DateTimeFormatting.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shortDate")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter.shortTime")
      @js.native
      def shortTime: typings.winrt.Windows.Globalization.DateTimeFormatting.DateTimeFormatter = js.native
      inline def shortTime_=(x: typings.winrt.Windows.Globalization.DateTimeFormatting.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shortTime")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Windows.Globalization.DateTimeFormatting.DayFormat")
    @js.native
    object DayFormat extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Globalization.DateTimeFormatting.DayFormat & Double] = js.native
      
      /* 1 */ val default: typings.winrt.Windows.Globalization.DateTimeFormatting.DayFormat.default & Double = js.native
      
      /* 0 */ val none: typings.winrt.Windows.Globalization.DateTimeFormatting.DayFormat.none & Double = js.native
    }
    
    @JSGlobal("Windows.Globalization.DateTimeFormatting.DayOfWeekFormat")
    @js.native
    object DayOfWeekFormat extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat & Double] = js.native
      
      /* 1 */ val default: typings.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.default & Double = js.native
      
      /* 2 */ val abbreviated: typings.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.abbreviated & Double = js.native
      
      /* 3 */ val full: typings.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.full & Double = js.native
      
      /* 0 */ val none: typings.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.none & Double = js.native
    }
    
    @JSGlobal("Windows.Globalization.DateTimeFormatting.HourFormat")
    @js.native
    object HourFormat extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Globalization.DateTimeFormatting.HourFormat & Double] = js.native
      
      /* 1 */ val default: typings.winrt.Windows.Globalization.DateTimeFormatting.HourFormat.default & Double = js.native
      
      /* 0 */ val none: typings.winrt.Windows.Globalization.DateTimeFormatting.HourFormat.none & Double = js.native
    }
    
    @JSGlobal("Windows.Globalization.DateTimeFormatting.MinuteFormat")
    @js.native
    object MinuteFormat extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Globalization.DateTimeFormatting.MinuteFormat & Double] = js.native
      
      /* 1 */ val default: typings.winrt.Windows.Globalization.DateTimeFormatting.MinuteFormat.default & Double = js.native
      
      /* 0 */ val none: typings.winrt.Windows.Globalization.DateTimeFormatting.MinuteFormat.none & Double = js.native
    }
    
    @JSGlobal("Windows.Globalization.DateTimeFormatting.MonthFormat")
    @js.native
    object MonthFormat extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat & Double] = js.native
      
      /* 1 */ val default: typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat.default & Double = js.native
      
      /* 2 */ val abbreviated: typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat.abbreviated & Double = js.native
      
      /* 3 */ val full: typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat.full & Double = js.native
      
      /* 0 */ val none: typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat.none & Double = js.native
      
      /* 4 */ val numeric: typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat.numeric & Double = js.native
    }
    
    @JSGlobal("Windows.Globalization.DateTimeFormatting.SecondFormat")
    @js.native
    object SecondFormat extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Globalization.DateTimeFormatting.SecondFormat & Double] = js.native
      
      /* 1 */ val default: typings.winrt.Windows.Globalization.DateTimeFormatting.SecondFormat.default & Double = js.native
      
      /* 0 */ val none: typings.winrt.Windows.Globalization.DateTimeFormatting.SecondFormat.none & Double = js.native
    }
    
    @JSGlobal("Windows.Globalization.DateTimeFormatting.YearFormat")
    @js.native
    object YearFormat extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat & Double] = js.native
      
      /* 1 */ val default: typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat.default & Double = js.native
      
      /* 2 */ val abbreviated: typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat.abbreviated & Double = js.native
      
      /* 3 */ val full: typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat.full & Double = js.native
      
      /* 0 */ val none: typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat.none & Double = js.native
    }
  }
  
  @JSGlobal("Windows.Globalization.DayOfWeek")
  @js.native
  object DayOfWeek extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Globalization.DayOfWeek & Double] = js.native
    
    /* 5 */ val friday: typings.winrt.Windows.Globalization.DayOfWeek.friday & Double = js.native
    
    /* 1 */ val monday: typings.winrt.Windows.Globalization.DayOfWeek.monday & Double = js.native
    
    /* 6 */ val saturday: typings.winrt.Windows.Globalization.DayOfWeek.saturday & Double = js.native
    
    /* 0 */ val sunday: typings.winrt.Windows.Globalization.DayOfWeek.sunday & Double = js.native
    
    /* 4 */ val thursday: typings.winrt.Windows.Globalization.DayOfWeek.thursday & Double = js.native
    
    /* 2 */ val tuesday: typings.winrt.Windows.Globalization.DayOfWeek.tuesday & Double = js.native
    
    /* 3 */ val wednesday: typings.winrt.Windows.Globalization.DayOfWeek.wednesday & Double = js.native
  }
  
  object Fonts {
    
    @JSGlobal("Windows.Globalization.Fonts.LanguageFont")
    @js.native
    open class LanguageFont ()
      extends StObject
         with typings.winrt.Windows.Globalization.Fonts.LanguageFont {
      
      /* CompleteClass */
      var fontFamily: String = js.native
      
      /* CompleteClass */
      var fontStretch: FontStretch = js.native
      
      /* CompleteClass */
      var fontStyle: FontStyle = js.native
      
      /* CompleteClass */
      var fontWeight: FontWeight = js.native
      
      /* CompleteClass */
      var scaleFactor: Double = js.native
    }
    
    @JSGlobal("Windows.Globalization.Fonts.LanguageFontGroup")
    @js.native
    open class LanguageFontGroup protected ()
      extends StObject
         with typings.winrt.Windows.Globalization.Fonts.LanguageFontGroup {
      def this(languageTag: String) = this()
      
      /* CompleteClass */
      var documentAlternate1Font: typings.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
      
      /* CompleteClass */
      var documentAlternate2Font: typings.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
      
      /* CompleteClass */
      var documentHeadingFont: typings.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
      
      /* CompleteClass */
      var fixedWidthTextFont: typings.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
      
      /* CompleteClass */
      var modernDocumentFont: typings.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
      
      /* CompleteClass */
      var traditionalDocumentFont: typings.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
      
      /* CompleteClass */
      var uICaptionFont: typings.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
      
      /* CompleteClass */
      var uIHeadingFont: typings.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
      
      /* CompleteClass */
      var uINotificationHeadingFont: typings.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
      
      /* CompleteClass */
      var uITextFont: typings.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
      
      /* CompleteClass */
      var uITitleFont: typings.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
    }
  }
  
  @JSGlobal("Windows.Globalization.GeographicRegion")
  @js.native
  open class GeographicRegion ()
    extends StObject
       with typings.winrt.Windows.Globalization.GeographicRegion {
    def this(geographicRegionCode: String) = this()
    
    /* CompleteClass */
    var code: String = js.native
    
    /* CompleteClass */
    var codeThreeDigit: String = js.native
    
    /* CompleteClass */
    var codeThreeLetter: String = js.native
    
    /* CompleteClass */
    var codeTwoLetter: String = js.native
    
    /* CompleteClass */
    var currenciesInUse: IVectorView[String] = js.native
    
    /* CompleteClass */
    var displayName: String = js.native
    
    /* CompleteClass */
    var nativeName: String = js.native
  }
  /* static members */
  object GeographicRegion {
    
    @JSGlobal("Windows.Globalization.GeographicRegion")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isSupported(geographicRegionCode: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")(geographicRegionCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSGlobal("Windows.Globalization.Language")
  @js.native
  open class Language protected ()
    extends StObject
       with typings.winrt.Windows.Globalization.Language {
    def this(languageTag: String) = this()
    
    /* CompleteClass */
    var displayName: String = js.native
    
    /* CompleteClass */
    var languageTag: String = js.native
    
    /* CompleteClass */
    var nativeName: String = js.native
    
    /* CompleteClass */
    var script: String = js.native
  }
  /* static members */
  object Language {
    
    @JSGlobal("Windows.Globalization.Language")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Globalization.Language.currentInputMethodLanguageTag")
    @js.native
    def currentInputMethodLanguageTag: String = js.native
    inline def currentInputMethodLanguageTag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentInputMethodLanguageTag")(x.asInstanceOf[js.Any])
    
    inline def isWellFormed(languageTag: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWellFormed")(languageTag.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object NumberFormatting {
    
    @JSGlobal("Windows.Globalization.NumberFormatting.CurrencyFormatter")
    @js.native
    open class CurrencyFormatter protected ()
      extends StObject
         with typings.winrt.Windows.Globalization.NumberFormatting.CurrencyFormatter {
      def this(currencyCode: String) = this()
      def this(currencyCode: String, languages: IIterable[String], geographicRegion: String) = this()
      
      /* CompleteClass */
      var currency: String = js.native
      
      /* CompleteClass */
      override def format(value: Double): String = js.native
      
      /* CompleteClass */
      override def formatDouble(value: Double): String = js.native
      
      /* CompleteClass */
      override def formatInt(value: Double): String = js.native
      
      /* CompleteClass */
      override def formatUInt(value: Double): String = js.native
      
      /* CompleteClass */
      var fractionDigits: Double = js.native
      
      /* CompleteClass */
      var geographicRegion: String = js.native
      
      /* CompleteClass */
      var integerDigits: Double = js.native
      
      /* CompleteClass */
      var isDecimalPointAlwaysDisplayed: Boolean = js.native
      
      /* CompleteClass */
      var isGrouped: Boolean = js.native
      
      /* CompleteClass */
      var languages: IVectorView[String] = js.native
      
      /* CompleteClass */
      var numeralSystem: String = js.native
      
      /* CompleteClass */
      override def parseDouble(text: String): Double = js.native
      
      /* CompleteClass */
      override def parseInt(text: String): Double = js.native
      
      /* CompleteClass */
      override def parseUInt(text: String): Double = js.native
      
      /* CompleteClass */
      var resolvedGeographicRegion: String = js.native
      
      /* CompleteClass */
      var resolvedLanguage: String = js.native
    }
    
    @JSGlobal("Windows.Globalization.NumberFormatting.DecimalFormatter")
    @js.native
    open class DecimalFormatter ()
      extends StObject
         with typings.winrt.Windows.Globalization.NumberFormatting.DecimalFormatter {
      def this(languages: IIterable[String], geographicRegion: String) = this()
      
      /* CompleteClass */
      override def format(value: Double): String = js.native
      
      /* CompleteClass */
      override def formatDouble(value: Double): String = js.native
      
      /* CompleteClass */
      override def formatInt(value: Double): String = js.native
      
      /* CompleteClass */
      override def formatUInt(value: Double): String = js.native
      
      /* CompleteClass */
      var fractionDigits: Double = js.native
      
      /* CompleteClass */
      var geographicRegion: String = js.native
      
      /* CompleteClass */
      var integerDigits: Double = js.native
      
      /* CompleteClass */
      var isDecimalPointAlwaysDisplayed: Boolean = js.native
      
      /* CompleteClass */
      var isGrouped: Boolean = js.native
      
      /* CompleteClass */
      var languages: IVectorView[String] = js.native
      
      /* CompleteClass */
      var numeralSystem: String = js.native
      
      /* CompleteClass */
      override def parseDouble(text: String): Double = js.native
      
      /* CompleteClass */
      override def parseInt(text: String): Double = js.native
      
      /* CompleteClass */
      override def parseUInt(text: String): Double = js.native
      
      /* CompleteClass */
      var resolvedGeographicRegion: String = js.native
      
      /* CompleteClass */
      var resolvedLanguage: String = js.native
    }
    
    @JSGlobal("Windows.Globalization.NumberFormatting.PercentFormatter")
    @js.native
    open class PercentFormatter ()
      extends StObject
         with typings.winrt.Windows.Globalization.NumberFormatting.PercentFormatter {
      def this(languages: IIterable[String], geographicRegion: String) = this()
      
      /* CompleteClass */
      override def format(value: Double): String = js.native
      
      /* CompleteClass */
      override def formatDouble(value: Double): String = js.native
      
      /* CompleteClass */
      override def formatInt(value: Double): String = js.native
      
      /* CompleteClass */
      override def formatUInt(value: Double): String = js.native
      
      /* CompleteClass */
      var fractionDigits: Double = js.native
      
      /* CompleteClass */
      var geographicRegion: String = js.native
      
      /* CompleteClass */
      var integerDigits: Double = js.native
      
      /* CompleteClass */
      var isDecimalPointAlwaysDisplayed: Boolean = js.native
      
      /* CompleteClass */
      var isGrouped: Boolean = js.native
      
      /* CompleteClass */
      var languages: IVectorView[String] = js.native
      
      /* CompleteClass */
      var numeralSystem: String = js.native
      
      /* CompleteClass */
      override def parseDouble(text: String): Double = js.native
      
      /* CompleteClass */
      override def parseInt(text: String): Double = js.native
      
      /* CompleteClass */
      override def parseUInt(text: String): Double = js.native
      
      /* CompleteClass */
      var resolvedGeographicRegion: String = js.native
      
      /* CompleteClass */
      var resolvedLanguage: String = js.native
    }
    
    @JSGlobal("Windows.Globalization.NumberFormatting.PermilleFormatter")
    @js.native
    open class PermilleFormatter ()
      extends StObject
         with typings.winrt.Windows.Globalization.NumberFormatting.PermilleFormatter {
      def this(languages: IIterable[String], geographicRegion: String) = this()
      
      /* CompleteClass */
      override def format(value: Double): String = js.native
      
      /* CompleteClass */
      override def formatDouble(value: Double): String = js.native
      
      /* CompleteClass */
      override def formatInt(value: Double): String = js.native
      
      /* CompleteClass */
      override def formatUInt(value: Double): String = js.native
      
      /* CompleteClass */
      var fractionDigits: Double = js.native
      
      /* CompleteClass */
      var geographicRegion: String = js.native
      
      /* CompleteClass */
      var integerDigits: Double = js.native
      
      /* CompleteClass */
      var isDecimalPointAlwaysDisplayed: Boolean = js.native
      
      /* CompleteClass */
      var isGrouped: Boolean = js.native
      
      /* CompleteClass */
      var languages: IVectorView[String] = js.native
      
      /* CompleteClass */
      var numeralSystem: String = js.native
      
      /* CompleteClass */
      override def parseDouble(text: String): Double = js.native
      
      /* CompleteClass */
      override def parseInt(text: String): Double = js.native
      
      /* CompleteClass */
      override def parseUInt(text: String): Double = js.native
      
      /* CompleteClass */
      var resolvedGeographicRegion: String = js.native
      
      /* CompleteClass */
      var resolvedLanguage: String = js.native
    }
  }
}
