package typings.winrtUwp.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a location that may contain latitude and longitude data or venue data. */
trait Geoposition extends js.Object {
  /** Unsupported API. */
  var civicAddress: CivicAddress
  /** The latitude and longitude associated with a geographic location. */
  var coordinate: Geocoordinate
  /** Represents the venue associated with a geographic location. */
  var venueData: VenueData
}

object Geoposition {
  @scala.inline
  def apply(civicAddress: CivicAddress, coordinate: Geocoordinate, venueData: VenueData): Geoposition = {
    val __obj = js.Dynamic.literal(civicAddress = civicAddress.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any], venueData = venueData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geoposition]
  }
}

