package typings.winrt.global.Windows.UI.WebUI

import typings.winrt.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrt.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Storage.IStorageItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.WebUIFileActivatedEventArgs")
@js.native
class WebUIFileActivatedEventArgs ()
  extends typings.winrt.Windows.UI.WebUI.WebUIFileActivatedEventArgs {
  /* CompleteClass */
  override var activatedOperation: typings.winrt.Windows.UI.WebUI.ActivatedOperation = js.native
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

