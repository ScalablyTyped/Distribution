package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Activation.FileSavePickerActivatedEventArgs")
@js.native
class FileSavePickerActivatedEventArgs () extends IFileSavePickerActivatedEventArgs {
  /* CompleteClass */
  override var fileSavePickerUI: winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs.FileSavePickerUI = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

