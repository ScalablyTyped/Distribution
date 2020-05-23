package typings.winrtUwp.global.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a location that may contain latitude and longitude data or venue data. */
@JSGlobal("Windows.Devices.Geolocation.Geoposition")
@js.native
abstract class Geoposition ()
  extends typings.winrtUwp.Windows.Devices.Geolocation.Geoposition {
  /** Unsupported API. */
  /* CompleteClass */
  override var civicAddress: typings.winrtUwp.Windows.Devices.Geolocation.CivicAddress = js.native
  /** The latitude and longitude associated with a geographic location. */
  /* CompleteClass */
  override var coordinate: typings.winrtUwp.Windows.Devices.Geolocation.Geocoordinate = js.native
  /** Represents the venue associated with a geographic location. */
  /* CompleteClass */
  override var venueData: typings.winrtUwp.Windows.Devices.Geolocation.VenueData = js.native
}

