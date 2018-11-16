package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an activated event that fires when the user tries to pick files or folders that are provided by the app. */
@JSGlobal("Windows.ApplicationModel.Activation.FileOpenPickerActivatedEventArgs")
@js.native
abstract class FileOpenPickerActivatedEventArgs () extends js.Object {
  /** The package family name of the app that launched your app. */
  var callerPackageFamilyName: java.lang.String = js.native
  /** Gets the letterbox UI of the file picker that is displayed when the user wants to pick files or folders that are provided by the app. */
  var fileOpenPickerUI: winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.ProviderNs.FileOpenPickerUI = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets a SplashScreen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}

