package typings.titanium.Titanium.Geolocation

import typings.titanium.ForwardGeocodeResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.Geolocation.forwardGeocoder")
@js.native
object forwardGeocoder extends js.Object {
  /**
  		 * Resolves an address to a location.
  		 */
  def apply(address: String, callback: js.Function1[/* param0 */ ForwardGeocodeResponse, _]): Unit = js.native
}

