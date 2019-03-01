package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileOpenPickerActivatedEventArgs extends IActivatedEventArgs {
  var fileOpenPickerUI: winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs.FileOpenPickerUI
}

object IFileOpenPickerActivatedEventArgs {
  @scala.inline
  def apply(
    fileOpenPickerUI: winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs.FileOpenPickerUI,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): IFileOpenPickerActivatedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileOpenPickerUI")(fileOpenPickerUI)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("previousExecutionState")(previousExecutionState)
    __obj.updateDynamic("splashScreen")(splashScreen)
    __obj.asInstanceOf[IFileOpenPickerActivatedEventArgs]
  }
}

