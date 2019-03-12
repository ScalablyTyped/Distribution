package typings
package titaniumLib.TitaniumNs.GeolocationNs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A location rule to filter the results returned by location providers.
			 */
trait LocationRule
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Minimum accuracy required for a location update.
  				 */
  var accuracy: scala.Double
  /**
  				 * Controls the freshness of location updates. Do not forward an update
  				 * unless it is newer than `maxAge` milliseconds.
  				 */
  var maxAge: scala.Double
  /**
  				 * Controls the frequency of location updates.
  				 */
  var minAge: scala.Double
  /**
  				 * If specified, this rule only applies to updates generated
  				 * by the specified provider. If `null`, this rule applies to all updates.
  				 */
  var name: java.lang.String
  /**
  				 * Gets the value of the <Titanium.Geolocation.Android.LocationRule.accuracy> property.
  				 */
  def getAccuracy(): scala.Double
  /**
  				 * Gets the value of the <Titanium.Geolocation.Android.LocationRule.maxAge> property.
  				 */
  def getMaxAge(): scala.Double
  /**
  				 * Gets the value of the <Titanium.Geolocation.Android.LocationRule.minAge> property.
  				 */
  def getMinAge(): scala.Double
  /**
  				 * Gets the value of the <Titanium.Geolocation.Android.LocationRule.name> property.
  				 */
  def getName(): java.lang.String
  /**
  				 * Sets the value of the <Titanium.Geolocation.Android.LocationRule.accuracy> property.
  				 */
  def setAccuracy(accuracy: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.Geolocation.Android.LocationRule.maxAge> property.
  				 */
  def setMaxAge(maxAge: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.Geolocation.Android.LocationRule.minAge> property.
  				 */
  def setMinAge(minAge: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.Geolocation.Android.LocationRule.name> property.
  				 */
  def setName(name: java.lang.String): scala.Unit
}

object LocationRule {
  @scala.inline
  def apply(
    accuracy: scala.Double,
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getAccuracy: () => scala.Double,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getMaxAge: () => scala.Double,
    getMinAge: () => scala.Double,
    getName: () => java.lang.String,
    maxAge: scala.Double,
    minAge: scala.Double,
    name: java.lang.String,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setAccuracy: scala.Double => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setMaxAge: scala.Double => scala.Unit,
    setMinAge: scala.Double => scala.Unit,
    setName: java.lang.String => scala.Unit,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): LocationRule = {
    val __obj = js.Dynamic.literal(accuracy = accuracy, addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getAccuracy = js.Any.fromFunction0(getAccuracy), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getMaxAge = js.Any.fromFunction0(getMaxAge), getMinAge = js.Any.fromFunction0(getMinAge), getName = js.Any.fromFunction0(getName), maxAge = maxAge, minAge = minAge, name = name, removeEventListener = js.Any.fromFunction2(removeEventListener), setAccuracy = js.Any.fromFunction1(setAccuracy), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setMaxAge = js.Any.fromFunction1(setMaxAge), setMinAge = js.Any.fromFunction1(setMinAge), setName = js.Any.fromFunction1(setName))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[LocationRule]
  }
}

