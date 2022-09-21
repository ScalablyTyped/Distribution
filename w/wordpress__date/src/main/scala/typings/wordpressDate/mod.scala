package typings.wordpressDate

import typings.moment.mod.MomentInput
import typings.wordpressDate.anon.Date
import typings.wordpressDate.anon.Locale
import typings.wordpressDate.anon.Offset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/date", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def date(dateFormat: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(dateFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def date(dateFormat: String, dateValue: Unit, timezone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(dateFormat.asInstanceOf[js.Any], dateValue.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def date(dateFormat: String, dateValue: Unit, timezone: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(dateFormat.asInstanceOf[js.Any], dateValue.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def date(dateFormat: String, dateValue: MomentInput): String = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(dateFormat.asInstanceOf[js.Any], dateValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def date(dateFormat: String, dateValue: MomentInput, timezone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(dateFormat.asInstanceOf[js.Any], dateValue.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def date(dateFormat: String, dateValue: MomentInput, timezone: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(dateFormat.asInstanceOf[js.Any], dateValue.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def dateI18n(dateFormat: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dateI18n")(dateFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def dateI18n(dateFormat: String, dateValue: Unit, timezone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dateI18n")(dateFormat.asInstanceOf[js.Any], dateValue.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def dateI18n(dateFormat: String, dateValue: Unit, timezone: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dateI18n")(dateFormat.asInstanceOf[js.Any], dateValue.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def dateI18n(dateFormat: String, dateValue: MomentInput): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dateI18n")(dateFormat.asInstanceOf[js.Any], dateValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def dateI18n(dateFormat: String, dateValue: MomentInput, timezone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dateI18n")(dateFormat.asInstanceOf[js.Any], dateValue.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def dateI18n(dateFormat: String, dateValue: MomentInput, timezone: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dateI18n")(dateFormat.asInstanceOf[js.Any], dateValue.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def format(dateFormat: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(dateFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(dateFormat: String, dateValue: MomentInput): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(dateFormat.asInstanceOf[js.Any], dateValue.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getDate(): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDate")().asInstanceOf[js.Date]
  inline def getDate(dateValue: MomentInput): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDate")(dateValue.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def gmdate(dateFormat: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("gmdate")(dateFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def gmdate(dateFormat: String, dateValue: MomentInput): String = (^.asInstanceOf[js.Dynamic].applyDynamic("gmdate")(dateFormat.asInstanceOf[js.Any], dateValue.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isInTheFuture(dateValue: MomentInput): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInTheFuture")(dateValue.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def setSettings(dateSettings: DateSettings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSettings")(dateSettings.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait DateSettings extends StObject {
    
    var formats: Date
    
    var l10n: Locale
    
    var timezone: Offset
  }
  object DateSettings {
    
    inline def apply(formats: Date, l10n: Locale, timezone: Offset): DateSettings = {
      val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], l10n = l10n.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateSettings]
    }
    
    extension [Self <: DateSettings](x: Self) {
      
      inline def setFormats(value: Date): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setL10n(value: Locale): Self = StObject.set(x, "l10n", value.asInstanceOf[js.Any])
      
      inline def setTimezone(value: Offset): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    }
  }
}
