package typings.titanium.Titanium.Geolocation.Android

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A location rule to filter the results returned by location providers.
			 */
trait LocationRule extends Proxy {
  /**
  				 * Minimum accuracy required for a location update.
  				 */
  var accuracy: Double
  /**
  				 * Controls the freshness of location updates. Do not forward an update
  				 * unless it is newer than `maxAge` milliseconds.
  				 */
  var maxAge: Double
  /**
  				 * Controls the frequency of location updates.
  				 */
  var minAge: Double
  /**
  				 * If specified, this rule only applies to updates generated
  				 * by the specified provider. If `null`, this rule applies to all updates.
  				 */
  var name: String
  /**
  				 * Gets the value of the <Titanium.Geolocation.Android.LocationRule.accuracy> property.
  				 */
  def getAccuracy(): Double
  /**
  				 * Gets the value of the <Titanium.Geolocation.Android.LocationRule.maxAge> property.
  				 */
  def getMaxAge(): Double
  /**
  				 * Gets the value of the <Titanium.Geolocation.Android.LocationRule.minAge> property.
  				 */
  def getMinAge(): Double
  /**
  				 * Gets the value of the <Titanium.Geolocation.Android.LocationRule.name> property.
  				 */
  def getName(): String
  /**
  				 * Sets the value of the <Titanium.Geolocation.Android.LocationRule.accuracy> property.
  				 */
  def setAccuracy(accuracy: Double): Unit
  /**
  				 * Sets the value of the <Titanium.Geolocation.Android.LocationRule.maxAge> property.
  				 */
  def setMaxAge(maxAge: Double): Unit
  /**
  				 * Sets the value of the <Titanium.Geolocation.Android.LocationRule.minAge> property.
  				 */
  def setMinAge(minAge: Double): Unit
  /**
  				 * Sets the value of the <Titanium.Geolocation.Android.LocationRule.name> property.
  				 */
  def setName(name: String): Unit
}

object LocationRule {
  @scala.inline
  def apply(
    accuracy: Double,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getAccuracy: () => Double,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getMaxAge: () => Double,
    getMinAge: () => Double,
    getName: () => String,
    maxAge: Double,
    minAge: Double,
    name: String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setAccuracy: Double => Unit,
    setBubbleParent: Boolean => Unit,
    setMaxAge: Double => Unit,
    setMinAge: Double => Unit,
    setName: String => Unit,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): LocationRule = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName.asInstanceOf[js.Any], applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent.asInstanceOf[js.Any], fireEvent = js.Any.fromFunction2(fireEvent), getAccuracy = js.Any.fromFunction0(getAccuracy), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getMaxAge = js.Any.fromFunction0(getMaxAge), getMinAge = js.Any.fromFunction0(getMinAge), getName = js.Any.fromFunction0(getName), maxAge = maxAge.asInstanceOf[js.Any], minAge = minAge.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener), setAccuracy = js.Any.fromFunction1(setAccuracy), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setMaxAge = js.Any.fromFunction1(setMaxAge), setMinAge = js.Any.fromFunction1(setMinAge), setName = js.Any.fromFunction1(setName))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRule]
  }
}

