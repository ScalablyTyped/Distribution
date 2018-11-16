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

