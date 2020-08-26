package typings.winrt.Windows.ApplicationModel.Activation

import typings.winrt.Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareTargetActivatedEventArgs extends IShareTargetActivatedEventArgs

object ShareTargetActivatedEventArgs {
  @scala.inline
  def apply(
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    shareOperation: ShareOperation,
    splashScreen: SplashScreen
  ): ShareTargetActivatedEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], shareOperation = shareOperation.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareTargetActivatedEventArgs]
  }
}

