package typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs

import typings.winrt.WindowsNs.ApplicationModelNs.DataTransferNs.ShareTargetNs.ShareOperation
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

