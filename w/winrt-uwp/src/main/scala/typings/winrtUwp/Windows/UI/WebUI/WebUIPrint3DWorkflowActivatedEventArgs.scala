package typings.winrtUwp.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the arguments related to activating a 3D print workflow. */
trait WebUIPrint3DWorkflowActivatedEventArgs extends js.Object {
  /** Gets the activated operation. */
  var activatedOperation: ActivatedOperation
  /** Gets the kind of activation. */
  var kind: ActivationKind
  /** Gets the previous execution state. */
  var previousExecutionState: ApplicationExecutionState
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
  /** Gets the print workflow. */
  var workflow: Print3DWorkflow
}

object WebUIPrint3DWorkflowActivatedEventArgs {
  @scala.inline
  def apply(
    activatedOperation: ActivatedOperation,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    workflow: Print3DWorkflow
  ): WebUIPrint3DWorkflowActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], workflow = workflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIPrint3DWorkflowActivatedEventArgs]
  }
}

