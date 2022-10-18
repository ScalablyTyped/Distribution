package typings.vueI18n.mod

import typings.intlifyCoreBase.mod.Locale
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueI18nTranslationChoice[Messages, Locales, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, C, M, ResourceKeys /* <: C | M */] extends StObject {
  
  /**
    * Locale message pluralization
    *
    * @remarks
    * If this is used in a reactive context, it will re-evaluate once the locale changes.
    *
    * If [i18n component options](injection#i18n) is specified, it’s pluraled in preferentially local scope locale messages than global scope locale messages.
    *
    * If [i18n component options](injection#i18n) isn't specified, it’s pluraled with global scope locale messages.
    *
    * The plural choice number is handled with default `1`.
    *
    * @param key - A target locale message key
    *
    * @returns Pluraled message
    *
    * @VueI18nSee [Pluralization](../guide/essentials/pluralization)
    */
  def apply[Key /* <: String */](key: Key | ResourceKeys): TranslateResult = js.native
  /**
    * Locale message pluralization
    *
    * @remarks
    * Overloaded `tc`. About details, see the [call signature](legacy#key-key-resourcekeys-translateresult-2) details.
    *
    * @param key - A target locale message key
    * @param choice - Which plural string to get. 1 returns the first one.
    *
    * @returns Pluraled message
    */
  def apply[Key /* <: String */](key: Key | ResourceKeys, choice: Double): TranslateResult = js.native
  /**
    * Locale message pluralization
    *
    * @remarks
    * Overloaded `tc`. About details, see the [call signature](legacy#key-key-resourcekeys-translateresult-2) details.
    *
    * @param key - A target locale message key
    * @param choice - Which plural string to get. 1 returns the first one.
    * @param list - A values of list interpolation
    *
    * @returns Pluraled message
    */
  def apply[Key /* <: String */](key: Key | ResourceKeys, choice: Double, list: js.Array[Any]): TranslateResult = js.native
  /**
    * Locale message pluralization
    *
    * @remarks
    * Overloaded `tc`. About details, see the [call signature](legacy#key-key-resourcekeys-translateresult-2) details.
    *
    * @param key - A target locale message key
    * @param choice - Which plural string to get. 1 returns the first one.
    * @param locale - A locale, it will be used over than global scope or local scope.
    *
    * @returns Pluraled message
    */
  def apply[Key /* <: String */](key: Key | ResourceKeys, choice: Double, locale: Locales): TranslateResult = js.native
  def apply[Key /* <: String */](key: Key | ResourceKeys, choice: Double, locale: Locale): TranslateResult = js.native
  /**
    * Locale message pluralization
    *
    * @remarks
    * Overloaded `tc`. About details, see the [call signature](legacy#key-key-resourcekeys-translateresult-2) details.
    *
    * @param key - A target locale message key
    * @param choice - Which plural string to get. 1 returns the first one.
    * @param named - A values of named interpolation
    *
    * @returns Pluraled message
    */
  def apply[Key /* <: String */](key: Key | ResourceKeys, choice: Double, named: Record[String, Any]): TranslateResult = js.native
  /**
    * Locale message pluralization
    *
    * @remarks
    * Overloaded `tc`. About details, see the [call signature](legacy#key-key-resourcekeys-translateresult-2) details.
    *
    * @param key - A target locale message key
    * @param list - A values of list interpolation
    *
    * @returns Pluraled message
    */
  def apply[Key /* <: String */](key: Key | ResourceKeys, list: js.Array[Any]): TranslateResult = js.native
  /**
    * Locale message pluralization
    *
    * @remarks
    * Overloaded `tc`. About details, see the [call signature](legacy#key-key-resourcekeys-translateresult-2) details.
    *
    * @param key - A target locale message key
    * @param locale - A locale, it will be used over than global scope or local scope.
    *
    * @returns Pluraled message
    */
  def apply[Key /* <: String */](key: Key | ResourceKeys, locale: Locales): TranslateResult = js.native
  def apply[Key /* <: String */](key: Key | ResourceKeys, locale: Locale): TranslateResult = js.native
  /**
    * Locale message pluralization
    *
    * @remarks
    * Overloaded `tc`. About details, see the [call signature](legacy#key-key-resourcekeys-translateresult-2) details.
    *
    * @param key - A target locale message key
    * @param named - A values of named interpolation
    *
    * @returns Pluraled message
    */
  def apply[Key /* <: String */](key: Key | ResourceKeys, named: Record[String, Any]): TranslateResult = js.native
}
