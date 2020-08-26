package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object holding the data for a location update.
  */
@js.native
trait LocationCoordinates extends js.Object {
  /**
    * Accuracy of the location update, in meters.
    */
  var accuracy: js.UndefOr[Double] = js.native
  /**
    * Altitude of the location update, in meters.
    */
  var altitude: js.UndefOr[Double] = js.native
  /**
    * Vertical accuracy of the location update, in meters.
    */
  var altitudeAccuracy: js.UndefOr[Double] = js.native
  /**
    * The floor of the building on which the user is located.
    */
  var floor: js.UndefOr[LocationCoordinatesFloor] = js.native
  /**
    * Compass heading, in degrees. May be unknown if device is not moving. On
    * iOS, a negative value indicates that the heading data is not valid.
    */
  var heading: js.UndefOr[Double] = js.native
  /**
    * Latitude of the location update, in decimal degrees.
    */
  var latitude: js.UndefOr[Double] = js.native
  /**
    * Longitude of the location update, in decimal degrees.
    */
  var longitude: js.UndefOr[Double] = js.native
  /**
    * Current speed in meters/second. On iOS, a negative value indicates that the
    * heading data is not valid or the accuracy is configured incorrectly.
    * Note: Due to the Apple Geolocation API, set the <Titanium.Geolocation.accuracy>
    * property to <Titanium.Geolocation.ACCURACY_BEST_FOR_NAVIGATION> in order to properly
    * measure speed changes and prevent the app from returning negative values.
    */
  var speed: js.UndefOr[Double] = js.native
  /**
    * Timestamp for this location update, in milliseconds.
    */
  var timestamp: js.UndefOr[Double] = js.native
}

object LocationCoordinates {
  @scala.inline
  def apply(): LocationCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationCoordinates]
  }
  @scala.inline
  implicit class LocationCoordinatesOps[Self <: LocationCoordinates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccuracy(value: Double): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccuracy: Self = this.set("accuracy", js.undefined)
    @scala.inline
    def setAltitude(value: Double): Self = this.set("altitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltitude: Self = this.set("altitude", js.undefined)
    @scala.inline
    def setAltitudeAccuracy(value: Double): Self = this.set("altitudeAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltitudeAccuracy: Self = this.set("altitudeAccuracy", js.undefined)
    @scala.inline
    def setFloor(value: LocationCoordinatesFloor): Self = this.set("floor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloor: Self = this.set("floor", js.undefined)
    @scala.inline
    def setHeading(value: Double): Self = this.set("heading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
  
}

