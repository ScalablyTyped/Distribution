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
    accuracy: js.UndefOr[Double] = js.undefined,
    altitude: js.UndefOr[Double] = js.undefined,
    altitudeAccuracy: js.UndefOr[Double] = js.undefined,
    floor: LocationCoordinatesFloor = null,
    heading: js.UndefOr[Double] = js.undefined,
    latitude: js.UndefOr[Double] = js.undefined,
    longitude: js.UndefOr[Double] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined,
    timestamp: js.UndefOr[Double] = js.undefined
  ): LocationCoordinates = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accuracy)) __obj.updateDynamic("accuracy")(accuracy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(altitudeAccuracy)) __obj.updateDynamic("altitudeAccuracy")(altitudeAccuracy.get.asInstanceOf[js.Any])
    if (floor != null) __obj.updateDynamic("floor")(floor.asInstanceOf[js.Any])
    if (!js.isUndefined(heading)) __obj.updateDynamic("heading")(heading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationCoordinates]
  }
}

