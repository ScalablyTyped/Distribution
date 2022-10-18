package typings.vueI18n.mod

import typings.intlifyCoreBase.mod.NamedValue
import typings.intlifyCoreBase.mod.TranslateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComposerTranslation[Messages, Locales, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, C, M, ResourceKeys /* <: C | M */] extends StObject {
  
  /**
    * Locale message translation
    *
    * @remarks
    * If this is used in a reactive context, it will re-evaluate once the locale changes.
    *
    * If [UseI18nScope](general#usei18nscope) `'local'` or Some [UseI18nOptions](composition#usei18noptions) are specified at `useI18n`, it’s translated in preferentially local scope locale messages than global scope locale messages.
    *
    * If not, then it’s translated with global scope locale messages.
    *
    * @param key - A target locale message key
    *
    * @returns Translated message
    *
    * @VueI18nSee [Scope and Locale Changing](../guide/essentials/scope)
    */
  def apply[Key /* <: String */](key: Key | ResourceKeys): String = js.native
  /**
    * Locale message translation for missing default message
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](composition#key-key-resourcekeys-number-string) details.
    *
    * In this overloaded `t`, if no translation was found, return a default message.
    *
    * You can also suppress the warning, when the translation missing according to the options.
    *
    * About details of options, see the {@link TranslateOptions}.
    *
    * @param key - A target locale message key
    * @param defaultMsg - A default message to return if no translation was found
    * @param options - Additional {@link TranslateOptions | options} for translation
    *
    * @returns Translated message
    */
  def apply[Key /* <: String */](key: Key | ResourceKeys, defaultMsg: String): String = js.native
  def apply[Key /* <: String */](key: Key | ResourceKeys, defaultMsg: String, options: TranslateOptions[Locales]): String = js.native
  /**
    * Locale message translation for list interpolations
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](composition#key-key-resourcekeys-number-string) details.
    *
    * In this overloaded `t`, the locale messages should contain a `{0}`, `{1}`, … for each placeholder in the list.
    *
    * You can also suppress the warning, when the translation missing according to the options.
    *
    * About details of options, see the {@link TranslateOptions}.
    *
    * @param key - A target locale message key
    * @param list - A values of list interpolation
    * @param options - Additional {@link TranslateOptions | options} for translation
    *
    * @returns Translated message
    *
    * @VueI18nSee [List interpolation](../guide/essentials/syntax#list-interpolation)
    */
  def apply[Key /* <: String */](key: Key | ResourceKeys, list: js.Array[Any]): String = js.native
  /**
    * Locale message translation for list interpolations and missing default message
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](composition#key-key-resourcekeys-number-string) details.
    *
    * In this overloaded `t`, the locale messages should contain a `{0}`, `{1}`, … for each placeholder in the list, and if no translation was found, return a default message.
    *
    * @param key - A target locale message key
    * @param list - A values of list interpolation
    * @param defaultMsg - A default message to return if no translation was found
    *
    * @returns Translated message
    *
    * @VueI18nSee [List interpolation](../guide/essentials/syntax#list-interpolation)
    */
  def apply[Key /* <: String */](key: Key | ResourceKeys, list: js.Array[Any], defaultMsg: String): String = js.native
  def apply[Key /* <: String */](key: Key | ResourceKeys, list: js.Array[Any], options: TranslateOptions[Locales]): String = js.native
  /**
    * Locale message translation for list interpolations and plurals
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](composition#key-key-resourcekeys-number-string) details.
    *
    * In this overloaded `t`, the locale messages should contain a `{0}`, `{1}`, … for each placeholder in the list, and return a pluralized translation message.
    *
    * @param key - A target locale message key
    * @param list - A values of list interpolation
    * @param plural - Which plural string to get. 1 returns the first one.
    *
    * @returns Translated message
    *
    * @VueI18nSee [Pluralization](../guide/essentials/pluralization)
    * @VueI18nSee [List interpolation](../guide/essentials/syntax#list-interpolation)
    */
  def apply[Key /* <: String */](key: Key | ResourceKeys, list: js.Array[Any], plural: Double): String = js.native
  /**
    * Locale message translation for named interpolations
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](composition#key-key-resourcekeys-number-string) details.
    *
    * In this overloaded `t`, for each placeholder x, the locale messages should contain a `{x}` token.
    *
    * You can also suppress the warning, when the translation missing according to the options.
    *
    * About details of options, see the {@link TranslateOptions}.
    *
    * @param key - A target locale message key
    * @param named - A values of named interpolation
    * @param options - Additional {@link TranslateOptions | options} for translation
    *
    * @returns Translated message
    *
    * @VueI18nSee [Named interpolation](../guide/essentials/syntax#named-interpolation)
    */
  def apply[Key /* <: String */](key: Key | ResourceKeys, named: NamedValue[js.Object]): String = js.native
  /**
    * Locale message translation for named interpolations and plurals
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](composition#key-key-resourcekeys-number-string) details.
    *
    * In this overloaded `t`, for each placeholder x, the locale messages should contain a `{x}` token, and if no translation was found, return a default message.
    *
    * @param key - A target locale message key
    * @param named - A values of named interpolation
    * @param defaultMsg - A default message to return if no translation was found
    *
    * @returns Translated message
    *
    * @VueI18nSee [Named interpolation](../guide/essentials/syntax#named-interpolation)
    */
  def apply[Key /* <: String */](key: Key | ResourceKeys, named: NamedValue[js.Object], defaultMsg: String): String = js.native
  def apply[Key /* <: String */](key: Key | ResourceKeys, named: NamedValue[js.Object], options: TranslateOptions[Locales]): String = js.native
  /**
    * Locale message translation for named interpolations and plurals
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](composition#key-key-resourcekeys-number-string) details.
    *
    * In this overloaded `t`, for each placeholder x, the locale messages should contain a `{x}` token, and return a pluralized translation message.
    *
    * @param key - A target locale message key
    * @param named - A values of named interpolation
    * @param plural - Which plural string to get. 1 returns the first one.
    *
    * @returns Translated message
    *
    * @VueI18nSee [Pluralization](../guide/essentials/pluralization)
    * @VueI18nSee [Named interpolation](../guide/essentials/syntax#named-interpolation)
    */
  def apply[Key /* <: String */](key: Key | ResourceKeys, named: NamedValue[js.Object], plural: Double): String = js.native
  /**
    * Locale message translation for plurals
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](composition#key-key-resourcekeys-number-string) details.
    *
    * In this overloaded `t`, return a pluralized translation message.
    *
    * You can also suppress the warning, when the translation missing according to the options.
    *
    * About details of options, see the {@link TranslateOptions}.
    *
    * @param key - A target locale message key
    * @param plural - Which plural string to get. 1 returns the first one.
    * @param options - Additional {@link TranslateOptions | options} for translation
    *
    * @returns Translated message
    *
    * @VueI18nSee [Pluralization](../guide/essentials/pluralization)
    */
  def apply[Key /* <: String */](key: Key | ResourceKeys, plural: Double): String = js.native
  def apply[Key /* <: String */](key: Key | ResourceKeys, plural: Double, options: TranslateOptions[Locales]): String = js.native
  def apply[Key /* <: String */](key: Double): String = js.native
  def apply[Key /* <: String */](key: Double, defaultMsg: String): String = js.native
  def apply[Key /* <: String */](key: Double, defaultMsg: String, options: TranslateOptions[Locales]): String = js.native
  def apply[Key /* <: String */](key: Double, list: js.Array[Any]): String = js.native
  def apply[Key /* <: String */](key: Double, list: js.Array[Any], defaultMsg: String): String = js.native
  def apply[Key /* <: String */](key: Double, list: js.Array[Any], options: TranslateOptions[Locales]): String = js.native
  def apply[Key /* <: String */](key: Double, list: js.Array[Any], plural: Double): String = js.native
  def apply[Key /* <: String */](key: Double, named: NamedValue[js.Object]): String = js.native
  def apply[Key /* <: String */](key: Double, named: NamedValue[js.Object], defaultMsg: String): String = js.native
  def apply[Key /* <: String */](key: Double, named: NamedValue[js.Object], options: TranslateOptions[Locales]): String = js.native
  def apply[Key /* <: String */](key: Double, named: NamedValue[js.Object], plural: Double): String = js.native
  def apply[Key /* <: String */](key: Double, plural: Double): String = js.native
  def apply[Key /* <: String */](key: Double, plural: Double, options: TranslateOptions[Locales]): String = js.native
}
