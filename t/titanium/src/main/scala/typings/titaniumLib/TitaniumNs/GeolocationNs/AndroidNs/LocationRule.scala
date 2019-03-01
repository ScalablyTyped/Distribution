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
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getAccuracy: js.Function0[scala.Double],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getMaxAge: js.Function0[scala.Double],
    getMinAge: js.Function0[scala.Double],
    getName: js.Function0[java.lang.String],
    maxAge: scala.Double,
    minAge: scala.Double,
    name: java.lang.String,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setAccuracy: js.Function1[scala.Double, scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setMaxAge: js.Function1[scala.Double, scala.Unit],
    setMinAge: js.Function1[scala.Double, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): LocationRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accuracy")(accuracy)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("getAccuracy")(getAccuracy)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("getMaxAge")(getMaxAge)
    __obj.updateDynamic("getMinAge")(getMinAge)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("maxAge")(maxAge)
    __obj.updateDynamic("minAge")(minAge)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setAccuracy")(setAccuracy)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.updateDynamic("setMaxAge")(setMaxAge)
    __obj.updateDynamic("setMinAge")(setMinAge)
    __obj.updateDynamic("setName")(setName)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[LocationRule]
  }
}

