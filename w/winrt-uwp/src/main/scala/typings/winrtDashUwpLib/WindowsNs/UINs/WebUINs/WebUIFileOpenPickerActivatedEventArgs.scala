package typings
package winrtDashUwpLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an activated event that fires when the user tries to pick files or folders that are provided by the app. */
@JSGlobal("Windows.UI.WebUI.WebUIFileOpenPickerActivatedEventArgs")
@js.native
abstract class WebUIFileOpenPickerActivatedEventArgs () extends js.Object {
  /** Gets the app activated operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the family name of the caller's package. */
  var callerPackageFamilyName: java.lang.String = js.native
  /** Gets the letterbox UI of the file picker that is displayed when the user wants to pick files or folders that are provided by the app. */
  var fileOpenPickerUI: winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.ProviderNs.FileOpenPickerUI = js.native
  /** Gets the activation type. */
  var kind: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen = js.native
}

