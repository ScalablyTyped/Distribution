package typings.titanium

import typings.titanium.TitaniumNs.GeolocationNs.AndroidNs.LocationProvider
import typings.titanium.TitaniumNs.GeolocationNs.AndroidNs.LocationRule
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofAndroidAddEventListenerAddLocationProvider extends js.Object {
  /**
  			 * Specifies the GPS location provider.
  			 */
  val PROVIDER_GPS: String = js.native
  /**
  			 * Specifies the network location provider.
  			 */
  val PROVIDER_NETWORK: String = js.native
  /**
  			 * Specifies the passive location provider.
  			 */
  val PROVIDER_PASSIVE: String = js.native
  /**
  			 * The name of the API that this proxy corresponds to.
  			 */
  val apiName: String = js.native
  /**
  			 * Indicates if the proxy will bubble an event to its parent.
  			 */
  var bubbleParent: Boolean = js.native
  /**
  			 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  			 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  			 * Set to `true` to enable manual configuration of location updates through this module.
  			 */
  var manualMode: Boolean = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Adds and enables the specified location provider, possibly replacing an existing one.
  			 */
  def addLocationProvider(provider: LocationProvider): Unit = js.native
  /**
  			 * Adds and enables the specified location rule.
  			 */
  def addLocationRule(rule: LocationRule): Unit = js.native
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  			 * Creates and returns an instance of <Titanium.Geolocation.Android.LocationProvider>.
  			 */
  def createLocationProvider(): LocationProvider = js.native
  def createLocationProvider(parameters: js.Any): LocationProvider = js.native
  /**
  			 * Creates and returns an instance of <Titanium.Geolocation.Android.LocationRule>.
  			 */
  def createLocationRule(): LocationRule = js.native
  def createLocationRule(parameters: js.Any): LocationRule = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Geolocation.Android.apiName> property.
  			 */
  def getApiName(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Geolocation.Android.bubbleParent> property.
  			 */
  def getBubbleParent(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Geolocation.Android.lifecycleContainer> property.
  			 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  			 * Gets the value of the <Titanium.Geolocation.Android.manualMode> property.
  			 */
  def getManualMode(): Boolean = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Disables and removes the specified location provider.
  			 */
  def removeLocationProvider(provider: LocationProvider): Unit = js.native
  /**
  			 * Disables and removes the specified location rule.
  			 */
  def removeLocationRule(rule: LocationRule): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Geolocation.Android.bubbleParent> property.
  			 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Geolocation.Android.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Geolocation.Android.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Geolocation.Android.manualMode> property.
  			 */
  def setManualMode(manualMode: Boolean): Unit = js.native
}

