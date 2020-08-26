package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an activated event that fires after the app was suspended for a file open picker operation. */
@js.native
trait FileOpenPickerContinuationEventArgs extends js.Object {
  /** Gets a set of values populated by the app before a FileOpenPicker operation that deactivates the app in order to provide context when the app is activated. */
  var continuationData: ValueSet = js.native
  /** Gets the list of files selected by the user during the file open picker operation. */
  var files: IVectorView[StorageFile] = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets a SplashScreen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}

object FileOpenPickerContinuationEventArgs {
  @scala.inline
  def apply(
    continuationData: ValueSet,
    files: IVectorView[StorageFile],
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): FileOpenPickerContinuationEventArgs = {
    val __obj = js.Dynamic.literal(continuationData = continuationData.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileOpenPickerContinuationEventArgs]
  }
  @scala.inline
  implicit class FileOpenPickerContinuationEventArgsOps[Self <: FileOpenPickerContinuationEventArgs] (val x: Self) extends AnyVal {
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
    def setContinuationData(value: ValueSet): Self = this.set("continuationData", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiles(value: IVectorView[StorageFile]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: ActivationKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = this.set("previousExecutionState", value.asInstanceOf[js.Any])
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = this.set("splashScreen", value.asInstanceOf[js.Any])
  }
  
}

