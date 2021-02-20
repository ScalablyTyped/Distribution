package typings.timeago

import typings.std.Date
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Timeago {
  
  type DynamicMessage = js.Function2[/* n */ Double, /* distanceMillis */ Double, String]
  
  @js.native
  trait LocalizedStrings extends StObject {
    
    var day: String | DynamicMessage = js.native
    
    var days: String | DynamicMessage = js.native
    
    var hour: String | DynamicMessage = js.native
    
    var hours: String | DynamicMessage = js.native
    
    var inPast: String = js.native
    
    var minute: String | DynamicMessage = js.native
    
    var minutes: String | DynamicMessage = js.native
    
    var month: String | DynamicMessage = js.native
    
    var months: String | DynamicMessage = js.native
    
    var numbers: js.Array[String] = js.native
    
    var prefixAgo: String | Null = js.native
    
    var prefixFromNow: String | Null = js.native
    
    var seconds: String | DynamicMessage = js.native
    
    var suffixAgo: String | Null = js.native
    
    var suffixFromNow: String | Null = js.native
    
    var wordSeparator: String = js.native
    
    var year: String | DynamicMessage = js.native
    
    var years: String | DynamicMessage = js.native
  }
  object LocalizedStrings {
    
    @scala.inline
    def apply(
      day: String | DynamicMessage,
      days: String | DynamicMessage,
      hour: String | DynamicMessage,
      hours: String | DynamicMessage,
      inPast: String,
      minute: String | DynamicMessage,
      minutes: String | DynamicMessage,
      month: String | DynamicMessage,
      months: String | DynamicMessage,
      numbers: js.Array[String],
      seconds: String | DynamicMessage,
      wordSeparator: String,
      year: String | DynamicMessage,
      years: String | DynamicMessage
    ): LocalizedStrings = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], inPast = inPast.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], wordSeparator = wordSeparator.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalizedStrings]
    }
    
    @scala.inline
    implicit class LocalizedStringsMutableBuilder[Self <: LocalizedStrings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDay(value: String | DynamicMessage): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = StObject.set(x, "day", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDays(value: String | DynamicMessage): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = StObject.set(x, "days", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHour(value: String | DynamicMessage): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = StObject.set(x, "hour", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHours(value: String | DynamicMessage): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoursFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = StObject.set(x, "hours", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInPast(value: String): Self = StObject.set(x, "inPast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinute(value: String | DynamicMessage): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = StObject.set(x, "minute", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMinutes(value: String | DynamicMessage): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinutesFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = StObject.set(x, "minutes", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMonth(value: String | DynamicMessage): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = StObject.set(x, "month", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMonths(value: String | DynamicMessage): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = StObject.set(x, "months", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNumbers(value: js.Array[String]): Self = StObject.set(x, "numbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumbersVarargs(value: String*): Self = StObject.set(x, "numbers", js.Array(value :_*))
      
      @scala.inline
      def setPrefixAgo(value: String): Self = StObject.set(x, "prefixAgo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixAgoNull: Self = StObject.set(x, "prefixAgo", null)
      
      @scala.inline
      def setPrefixFromNow(value: String): Self = StObject.set(x, "prefixFromNow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixFromNowNull: Self = StObject.set(x, "prefixFromNow", null)
      
      @scala.inline
      def setSeconds(value: String | DynamicMessage): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondsFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = StObject.set(x, "seconds", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSuffixAgo(value: String): Self = StObject.set(x, "suffixAgo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixAgoNull: Self = StObject.set(x, "suffixAgo", null)
      
      @scala.inline
      def setSuffixFromNow(value: String): Self = StObject.set(x, "suffixFromNow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixFromNowNull: Self = StObject.set(x, "suffixFromNow", null)
      
      @scala.inline
      def setWordSeparator(value: String): Self = StObject.set(x, "wordSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYear(value: String | DynamicMessage): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = StObject.set(x, "year", js.Any.fromFunction2(value))
      
      @scala.inline
      def setYears(value: String | DynamicMessage): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearsFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = StObject.set(x, "years", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Settings extends StObject {
    
    var allowFuture: Boolean = js.native
    
    var allowPast: Boolean = js.native
    
    var autoDispose: Boolean = js.native
    
    var cutoff: Double = js.native
    
    var localeTitle: Boolean = js.native
    
    var refreshMillis: Double = js.native
    
    var strings: LocalizedStrings = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(
      allowFuture: Boolean,
      allowPast: Boolean,
      autoDispose: Boolean,
      cutoff: Double,
      localeTitle: Boolean,
      refreshMillis: Double,
      strings: LocalizedStrings
    ): Settings = {
      val __obj = js.Dynamic.literal(allowFuture = allowFuture.asInstanceOf[js.Any], allowPast = allowPast.asInstanceOf[js.Any], autoDispose = autoDispose.asInstanceOf[js.Any], cutoff = cutoff.asInstanceOf[js.Any], localeTitle = localeTitle.asInstanceOf[js.Any], refreshMillis = refreshMillis.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowFuture(value: Boolean): Self = StObject.set(x, "allowFuture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowPast(value: Boolean): Self = StObject.set(x, "allowPast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDispose(value: Boolean): Self = StObject.set(x, "autoDispose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCutoff(value: Double): Self = StObject.set(x, "cutoff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleTitle(value: Boolean): Self = StObject.set(x, "localeTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshMillis(value: Double): Self = StObject.set(x, "refreshMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrings(value: LocalizedStrings): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TimeagoStatic extends StObject {
    
    def apply(timestamp: String): String = js.native
    def apply(timestamp: Double): String = js.native
    def apply(timestamp: Date): String = js.native
    def apply(timestamp: Element): String = js.native
    
    def datetime(elem: Element): Date = js.native
    
    def inWords(distanceMillis: Double): String = js.native
    
    def isTime(elem: Element): Boolean = js.native
    
    def parse(timestamp: String): Date = js.native
    
    var settings: Settings = js.native
  }
}
