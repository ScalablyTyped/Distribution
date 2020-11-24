package typings.titanium.global.Titanium

import typings.titanium.Titanium.Event
import typings.titanium.Titanium.LocaleChangeEvent
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.titaniumStrings.change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top level Locale module.
  */
@JSGlobal("Titanium.Locale")
@js.native
class Locale ()
  extends typings.titanium.Titanium.Proxy
/* static members */
@JSGlobal("Titanium.Locale")
@js.native
object Locale extends js.Object {
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ LocaleChangeEvent, Unit]
  ): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  def applyProperties(props: js.Any): Unit = js.native
  
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
    * Fires a synthesized event to any registered listeners.
    */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_change(name: change): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_change(name: change, event: LocaleChangeEvent): Unit = js.native
  
  /**
    * Formats a telephone number according to the current system locale.
    */
  def formatTelephoneNumber(number: String): String = js.native
  
  /**
    * Gets the value of the <Titanium.Locale.apiName> property.
    * @deprecated Access <Titanium.Locale.apiName> instead.
    */
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Locale.bubbleParent> property.
    * @deprecated Access <Titanium.Locale.bubbleParent> instead.
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
    * @deprecated Access <Titanium.Locale.currentCountry> instead.
    */
  def getCurrentCountry(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Locale.currentLanguage> property.
    * @deprecated Access <Titanium.Locale.currentLanguage> instead.
    */
  def getCurrentLanguage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Locale.currentLocale> property.
    * @deprecated Access <Titanium.Locale.currentLocale> instead.
    */
  def getCurrentLocale(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Locale.lifecycleContainer> property.
    * @deprecated Access <Titanium.Locale.lifecycleContainer> instead.
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
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  var lifecycleContainer: Window | TabGroup = js.native
  
  /**
    * Parses a number from the given string using the current or given locale.
    */
  def parseDecimal(text: String): Double = js.native
  def parseDecimal(text: String, locale: String): Double = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ LocaleChangeEvent, Unit]
  ): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Locale.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Locale.bubbleParent> instead.
    */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  /**
    * Sets the current language of the application.
    */
  def setLanguage(language: String): Unit = js.native
  
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Locale.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Locale.lifecycleContainer> instead.
    */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}
