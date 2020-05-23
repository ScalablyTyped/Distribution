package typings.winrt.global.Windows.UI.WebUI

import typings.winrt.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrt.Windows.ApplicationModel.Activation.SplashScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.WebUISearchActivatedEventArgs")
@js.native
class WebUISearchActivatedEventArgs ()
  extends typings.winrt.Windows.UI.WebUI.WebUISearchActivatedEventArgs {
  /* CompleteClass */
  override var activatedOperation: typings.winrt.Windows.UI.WebUI.ActivatedOperation = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var language: String = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var queryText: String = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

