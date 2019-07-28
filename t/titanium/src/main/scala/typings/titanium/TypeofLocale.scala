package typings.titanium

import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofLocale extends js.Object {
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: Boolean = js.native
  /**
  		 * Country of the current system locale, as an ISO 2-letter code.
  		 */
  val currentCountry: String = js.native
  /**
  		 * Language of the current system locale, as an ISO 2-letter code.
  		 */
  val currentLanguage: String = js.native
  /**
  		 * Current system locale, as a combination of ISO 2-letter language and country codes.
  		 */
  val currentLocale: String = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  		 * Formats a telephone number according to the current system locale.
  		 */
  def formatTelephoneNumber(number: String): String = js.native
  /**
  		 * Gets the value of the <Titanium.Locale.apiName> property.
  		 */
  def getApiName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Locale.bubbleParent> property.
  		 */
  def getBubbleParent(): Boolean = js.native
  /**
  		 * Returns the ISO 3-letter currency code for the specified locale.
  		 */
  def getCurrencyCode(locale: String): String = js.native
  /**
  		 * Returns the currency symbol for the specified currency code.
  		 */
  def getCurrencySymbol(currencyCode: String): String = js.native
  /**
  		 * Gets the value of the <Titanium.Locale.currentCountry> property.
  		 */
  def getCurrentCountry(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Locale.currentLanguage> property.
  		 */
  def getCurrentLanguage(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Locale.currentLocale> property.
  		 */
  def getCurrentLocale(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Locale.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  		 * Returns the currency symbol for the specified locale.
  		 */
  def getLocaleCurrencySymbol(locale: String): String = js.native
  /**
  		 * Returns a string, localized according to the current system locale using the appropriate
  		 * `/i18n/LANG/strings.xml` localization file.
  		 */
  def getString(key: String): String = js.native
  def getString(key: String, hint: String): String = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Locale.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  		 * Sets the current language of the application.
  		 */
  def setLanguage(language: String): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Locale.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Locale.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}

