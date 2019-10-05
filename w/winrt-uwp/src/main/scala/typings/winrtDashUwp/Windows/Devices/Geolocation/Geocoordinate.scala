package typings.winrtDashUwp.Windows.Devices.Geolocation

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the information for identifying a geographic location. */
@JSGlobal("Windows.Devices.Geolocation.Geocoordinate")
@js.native
abstract class Geocoordinate () extends js.Object {
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

