package typings.winrt.Windows.UI.WebUI

import typings.winrt.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrt.Windows.ApplicationModel.Activation.IPrintTaskSettingsActivatedEventArgs
import typings.winrt.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebUIPrintTaskSettingsActivatedEventArgs
  extends StObject
     with IPrintTaskSettingsActivatedEventArgs
     with IActivatedEventArgsDeferral
object WebUIPrintTaskSettingsActivatedEventArgs {
  
  inline def apply(
    activatedOperation: ActivatedOperation,
    configuration: PrintTaskConfiguration,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): WebUIPrintTaskSettingsActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIPrintTaskSettingsActivatedEventArgs]
  }
}
