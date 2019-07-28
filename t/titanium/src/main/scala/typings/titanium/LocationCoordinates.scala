package typings.titanium

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
  var accuracy: js.UndefOr[Double] = js.undefined
  /**
  	 * Altitude of the location update, in meters.
  	 */
  var altitude: js.UndefOr[Double] = js.undefined
  /**
  	 * Vertical accuracy of the location update, in meters.
  	 */
  var altitudeAccuracy: js.UndefOr[Double] = js.undefined
  /**
  	 * The floor of the building on which the user is located.
  	 */
  var floor: js.UndefOr[LocationCoordinatesFloor] = js.undefined
  /**
  	 * Compass heading, in degrees. May be unknown if device is not moving. On
  	 * iOS, a negative value indicates that the heading data is not valid.
  	 */
  var heading: js.UndefOr[Double] = js.undefined
  /**
  	 * Latitude of the location update, in decimal degrees.
  	 */
  var latitude: js.UndefOr[Double] = js.undefined
  /**
  	 * Longitude of the location update, in decimal degrees.
  	 */
  var longitude: js.UndefOr[Double] = js.undefined
  /**
  	 * Current speed in meters/second. On iOS, a negative value indicates that the
  	 * heading data is not valid or the accuracy is configured incorrectly.
  	 * Note: Due to the Apple Geolocation API, set the <Titanium.Geolocation.accuracy>
  	 * property to <Titanium.Geolocation.ACCURACY_BEST_FOR_NAVIGATION> in order to properly
  	 * measure speed changes and prevent the app from returning negative values.
  	 */
  var speed: js.UndefOr[Double] = js.undefined
  /**
  	 * Timestamp for this location update, in milliseconds.
  	 */
  var timestamp: js.UndefOr[Double] = js.undefined
}

object LocationCoordinates {
  @scala.inline
  def apply(
    accuracy: Int | Double = null,
    altitude: Int | Double = null,
    altitudeAccuracy: Int | Double = null,
    floor: LocationCoordinatesFloor = null,
    heading: Int | Double = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    speed: Int | Double = null,
    timestamp: Int | Double = null
  ): LocationCoordinates = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (altitudeAccuracy != null) __obj.updateDynamic("altitudeAccuracy")(altitudeAccuracy.asInstanceOf[js.Any])
    if (floor != null) __obj.updateDynamic("floor")(floor)
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationCoordinates]
  }
}

