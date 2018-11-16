package typings
package winrtDashUwpLib.WindowsNs.UINs.WebUINs

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
  var kind: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind = js.native
  /** Gets the previous execution state. */
  var previousExecutionState: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen = js.native
  /** Gets the print workflow. */
  var workflow: winrtDashUwpLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflow = js.native
}

