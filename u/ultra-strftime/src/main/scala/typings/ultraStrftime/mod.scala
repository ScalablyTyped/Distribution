package typings.ultraStrftime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(fmt: String): String = ^.asInstanceOf[js.Dynamic].apply(fmt.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(fmt: String, d: js.Date): String = (^.asInstanceOf[js.Dynamic].apply(fmt.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(fmt: String, d: js.Date, locale: Unit, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(fmt.asInstanceOf[js.Any], d.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(fmt: String, d: js.Date, locale: Locale): String = (^.asInstanceOf[js.Dynamic].apply(fmt.asInstanceOf[js.Any], d.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(fmt: String, d: js.Date, locale: Locale, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(fmt.asInstanceOf[js.Any], d.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(fmt: String, d: Unit, locale: Unit, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(fmt.asInstanceOf[js.Any], d.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(fmt: String, d: Unit, locale: Locale): String = (^.asInstanceOf[js.Dynamic].apply(fmt.asInstanceOf[js.Any], d.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(fmt: String, d: Unit, locale: Locale, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(fmt.asInstanceOf[js.Any], d.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(fmt: String, locale: Unit, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(fmt.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(fmt: String, locale: Locale): String = (^.asInstanceOf[js.Dynamic].apply(fmt.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(fmt: String, locale: Locale, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(fmt.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("ultra-strftime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def localizedStrftime(locale: Locale): StrftimeFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("localizedStrftime")(locale.asInstanceOf[js.Any]).asInstanceOf[StrftimeFunction]
  
  inline def strftime(fmt: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("strftime")(fmt.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def strftime(fmt: String, d: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("strftime")(fmt.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def strftime(fmt: String, d: js.Date, locale: Unit, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("strftime")(fmt.asInstanceOf[js.Any], d.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def strftime(fmt: String, d: js.Date, locale: Locale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("strftime")(fmt.asInstanceOf[js.Any], d.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def strftime(fmt: String, d: js.Date, locale: Locale, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("strftime")(fmt.asInstanceOf[js.Any], d.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def strftime(fmt: String, d: Unit, locale: Unit, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("strftime")(fmt.asInstanceOf[js.Any], d.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def strftime(fmt: String, d: Unit, locale: Locale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("strftime")(fmt.asInstanceOf[js.Any], d.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def strftime(fmt: String, d: Unit, locale: Locale, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("strftime")(fmt.asInstanceOf[js.Any], d.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def strftime(fmt: String, locale: Unit, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("strftime")(fmt.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def strftime(fmt: String, locale: Locale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("strftime")(fmt.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def strftime(fmt: String, locale: Locale, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("strftime")(fmt.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def strftimeTZ(fmt: String, d: js.Date, locale: Locale, timezone: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("strftimeTZ")(fmt.asInstanceOf[js.Any], d.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def strftimeTZ(fmt: String, d: js.Date, timezone: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("strftimeTZ")(fmt.asInstanceOf[js.Any], d.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def strftimeUTC(fmt: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("strftimeUTC")(fmt.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def strftimeUTC(fmt: String, d: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("strftimeUTC")(fmt.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def strftimeUTC(fmt: String, d: js.Date, locale: Locale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("strftimeUTC")(fmt.asInstanceOf[js.Any], d.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def strftimeUTC(fmt: String, d: Unit, locale: Locale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("strftimeUTC")(fmt.asInstanceOf[js.Any], d.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Locale extends StObject {
    
    var AM: String
    
    var PM: String
    
    var am: String
    
    var days: js.Array[String]
    
    var formats: LocaleFormats
    
    var months: js.Array[String]
    
    var pm: String
    
    var shortDays: js.Array[String]
    
    var shortMonths: js.Array[String]
  }
  object Locale {
    
    inline def apply(
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
    
    extension [Self <: Locale](x: Self) {
      
      inline def setAM(value: String): Self = StObject.set(x, "AM", value.asInstanceOf[js.Any])
      
      inline def setDays(value: js.Array[String]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setDaysVarargs(value: String*): Self = StObject.set(x, "days", js.Array(value*))
      
      inline def setFormats(value: LocaleFormats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value*))
      
      inline def setPM(value: String): Self = StObject.set(x, "PM", value.asInstanceOf[js.Any])
      
      inline def setShortDays(value: js.Array[String]): Self = StObject.set(x, "shortDays", value.asInstanceOf[js.Any])
      
      inline def setShortDaysVarargs(value: String*): Self = StObject.set(x, "shortDays", js.Array(value*))
      
      inline def setShortMonths(value: js.Array[String]): Self = StObject.set(x, "shortMonths", value.asInstanceOf[js.Any])
      
      inline def setShortMonthsVarargs(value: String*): Self = StObject.set(x, "shortMonths", js.Array(value*))
    }
  }
  
  trait LocaleFormats extends StObject {
    
    /** equivalent to %m/%d/%y in en_US */
    var D: String
    
    /** equivalent to %Y-%m-%d in en_US */
    var F: String
    
    /** equivalent to %H:%M in en_US */
    var R: String
    
    /** equivalent to %H:%M:%S in en_US */
    var T: String
    
    /** equivalent to %D in en_US */
    var X: String
    
    /** equivalent to %a %b %d %X %Y %Z in en_US */
    var c: String
    
    /** equivalent to %I:%M:%S %p in en_US */
    var r: String
    
    /** equivalent to %e-%b-%Y in en_US */
    var v: String
    
    /** equivalent to %T in en_US */
    var x: String
  }
  object LocaleFormats {
    
    inline def apply(D: String, F: String, R: String, T: String, X: String, c: String, r: String, v: String, x: String): LocaleFormats = {
      val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], F = F.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any], T = T.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocaleFormats]
    }
    
    extension [Self <: LocaleFormats](x: Self) {
      
      inline def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setD(value: String): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
      
      inline def setF(value: String): Self = StObject.set(x, "F", value.asInstanceOf[js.Any])
      
      inline def setR(value: String): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
      
      inline def setT(value: String): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
      
      inline def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setX(value: String): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var timezone: js.UndefOr[String | Double] = js.undefined
    
    var utc: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setTimezone(value: String | Double): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
      
      inline def setUtc(value: Boolean): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
      
      inline def setUtcUndefined: Self = StObject.set(x, "utc", js.undefined)
    }
  }
  
  type StrftimeFunction = js.Function3[
    /* fmt */ String, 
    /* d */ js.UndefOr[js.Date], 
    /* options */ js.UndefOr[Options], 
    String
  ]
}
