package typings.winrt.Windows.ApplicationModel.Activation

import typings.winrt.Windows.Storage.Pickers.Provider.FileOpenPickerUI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileOpenPickerActivatedEventArgs
  extends StObject
     with IFileOpenPickerActivatedEventArgs
object FileOpenPickerActivatedEventArgs {
  
  @scala.inline
  def apply(
    fileOpenPickerUI: FileOpenPickerUI,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): FileOpenPickerActivatedEventArgs = {
    val __obj = js.Dynamic.literal(fileOpenPickerUI = fileOpenPickerUI.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileOpenPickerActivatedEventArgs]
  }
}
