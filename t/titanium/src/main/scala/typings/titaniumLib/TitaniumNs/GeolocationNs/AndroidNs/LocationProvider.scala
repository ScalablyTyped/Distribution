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
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getMinUpdateDistance: js.Function0[scala.Double],
    getMinUpdateTime: js.Function0[scala.Double],
    getName: js.Function0[java.lang.String],
    minUpdateDistance: scala.Double,
    minUpdateTime: scala.Double,
    name: java.lang.String,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setMinUpdateDistance: js.Function1[scala.Double, scala.Unit],
    setMinUpdateTime: js.Function1[scala.Double, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): LocationProvider = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, getMinUpdateDistance = getMinUpdateDistance, getMinUpdateTime = getMinUpdateTime, getName = getName, minUpdateDistance = minUpdateDistance, minUpdateTime = minUpdateTime, name = name, removeEventListener = removeEventListener, setBubbleParent = setBubbleParent, setMinUpdateDistance = setMinUpdateDistance, setMinUpdateTime = setMinUpdateTime, setName = setName)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[LocationProvider]
  }
}

