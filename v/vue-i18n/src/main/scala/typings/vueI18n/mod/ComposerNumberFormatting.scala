package typings.vueI18n.mod

import typings.intlifyCoreBase.mod.NumberOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComposerNumberFormatting[NumberFormats, Locales, DefinedNumberFormat /* <: js.Object */, C, M, ResourceKeys /* <: C | M */] extends StObject {
  
  /**
    * Number Formatting
    *
    * @remarks
    * If this is used in a reactive context, it will re-evaluate once the locale changes.
    *
    * If [UseI18nScope](general#usei18nscope) `'local'` or Some [UseI18nOptions](composition#usei18noptions) are specified at `useI18n`, it’s translated in preferentially local scope datetime formats than global scope datetime formats.
    *
    * If not, then it’s formatted with global scope number formats.
    *
    * @param value - A number value
    *
    * @returns Formatted value
    *
    * @VueI18nSee [Number formatting](../guide/essentials/number)
    */
  def apply(value: Double): String = js.native
  /**
    * Number Formatting
    *
    * @remarks
    * Overloaded `n`. About details, see the [call signature](composition#value-number-string) details.
    *
    * In this overloaded `n`, format in number format for a key registered in number formats.
    *
    * @param value - A number value
    * @param keyOrOptions - A key of number formats, or additional {@link NumberOptions | options} for number formatting
    *
    * @returns Formatted value
    */
  def apply[Key /* <: String */](value: Double, keyOrOptions: Key | ResourceKeys): String = js.native
  /**
    * Number Formatting
    *
    * @remarks
    * Overloaded `n`. About details, see the [call signature](composition#value-number-string) details.
    *
    * In this overloaded `n`, format in number format for a key registered in number formats at target locale.
    *
    * @param value - A number value
    * @param keyOrOptions - A key of number formats, or additional {@link NumberOptions | options} for number formatting
    * @param locale - A locale, it will be used over than global scope or local scope.
    *
    * @returns Formatted value
    */
  def apply[Key /* <: String */](value: Double, keyOrOptions: Key | ResourceKeys, locale: Locales): String = js.native
  def apply[Key /* <: String */](value: Double, keyOrOptions: NumberOptions[Key | ResourceKeys, Locales]): String = js.native
  def apply[Key /* <: String */](value: Double, keyOrOptions: NumberOptions[Key | ResourceKeys, Locales], locale: Locales): String = js.native
}
