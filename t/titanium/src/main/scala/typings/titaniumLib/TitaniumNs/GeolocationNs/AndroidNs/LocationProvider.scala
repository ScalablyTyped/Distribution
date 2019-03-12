package typings
package titaniumLib.TitaniumNs.GeolocationNs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Represents a source of location information, such as GPS.
			 */
trait LocationProvider
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Don't send a location update unless the location has changed at least `minUpdateDistance`
  				 * meters since the previous update.
  				 */
  var minUpdateDistance: scala.Double
  /**
  				 * Limits the frequency of location updates to no more than one per `minUpdateTime` seconds.
  				 */
  var minUpdateTime: scala.Double
  /**
  				 * Type of location provider: [PROVIDER_GPS](Titanium.Geolocation.PROVIDER_GPS),
  				 * [PROVIDER_NETWORK](Titanium.Geolocation.PROVIDER_NETWORK), or
  				 * [PROVIDER_PASSIVE](Titanium.Geolocation.PROVIDER_PASSIVE).
  				 */
  var name: java.lang.String
  /**
  				 * Gets the value of the <Titanium.Geolocation.Android.LocationProvider.minUpdateDistance> property.
  				 */
  def getMinUpdateDistance(): scala.Double
  /**
  				 * Gets the value of the <Titanium.Geolocation.Android.LocationProvider.minUpdateTime> property.
  				 */
  def getMinUpdateTime(): scala.Double
  /**
  				 * Gets the value of the <Titanium.Geolocation.Android.LocationProvider.name> property.
  				 */
  def getName(): java.lang.String
  /**
  				 * Sets the value of the <Titanium.Geolocation.Android.LocationProvider.minUpdateDistance> property.
  				 */
  def setMinUpdateDistance(minUpdateDistance: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.Geolocation.Android.LocationProvider.minUpdateTime> property.
  				 */
  def setMinUpdateTime(minUpdateTime: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.Geolocation.Android.LocationProvider.name> property.
  				 */
  def setName(name: java.lang.String): scala.Unit
}

object LocationProvider {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getMinUpdateDistance: () => scala.Double,
    getMinUpdateTime: () => scala.Double,
    getName: () => java.lang.String,
    minUpdateDistance: scala.Double,
    minUpdateTime: scala.Double,
    name: java.lang.String,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setMinUpdateDistance: scala.Double => scala.Unit,
    setMinUpdateTime: scala.Double => scala.Unit,
    setName: java.lang.String => scala.Unit,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): LocationProvider = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getMinUpdateDistance = js.Any.fromFunction0(getMinUpdateDistance), getMinUpdateTime = js.Any.fromFunction0(getMinUpdateTime), getName = js.Any.fromFunction0(getName), minUpdateDistance = minUpdateDistance, minUpdateTime = minUpdateTime, name = name, removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setMinUpdateDistance = js.Any.fromFunction1(setMinUpdateDistance), setMinUpdateTime = js.Any.fromFunction1(setMinUpdateTime), setName = js.Any.fromFunction1(setName))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[LocationProvider]
  }
}

