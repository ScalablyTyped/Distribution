package typings.vueI18n.mod

import typings.intlifyCoreBase.mod.DateTimeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComposerDateTimeFormatting[DateTimeFormats, Locales, DefinedDateTimeFormat /* <: js.Object */, C, M, ResourceKeys /* <: C | M */] extends StObject {
  
  def apply(value: String): String = js.native
  def apply(value: js.Date): String = js.native
  /**
    * Datetime formatting
    *
    * @remarks
    * If this is used in a reactive context, it will re-evaluate once the locale changes.
    *
    * If [UseI18nScope](general#usei18nscope) `'local'` or Some [UseI18nOptions](composition#usei18noptions) are specified at `useI18n`, it’s translated in preferentially local scope datetime formats than global scope datetime formats.
    *
    * If not, then it’s formatted with global scope datetime formats.
    *
    * @param value - A value, timestamp number or `Date` instance or ISO 8601 string
    *
    * @returns Formatted value
    *
    * @VueI18nSee [Datetime formatting](../guide/essentials/datetime)
    */
  def apply(value: Double): String = js.native
  def apply[Key /* <: String */](value: String, keyOrOptions: Key | ResourceKeys): String = js.native
  def apply[Key /* <: String */](value: String, keyOrOptions: Key | ResourceKeys, locale: Locales): String = js.native
  def apply[Key /* <: String */](value: String, keyOrOptions: DateTimeOptions[Key | ResourceKeys, Locales]): String = js.native
  def apply[Key /* <: String */](value: String, keyOrOptions: DateTimeOptions[Key | ResourceKeys, Locales], locale: Locales): String = js.native
  def apply[Key /* <: String */](value: js.Date, keyOrOptions: Key | ResourceKeys): String = js.native
  def apply[Key /* <: String */](value: js.Date, keyOrOptions: Key | ResourceKeys, locale: Locales): String = js.native
  def apply[Key /* <: String */](value: js.Date, keyOrOptions: DateTimeOptions[Key | ResourceKeys, Locales]): String = js.native
  def apply[Key /* <: String */](value: js.Date, keyOrOptions: DateTimeOptions[Key | ResourceKeys, Locales], locale: Locales): String = js.native
  /**
    * Datetime formatting
    *
    * @remarks
    * Overloaded `d`. About details, see the [call signature](composition#value-number-date-string-string) details.
    *
    * In this overloaded `d`, format in datetime format for a key registered in datetime formats.
    *
    * @param value - A value, timestamp number or `Date` instance or ISO 8601 string
    * @param keyOrOptions - A key of datetime formats, or additional {@link DateTimeOptions | options} for datetime formatting
    *
    * @returns Formatted value
    */
  def apply[Key /* <: String */](value: Double, keyOrOptions: Key | ResourceKeys): String = js.native
  /**
    * Datetime formatting
    *
    * @remarks
    * Overloaded `d`. About details, see the [call signature](composition#value-number-date-string-string) details.
    *
    * In this overloaded `d`, format in datetime format for a key registered in datetime formats at target locale
    *
    * @param value - A value, timestamp number or `Date` instance or ISO 8601 string
    * @param keyOrOptions - A key of datetime formats, or additional {@link DateTimeOptions | options} for datetime formatting
    * @param locale - A locale, it will be used over than global scope or local scope.
    *
    * @returns Formatted value
    */
  def apply[Key /* <: String */](value: Double, keyOrOptions: Key | ResourceKeys, locale: Locales): String = js.native
  def apply[Key /* <: String */](value: Double, keyOrOptions: DateTimeOptions[Key | ResourceKeys, Locales]): String = js.native
  def apply[Key /* <: String */](value: Double, keyOrOptions: DateTimeOptions[Key | ResourceKeys, Locales], locale: Locales): String = js.native
}
