package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the arguments related to activating a 3D print workflow. */
@JSGlobal("Windows.UI.WebUI.WebUIPrint3DWorkflowActivatedEventArgs")
@js.native
abstract class WebUIPrint3DWorkflowActivatedEventArgs ()
  extends typings.winrtUwp.Windows.UI.WebUI.WebUIPrint3DWorkflowActivatedEventArgs {
  /** Gets the activated operation. */
  /* CompleteClass */
  override var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  /** Gets the kind of activation. */
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /** Gets the previous execution state. */
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
  /** Gets the print workflow. */
  /* CompleteClass */
  override var workflow: Print3DWorkflow = js.native
}

