package typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs

import typings.winrt.WindowsNs.StorageNs.PickersNs.ProviderNs.FileOpenPickerUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Activation.FileOpenPickerActivatedEventArgs")
@js.native
class FileOpenPickerActivatedEventArgs () extends IFileOpenPickerActivatedEventArgs {
  /* CompleteClass */
  override var fileOpenPickerUI: FileOpenPickerUI = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

