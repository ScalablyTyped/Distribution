package typings
package winrtLib.WindowsNs.DevicesNs.GeolocationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeolocator extends js.Object {
  var desiredAccuracy: PositionAccuracy = js.native
  var locationStatus: PositionStatus = js.native
  var movementThreshold: scala.Double = js.native
  var onpositionchanged: js.Any = js.native
  var onstatuschanged: js.Any = js.native
  var reportInterval: scala.Double = js.native
  def getGeopositionAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[Geoposition] = js.native
  def getGeopositionAsync(maximumAge: scala.Double, timeout: scala.Double): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[Geoposition] = js.native
}

