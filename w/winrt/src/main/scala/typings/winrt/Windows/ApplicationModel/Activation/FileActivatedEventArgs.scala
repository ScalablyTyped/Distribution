package typings.winrt.Windows.ApplicationModel.Activation

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Storage.IStorageItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileActivatedEventArgs
  extends StObject
     with IFileActivatedEventArgs
object FileActivatedEventArgs {
  
  @scala.inline
  def apply(
    files: IVectorView[IStorageItem],
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    verb: String
  ): FileActivatedEventArgs = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileActivatedEventArgs]
  }
}
