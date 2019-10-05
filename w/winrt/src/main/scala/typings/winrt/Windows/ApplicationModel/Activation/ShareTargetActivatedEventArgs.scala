package typings.winrt.Windows.ApplicationModel.Activation

import typings.winrt.Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation
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
  override var shareOperation: ShareOperation = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

