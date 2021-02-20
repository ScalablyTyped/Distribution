package typings.ultraStrftime

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ultra-strftime", JSImport.Namespace)
  @js.native
  def apply(fmt: String): String = js.native
  @JSImport("ultra-strftime", JSImport.Namespace)
  @js.native
  def apply(fmt: String, d: js.UndefOr[scala.Nothing], locale: js.UndefOr[scala.Nothing], options: Options): String = js.native
  @JSImport("ultra-strftime", JSImport.Namespace)
  @js.native
  def apply(fmt: String, d: js.UndefOr[scala.Nothing], locale: Locale): String = js.native
  @JSImport("ultra-strftime", JSImport.Namespace)
  @js.native
  def apply(fmt: String, d: js.UndefOr[scala.Nothing], locale: Locale, options: Options): String = js.native
  @JSImport("ultra-strftime", JSImport.Namespace)
  @js.native
  def apply(fmt: String, d: Date): String = js.native
  @JSImport("ultra-strftime", JSImport.Namespace)
  @js.native
  def apply(fmt: String, d: Date, locale: js.UndefOr[scala.Nothing], options: Options): String = js.native
  @JSImport("ultra-strftime", JSImport.Namespace)
  @js.native
  def apply(fmt: String, d: Date, locale: Locale): String = js.native
  @JSImport("ultra-strftime", JSImport.Namespace)
  @js.native
  def apply(fmt: String, d: Date, locale: Locale, options: Options): String = js.native
  @JSImport("ultra-strftime", JSImport.Namespace)
  @js.native
  def apply(fmt: String, locale: js.UndefOr[scala.Nothing], options: Options): String = js.native
  @JSImport("ultra-strftime", JSImport.Namespace)
  @js.native
  def apply(fmt: String, locale: Locale): String = js.native
  @JSImport("ultra-strftime", JSImport.Namespace)
  @js.native
  def apply(fmt: String, locale: Locale, options: Options): String = js.native
  
  @JSImport("ultra-strftime", "localizedStrftime")
  @js.native
  def localizedStrftime(locale: Locale): StrftimeFunction = js.native
  
  @JSImport("ultra-strftime", "strftime")
  @js.native
  def strftime(fmt: String): String = js.native
  @JSImport("ultra-strftime", "strftime")
  @js.native
  def strftime(fmt: String, d: js.UndefOr[scala.Nothing], locale: js.UndefOr[scala.Nothing], options: Options): String = js.native
  @JSImport("ultra-strftime", "strftime")
  @js.native
  def strftime(fmt: String, d: js.UndefOr[scala.Nothing], locale: Locale): String = js.native
  @JSImport("ultra-strftime", "strftime")
  @js.native
  def strftime(fmt: String, d: js.UndefOr[scala.Nothing], locale: Locale, options: Options): String = js.native
  @JSImport("ultra-strftime", "strftime")
  @js.native
  def strftime(fmt: String, d: Date): String = js.native
  @JSImport("ultra-strftime", "strftime")
  @js.native
  def strftime(fmt: String, d: Date, locale: js.UndefOr[scala.Nothing], options: Options): String = js.native
  @JSImport("ultra-strftime", "strftime")
  @js.native
  def strftime(fmt: String, d: Date, locale: Locale): String = js.native
  @JSImport("ultra-strftime", "strftime")
  @js.native
  def strftime(fmt: String, d: Date, locale: Locale, options: Options): String = js.native
  @JSImport("ultra-strftime", "strftime")
  @js.native
  def strftime(fmt: String, locale: js.UndefOr[scala.Nothing], options: Options): String = js.native
  @JSImport("ultra-strftime", "strftime")
  @js.native
  def strftime(fmt: String, locale: Locale): String = js.native
  @JSImport("ultra-strftime", "strftime")
  @js.native
  def strftime(fmt: String, locale: Locale, options: Options): String = js.native
  
  @JSImport("ultra-strftime", "strftimeTZ")
  @js.native
  def strftimeTZ(fmt: String, d: Date, locale: Locale, timezone: Double): String = js.native
  @JSImport("ultra-strftime", "strftimeTZ")
  @js.native
  def strftimeTZ(fmt: String, d: Date, timezone: Double): String = js.native
  
  @JSImport("ultra-strftime", "strftimeUTC")
  @js.native
  def strftimeUTC(fmt: String): String = js.native
  @JSImport("ultra-strftime", "strftimeUTC")
  @js.native
  def strftimeUTC(fmt: String, d: js.UndefOr[scala.Nothing], locale: Locale): String = js.native
  @JSImport("ultra-strftime", "strftimeUTC")
  @js.native
  def strftimeUTC(fmt: String, d: Date): String = js.native
  @JSImport("ultra-strftime", "strftimeUTC")
  @js.native
  def strftimeUTC(fmt: String, d: Date, locale: Locale): String = js.native
  
  @js.native
  trait Locale extends StObject {
    
    var AM: String = js.native
    
    var PM: String = js.native
    
    var am: String = js.native
    
    var days: js.Array[String] = js.native
    
    var formats: LocaleFormats = js.native
    
    var months: js.Array[String] = js.native
    
    var pm: String = js.native
    
    var shortDays: js.Array[String] = js.native
    
    var shortMonths: js.Array[String] = js.native
  }
  object Locale {
    
    @scala.inline
    def apply(
      AM: String,
      PM: String,
      am: String,
      days: js.Array[String],
      formats: LocaleFormats,
      months: js.Array[String],
      pm: String,
      shortDays: js.Array[String],
      shortMonths: js.Array[String]
    ): Locale = {
      val __obj = js.Dynamic.literal(AM = AM.asInstanceOf[js.Any], PM = PM.asInstanceOf[js.Any], am = am.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any], shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAM(value: String): Self = StObject.set(x, "AM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDays(value: js.Array[String]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysVarargs(value: String*): Self = StObject.set(x, "days", js.Array(value :_*))
      
      @scala.inline
      def setFormats(value: LocaleFormats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value :_*))
      
      @scala.inline
      def setPM(value: String): Self = StObject.set(x, "PM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortDays(value: js.Array[String]): Self = StObject.set(x, "shortDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortDaysVarargs(value: String*): Self = StObject.set(x, "shortDays", js.Array(value :_*))
      
      @scala.inline
      def setShortMonths(value: js.Array[String]): Self = StObject.set(x, "shortMonths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortMonthsVarargs(value: String*): Self = StObject.set(x, "shortMonths", js.Array(value :_*))
    }
  }
  
  @js.native
  trait LocaleFormats extends StObject {
    
    /** equivalent to %m/%d/%y in en_US */
    var D: String = js.native
    
    /** equivalent to %Y-%m-%d in en_US */
    var F: String = js.native
    
    /** equivalent to %H:%M in en_US */
    var R: String = js.native
    
    /** equivalent to %H:%M:%S in en_US */
    var T: String = js.native
    
    /** equivalent to %D in en_US */
    var X: String = js.native
    
    /** equivalent to %a %b %d %X %Y %Z in en_US */
    var c: String = js.native
    
    /** equivalent to %I:%M:%S %p in en_US */
    var r: String = js.native
    
    /** equivalent to %e-%b-%Y in en_US */
    var v: String = js.native
    
    /** equivalent to %T in en_US */
    var x: String = js.native
  }
  object LocaleFormats {
    
    @scala.inline
    def apply(D: String, F: String, R: String, T: String, X: String, c: String, r: String, v: String, x: String): LocaleFormats = {
      val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], F = F.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any], T = T.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocaleFormats]
    }
    
    @scala.inline
    implicit class LocaleFormatsMutableBuilder[Self <: LocaleFormats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setD(value: String): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setF(value: String): Self = StObject.set(x, "F", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: String): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setT(value: String): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: String): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var timezone: js.UndefOr[String | Double] = js.native
    
    var utc: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimezone(value: String | Double): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
      
      @scala.inline
      def setUtc(value: Boolean): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtcUndefined: Self = StObject.set(x, "utc", js.undefined)
    }
  }
  
  type StrftimeFunction = js.Function3[/* fmt */ String, /* d */ js.UndefOr[Date], /* options */ js.UndefOr[Options], String]
}
