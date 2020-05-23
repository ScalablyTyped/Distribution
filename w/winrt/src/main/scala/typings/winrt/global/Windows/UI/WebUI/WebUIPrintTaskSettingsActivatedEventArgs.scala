package typings.winrt.global.Windows.UI.WebUI

import typings.winrt.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrt.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.WebUIPrintTaskSettingsActivatedEventArgs")
@js.native
class WebUIPrintTaskSettingsActivatedEventArgs ()
  extends typings.winrt.Windows.UI.WebUI.WebUIPrintTaskSettingsActivatedEventArgs {
  /* CompleteClass */
  override var activatedOperation: typings.winrt.Windows.UI.WebUI.ActivatedOperation = js.native
  /* CompleteClass */
  override var configuration: PrintTaskConfiguration = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

