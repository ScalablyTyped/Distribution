package typings.titanium.global.Titanium

import typings.titanium.Titanium.Event
import typings.titanium.Titanium.LocaleChangeEvent
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.titaniumStrings.change
import org.scalablytyped.runtime.StObject
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
object Locale {
  
  @JSGlobal("Titanium.Locale")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.addEventListener")
  @js.native
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.addEventListener")
  @js.native
  def addEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.Locale, /* event */ LocaleChangeEvent, Unit]
  ): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.apiName")
  @js.native
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.applyProperties")
  @js.native
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.bubbleParent")
  @js.native
  def bubbleParent: Boolean = js.native
  @scala.inline
  def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
  
  /**
    * Country of the current system locale, as an ISO 2-letter code.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.currentCountry")
  @js.native
  val currentCountry: String = js.native
  
  /**
    * Language of the current system locale, as an ISO 2-letter code.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.currentLanguage")
  @js.native
  val currentLanguage: String = js.native
  
  /**
    * Current system locale, as a combination of ISO 2-letter language and country codes.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.currentLocale")
  @js.native
  val currentLocale: String = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.fireEvent")
  @js.native
  def fireEvent(name: String): Unit = js.native
  @JSGlobal("Titanium.Locale.fireEvent")
  @js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.fireEvent")
  @js.native
  def fireEvent_change(name: change): Unit = js.native
  @JSGlobal("Titanium.Locale.fireEvent")
  @js.native
  def fireEvent_change(name: change, event: LocaleChangeEvent): Unit = js.native
  
  /**
    * Formats a telephone number according to the current system locale.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.formatTelephoneNumber")
  @js.native
  def formatTelephoneNumber(number: String): String = js.native
  
  /**
    * Gets the value of the <Titanium.Locale.apiName> property.
    * @deprecated Access <Titanium.Locale.apiName> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.getApiName")
  @js.native
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Locale.bubbleParent> property.
    * @deprecated Access <Titanium.Locale.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.getBubbleParent")
  @js.native
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Returns the ISO 3-letter currency code for the specified locale.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.getCurrencyCode")
  @js.native
  def getCurrencyCode(locale: String): String = js.native
  
  /**
    * Returns the currency symbol for the specified currency code.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.getCurrencySymbol")
  @js.native
  def getCurrencySymbol(currencyCode: String): String = js.native
  
  /**
    * Gets the value of the <Titanium.Locale.currentCountry> property.
    * @deprecated Access <Titanium.Locale.currentCountry> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.getCurrentCountry")
  @js.native
  def getCurrentCountry(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Locale.currentLanguage> property.
    * @deprecated Access <Titanium.Locale.currentLanguage> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.getCurrentLanguage")
  @js.native
  def getCurrentLanguage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Locale.currentLocale> property.
    * @deprecated Access <Titanium.Locale.currentLocale> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.getCurrentLocale")
  @js.native
  def getCurrentLocale(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Locale.lifecycleContainer> property.
    * @deprecated Access <Titanium.Locale.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.getLifecycleContainer")
  @js.native
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * Returns the currency symbol for the specified locale.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.getLocaleCurrencySymbol")
  @js.native
  def getLocaleCurrencySymbol(locale: String): String = js.native
  
  /**
    * Returns a string, localized according to the current system locale using the appropriate
    * `/i18n/LANG/strings.xml` localization file.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.getString")
  @js.native
  def getString(key: String): String = js.native
  @JSGlobal("Titanium.Locale.getString")
  @js.native
  def getString(key: String, hint: String): String = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.lifecycleContainer")
  @js.native
  def lifecycleContainer: Window | TabGroup = js.native
  @scala.inline
  def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
  
  /**
    * Parses a number from the given string using the current or given locale.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.parseDecimal")
  @js.native
  def parseDecimal(text: String): Double = js.native
  @JSGlobal("Titanium.Locale.parseDecimal")
  @js.native
  def parseDecimal(text: String, locale: String): Double = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.removeEventListener")
  @js.native
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.removeEventListener")
  @js.native
  def removeEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.Locale, /* event */ LocaleChangeEvent, Unit]
  ): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Locale.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Locale.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.setBubbleParent")
  @js.native
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  /**
    * Sets the current language of the application.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.setLanguage")
  @js.native
  def setLanguage(language: String): Unit = js.native
  
  @JSGlobal("Titanium.Locale.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Locale.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Locale.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Locale.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}
