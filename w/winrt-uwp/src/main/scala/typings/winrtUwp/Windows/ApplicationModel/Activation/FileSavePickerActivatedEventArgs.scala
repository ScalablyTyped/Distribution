package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Storage.Pickers.Provider.FileSavePickerUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an activated event that fires when the user saves a file through the file picker and selects the app as the location. */
@js.native
trait FileSavePickerActivatedEventArgs extends js.Object {
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
  @scala.inline
  implicit class FileSavePickerActivatedEventArgsOps[Self <: FileSavePickerActivatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCallerPackageFamilyName(value: String): Self = this.set("callerPackageFamilyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnterpriseId(value: String): Self = this.set("enterpriseId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSavePickerUI(value: FileSavePickerUI): Self = this.set("fileSavePickerUI", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: ActivationKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = this.set("previousExecutionState", value.asInstanceOf[js.Any])
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = this.set("splashScreen", value.asInstanceOf[js.Any])
  }
  
}

