package typings.titanium.Titanium.Geolocation

import typings.titanium.LocationAuthorizationResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.Geolocation.requestLocationPermissions")
@js.native
object requestLocationPermissions extends js.Object {
  /**
  		 * Requests for location access.
  		 */
  def apply(authorizationType: Double, callback: js.Function1[/* param0 */ LocationAuthorizationResponse, _]): Unit = js.native
}

