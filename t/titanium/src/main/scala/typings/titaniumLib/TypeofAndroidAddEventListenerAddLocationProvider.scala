package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofAndroidAddEventListenerAddLocationProvider extends js.Object {
  /**
  			 * Specifies the GPS location provider.
  			 */
  val PROVIDER_GPS: java.lang.String = js.native
  /**
  			 * Specifies the network location provider.
  			 */
  val PROVIDER_NETWORK: java.lang.String = js.native
  /**
  			 * Specifies the passive location provider.
  			 */
  val PROVIDER_PASSIVE: java.lang.String = js.native
  /**
  			 * The name of the API that this proxy corresponds to.
  			 */
  val apiName: java.lang.String = js.native
  /**
  			 * Indicates if the proxy will bubble an event to its parent.
  			 */
  var bubbleParent: scala.Boolean = js.native
  /**
  			 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  			 */
  var lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  			 * Set to `true` to enable manual configuration of location updates through this module.
  			 */
  var manualMode: scala.Boolean = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Adds and enables the specified location provider, possibly replacing an existing one.
  			 */
  def addLocationProvider(provider: titaniumLib.TitaniumNs.GeolocationNs.AndroidNs.LocationProvider): scala.Unit = js.native
  /**
  			 * Adds and enables the specified location rule.
  			 */
  def addLocationRule(rule: titaniumLib.TitaniumNs.GeolocationNs.AndroidNs.LocationRule): scala.Unit = js.native
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  			 * Creates and returns an instance of <Titanium.Geolocation.Android.LocationProvider>.
  			 */
  def createLocationProvider(): titaniumLib.TitaniumNs.GeolocationNs.AndroidNs.LocationProvider = js.native
  def createLocationProvider(parameters: js.Any): titaniumLib.TitaniumNs.GeolocationNs.AndroidNs.LocationProvider = js.native
  /**
  			 * Creates and returns an instance of <Titanium.Geolocation.Android.LocationRule>.
  			 */
  def createLocationRule(): titaniumLib.TitaniumNs.GeolocationNs.AndroidNs.LocationRule = js.native
  def createLocationRule(parameters: js.Any): titaniumLib.TitaniumNs.GeolocationNs.AndroidNs.LocationRule = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Geolocation.Android.apiName> property.
  			 */
  def getApiName(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Geolocation.Android.bubbleParent> property.
  			 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Geolocation.Android.lifecycleContainer> property.
  			 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  			 * Gets the value of the <Titanium.Geolocation.Android.manualMode> property.
  			 */
  def getManualMode(): scala.Boolean = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Disables and removes the specified location provider.
  			 */
  def removeLocationProvider(provider: titaniumLib.TitaniumNs.GeolocationNs.AndroidNs.LocationProvider): scala.Unit = js.native
  /**
  			 * Disables and removes the specified location rule.
  			 */
  def removeLocationRule(rule: titaniumLib.TitaniumNs.GeolocationNs.AndroidNs.LocationRule): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Geolocation.Android.bubbleParent> property.
  			 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Geolocation.Android.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Geolocation.Android.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Geolocation.Android.manualMode> property.
  			 */
  def setManualMode(manualMode: scala.Boolean): scala.Unit = js.native
}

