package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileSavePickerActivatedEventArgs extends IActivatedEventArgs {
  var fileSavePickerUI: winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs.FileSavePickerUI
}

object IFileSavePickerActivatedEventArgs {
  @scala.inline
  def apply(
    fileSavePickerUI: winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs.FileSavePickerUI,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): IFileSavePickerActivatedEventArgs = {
    val __obj = js.Dynamic.literal(fileSavePickerUI = fileSavePickerUI, kind = kind, previousExecutionState = previousExecutionState, splashScreen = splashScreen)
  
    __obj.asInstanceOf[IFileSavePickerActivatedEventArgs]
  }
}

