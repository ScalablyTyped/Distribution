package typings.titanium.Titanium.Geolocation.Android

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Represents a source of location information, such as GPS.
			 */
trait LocationProvider extends Proxy {
  /**
  				 * Don't send a location update unless the location has changed at least `minUpdateDistance`
  				 * meters since the previous update.
  				 */
  var minUpdateDistance: Double
  /**
  				 * Limits the frequency of location updates to no more than one per `minUpdateTime` seconds.
  				 */
  var minUpdateTime: Double
  /**
  				 * Type of location provider: [PROVIDER_GPS](Titanium.Geolocation.Android.PROVIDER_GPS),
  				 * [PROVIDER_NETWORK](Titanium.Geolocation.Android.PROVIDER_NETWORK), or
  				 * [PROVIDER_PASSIVE](Titanium.Geolocation.Android.PROVIDER_PASSIVE).
  				 */
  var name: String
  /**
  				 * Gets the value of the <Titanium.Geolocation.Android.LocationProvider.minUpdateDistance> property.
  				 */
  def getMinUpdateDistance(): Double
  /**
  				 * Gets the value of the <Titanium.Geolocation.Android.LocationProvider.minUpdateTime> property.
  				 */
  def getMinUpdateTime(): Double
  /**
  				 * Gets the value of the <Titanium.Geolocation.Android.LocationProvider.name> property.
  				 */
  def getName(): String
  /**
  				 * Sets the value of the <Titanium.Geolocation.Android.LocationProvider.minUpdateDistance> property.
  				 */
  def setMinUpdateDistance(minUpdateDistance: Double): Unit
  /**
  				 * Sets the value of the <Titanium.Geolocation.Android.LocationProvider.minUpdateTime> property.
  				 */
  def setMinUpdateTime(minUpdateTime: Double): Unit
  /**
  				 * Sets the value of the <Titanium.Geolocation.Android.LocationProvider.name> property.
  				 */
  def setName(name: String): Unit
}

object LocationProvider {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getMinUpdateDistance: () => Double,
    getMinUpdateTime: () => Double,
    getName: () => String,
    minUpdateDistance: Double,
    minUpdateTime: Double,
    name: String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit,
    setMinUpdateDistance: Double => Unit,
    setMinUpdateTime: Double => Unit,
    setName: String => Unit,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): LocationProvider = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName.asInstanceOf[js.Any], applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent.asInstanceOf[js.Any], fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getMinUpdateDistance = js.Any.fromFunction0(getMinUpdateDistance), getMinUpdateTime = js.Any.fromFunction0(getMinUpdateTime), getName = js.Any.fromFunction0(getName), minUpdateDistance = minUpdateDistance.asInstanceOf[js.Any], minUpdateTime = minUpdateTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setMinUpdateDistance = js.Any.fromFunction1(setMinUpdateDistance), setMinUpdateTime = js.Any.fromFunction1(setMinUpdateTime), setName = js.Any.fromFunction1(setName))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationProvider]
  }
}

