package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Devices.Printers.Extensions.PrintTaskConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information in response to the event that is raised when print task settings are activated. */
trait PrintTaskSettingsActivatedEventArgs extends js.Object {
  /** Gets the configuration information for the print task. */
  var configuration: PrintTaskConfiguration
  /** Gets the activation type for the print task settings. */
  var kind: ActivationKind
  /** Gets the execution state of the app before the settings were activated. */
  var previousExecutionState: ApplicationExecutionState
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
}

object PrintTaskSettingsActivatedEventArgs {
  @scala.inline
  def apply(
    configuration: PrintTaskConfiguration,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): PrintTaskSettingsActivatedEventArgs = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskSettingsActivatedEventArgs]
  }
}

