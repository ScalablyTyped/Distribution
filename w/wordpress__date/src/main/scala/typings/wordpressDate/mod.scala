package typings.wordpressDate

import typings.moment.mod.MomentInput
import typings.std.Date
import typings.wordpressDate.anon.Locale
import typings.wordpressDate.anon.Offset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/date", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def date(dateFormat: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(dateFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def date(dateFormat: String, dateValue: MomentInput): String = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(dateFormat.asInstanceOf[js.Any], dateValue.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def dateI18n(dateFormat: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dateI18n")(dateFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def dateI18n(dateFormat: String, dateValue: Unit, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dateI18n")(dateFormat.asInstanceOf[js.Any], dateValue.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def dateI18n(dateFormat: String, dateValue: MomentInput): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dateI18n")(dateFormat.asInstanceOf[js.Any], dateValue.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def dateI18n(dateFormat: String, dateValue: MomentInput, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dateI18n")(dateFormat.asInstanceOf[js.Any], dateValue.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def format(dateFormat: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(dateFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def format(dateFormat: String, dateValue: MomentInput): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(dateFormat.asInstanceOf[js.Any], dateValue.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getDate(): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDate")().asInstanceOf[Date]
  @scala.inline
  def getDate(dateValue: MomentInput): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDate")(dateValue.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def gmdate(dateFormat: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("gmdate")(dateFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def gmdate(dateFormat: String, dateValue: MomentInput): String = (^.asInstanceOf[js.Dynamic].applyDynamic("gmdate")(dateFormat.asInstanceOf[js.Any], dateValue.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def isInTheFuture(dateValue: MomentInput): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInTheFuture")(dateValue.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def setSettings(dateSettings: DateSettings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSettings")(dateSettings.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait DateSettings extends StObject {
    
    var formats: typings.wordpressDate.anon.Date
    
    var l10n: Locale
    
    var timezone: Offset
  }
  object DateSettings {
    
    @scala.inline
    def apply(formats: typings.wordpressDate.anon.Date, l10n: Locale, timezone: Offset): DateSettings = {
      val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], l10n = l10n.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateSettings]
    }
    
    @scala.inline
    implicit class DateSettingsMutableBuilder[Self <: DateSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormats(value: typings.wordpressDate.anon.Date): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL10n(value: Locale): Self = StObject.set(x, "l10n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezone(value: Offset): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    }
  }
}
