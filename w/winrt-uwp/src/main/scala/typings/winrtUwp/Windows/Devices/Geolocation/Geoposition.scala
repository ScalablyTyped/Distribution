package typings.winrtUwp.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a location that may contain latitude and longitude data or venue data. */
@JSGlobal("Windows.Devices.Geolocation.Geoposition")
@js.native
abstract class Geoposition () extends js.Object {
  /** Unsupported API. */
  var civicAddress: CivicAddress = js.native
  /** The latitude and longitude associated with a geographic location. */
  var coordinate: Geocoordinate = js.native
  /** Represents the venue associated with a geographic location. */
  var venueData: VenueData = js.native
}

