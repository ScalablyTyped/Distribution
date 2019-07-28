package typings.winrt.WindowsNs.UINs.WebUINs

import typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
import typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
import typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.IContactPickerActivatedEventArgs
import typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen
import typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs.ContactPickerUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.WebUIContactPickerActivatedEventArgs")
@js.native
class WebUIContactPickerActivatedEventArgs ()
  extends IContactPickerActivatedEventArgs
     with IActivatedEventArgsDeferral {
  /* CompleteClass */
  override var activatedOperation: ActivatedOperation = js.native
  /* CompleteClass */
  override var contactPickerUI: ContactPickerUI = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

