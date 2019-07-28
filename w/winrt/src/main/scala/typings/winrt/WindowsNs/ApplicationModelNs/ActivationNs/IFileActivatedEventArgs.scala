package typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.StorageNs.IStorageItem
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
    val __obj = js.Dynamic.literal(files = files, kind = kind, previousExecutionState = previousExecutionState, splashScreen = splashScreen, verb = verb)
  
    __obj.asInstanceOf[IFileActivatedEventArgs]
  }
}

