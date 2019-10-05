package typings.winrt.Windows.ApplicationModel.Activation

import typings.winrt.Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShareTargetActivatedEventArgs extends IActivatedEventArgs {
  var shareOperation: ShareOperation
}

object IShareTargetActivatedEventArgs {
  @scala.inline
  def apply(
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    shareOperation: ShareOperation,
    splashScreen: SplashScreen
  ): IShareTargetActivatedEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind, previousExecutionState = previousExecutionState, shareOperation = shareOperation, splashScreen = splashScreen)
  
    __obj.asInstanceOf[IShareTargetActivatedEventArgs]
  }
}

