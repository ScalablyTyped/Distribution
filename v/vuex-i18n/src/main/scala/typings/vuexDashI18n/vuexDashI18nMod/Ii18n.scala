package typings.vuexDashI18n.vuexDashI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ii18n extends js.Object {
  /**
    * add locale translation to the storage. this will extend existing information
    * (i.e. 'de', {'message': 'Eine Nachricht'})
    */
  def add(locale: String, translations: Translations): Unit = js.native
  /**
    * set a fallback locale if translation for current locale does not exist
    */
  def fallback(locale: String): Unit = js.native
  /**
    * check if the given key is available
    * optional with a second parameter to limit the scope
    * strict: only current locale (exact match)
    * locale: current locale and parent language locale (i.e. en-us & en)
    * fallback: current locale, parent language locale and fallback locale
    * the default is fallback
    */
  def keyExists(key: String): Boolean = js.native
  def keyExists(key: String, scope: String): Boolean = js.native
  /** get the current locale */
  def locale(): String | Null = js.native
  /**
    * check if the given locale translations are present in the store
    */
  def localeExists(locale: String): Boolean = js.native
  /** get all the registered locales */
  def locales(): js.Array[String] = js.native
  /**
    * remove the given locale from the store
    */
  def remove(locale: String): Unit = js.native
  /**
    * replace locale translations in the storage. this will remove all previous
    * locale information for the specified locale
    */
  def replace(locale: String, translations: Translations): Unit = js.native
  /** set the current locale (i.e. 'de', 'en') */
  def set(locale: String): Unit = js.native
  /**
    * get localized string from store. note that we pass the arguments passed
    * to the function directly to the translateInLanguage function
    */
  def translate(key: String): js.UndefOr[String] = js.native
  /**
    * get localized string from store. note that we pass the arguments passed
    * to the function directly to the translateInLanguage function
    */
  def translate(key: String, defaultValue: String): js.UndefOr[String] = js.native
  def translate(key: String, defaultValue: String, options: js.Any): js.UndefOr[String] = js.native
  def translate(key: String, defaultValue: String, options: js.Any, pluralization: Double): js.UndefOr[String] = js.native
  def translate(key: String, options: js.Any): js.UndefOr[String] = js.native
  def translate(key: String, options: js.Any, pluralization: Double): js.UndefOr[String] = js.native
  /**
    * get localized string from store in a given language if available.
    */
  def translateIn(locale: String, key: String): js.UndefOr[String] = js.native
  /**
    * get localized string from store in a given language if available.
    */
  def translateIn(locale: String, key: String, defaultValue: String): js.UndefOr[String] = js.native
  def translateIn(locale: String, key: String, defaultValue: String, options: js.Any): js.UndefOr[String] = js.native
  def translateIn(locale: String, key: String, defaultValue: String, options: js.Any, pluralization: Double): js.UndefOr[String] = js.native
  def translateIn(locale: String, key: String, options: js.Any): js.UndefOr[String] = js.native
  def translateIn(locale: String, key: String, options: js.Any, pluralization: Double): js.UndefOr[String] = js.native
}

