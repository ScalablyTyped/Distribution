package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Security.Authentication.Web.Provider.IWebAccountProviderOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information to an app activated as a result of a web account provider operation. */
trait WebAccountProviderActivatedEventArgs extends js.Object {
  /** Gets the kind of web account provider activation. */
  var kind: ActivationKind
  /** Gets the web account provider operation. */
  var operation: IWebAccountProviderOperation
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
}

object WebAccountProviderActivatedEventArgs {
  @scala.inline
  def apply(
    kind: ActivationKind,
    operation: IWebAccountProviderOperation,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): WebAccountProviderActivatedEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountProviderActivatedEventArgs]
  }
}

