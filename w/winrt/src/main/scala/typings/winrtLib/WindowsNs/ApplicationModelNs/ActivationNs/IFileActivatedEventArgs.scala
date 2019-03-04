package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileActivatedEventArgs extends IActivatedEventArgs {
  var files: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.StorageNs.IStorageItem]
  var verb: java.lang.String
}

object IFileActivatedEventArgs {
  @scala.inline
  def apply(
    files: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.StorageNs.IStorageItem],
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    verb: java.lang.String
  ): IFileActivatedEventArgs = {
    val __obj = js.Dynamic.literal(files = files, kind = kind, previousExecutionState = previousExecutionState, splashScreen = splashScreen, verb = verb)
  
    __obj.asInstanceOf[IFileActivatedEventArgs]
  }
}

