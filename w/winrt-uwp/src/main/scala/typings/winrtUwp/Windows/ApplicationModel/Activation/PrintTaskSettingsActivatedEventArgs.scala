package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Devices.Printers.Extensions.PrintTaskConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information in response to the event that is raised when print task settings are activated. */
trait PrintTaskSettingsActivatedEventArgs extends StObject {
  
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
  
  @scala.inline
  implicit class PrintTaskSettingsActivatedEventArgsMutableBuilder[Self <: PrintTaskSettingsActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: PrintTaskConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
  }
}
