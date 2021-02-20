package typings.winrtUwp.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the arguments related to activating a 3D print workflow. */
@js.native
trait WebUIPrint3DWorkflowActivatedEventArgs extends StObject {
  
  /** Gets the activated operation. */
  var activatedOperation: ActivatedOperation = js.native
  
  /** Gets the kind of activation. */
  var kind: ActivationKind = js.native
  
  /** Gets the previous execution state. */
  var previousExecutionState: ApplicationExecutionState = js.native
  
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  
  /** Gets the print workflow. */
  var workflow: Print3DWorkflow = js.native
}
object WebUIPrint3DWorkflowActivatedEventArgs {
  
  @scala.inline
  def apply(
    activatedOperation: ActivatedOperation,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    workflow: Print3DWorkflow
  ): WebUIPrint3DWorkflowActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], workflow = workflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIPrint3DWorkflowActivatedEventArgs]
  }
  
  @scala.inline
  implicit class WebUIPrint3DWorkflowActivatedEventArgsMutableBuilder[Self <: WebUIPrint3DWorkflowActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivatedOperation(value: ActivatedOperation): Self = StObject.set(x, "activatedOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflow(value: Print3DWorkflow): Self = StObject.set(x, "workflow", value.asInstanceOf[js.Any])
  }
}
