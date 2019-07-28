package typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs

import typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs.ContactPickerUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Activation.ContactPickerActivatedEventArgs")
@js.native
class ContactPickerActivatedEventArgs () extends IContactPickerActivatedEventArgs {
  /* CompleteClass */
  override var contactPickerUI: ContactPickerUI = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

