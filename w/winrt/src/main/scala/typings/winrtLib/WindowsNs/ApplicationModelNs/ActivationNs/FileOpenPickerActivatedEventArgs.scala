package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Activation.FileOpenPickerActivatedEventArgs")
@js.native
class FileOpenPickerActivatedEventArgs () extends IFileOpenPickerActivatedEventArgs {
  /* CompleteClass */
  override var fileOpenPickerUI: winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs.FileOpenPickerUI = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

