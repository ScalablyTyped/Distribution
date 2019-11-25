package typings.winrt.Windows.ApplicationModel.Activation

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Storage.IStorageItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileActivatedEventArgs extends IActivatedEventArgs {
  var files: IVectorView[IStorageItem]
  var verb: String
}

object IFileActivatedEventArgs {
  @scala.inline
  def apply(
    files: IVectorView[IStorageItem],
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    verb: String
  ): IFileActivatedEventArgs = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFileActivatedEventArgs]
  }
}

