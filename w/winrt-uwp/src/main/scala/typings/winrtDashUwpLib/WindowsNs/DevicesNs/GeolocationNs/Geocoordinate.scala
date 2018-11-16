package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the information for identifying a geographic location. */
@JSGlobal("Windows.Devices.Geolocation.Geocoordinate")
@js.native
abstract class Geocoordinate () extends js.Object {
  /** The accuracy of the location in meters. */
  var accuracy: scala.Double = js.native
  /** The altitude of the location, in meters. */
  var altitude: scala.Double = js.native
  /** The accuracy of the altitude, in meters. */
  var altitudeAccuracy: scala.Double = js.native
  /** The current heading in degrees relative to true north. */
  var heading: scala.Double = js.native
  /** The latitude in degrees. */
  var latitude: scala.Double = js.native
  /** The longitude in degrees. */
  var longitude: scala.Double = js.native
  /** The location of the Geocoordinate. */
  var point: Geopoint = js.native
  /** Gets the source used to obtain a Geocoordinate. */
  var positionSource: PositionSource = js.native
  /** Gets the time at which the associated Geocoordinate position was calculated. */
  var positionSourceTimestamp: stdLib.Date = js.native
  /** Gets information about the satellites used to obtain a Geocoordinate. */
  var satelliteData: GeocoordinateSatelliteData = js.native
  /** The speed in meters per second. */
  var speed: scala.Double = js.native
  /** The system time at which the location was determined. */
  var timestamp: stdLib.Date = js.native
}

