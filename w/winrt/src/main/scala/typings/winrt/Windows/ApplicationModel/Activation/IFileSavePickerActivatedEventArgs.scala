package typings.winrt.Windows.ApplicationModel.Activation

import typings.winrt.Windows.Storage.Pickers.Provider.FileSavePickerUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileSavePickerActivatedEventArgs extends IActivatedEventArgs {
  var fileSavePickerUI: FileSavePickerUI
}

object IFileSavePickerActivatedEventArgs {
  @scala.inline
  def apply(
    fileSavePickerUI: FileSavePickerUI,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): IFileSavePickerActivatedEventArgs = {
    val __obj = js.Dynamic.literal(fileSavePickerUI = fileSavePickerUI, kind = kind, previousExecutionState = previousExecutionState, splashScreen = splashScreen)
  
    __obj.asInstanceOf[IFileSavePickerActivatedEventArgs]
  }
}

