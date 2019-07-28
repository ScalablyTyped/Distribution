package typings.winrtDashUwp.WindowsNs.UINs.WebUINs

import typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
import typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
import typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen
import typings.winrtDashUwp.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the arguments related to activating a 3D print workflow. */
@JSGlobal("Windows.UI.WebUI.WebUIPrint3DWorkflowActivatedEventArgs")
@js.native
abstract class WebUIPrint3DWorkflowActivatedEventArgs () extends js.Object {
  /** Gets the activated operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the kind of activation. */
  var kind: ActivationKind = js.native
  /** Gets the previous execution state. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the print workflow. */
  var workflow: Print3DWorkflow = js.native
}

