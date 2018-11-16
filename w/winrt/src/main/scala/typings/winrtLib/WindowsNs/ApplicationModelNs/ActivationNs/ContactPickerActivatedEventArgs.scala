package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Activation.ContactPickerActivatedEventArgs")
@js.native
class ContactPickerActivatedEventArgs () extends IContactPickerActivatedEventArgs {
  /* CompleteClass */
  override var contactPickerUI: winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs.ContactPickerUI = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

