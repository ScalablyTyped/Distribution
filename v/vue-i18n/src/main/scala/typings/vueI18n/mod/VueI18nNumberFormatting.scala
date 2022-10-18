package typings.vueI18n.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueI18nNumberFormatting[NumberFormats, Locales, DefinedNumberFormat /* <: js.Object */, C, M, ResourceKeys /* <: C | M */] extends StObject {
  
  /**
    * Number formatting
    *
    * @remarks
    * If this is used in a reactive context, it will re-evaluate once the locale changes.
    *
    * If [i18n component options](injection#i18n) is specified, it’s formatted in preferentially local scope number formats than global scope locale messages.
    *
    * If [i18n component options](injection#i18n) isn't specified, it’s formatted with global scope number formats.
    *
    * @param value - A number value
    *
    * @returns Formatted value
    *
    * @VueI18nSee [Number formatting](../guide/essentials/number)
    */
  def apply(value: Double): NumberFormatResult = js.native
  /**
    * Number formatting
    *
    * @remarks
    * Overloaded `n`. About details, see the [call signature](legacy#value-number-numberformatresult) details.
    *
    * @param value - A number value
    * @param args - An argument values
    *
    * @returns Formatted value
    */
  def apply(value: Double, args: StringDictionary[String | Boolean | Double]): NumberFormatResult = js.native
  /**
    * Number formatting
    *
    * @remarks
    * Overloaded `n`. About details, see the [call signature](legacy#value-number-numberformatresult) details.
    *
    * @param value - A number value
    * @param key - A key of number formats
    *
    * @returns Formatted value
    */
  def apply[Key /* <: String */](value: Double, key: Key | ResourceKeys): NumberFormatResult = js.native
  /**
    * Number formatting
    *
    * @remarks
    * Overloaded `n`. About details, see the [call signature](legacy#value-number-numberformatresult) details.
    *
    * @param value - A number value
    * @param key - A key of number formats
    * @param locale - A locale, it will be used over than global scope or local scope.
    *
    * @returns Formatted value
    */
  def apply[Key /* <: String */](value: Double, key: Key | ResourceKeys, locale: Locales): NumberFormatResult = js.native
}
