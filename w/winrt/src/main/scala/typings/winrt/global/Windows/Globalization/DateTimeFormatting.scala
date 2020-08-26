package typings.winrt.global.Windows.Globalization

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Globalization.DateTimeFormatting.DayFormat
import typings.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat
import typings.winrt.Windows.Globalization.DateTimeFormatting.HourFormat
import typings.winrt.Windows.Globalization.DateTimeFormatting.MinuteFormat
import typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat
import typings.winrt.Windows.Globalization.DateTimeFormatting.SecondFormat
import typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Globalization.DateTimeFormatting")
@js.native
object DateTimeFormatting extends js.Object {
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
  @js.native
  object DateTimeFormatter extends js.Object {
    var longDate: typings.winrt.Windows.Globalization.DateTimeFormatting.DateTimeFormatter = js.native
    var longTime: typings.winrt.Windows.Globalization.DateTimeFormatting.DateTimeFormatter = js.native
    var shortDate: typings.winrt.Windows.Globalization.DateTimeFormatting.DateTimeFormatter = js.native
    var shortTime: typings.winrt.Windows.Globalization.DateTimeFormatting.DateTimeFormatter = js.native
  }
  
  @js.native
  object DayFormat extends js.Object {
    /* 1 */ val default: typings.winrt.Windows.Globalization.DateTimeFormatting.DayFormat.default with Double = js.native
    /* 0 */ val none: typings.winrt.Windows.Globalization.DateTimeFormatting.DayFormat.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Globalization.DateTimeFormatting.DayFormat with Double] = js.native
  }
  
  @js.native
  object DayOfWeekFormat extends js.Object {
    /* 2 */ val abbreviated: typings.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.abbreviated with Double = js.native
    /* 1 */ val default: typings.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.default with Double = js.native
    /* 3 */ val full: typings.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.full with Double = js.native
    /* 0 */ val none: typings.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat with Double
      ] = js.native
  }
  
  @js.native
  object HourFormat extends js.Object {
    /* 1 */ val default: typings.winrt.Windows.Globalization.DateTimeFormatting.HourFormat.default with Double = js.native
    /* 0 */ val none: typings.winrt.Windows.Globalization.DateTimeFormatting.HourFormat.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Globalization.DateTimeFormatting.HourFormat with Double] = js.native
  }
  
  @js.native
  object MinuteFormat extends js.Object {
    /* 1 */ val default: typings.winrt.Windows.Globalization.DateTimeFormatting.MinuteFormat.default with Double = js.native
    /* 0 */ val none: typings.winrt.Windows.Globalization.DateTimeFormatting.MinuteFormat.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Globalization.DateTimeFormatting.MinuteFormat with Double] = js.native
  }
  
  @js.native
  object MonthFormat extends js.Object {
    /* 2 */ val abbreviated: typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat.abbreviated with Double = js.native
    /* 1 */ val default: typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat.default with Double = js.native
    /* 3 */ val full: typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat.full with Double = js.native
    /* 0 */ val none: typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat.none with Double = js.native
    /* 4 */ val numeric: typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat.numeric with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat with Double] = js.native
  }
  
  @js.native
  object SecondFormat extends js.Object {
    /* 1 */ val default: typings.winrt.Windows.Globalization.DateTimeFormatting.SecondFormat.default with Double = js.native
    /* 0 */ val none: typings.winrt.Windows.Globalization.DateTimeFormatting.SecondFormat.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Globalization.DateTimeFormatting.SecondFormat with Double] = js.native
  }
  
  @js.native
  object YearFormat extends js.Object {
    /* 2 */ val abbreviated: typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat.abbreviated with Double = js.native
    /* 1 */ val default: typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat.default with Double = js.native
    /* 3 */ val full: typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat.full with Double = js.native
    /* 0 */ val none: typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat with Double] = js.native
  }
  
}

