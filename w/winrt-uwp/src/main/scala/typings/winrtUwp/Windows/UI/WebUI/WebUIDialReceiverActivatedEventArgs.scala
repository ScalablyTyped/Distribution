package typings.winrtUwp.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated from another app by using the DIAL protocol. */
trait WebUIDialReceiverActivatedEventArgs extends js.Object {
  /** Gets the app activated operation. */
  var activatedOperation: ActivatedOperation
  /** Gets the name of the app that invoked the dial receiver app. */
  var appName: String
  /** Gets the arguments that are passed to the app during its launch activation. */
  var arguments: String
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double
  /** Gets the activation type. */
  var kind: ActivationKind
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
  /** Gets the identifier of the source tile that launched the app. */
  var tileId: String
}

object WebUIDialReceiverActivatedEventArgs {
  @scala.inline
  def apply(
    activatedOperation: ActivatedOperation,
    appName: String,
    arguments: String,
    currentlyShownApplicationViewId: Double,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    tileId: String
  ): WebUIDialReceiverActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], arguments = arguments.asInstanceOf[js.Any], currentlyShownApplicationViewId = currentlyShownApplicationViewId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], tileId = tileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIDialReceiverActivatedEventArgs]
  }
}

