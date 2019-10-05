package typings.winrt.Windows.ApplicationModel.Activation

import typings.winrt.Windows.Storage.Pickers.Provider.FileOpenPickerUI
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

