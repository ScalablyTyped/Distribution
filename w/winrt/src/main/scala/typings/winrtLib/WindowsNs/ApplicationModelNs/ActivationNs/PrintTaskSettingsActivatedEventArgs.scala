package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Activation.PrintTaskSettingsActivatedEventArgs")
@js.native
class PrintTaskSettingsActivatedEventArgs () extends IPrintTaskSettingsActivatedEventArgs {
  /* CompleteClass */
  override var configuration: winrtLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.PrintTaskConfiguration = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

