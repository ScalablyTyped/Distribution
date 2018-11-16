package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.SetVersionRequest")
@js.native
class SetVersionRequest () extends ISetVersionRequest {
  /* CompleteClass */
  override var currentVersion: scala.Double = js.native
  /* CompleteClass */
  override var desiredVersion: scala.Double = js.native
  /* CompleteClass */
  override def getDeferral(): SetVersionDeferral = js.native
}

