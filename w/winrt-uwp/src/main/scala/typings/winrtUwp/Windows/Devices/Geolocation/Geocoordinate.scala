package typings.winrtUwp.Windows.Devices.Geolocation

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the information for identifying a geographic location. */
@js.native
trait Geocoordinate extends js.Object {
  /** The accuracy of the location in meters. */
  var accuracy: Double = js.native
  /** The altitude of the location, in meters. */
  var altitude: Double = js.native
  /** The accuracy of the altitude, in meters. */
  var altitudeAccuracy: Double = js.native
  /** The current heading in degrees relative to true north. */
  var heading: Double = js.native
  /** The latitude in degrees. */
  var latitude: Double = js.native
  /** The longitude in degrees. */
  var longitude: Double = js.native
  /** The location of the Geocoordinate. */
  var point: Geopoint = js.native
  /** Gets the source used to obtain a Geocoordinate. */
  var positionSource: PositionSource = js.native
  /** Gets the time at which the associated Geocoordinate position was calculated. */
  var positionSourceTimestamp: Date = js.native
  /** Gets information about the satellites used to obtain a Geocoordinate. */
  var satelliteData: GeocoordinateSatelliteData = js.native
  /** The speed in meters per second. */
  var speed: Double = js.native
  /** The system time at which the location was determined. */
  var timestamp: Date = js.native
}

object Geocoordinate {
  @scala.inline
  def apply(
    accuracy: Double,
    altitude: Double,
    altitudeAccuracy: Double,
    heading: Double,
    latitude: Double,
    longitude: Double,
    point: Geopoint,
    positionSource: PositionSource,
    positionSourceTimestamp: Date,
    satelliteData: GeocoordinateSatelliteData,
    speed: Double,
    timestamp: Date
  ): Geocoordinate = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], altitudeAccuracy = altitudeAccuracy.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], positionSource = positionSource.asInstanceOf[js.Any], positionSourceTimestamp = positionSourceTimestamp.asInstanceOf[js.Any], satelliteData = satelliteData.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geocoordinate]
  }
  @scala.inline
  implicit class GeocoordinateOps[Self <: Geocoordinate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccuracy(value: Double): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def setAltitude(value: Double): Self = this.set("altitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setAltitudeAccuracy(value: Double): Self = this.set("altitudeAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeading(value: Double): Self = this.set("heading", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoint(value: Geopoint): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositionSource(value: PositionSource): Self = this.set("positionSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositionSourceTimestamp(value: Date): Self = this.set("positionSourceTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setSatelliteData(value: GeocoordinateSatelliteData): Self = this.set("satelliteData", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

