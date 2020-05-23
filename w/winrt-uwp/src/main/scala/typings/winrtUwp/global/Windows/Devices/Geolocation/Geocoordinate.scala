package typings.winrtUwp.global.Windows.Devices.Geolocation

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the information for identifying a geographic location. */
@JSGlobal("Windows.Devices.Geolocation.Geocoordinate")
@js.native
abstract class Geocoordinate ()
  extends typings.winrtUwp.Windows.Devices.Geolocation.Geocoordinate {
  /** The accuracy of the location in meters. */
  /* CompleteClass */
  override var accuracy: Double = js.native
  /** The altitude of the location, in meters. */
  /* CompleteClass */
  override var altitude: Double = js.native
  /** The accuracy of the altitude, in meters. */
  /* CompleteClass */
  override var altitudeAccuracy: Double = js.native
  /** The current heading in degrees relative to true north. */
  /* CompleteClass */
  override var heading: Double = js.native
  /** The latitude in degrees. */
  /* CompleteClass */
  override var latitude: Double = js.native
  /** The longitude in degrees. */
  /* CompleteClass */
  override var longitude: Double = js.native
  /** The location of the Geocoordinate. */
  /* CompleteClass */
  override var point: typings.winrtUwp.Windows.Devices.Geolocation.Geopoint = js.native
  /** Gets the source used to obtain a Geocoordinate. */
  /* CompleteClass */
  override var positionSource: typings.winrtUwp.Windows.Devices.Geolocation.PositionSource = js.native
  /** Gets the time at which the associated Geocoordinate position was calculated. */
  /* CompleteClass */
  override var positionSourceTimestamp: Date = js.native
  /** Gets information about the satellites used to obtain a Geocoordinate. */
  /* CompleteClass */
  override var satelliteData: typings.winrtUwp.Windows.Devices.Geolocation.GeocoordinateSatelliteData = js.native
  /** The speed in meters per second. */
  /* CompleteClass */
  override var speed: Double = js.native
  /** The system time at which the location was determined. */
  /* CompleteClass */
  override var timestamp: Date = js.native
}

