package typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs

import typings.winrt.WindowsNs.StorageNs.PickersNs.ProviderNs.FileOpenPickerUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileOpenPickerActivatedEventArgs extends IActivatedEventArgs {
  var fileOpenPickerUI: FileOpenPickerUI
}

object IFileOpenPickerActivatedEventArgs {
  @scala.inline
  def apply(
    fileOpenPickerUI: FileOpenPickerUI,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): IFileOpenPickerActivatedEventArgs = {
    val __obj = js.Dynamic.literal(fileOpenPickerUI = fileOpenPickerUI, kind = kind, previousExecutionState = previousExecutionState, splashScreen = splashScreen)
  
    __obj.asInstanceOf[IFileOpenPickerActivatedEventArgs]
  }
}

