package typings.winrt.WindowsNs.UINs.WebUINs

import typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
import typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
import typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.IFileSavePickerActivatedEventArgs
import typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen
import typings.winrt.WindowsNs.StorageNs.PickersNs.ProviderNs.FileSavePickerUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.WebUIFileSavePickerActivatedEventArgs")
@js.native
class WebUIFileSavePickerActivatedEventArgs ()
  extends IFileSavePickerActivatedEventArgs
     with IActivatedEventArgsDeferral {
  /* CompleteClass */
  override var activatedOperation: ActivatedOperation = js.native
  /* CompleteClass */
  override var fileSavePickerUI: FileSavePickerUI = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

