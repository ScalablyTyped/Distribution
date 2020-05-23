package typings.winrtUwp.Windows.Devices.Geolocation

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the information for identifying a geographic location. */
trait Geocoordinate extends js.Object {
  /** The accuracy of the location in meters. */
  var accuracy: Double
  /** The altitude of the location, in meters. */
  var altitude: Double
  /** The accuracy of the altitude, in meters. */
  var altitudeAccuracy: Double
  /** The current heading in degrees relative to true north. */
  var heading: Double
  /** The latitude in degrees. */
  var latitude: Double
  /** The longitude in degrees. */
  var longitude: Double
  /** The location of the Geocoordinate. */
  var point: Geopoint
  /** Gets the source used to obtain a Geocoordinate. */
  var positionSource: PositionSource
  /** Gets the time at which the associated Geocoordinate position was calculated. */
  var positionSourceTimestamp: Date
  /** Gets information about the satellites used to obtain a Geocoordinate. */
  var satelliteData: GeocoordinateSatelliteData
  /** The speed in meters per second. */
  var speed: Double
  /** The system time at which the location was determined. */
  var timestamp: Date
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
}

