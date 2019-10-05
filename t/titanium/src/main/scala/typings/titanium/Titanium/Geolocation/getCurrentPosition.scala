package typings.titanium.Titanium.Geolocation

import typings.titanium.LocationResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.Geolocation.getCurrentPosition")
@js.native
object getCurrentPosition extends js.Object {
  /**
  		 * Retrieves the last known location from the device.
  		 */
  def apply(callback: js.Function1[/* param0 */ LocationResults, _]): Unit = js.native
}

