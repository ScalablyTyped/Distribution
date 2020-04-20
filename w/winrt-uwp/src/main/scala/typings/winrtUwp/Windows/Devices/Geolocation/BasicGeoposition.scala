package typings.winrtUwp.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The basic information to describe a geographic position. */
trait BasicGeoposition extends js.Object {
  /** The altitude of the geographic position in meters. */
  var altitude: Double
  /** The latitude of the geographic position. The valid range of latitude values is from -90.0 to 90.0 degrees. */
  var latitude: Double
  /** The longitude of the geographic position. This can be any value. For values less than or equal to-180.0 or values greater than 180.0, the value may be wrapped and stored appropriately before it is used. For example, a longitude of 183.0 degrees would become -177.0 degrees. */
  var longitude: Double
}

object BasicGeoposition {
  @scala.inline
  def apply(altitude: Double, latitude: Double, longitude: Double): BasicGeoposition = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicGeoposition]
  }
}

