package typings.winrt.Windows.UI.WebUI

import typings.winrt.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrt.Windows.ApplicationModel.Activation.IFileOpenPickerActivatedEventArgs
import typings.winrt.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrt.Windows.Storage.Pickers.Provider.FileOpenPickerUI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebUIFileOpenPickerActivatedEventArgs
  extends StObject
     with IFileOpenPickerActivatedEventArgs
     with IActivatedEventArgsDeferral
object WebUIFileOpenPickerActivatedEventArgs {
  
  @scala.inline
  def apply(
    activatedOperation: ActivatedOperation,
    fileOpenPickerUI: FileOpenPickerUI,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): WebUIFileOpenPickerActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], fileOpenPickerUI = fileOpenPickerUI.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIFileOpenPickerActivatedEventArgs]
  }
}
