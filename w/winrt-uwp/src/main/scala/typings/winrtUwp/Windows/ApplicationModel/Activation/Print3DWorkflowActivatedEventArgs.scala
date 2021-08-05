package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an event that occurs when the app is launched as a 3D printing workflow. */
trait Print3DWorkflowActivatedEventArgs extends StObject {
  
  /** Gets the activation type. */
  var kind: ActivationKind
  
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
  
  /** Gets a customized printing experience for a 3D printer. */
  var workflow: Print3DWorkflow
}
object Print3DWorkflowActivatedEventArgs {
  
  inline def apply(
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    workflow: Print3DWorkflow
  ): Print3DWorkflowActivatedEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], workflow = workflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Print3DWorkflowActivatedEventArgs]
  }
  
  extension [Self <: Print3DWorkflowActivatedEventArgs](x: Self) {
    
    inline def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    inline def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
    
    inline def setWorkflow(value: Print3DWorkflow): Self = StObject.set(x, "workflow", value.asInstanceOf[js.Any])
  }
}
