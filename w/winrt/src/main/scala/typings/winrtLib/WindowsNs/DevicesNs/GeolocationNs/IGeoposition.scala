package typings
package winrtLib.WindowsNs.DevicesNs.GeolocationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoposition extends js.Object {
  var civicAddress: CivicAddress
  var coordinate: Geocoordinate
}

object IGeoposition {
  @scala.inline
  def apply(civicAddress: CivicAddress, coordinate: Geocoordinate): IGeoposition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("civicAddress")(civicAddress)
    __obj.updateDynamic("coordinate")(coordinate)
    __obj.asInstanceOf[IGeoposition]
  }
}

