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

