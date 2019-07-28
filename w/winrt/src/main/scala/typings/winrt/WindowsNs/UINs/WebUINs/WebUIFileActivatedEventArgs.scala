package typings.winrt.WindowsNs.UINs.WebUINs

import typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
import typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
import typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.IFileActivatedEventArgs
import typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.StorageNs.IStorageItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.WebUIFileActivatedEventArgs")
@js.native
class WebUIFileActivatedEventArgs ()
  extends IFileActivatedEventArgs
     with IActivatedEventArgsDeferral {
  /* CompleteClass */
  override var activatedOperation: ActivatedOperation = js.native
  /* CompleteClass */
  override var files: IVectorView[IStorageItem] = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
  /* CompleteClass */
  override var verb: String = js.native
}

