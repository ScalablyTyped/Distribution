package typings.titanium.Titanium.Geolocation

import typings.titanium.ReverseGeocodeResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.Geolocation.reverseGeocoder")
@js.native
object reverseGeocoder extends js.Object {
  /**
  		 * Tries to resolve a location to an address.
  		 */
  def apply(
    latitude: Double,
    longitude: Double,
    callback: js.Function1[/* param0 */ ReverseGeocodeResponse, _]
  ): Unit = js.native
}

