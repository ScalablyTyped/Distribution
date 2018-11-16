package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Activation.FileActivatedEventArgs")
@js.native
class FileActivatedEventArgs () extends IFileActivatedEventArgs {
  /* CompleteClass */
  override var files: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.StorageNs.IStorageItem] = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
  /* CompleteClass */
  override var verb: java.lang.String = js.native
}

