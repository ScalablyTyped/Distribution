package typings.wordpressDate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AM extends StObject {
    
    var AM: String
    
    var PM: String
    
    var am: String
    
    var pm: String
  }
  object AM {
    
    @scala.inline
    def apply(AM: String, PM: String, am: String, pm: String): AM = {
      val __obj = js.Dynamic.literal(AM = AM.asInstanceOf[js.Any], PM = PM.asInstanceOf[js.Any], am = am.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any])
      __obj.asInstanceOf[AM]
    }
    
    @scala.inline
    implicit class AMMutableBuilder[Self <: AM] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAM(value: String): Self = StObject.set(x, "AM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPM(value: String): Self = StObject.set(x, "PM", value.asInstanceOf[js.Any])
    }
  }
  
  trait Date extends StObject {
    
    var date: String
    
    var datetime: String
    
    var datetimeAbbreviated: String
    
    var time: String
  }
  object Date {
    
    @scala.inline
    def apply(date: String, datetime: String, datetimeAbbreviated: String, time: String): Date = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], datetimeAbbreviated = datetimeAbbreviated.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Date]
    }
    
    @scala.inline
    implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatetime(value: String): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatetimeAbbreviated(value: String): Self = StObject.set(x, "datetimeAbbreviated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait Future extends StObject {
    
    var future: String
    
    var past: String
  }
  object Future {
    
    @scala.inline
    def apply(future: String, past: String): Future = {
      val __obj = js.Dynamic.literal(future = future.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any])
      __obj.asInstanceOf[Future]
    }
    
    @scala.inline
    implicit class FutureMutableBuilder[Self <: Future] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFuture(value: String): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPast(value: String): Self = StObject.set(x, "past", value.asInstanceOf[js.Any])
    }
  }
  
  trait Locale extends StObject {
    
    var locale: String
    
    var meridiem: AM
    
    var months: js.Array[String]
    
    var monthsShort: js.Array[String]
    
    var relative: Future
    
    var weekdays: js.Array[String]
    
    var weekdaysShort: js.Array[String]
  }
  object Locale {
    
    @scala.inline
    def apply(
      locale: String,
      meridiem: AM,
      months: js.Array[String],
      monthsShort: js.Array[String],
      relative: Future,
      weekdays: js.Array[String],
      weekdaysShort: js.Array[String]
    ): Locale = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], meridiem = meridiem.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], monthsShort = monthsShort.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any], weekdaysShort = weekdaysShort.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeridiem(value: AM): Self = StObject.set(x, "meridiem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsShort(value: js.Array[String]): Self = StObject.set(x, "monthsShort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsShortVarargs(value: String*): Self = StObject.set(x, "monthsShort", js.Array(value :_*))
      
      @scala.inline
      def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value :_*))
      
      @scala.inline
      def setRelative(value: Future): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdays(value: js.Array[String]): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdaysShort(value: js.Array[String]): Self = StObject.set(x, "weekdaysShort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdaysShortVarargs(value: String*): Self = StObject.set(x, "weekdaysShort", js.Array(value :_*))
      
      @scala.inline
      def setWeekdaysVarargs(value: String*): Self = StObject.set(x, "weekdays", js.Array(value :_*))
    }
  }
  
  trait Offset extends StObject {
    
    var offset: String
    
    var string: String
  }
  object Offset {
    
    @scala.inline
    def apply(offset: String, string: String): Offset = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    @scala.inline
    implicit class OffsetMutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
}
