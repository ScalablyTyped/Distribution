package typings.vueI18n.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueI18nDateTimeFormatting[DateTimeFormats, Locales, DefinedDateTimeFormat /* <: js.Object */, C, M, ResourceKeys /* <: C | M */] extends StObject {
  
  def apply(value: js.Date): DateTimeFormatResult = js.native
  def apply(value: js.Date, args: StringDictionary[String | Boolean | Double]): DateTimeFormatResult = js.native
  /**
    * Datetime formatting
    *
    * @remarks
    * If this is used in a reactive context, it will re-evaluate once the locale changes.
    *
    * If [i18n component options](injection#i18n) is specified, it’s formatted in preferentially local scope datetime formats than global scope locale messages.
    *
    * If [i18n component options](injection#i18n) isn't specified, it’s formatted with global scope datetime formats.
    *
    * @param value - A value, timestamp number or `Date` instance
    *
    * @returns Formatted value
    *
    * @VueI18nSee [Datetime formatting](../guide/essentials/datetime)
    */
  def apply(value: Double): DateTimeFormatResult = js.native
  /**
    * Datetime formatting
    *
    * @remarks
    * Overloaded `d`. About details, see the [call signature](legacy#value-number-date-datetimeformatresult) details.
    *
    * @param value - A value, timestamp number or `Date` instance
    * @param args - An argument values
    *
    * @returns Formatted value
    */
  def apply(value: Double, args: StringDictionary[String | Boolean | Double]): DateTimeFormatResult = js.native
  def apply[Key /* <: String */](value: js.Date, key: Key | ResourceKeys): DateTimeFormatResult = js.native
  def apply[Key /* <: String */](value: js.Date, key: Key | ResourceKeys, locale: Locales): DateTimeFormatResult = js.native
  /**
    * Datetime formatting
    *
    * @remarks
    * Overloaded `d`. About details, see the [call signature](legacy#value-number-date-datetimeformatresult) details.
    *
    * @param value - A value, timestamp number or `Date` instance
    * @param key - A key of datetime formats
    *
    * @returns Formatted value
    */
  def apply[Key /* <: String */](value: Double, key: Key | ResourceKeys): DateTimeFormatResult = js.native
  /**
    * Datetime formatting
    *
    * @remarks
    * Overloaded `d`. About details, see the [call signature](legacy#value-number-date-datetimeformatresult) details.
    *
    * @param value - A value, timestamp number or `Date` instance
    * @param key - A key of datetime formats
    * @param locale - A locale, it will be used over than global scope or local scope.
    *
    * @returns Formatted value
    */
  def apply[Key /* <: String */](value: Double, key: Key | ResourceKeys, locale: Locales): DateTimeFormatResult = js.native
}
