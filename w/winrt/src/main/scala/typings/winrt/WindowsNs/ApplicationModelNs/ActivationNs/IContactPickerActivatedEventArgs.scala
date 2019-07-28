package typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs

import typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs.ContactPickerUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContactPickerActivatedEventArgs extends IActivatedEventArgs {
  var contactPickerUI: ContactPickerUI
}

object IContactPickerActivatedEventArgs {
  @scala.inline
  def apply(
    contactPickerUI: ContactPickerUI,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): IContactPickerActivatedEventArgs = {
    val __obj = js.Dynamic.literal(contactPickerUI = contactPickerUI, kind = kind, previousExecutionState = previousExecutionState, splashScreen = splashScreen)
  
    __obj.asInstanceOf[IContactPickerActivatedEventArgs]
  }
}

