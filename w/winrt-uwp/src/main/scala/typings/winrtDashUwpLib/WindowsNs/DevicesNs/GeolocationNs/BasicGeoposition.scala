package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The basic information to describe a geographic position. */
trait BasicGeoposition extends js.Object {
  /** The altitude of the geographic position in meters. */
  var altitude: scala.Double
  /** The latitude of the geographic position. The valid range of latitude values is from -90.0 to 90.0 degrees. */
  var latitude: scala.Double
  /** The longitude of the geographic position. This can be any value. For values less than or equal to-180.0 or values greater than 180.0, the value may be wrapped and stored appropriately before it is used. For example, a longitude of 183.0 degrees would become -177.0 degrees. */
  var longitude: scala.Double
}

object BasicGeoposition {
  @scala.inline
  def apply(altitude: scala.Double, latitude: scala.Double, longitude: scala.Double): BasicGeoposition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("altitude")(altitude)
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.asInstanceOf[BasicGeoposition]
  }
}

