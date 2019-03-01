package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContactPickerActivatedEventArgs extends IActivatedEventArgs {
  var contactPickerUI: winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs.ContactPickerUI
}

object IContactPickerActivatedEventArgs {
  @scala.inline
  def apply(
    contactPickerUI: winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs.ContactPickerUI,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): IContactPickerActivatedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contactPickerUI")(contactPickerUI)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("previousExecutionState")(previousExecutionState)
    __obj.updateDynamic("splashScreen")(splashScreen)
    __obj.asInstanceOf[IContactPickerActivatedEventArgs]
  }
}

