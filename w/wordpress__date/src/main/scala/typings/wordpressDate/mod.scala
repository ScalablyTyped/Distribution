package typings.wordpressDate

import typings.moment.mod.MomentInput
import typings.std.Date
import typings.wordpressDate.anon.Locale
import typings.wordpressDate.anon.Offset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/date", "date")
  @js.native
  def date(dateFormat: String): String = js.native
  @JSImport("@wordpress/date", "date")
  @js.native
  def date(dateFormat: String, dateValue: MomentInput): String = js.native
  
  @JSImport("@wordpress/date", "dateI18n")
  @js.native
  def dateI18n(dateFormat: String): String = js.native
  @JSImport("@wordpress/date", "dateI18n")
  @js.native
  def dateI18n(dateFormat: String, dateValue: js.UndefOr[MomentInput], gmt: Boolean): String = js.native
  @JSImport("@wordpress/date", "dateI18n")
  @js.native
  def dateI18n(dateFormat: String, dateValue: MomentInput): String = js.native
  
  @JSImport("@wordpress/date", "format")
  @js.native
  def format(dateFormat: String): String = js.native
  @JSImport("@wordpress/date", "format")
  @js.native
  def format(dateFormat: String, dateValue: MomentInput): String = js.native
  
  @JSImport("@wordpress/date", "getDate")
  @js.native
  def getDate(): Date = js.native
  @JSImport("@wordpress/date", "getDate")
  @js.native
  def getDate(dateValue: MomentInput): Date = js.native
  
  @JSImport("@wordpress/date", "gmdate")
  @js.native
  def gmdate(dateFormat: String): String = js.native
  @JSImport("@wordpress/date", "gmdate")
  @js.native
  def gmdate(dateFormat: String, dateValue: MomentInput): String = js.native
  
  @JSImport("@wordpress/date", "isInTheFuture")
  @js.native
  def isInTheFuture(dateValue: MomentInput): Boolean = js.native
  
  @JSImport("@wordpress/date", "setSettings")
  @js.native
  def setSettings(dateSettings: DateSettings): Unit = js.native
  
  @js.native
  trait DateSettings extends StObject {
    
    var formats: typings.wordpressDate.anon.Date = js.native
    
    var l10n: Locale = js.native
    
    var timezone: Offset = js.native
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
