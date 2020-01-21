package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Devices.Printers.Extensions.PrintTaskConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information in response to the event that is raised when print task settings are activated. */
@JSGlobal("Windows.ApplicationModel.Activation.PrintTaskSettingsActivatedEventArgs")
@js.native
abstract class PrintTaskSettingsActivatedEventArgs () extends js.Object {
  /** Gets the configuration information for the print task. */
  var configuration: PrintTaskConfiguration = js.native
  /** Gets the activation type for the print task settings. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before the settings were activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}

