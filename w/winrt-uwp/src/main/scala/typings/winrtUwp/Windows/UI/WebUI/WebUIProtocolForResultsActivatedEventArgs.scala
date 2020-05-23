package typings.winrtUwp.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.System.ProtocolForResultsOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the activation arguments when an app is launched via LaunchUriForResultsAsync . */
trait WebUIProtocolForResultsActivatedEventArgs extends js.Object {
  /** Gets the app activation operation. */
  var activatedOperation: ActivatedOperation
  /** Gets the family name of the caller's package. */
  var callerPackageFamilyName: String
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double
  /** Gets the data associated with the activation. */
  var data: ValueSet
  /** Gets the kind of activation. */
  var kind: ActivationKind
  /** Gets the previous execution state. */
  var previousExecutionState: ApplicationExecutionState
  /** Gets info about the protocol for results operation that triggered the activation. */
  var protocolForResultsOperation: ProtocolForResultsOperation
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
  /** Gets the Uniform Resource Identifier (URI) for which the app was activated. */
  var uri: Uri
}

object WebUIProtocolForResultsActivatedEventArgs {
  @scala.inline
  def apply(
    activatedOperation: ActivatedOperation,
    callerPackageFamilyName: String,
    currentlyShownApplicationViewId: Double,
    data: ValueSet,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    protocolForResultsOperation: ProtocolForResultsOperation,
    splashScreen: SplashScreen,
    uri: Uri
  ): WebUIProtocolForResultsActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], callerPackageFamilyName = callerPackageFamilyName.asInstanceOf[js.Any], currentlyShownApplicationViewId = currentlyShownApplicationViewId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], protocolForResultsOperation = protocolForResultsOperation.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIProtocolForResultsActivatedEventArgs]
  }
}

