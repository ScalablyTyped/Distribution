package typings.winrt.Windows.ApplicationModel.Activation

import typings.winrt.Windows.Storage.Pickers.Provider.FileOpenPickerUI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileOpenPickerActivatedEventArgs extends IActivatedEventArgs {
  
  var fileOpenPickerUI: FileOpenPickerUI = js.native
}
object IFileOpenPickerActivatedEventArgs {
  
  @scala.inline
  def apply(
    fileOpenPickerUI: FileOpenPickerUI,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): IFileOpenPickerActivatedEventArgs = {
    val __obj = js.Dynamic.literal(fileOpenPickerUI = fileOpenPickerUI.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileOpenPickerActivatedEventArgs]
  }
  
  @scala.inline
  implicit class IFileOpenPickerActivatedEventArgsMutableBuilder[Self <: IFileOpenPickerActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileOpenPickerUI(value: FileOpenPickerUI): Self = StObject.set(x, "fileOpenPickerUI", value.asInstanceOf[js.Any])
  }
}
