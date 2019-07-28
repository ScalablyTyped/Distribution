package typings.winrt.WindowsNs.DevicesNs.GeolocationNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeolocator extends js.Object {
  var desiredAccuracy: PositionAccuracy = js.native
  var locationStatus: PositionStatus = js.native
  var movementThreshold: Double = js.native
  var onpositionchanged: js.Any = js.native
  var onstatuschanged: js.Any = js.native
  var reportInterval: Double = js.native
  def getGeopositionAsync(): IAsyncOperation[Geoposition] = js.native
  def getGeopositionAsync(maximumAge: Double, timeout: Double): IAsyncOperation[Geoposition] = js.native
}

