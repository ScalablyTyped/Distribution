package typings.winrt.Windows.Storage

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
    val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], desiredVersion = desiredVersion.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[ISetVersionRequest]
  }
}

