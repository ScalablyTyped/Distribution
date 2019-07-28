package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs

import typings.winrtDashUwp.WindowsNs.StorageNs.PickersNs.ProviderNs.FileSavePickerUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an activated event that fires when the user saves a file through the file picker and selects the app as the location. */
@JSGlobal("Windows.ApplicationModel.Activation.FileSavePickerActivatedEventArgs")
@js.native
abstract class FileSavePickerActivatedEventArgs () extends js.Object {
  /** The package family name of the app that launched this app. */
  var callerPackageFamilyName: String = js.native
  /** Gets the ID of the enterprise that owns the file. */
  var enterpriseId: String = js.native
  /** Gets the letterbox UI of the file picker that is displayed when the user saves a file and selects the app as the save location. */
  var fileSavePickerUI: FileSavePickerUI = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets a SplashScreen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}

