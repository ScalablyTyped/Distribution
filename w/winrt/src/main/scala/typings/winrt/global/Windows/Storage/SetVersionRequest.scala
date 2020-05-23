package typings.winrt.global.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.SetVersionRequest")
@js.native
class SetVersionRequest ()
  extends typings.winrt.Windows.Storage.SetVersionRequest {
  /* CompleteClass */
  override var currentVersion: Double = js.native
  /* CompleteClass */
  override var desiredVersion: Double = js.native
  /* CompleteClass */
  override def getDeferral(): typings.winrt.Windows.Storage.SetVersionDeferral = js.native
}

