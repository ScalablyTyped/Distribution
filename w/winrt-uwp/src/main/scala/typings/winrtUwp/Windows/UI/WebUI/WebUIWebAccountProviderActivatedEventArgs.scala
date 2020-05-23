package typings.winrtUwp.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.Security.Authentication.Web.Provider.IWebAccountProviderOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the arguments involved in activated a web account provider. */
trait WebUIWebAccountProviderActivatedEventArgs extends js.Object {
  /** Gets the activated operation. */
  var activatedOperation: ActivatedOperation
  /** Gets the kind of activation. */
  var kind: ActivationKind
  /** Gets the web account provider operation. */
  var operation: IWebAccountProviderOperation
  /** Gets the previous execution state of the app. */
  var previousExecutionState: ApplicationExecutionState
  /** Gets the splash screen. */
  var splashScreen: SplashScreen
}

object WebUIWebAccountProviderActivatedEventArgs {
  @scala.inline
  def apply(
    activatedOperation: ActivatedOperation,
    kind: ActivationKind,
    operation: IWebAccountProviderOperation,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): WebUIWebAccountProviderActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIWebAccountProviderActivatedEventArgs]
  }
}

