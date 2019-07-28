package typings.winrt.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetVersionRequest extends js.Object {
  var currentVersion: Double
  var desiredVersion: Double
  def getDeferral(): SetVersionDeferral
}

object ISetVersionRequest {
  @scala.inline
  def apply(currentVersion: Double, desiredVersion: Double, getDeferral: () => SetVersionDeferral): ISetVersionRequest = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion, desiredVersion = desiredVersion, getDeferral = js.Any.fromFunction0(getDeferral))
  
    __obj.asInstanceOf[ISetVersionRequest]
  }
}

