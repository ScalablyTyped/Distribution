package typings.vueI18n

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vueI18n.mod.VueI18n.Choice
import typings.vueI18n.mod.VueI18n.DateTimeFormatResult
import typings.vueI18n.mod.VueI18n.Locale
import typings.vueI18n.mod.VueI18n.LocaleMessages
import typings.vueI18n.mod.VueI18n.NumberFormatResult
import typings.vueI18n.mod.VueI18n.NumberFormats
import typings.vueI18n.mod.VueI18n.Path
import typings.vueI18n.mod.VueI18n.TranslateResult
import typings.vueI18n.mod.VueI18n.Values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait DateTimeFormats extends StObject {
    
    var dateTimeFormats: js.UndefOr[typings.vueI18n.mod.VueI18n.DateTimeFormats] = js.native
    
    var messages: js.UndefOr[LocaleMessages] = js.native
    
    var numberFormats: js.UndefOr[NumberFormats] = js.native
    
    var sharedMessages: js.UndefOr[LocaleMessages] = js.native
  }
  object DateTimeFormats {
    
    @scala.inline
    def apply(): DateTimeFormats = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateTimeFormats]
    }
    
    @scala.inline
    implicit class DateTimeFormatsMutableBuilder[Self <: DateTimeFormats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDateTimeFormats(value: typings.vueI18n.mod.VueI18n.DateTimeFormats): Self = StObject.set(x, "dateTimeFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTimeFormatsUndefined: Self = StObject.set(x, "dateTimeFormats", js.undefined)
      
      @scala.inline
      def setMessages(value: LocaleMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setNumberFormats(value: NumberFormats): Self = StObject.set(x, "numberFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberFormatsUndefined: Self = StObject.set(x, "numberFormats", js.undefined)
      
      @scala.inline
      def setSharedMessages(value: LocaleMessages): Self = StObject.set(x, "sharedMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedMessagesUndefined: Self = StObject.set(x, "sharedMessages", js.undefined)
    }
  }
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply(value: Double): NumberFormatResult = js.native
    def apply(value: Double, args: StringDictionary[String]): NumberFormatResult = js.native
    def apply(value: Double, key: js.UndefOr[scala.Nothing], locale: Locale): NumberFormatResult = js.native
    def apply(value: Double, key: Path): NumberFormatResult = js.native
    def apply(value: Double, key: Path, locale: Locale): NumberFormatResult = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(key: Path): TranslateResult = js.native
    def apply(key: Path, locale: Locale): TranslateResult = js.native
    def apply(key: Path, locale: Locale, values: Values): TranslateResult = js.native
    def apply(key: Path, values: Values): TranslateResult = js.native
  }
  
  @js.native
  trait FnCallKeyChoiceLocaleValues extends StObject {
    
    def apply(key: Path): String = js.native
    def apply(key: Path, choice: js.UndefOr[scala.Nothing], values: Values): String = js.native
    def apply(key: Path, choice: Choice): String = js.native
    def apply(key: Path, choice: Choice, locale: Locale): String = js.native
    def apply(key: Path, choice: Choice, locale: Locale, values: Values): String = js.native
    def apply(key: Path, choice: Choice, values: Values): String = js.native
  }
  
  @js.native
  trait FnCallValueKeyLocale extends StObject {
    
    def apply(value: Double): DateTimeFormatResult = js.native
    def apply(value: Double, args: StringDictionary[String]): DateTimeFormatResult = js.native
    def apply(value: Double, key: js.UndefOr[scala.Nothing], locale: Locale): DateTimeFormatResult = js.native
    def apply(value: Double, key: Path): DateTimeFormatResult = js.native
    def apply(value: Double, key: Path, locale: Locale): DateTimeFormatResult = js.native
    def apply(value: Date): DateTimeFormatResult = js.native
    def apply(value: Date, args: StringDictionary[String]): DateTimeFormatResult = js.native
    def apply(value: Date, key: js.UndefOr[scala.Nothing], locale: Locale): DateTimeFormatResult = js.native
    def apply(value: Date, key: Path): DateTimeFormatResult = js.native
    def apply(value: Date, key: Path, locale: Locale): DateTimeFormatResult = js.native
  }
}
