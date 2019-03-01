package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskSettingsActivatedEventArgs extends IActivatedEventArgs {
  var configuration: winrtLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.PrintTaskConfiguration
}

object IPrintTaskSettingsActivatedEventArgs {
  @scala.inline
  def apply(
    configuration: winrtLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.PrintTaskConfiguration,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): IPrintTaskSettingsActivatedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configuration")(configuration)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("previousExecutionState")(previousExecutionState)
    __obj.updateDynamic("splashScreen")(splashScreen)
    __obj.asInstanceOf[IPrintTaskSettingsActivatedEventArgs]
  }
}

