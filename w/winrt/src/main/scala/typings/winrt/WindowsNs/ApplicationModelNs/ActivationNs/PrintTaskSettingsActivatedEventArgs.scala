package typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs

import typings.winrt.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.PrintTaskConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Activation.PrintTaskSettingsActivatedEventArgs")
@js.native
class PrintTaskSettingsActivatedEventArgs () extends IPrintTaskSettingsActivatedEventArgs {
  /* CompleteClass */
  override var configuration: PrintTaskConfiguration = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

