package typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs

import typings.winrt.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.PrintTaskConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskSettingsActivatedEventArgs extends IActivatedEventArgs {
  var configuration: PrintTaskConfiguration
}

object IPrintTaskSettingsActivatedEventArgs {
  @scala.inline
  def apply(
    configuration: PrintTaskConfiguration,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): IPrintTaskSettingsActivatedEventArgs = {
    val __obj = js.Dynamic.literal(configuration = configuration, kind = kind, previousExecutionState = previousExecutionState, splashScreen = splashScreen)
  
    __obj.asInstanceOf[IPrintTaskSettingsActivatedEventArgs]
  }
}

