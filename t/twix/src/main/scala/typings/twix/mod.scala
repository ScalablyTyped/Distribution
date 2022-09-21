package typings.twix

import typings.moment.mod.Duration_
import typings.moment.mod.Moment
import typings.moment.mod.MomentInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* augmented module */
  object momentAugmentingMod {
    
    @JSImport("moment", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def twix(start: Moment, end: Moment): Twix = (^.asInstanceOf[js.Dynamic].applyDynamic("twix")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Twix]
    
    @JSImport("moment", "twixClass")
    @js.native
    val twixClass: TwixStatic = js.native
    
    trait Duration extends StObject {
      
      def afterMoment(date: String): String
      
      def beforeMoment(date: String): String
    }
    object Duration {
      
      inline def apply(afterMoment: String => String, beforeMoment: String => String): Duration = {
        val __obj = js.Dynamic.literal(afterMoment = js.Any.fromFunction1(afterMoment), beforeMoment = js.Any.fromFunction1(beforeMoment))
        __obj.asInstanceOf[Duration]
      }
      
      extension [Self <: Duration](x: Self) {
        
        inline def setAfterMoment(value: String => String): Self = StObject.set(x, "afterMoment", js.Any.fromFunction1(value))
        
        inline def setBeforeMoment(value: String => String): Self = StObject.set(x, "beforeMoment", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait Moment extends StObject {
      
      def twix(date: String): Twix = js.native
      def twix(date: String, allDay: Boolean): Twix = js.native
      def twix(date: String, format: String, options: TwixParseAndFormatOptions): Twix = js.native
      def twix(date: String, options: TwixParseAndFormatOptions): Twix = js.native
      def twix(date: js.Array[Double]): Twix = js.native
      def twix(date: js.Array[Double], allDay: Boolean): Twix = js.native
      def twix(date: js.Array[Double], format: String, options: TwixParseAndFormatOptions): Twix = js.native
      def twix(date: js.Array[Double], options: TwixParseAndFormatOptions): Twix = js.native
      def twix(date: js.Date): Twix = js.native
      def twix(date: js.Date, allDay: Boolean): Twix = js.native
      def twix(date: js.Date, format: String, options: TwixParseAndFormatOptions): Twix = js.native
      def twix(date: js.Date, options: TwixParseAndFormatOptions): Twix = js.native
      def twix(date: Double): Twix = js.native
      def twix(date: Double, allDay: Boolean): Twix = js.native
      def twix(date: Double, format: String, options: TwixParseAndFormatOptions): Twix = js.native
      def twix(date: Double, options: TwixParseAndFormatOptions): Twix = js.native
      def twix(date: MomentInput): Twix = js.native
      def twix(date: MomentInput, allDay: Boolean): Twix = js.native
      def twix(date: MomentInput, format: String, options: TwixParseAndFormatOptions): Twix = js.native
      def twix(date: MomentInput, options: TwixParseAndFormatOptions): Twix = js.native
      def twix(date: Moment): Twix = js.native
      def twix(date: Moment, allDay: Boolean): Twix = js.native
      def twix(date: Moment, format: String, options: TwixParseAndFormatOptions): Twix = js.native
      def twix(date: Moment, options: TwixParseAndFormatOptions): Twix = js.native
    }
  }
  
  @js.native
  trait Twix extends StObject {
    
    def asDuration(period: String): Duration_ = js.native
    
    def contains(date: String): Boolean = js.native
    def contains(date: js.Date): Boolean = js.native
    def contains(date: Moment): Boolean = js.native
    
    def count(period: String): Double = js.native
    
    def countInner(period: String): Double = js.native
    
    def difference(other: Twix): js.Array[Twix] = js.native
    
    def engulfs(other: Twix): Boolean = js.native
    
    def equals(other: Twix): Boolean = js.native
    
    def format(): String = js.native
    def format(options: String): String = js.native
    def format(options: TwixFormatOptions): String = js.native
    
    def humanizeLength(): String = js.native
    
    def intersection(other: Twix): Twix = js.native
    
    def isCurrent(): Boolean = js.native
    
    def isFuture(): Boolean = js.native
    
    def isPast(): Boolean = js.native
    
    def isSame(period: String): Boolean = js.native
    
    def isValid(): Boolean = js.native
    
    def iterate(duration: Duration_): TwixIter = js.native
    def iterate(num: Double, period: String): TwixIter = js.native
    def iterate(period: String): TwixIter = js.native
    
    def iterateInner(num: Double, period: String): TwixIter = js.native
    def iterateInner(period: String): TwixIter = js.native
    
    def length(period: String): Double = js.native
    
    def overlaps(other: Twix): Boolean = js.native
    
    def simpleFormat(): String = js.native
    def simpleFormat(format: String): String = js.native
    def simpleFormat(format: String, options: TwixSimpleFormatOptions): String = js.native
    
    def split(duration: Duration_): js.Array[Twix] = js.native
    def split(num: Double, period: String): js.Array[Twix] = js.native
    def split(other: Moment): js.Array[Twix] = js.native
    def split(start: Moment, end: Moment): js.Array[Twix] = js.native
    
    def toDate(): js.Date = js.native
    
    def union(other: Twix): Twix = js.native
    
    def xor(other: Twix): js.Array[Twix] = js.native
  }
  
  trait TwixFormatOptions extends StObject {
    
    var allDay: js.UndefOr[Any] = js.undefined
    
    var dayFormat: js.UndefOr[String] = js.undefined
    
    // boolean | string
    var explicitAllDay: js.UndefOr[Boolean] = js.undefined
    
    var groupMeridiems: js.UndefOr[Boolean] = js.undefined
    
    var hideDate: js.UndefOr[Boolean] = js.undefined
    
    var hideTime: js.UndefOr[Boolean] = js.undefined
    
    var hideYear: js.UndefOr[Boolean] = js.undefined
    
    var hourFormat: js.UndefOr[String] = js.undefined
    
    var implicitMinutes: js.UndefOr[Boolean] = js.undefined
    
    var implicitYear: js.UndefOr[Boolean] = js.undefined
    
    var lastNightEndsAt: js.UndefOr[Double] = js.undefined
    
    var meridiemFormat: js.UndefOr[String] = js.undefined
    
    var minuteFormat: js.UndefOr[String] = js.undefined
    
    var monthFormat: js.UndefOr[String] = js.undefined
    
    var showDate: js.UndefOr[Boolean] = js.undefined
    
    var showDayOfWeek: js.UndefOr[Boolean] = js.undefined
    
    var spaceBeforeMeridiem: js.UndefOr[Boolean] = js.undefined
    
    var twentyFourHour: js.UndefOr[Boolean] = js.undefined
    
    var weekdayFormat: js.UndefOr[String] = js.undefined
    
    var yearFormat: js.UndefOr[String] = js.undefined
  }
  object TwixFormatOptions {
    
    inline def apply(): TwixFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TwixFormatOptions]
    }
    
    extension [Self <: TwixFormatOptions](x: Self) {
      
      inline def setAllDay(value: Any): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
      
      inline def setAllDayUndefined: Self = StObject.set(x, "allDay", js.undefined)
      
      inline def setDayFormat(value: String): Self = StObject.set(x, "dayFormat", value.asInstanceOf[js.Any])
      
      inline def setDayFormatUndefined: Self = StObject.set(x, "dayFormat", js.undefined)
      
      inline def setExplicitAllDay(value: Boolean): Self = StObject.set(x, "explicitAllDay", value.asInstanceOf[js.Any])
      
      inline def setExplicitAllDayUndefined: Self = StObject.set(x, "explicitAllDay", js.undefined)
      
      inline def setGroupMeridiems(value: Boolean): Self = StObject.set(x, "groupMeridiems", value.asInstanceOf[js.Any])
      
      inline def setGroupMeridiemsUndefined: Self = StObject.set(x, "groupMeridiems", js.undefined)
      
      inline def setHideDate(value: Boolean): Self = StObject.set(x, "hideDate", value.asInstanceOf[js.Any])
      
      inline def setHideDateUndefined: Self = StObject.set(x, "hideDate", js.undefined)
      
      inline def setHideTime(value: Boolean): Self = StObject.set(x, "hideTime", value.asInstanceOf[js.Any])
      
      inline def setHideTimeUndefined: Self = StObject.set(x, "hideTime", js.undefined)
      
      inline def setHideYear(value: Boolean): Self = StObject.set(x, "hideYear", value.asInstanceOf[js.Any])
      
      inline def setHideYearUndefined: Self = StObject.set(x, "hideYear", js.undefined)
      
      inline def setHourFormat(value: String): Self = StObject.set(x, "hourFormat", value.asInstanceOf[js.Any])
      
      inline def setHourFormatUndefined: Self = StObject.set(x, "hourFormat", js.undefined)
      
      inline def setImplicitMinutes(value: Boolean): Self = StObject.set(x, "implicitMinutes", value.asInstanceOf[js.Any])
      
      inline def setImplicitMinutesUndefined: Self = StObject.set(x, "implicitMinutes", js.undefined)
      
      inline def setImplicitYear(value: Boolean): Self = StObject.set(x, "implicitYear", value.asInstanceOf[js.Any])
      
      inline def setImplicitYearUndefined: Self = StObject.set(x, "implicitYear", js.undefined)
      
      inline def setLastNightEndsAt(value: Double): Self = StObject.set(x, "lastNightEndsAt", value.asInstanceOf[js.Any])
      
      inline def setLastNightEndsAtUndefined: Self = StObject.set(x, "lastNightEndsAt", js.undefined)
      
      inline def setMeridiemFormat(value: String): Self = StObject.set(x, "meridiemFormat", value.asInstanceOf[js.Any])
      
      inline def setMeridiemFormatUndefined: Self = StObject.set(x, "meridiemFormat", js.undefined)
      
      inline def setMinuteFormat(value: String): Self = StObject.set(x, "minuteFormat", value.asInstanceOf[js.Any])
      
      inline def setMinuteFormatUndefined: Self = StObject.set(x, "minuteFormat", js.undefined)
      
      inline def setMonthFormat(value: String): Self = StObject.set(x, "monthFormat", value.asInstanceOf[js.Any])
      
      inline def setMonthFormatUndefined: Self = StObject.set(x, "monthFormat", js.undefined)
      
      inline def setShowDate(value: Boolean): Self = StObject.set(x, "showDate", value.asInstanceOf[js.Any])
      
      inline def setShowDateUndefined: Self = StObject.set(x, "showDate", js.undefined)
      
      inline def setShowDayOfWeek(value: Boolean): Self = StObject.set(x, "showDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setShowDayOfWeekUndefined: Self = StObject.set(x, "showDayOfWeek", js.undefined)
      
      inline def setSpaceBeforeMeridiem(value: Boolean): Self = StObject.set(x, "spaceBeforeMeridiem", value.asInstanceOf[js.Any])
      
      inline def setSpaceBeforeMeridiemUndefined: Self = StObject.set(x, "spaceBeforeMeridiem", js.undefined)
      
      inline def setTwentyFourHour(value: Boolean): Self = StObject.set(x, "twentyFourHour", value.asInstanceOf[js.Any])
      
      inline def setTwentyFourHourUndefined: Self = StObject.set(x, "twentyFourHour", js.undefined)
      
      inline def setWeekdayFormat(value: String): Self = StObject.set(x, "weekdayFormat", value.asInstanceOf[js.Any])
      
      inline def setWeekdayFormatUndefined: Self = StObject.set(x, "weekdayFormat", js.undefined)
      
      inline def setYearFormat(value: String): Self = StObject.set(x, "yearFormat", value.asInstanceOf[js.Any])
      
      inline def setYearFormatUndefined: Self = StObject.set(x, "yearFormat", js.undefined)
    }
  }
  
  trait TwixIter extends StObject {
    
    def hasNext(): Boolean
    
    def next(): Twix
  }
  object TwixIter {
    
    inline def apply(hasNext: () => Boolean, next: () => Twix): TwixIter = {
      val __obj = js.Dynamic.literal(hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[TwixIter]
    }
    
    extension [Self <: TwixIter](x: Self) {
      
      inline def setHasNext(value: () => Boolean): Self = StObject.set(x, "hasNext", js.Any.fromFunction0(value))
      
      inline def setNext(value: () => Twix): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    }
  }
  
  trait TwixParseAndFormatOptions
    extends StObject
       with TwixFormatOptions {
    
    var parseStrict: js.UndefOr[Boolean] = js.undefined
  }
  object TwixParseAndFormatOptions {
    
    inline def apply(): TwixParseAndFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TwixParseAndFormatOptions]
    }
    
    extension [Self <: TwixParseAndFormatOptions](x: Self) {
      
      inline def setParseStrict(value: Boolean): Self = StObject.set(x, "parseStrict", value.asInstanceOf[js.Any])
      
      inline def setParseStrictUndefined: Self = StObject.set(x, "parseStrict", js.undefined)
    }
  }
  
  trait TwixSimpleFormatOptions extends StObject {
    
    var allDay: js.UndefOr[String] = js.undefined
    
    var template: js.UndefOr[js.Function2[/* left */ Any, /* right */ Any, Any]] = js.undefined
  }
  object TwixSimpleFormatOptions {
    
    inline def apply(): TwixSimpleFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TwixSimpleFormatOptions]
    }
    
    extension [Self <: TwixSimpleFormatOptions](x: Self) {
      
      inline def setAllDay(value: String): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
      
      inline def setAllDayUndefined: Self = StObject.set(x, "allDay", js.undefined)
      
      inline def setTemplate(value: (/* left */ Any, /* right */ Any) => Any): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  trait TwixStatic extends StObject {
    
    var formatTemplate: js.UndefOr[js.Function2[/* left */ Any, /* right */ Any, Any]] = js.undefined
  }
  object TwixStatic {
    
    inline def apply(): TwixStatic = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TwixStatic]
    }
    
    extension [Self <: TwixStatic](x: Self) {
      
      inline def setFormatTemplate(value: (/* left */ Any, /* right */ Any) => Any): Self = StObject.set(x, "formatTemplate", js.Any.fromFunction2(value))
      
      inline def setFormatTemplateUndefined: Self = StObject.set(x, "formatTemplate", js.undefined)
    }
  }
}
