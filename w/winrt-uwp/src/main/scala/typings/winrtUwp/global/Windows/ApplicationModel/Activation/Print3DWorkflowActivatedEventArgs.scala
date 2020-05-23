package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an event that occurs when the app is launched as a 3D printing workflow. */
@JSGlobal("Windows.ApplicationModel.Activation.Print3DWorkflowActivatedEventArgs")
@js.native
abstract class Print3DWorkflowActivatedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Activation.Print3DWorkflowActivatedEventArgs {
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  /** Gets a customized printing experience for a 3D printer. */
  /* CompleteClass */
  override var workflow: Print3DWorkflow = js.native
}

