package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShareTargetActivatedEventArgs extends IActivatedEventArgs {
  var shareOperation: winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs.ShareTargetNs.ShareOperation
}

object IShareTargetActivatedEventArgs {
  @scala.inline
  def apply(
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    shareOperation: winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs.ShareTargetNs.ShareOperation,
    splashScreen: SplashScreen
  ): IShareTargetActivatedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("previousExecutionState")(previousExecutionState)
    __obj.updateDynamic("shareOperation")(shareOperation)
    __obj.updateDynamic("splashScreen")(splashScreen)
    __obj.asInstanceOf[IShareTargetActivatedEventArgs]
  }
}

