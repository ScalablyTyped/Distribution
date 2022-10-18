package typings.vueI18n.mod

import typings.intlifyCoreBase.mod.Locale
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueI18nTranslation[Messages, Locales, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, C, M, ResourceKeys /* <: C | M */] extends StObject {
  
  /**
    * Locale message translation.
    *
    * @remarks
    * If this is used in a reactive context, it will re-evaluate once the locale changes.
    *
    * If [i18n component options](injection#i18n) is specified, it’s translated in preferentially local scope locale messages than global scope locale messages.
    *
    * If [i18n component options](injection#i18n) isn't specified, it’s translated with global scope locale messages.
    *
    * @param key - A target locale message key
    *
    * @returns Translated message
    *
    * @VueI18nSee [Scope and Locale Changing](../guide/essentials/scope)
    */
  def apply[Key /* <: String */](key: Key | ResourceKeys): TranslateResult = js.native
  /**
    * Locale message translation.
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](legacy#key-key-resourcekeys-translateresult) details.
    *
    * @param key - A target locale message key
    * @param list - A values of list interpolation
    *
    * @returns Translated message
    *
    * @VueI18nSee [List interpolation](../guide/essentials/syntax#list-interpolation)
    */
  def apply[Key /* <: String */](key: Key | ResourceKeys, list: js.Array[Any]): TranslateResult = js.native
  /**
    * Locale message translation.
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](legacy#key-key-resourcekeys-translateresult) details.
    *
    * @param key - A target locale message key
    * @param locale - A locale, it will be used over than global scope or local scope.
    *
    * @returns Translated message
    */
  def apply[Key /* <: String */](key: Key | ResourceKeys, locale: Locales): TranslateResult = js.native
  /**
    * Locale message translation.
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](legacy#key-key-resourcekeys-translateresult) details.
    *
    * @param key - A target locale message key
    * @param locale - A locale, it will be used over than global scope or local scope.
    * @param list - A values of list interpolation
    *
    * @returns Translated message
    *
    * @VueI18nSee [List interpolation](../guide/essentials/syntax#list-interpolation)
    */
  def apply[Key /* <: String */](key: Key | ResourceKeys, locale: Locales, list: js.Array[Any]): TranslateResult = js.native
  /**
    * Locale message translation.
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](legacy#key-key-resourcekeys-translateresult) details.
    *
    * @param key - A target locale message key
    * @param locale - A locale, it will be used over than global scope or local scope.
    * @param named - A values of named interpolation
    *
    * @returns Translated message
    *
    * @VueI18nSee [Named interpolation](../guide/essentials/syntax#named-interpolation)
    */
  def apply[Key /* <: String */](key: Key | ResourceKeys, locale: Locales, named: Record[String, Any]): TranslateResult = js.native
  def apply[Key /* <: String */](key: Key | ResourceKeys, locale: Locale): TranslateResult = js.native
  def apply[Key /* <: String */](key: Key | ResourceKeys, locale: Locale, list: js.Array[Any]): TranslateResult = js.native
  def apply[Key /* <: String */](key: Key | ResourceKeys, locale: Locale, named: Record[String, Any]): TranslateResult = js.native
  /**
    * Locale message translation.
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](legacy#key-key-resourcekeys-translateresult) details.
    *
    * @param key - A target locale message key
    * @param named - A values of named interpolation
    *
    * @returns Translated message
    *
    * @VueI18nSee [Named interpolation](../guide/essentials/syntax#named-interpolation)
    */
  def apply[Key /* <: String */](key: Key | ResourceKeys, named: Record[String, Any]): TranslateResult = js.native
}
