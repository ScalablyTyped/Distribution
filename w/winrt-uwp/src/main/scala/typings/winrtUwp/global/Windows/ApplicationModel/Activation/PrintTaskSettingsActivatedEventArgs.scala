package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Devices.Printers.Extensions.PrintTaskConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information in response to the event that is raised when print task settings are activated. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Activation.PrintTaskSettingsActivatedEventArgs")
@js.native
open class PrintTaskSettingsActivatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Activation.PrintTaskSettingsActivatedEventArgs {
  
  /** Gets the configuration information for the print task. */
  /* CompleteClass */
  var configuration: PrintTaskConfiguration = js.native
  
  /** Gets the activation type for the print task settings. */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  
  /** Gets the execution state of the app before the settings were activated. */
  /* CompleteClass */
  var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
}
