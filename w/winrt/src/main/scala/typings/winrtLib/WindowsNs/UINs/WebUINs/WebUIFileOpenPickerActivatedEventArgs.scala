package typings
package winrtLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.WebUIFileOpenPickerActivatedEventArgs")
@js.native
class WebUIFileOpenPickerActivatedEventArgs ()
  extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.IFileOpenPickerActivatedEventArgs
     with IActivatedEventArgsDeferral {
  /* CompleteClass */
  override var activatedOperation: ActivatedOperation = js.native
  /* CompleteClass */
  override var fileOpenPickerUI: winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs.FileOpenPickerUI = js.native
  /* CompleteClass */
  override var kind: winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen = js.native
}

