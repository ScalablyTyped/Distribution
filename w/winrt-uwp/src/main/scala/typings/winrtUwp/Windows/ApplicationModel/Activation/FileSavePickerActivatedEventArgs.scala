package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Storage.Pickers.Provider.FileSavePickerUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an activated event that fires when the user saves a file through the file picker and selects the app as the location. */
trait FileSavePickerActivatedEventArgs extends js.Object {
  /** The package family name of the app that launched this app. */
  var callerPackageFamilyName: String
  /** Gets the ID of the enterprise that owns the file. */
  var enterpriseId: String
  /** Gets the letterbox UI of the file picker that is displayed when the user saves a file and selects the app as the save location. */
  var fileSavePickerUI: FileSavePickerUI
  /** Gets the activation type. */
  var kind: ActivationKind
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  /** Gets a SplashScreen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
}

object FileSavePickerActivatedEventArgs {
  @scala.inline
  def apply(
    callerPackageFamilyName: String,
    enterpriseId: String,
    fileSavePickerUI: FileSavePickerUI,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): FileSavePickerActivatedEventArgs = {
    val __obj = js.Dynamic.literal(callerPackageFamilyName = callerPackageFamilyName.asInstanceOf[js.Any], enterpriseId = enterpriseId.asInstanceOf[js.Any], fileSavePickerUI = fileSavePickerUI.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSavePickerActivatedEventArgs]
  }
}

