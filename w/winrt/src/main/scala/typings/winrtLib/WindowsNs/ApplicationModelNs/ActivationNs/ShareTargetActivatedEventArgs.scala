package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Activation.ShareTargetActivatedEventArgs")
@js.native
class ShareTargetActivatedEventArgs () extends IShareTargetActivatedEventArgs {
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var shareOperation: winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs.ShareTargetNs.ShareOperation = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

