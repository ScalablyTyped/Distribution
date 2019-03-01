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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("files")(files)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("previousExecutionState")(previousExecutionState)
    __obj.updateDynamic("splashScreen")(splashScreen)
    __obj.updateDynamic("verb")(verb)
    __obj.asInstanceOf[IFileActivatedEventArgs]
  }
}

