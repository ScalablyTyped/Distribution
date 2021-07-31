package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the arguments related to activating a 3D print workflow. */
@JSGlobal("Windows.UI.WebUI.WebUIPrint3DWorkflowActivatedEventArgs")
@js.native
abstract class WebUIPrint3DWorkflowActivatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.UI.WebUI.WebUIPrint3DWorkflowActivatedEventArgs {
  
  /** Gets the activated operation. */
  /* CompleteClass */
  var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  
  /** Gets the kind of activation. */
  /* CompleteClass */
  var kind: ActivationKind = js.native
  
  /** Gets the previous execution state. */
  /* CompleteClass */
  var previousExecutionState: ApplicationExecutionState = js.native
  
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: SplashScreen = js.native
  
  /** Gets the print workflow. */
  /* CompleteClass */
  var workflow: Print3DWorkflow = js.native
}
