package typings.timeago

import typings.std.Date
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Timeago {
  
  type DynamicMessage = js.Function2[/* n */ Double, /* distanceMillis */ Double, String]
  
  trait LocalizedStrings extends StObject {
    
    var day: String | DynamicMessage
    
    var days: String | DynamicMessage
    
    var hour: String | DynamicMessage
    
    var hours: String | DynamicMessage
    
    var inPast: String
    
    var minute: String | DynamicMessage
    
    var minutes: String | DynamicMessage
    
    var month: String | DynamicMessage
    
    var months: String | DynamicMessage
    
    var numbers: js.Array[String]
    
    var prefixAgo: String | Null
    
    var prefixFromNow: String | Null
    
    var seconds: String | DynamicMessage
    
    var suffixAgo: String | Null
    
    var suffixFromNow: String | Null
    
    var wordSeparator: String
    
    var year: String | DynamicMessage
    
    var years: String | DynamicMessage
  }
  object LocalizedStrings {
    
    inline def apply(
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
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], inPast = inPast.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], wordSeparator = wordSeparator.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any], prefixAgo = null, prefixFromNow = null, suffixAgo = null, suffixFromNow = null)
      __obj.asInstanceOf[LocalizedStrings]
    }
    
    extension [Self <: LocalizedStrings](x: Self) {
      
      inline def setDay(value: String | DynamicMessage): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDayFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = StObject.set(x, "day", js.Any.fromFunction2(value))
      
      inline def setDays(value: String | DynamicMessage): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setDaysFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = StObject.set(x, "days", js.Any.fromFunction2(value))
      
      inline def setHour(value: String | DynamicMessage): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setHourFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = StObject.set(x, "hour", js.Any.fromFunction2(value))
      
      inline def setHours(value: String | DynamicMessage): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setHoursFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = StObject.set(x, "hours", js.Any.fromFunction2(value))
      
      inline def setInPast(value: String): Self = StObject.set(x, "inPast", value.asInstanceOf[js.Any])
      
      inline def setMinute(value: String | DynamicMessage): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMinuteFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = StObject.set(x, "minute", js.Any.fromFunction2(value))
      
      inline def setMinutes(value: String | DynamicMessage): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMinutesFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = StObject.set(x, "minutes", js.Any.fromFunction2(value))
      
      inline def setMonth(value: String | DynamicMessage): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = StObject.set(x, "month", js.Any.fromFunction2(value))
      
      inline def setMonths(value: String | DynamicMessage): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = StObject.set(x, "months", js.Any.fromFunction2(value))
      
      inline def setNumbers(value: js.Array[String]): Self = StObject.set(x, "numbers", value.asInstanceOf[js.Any])
      
      inline def setNumbersVarargs(value: String*): Self = StObject.set(x, "numbers", js.Array(value :_*))
      
      inline def setPrefixAgo(value: String): Self = StObject.set(x, "prefixAgo", value.asInstanceOf[js.Any])
      
      inline def setPrefixAgoNull: Self = StObject.set(x, "prefixAgo", null)
      
      inline def setPrefixFromNow(value: String): Self = StObject.set(x, "prefixFromNow", value.asInstanceOf[js.Any])
      
      inline def setPrefixFromNowNull: Self = StObject.set(x, "prefixFromNow", null)
      
      inline def setSeconds(value: String | DynamicMessage): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setSecondsFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = StObject.set(x, "seconds", js.Any.fromFunction2(value))
      
      inline def setSuffixAgo(value: String): Self = StObject.set(x, "suffixAgo", value.asInstanceOf[js.Any])
      
      inline def setSuffixAgoNull: Self = StObject.set(x, "suffixAgo", null)
      
      inline def setSuffixFromNow(value: String): Self = StObject.set(x, "suffixFromNow", value.asInstanceOf[js.Any])
      
      inline def setSuffixFromNowNull: Self = StObject.set(x, "suffixFromNow", null)
      
      inline def setWordSeparator(value: String): Self = StObject.set(x, "wordSeparator", value.asInstanceOf[js.Any])
      
      inline def setYear(value: String | DynamicMessage): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = StObject.set(x, "year", js.Any.fromFunction2(value))
      
      inline def setYears(value: String | DynamicMessage): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
      
      inline def setYearsFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = StObject.set(x, "years", js.Any.fromFunction2(value))
    }
  }
  
  trait Settings extends StObject {
    
    var allowFuture: Boolean
    
    var allowPast: Boolean
    
    var autoDispose: Boolean
    
    var cutoff: Double
    
    var localeTitle: Boolean
    
    var refreshMillis: Double
    
    var strings: LocalizedStrings
  }
  object Settings {
    
    inline def apply(
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
    
    extension [Self <: Settings](x: Self) {
      
      inline def setAllowFuture(value: Boolean): Self = StObject.set(x, "allowFuture", value.asInstanceOf[js.Any])
      
      inline def setAllowPast(value: Boolean): Self = StObject.set(x, "allowPast", value.asInstanceOf[js.Any])
      
      inline def setAutoDispose(value: Boolean): Self = StObject.set(x, "autoDispose", value.asInstanceOf[js.Any])
      
      inline def setCutoff(value: Double): Self = StObject.set(x, "cutoff", value.asInstanceOf[js.Any])
      
      inline def setLocaleTitle(value: Boolean): Self = StObject.set(x, "localeTitle", value.asInstanceOf[js.Any])
      
      inline def setRefreshMillis(value: Double): Self = StObject.set(x, "refreshMillis", value.asInstanceOf[js.Any])
      
      inline def setStrings(value: LocalizedStrings): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
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
