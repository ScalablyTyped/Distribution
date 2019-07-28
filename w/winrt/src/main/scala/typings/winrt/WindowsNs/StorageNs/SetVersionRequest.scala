package typings.winrt.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.SetVersionRequest")
@js.native
class SetVersionRequest () extends ISetVersionRequest {
  /* CompleteClass */
  override var currentVersion: Double = js.native
  /* CompleteClass */
  override var desiredVersion: Double = js.native
  /* CompleteClass */
  override def getDeferral(): SetVersionDeferral = js.native
}

