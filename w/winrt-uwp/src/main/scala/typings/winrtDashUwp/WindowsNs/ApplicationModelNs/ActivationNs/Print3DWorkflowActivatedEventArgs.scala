package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs

import typings.winrtDashUwp.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an event that occurs when the app is launched as a 3D printing workflow. */
@JSGlobal("Windows.ApplicationModel.Activation.Print3DWorkflowActivatedEventArgs")
@js.native
abstract class Print3DWorkflowActivatedEventArgs () extends js.Object {
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets a customized printing experience for a 3D printer. */
  var workflow: Print3DWorkflow = js.native
}

