package typings.winrt.Windows.UI.WebUI

import typings.winrt.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrt.Windows.ApplicationModel.Activation.IShareTargetActivatedEventArgs
import typings.winrt.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrt.Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebUIShareTargetActivatedEventArgs
  extends StObject
     with IShareTargetActivatedEventArgs
     with IActivatedEventArgsDeferral
object WebUIShareTargetActivatedEventArgs {
  
  @scala.inline
  def apply(
    activatedOperation: ActivatedOperation,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    shareOperation: ShareOperation,
    splashScreen: SplashScreen
  ): WebUIShareTargetActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], shareOperation = shareOperation.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIShareTargetActivatedEventArgs]
  }
}
