package typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs

import typings.winrt.WindowsNs.StorageNs.PickersNs.ProviderNs.FileSavePickerUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Activation.FileSavePickerActivatedEventArgs")
@js.native
class FileSavePickerActivatedEventArgs () extends IFileSavePickerActivatedEventArgs {
  /* CompleteClass */
  override var fileSavePickerUI: FileSavePickerUI = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

