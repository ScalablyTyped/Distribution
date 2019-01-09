package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddEventListenerApiNameApplyPropertiesBubbleParentCallbackCurrencyCode extends js.Object {
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: java.lang.String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: scala.Boolean = js.native
  /**
  		 * Country of the current system locale, as an ISO 2-letter code.
  		 */
  val currentCountry: java.lang.String = js.native
  /**
  		 * Language of the current system locale, as an ISO 2-letter code.
  		 */
  val currentLanguage: java.lang.String = js.native
  /**
  		 * Current system locale, as a combination of ISO 2-letter language and country codes.
  		 */
  val currentLocale: java.lang.String = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  		 * Formats a telephone number according to the current system locale.
  		 */
  def formatTelephoneNumber(number: java.lang.String): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Locale.apiName> property.
  		 */
  def getApiName(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Locale.bubbleParent> property.
  		 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  		 * Returns the ISO 3-letter currency code for the specified locale.
  		 */
  def getCurrencyCode(locale: java.lang.String): java.lang.String = js.native
  /**
  		 * Returns the currency symbol for the specified currency code.
  		 */
  def getCurrencySymbol(currencyCode: java.lang.String): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Locale.currentCountry> property.
  		 */
  def getCurrentCountry(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Locale.currentLanguage> property.
  		 */
  def getCurrentLanguage(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Locale.currentLocale> property.
  		 */
  def getCurrentLocale(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Locale.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Returns the currency symbol for the specified locale.
  		 */
  def getLocaleCurrencySymbol(locale: java.lang.String): java.lang.String = js.native
  /**
  		 * Returns a string, localized according to the current system locale using the appropriate
  		 * `/i18n/LANG/strings.xml` localization file.
  		 */
  def getString(key: java.lang.String): java.lang.String = js.native
  def getString(key: java.lang.String, hint: java.lang.String): java.lang.String = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Locale.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the current language of the application.
  		 */
  def setLanguage(language: java.lang.String): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Locale.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Locale.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
}

