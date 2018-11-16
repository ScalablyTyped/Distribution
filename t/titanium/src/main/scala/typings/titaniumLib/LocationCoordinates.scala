package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Simple object holding the data for a location update.
 */

trait LocationCoordinates extends js.Object {
  /**
  	 * Accuracy of the location update, in meters.
  	 */
  var accuracy: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Altitude of the location update, in meters.
  	 */
  var altitude: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Vertical accuracy of the location update, in meters.
  	 */
  var altitudeAccuracy: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The floor of the building on which the user is located.
  	 */
  var floor: js.UndefOr[LocationCoordinatesFloor] = js.undefined
  /**
  	 * Compass heading, in degrees. May be unknown if device is not moving. On
  	 * iOS, a negative value indicates that the heading data is not valid.
  	 */
  var heading: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Latitude of the location update, in decimal degrees.
  	 */
  var latitude: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Longitude of the location update, in decimal degrees.
  	 */
  var longitude: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Current speed in meters/second. On iOS, a negative value indicates that the
  	 * heading data is not valid or the accuracy is configured incorrectly.
  	 * Note: Due to the Apple Geolocation API, set the <Titanium.Geolocation.accuracy>
  	 * property to <Titanium.Geolocation.ACCURACY_BEST_FOR_NAVIGATION> in order to properly
  	 * measure speed changes and prevent the app from returning negative values.
  	 */
  var speed: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Timestamp for this location update, in milliseconds.
  	 */
  var timestamp: js.UndefOr[scala.Double] = js.undefined
}

