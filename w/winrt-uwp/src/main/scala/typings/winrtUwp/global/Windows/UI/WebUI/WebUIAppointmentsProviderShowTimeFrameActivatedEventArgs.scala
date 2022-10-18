package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when an app is activated to show a specified time frame on the user’s calendar. */
/* note: abstract class */ @JSGlobal("Windows.UI.WebUI.WebUIAppointmentsProviderShowTimeFrameActivatedEventArgs")
@js.native
open class WebUIAppointmentsProviderShowTimeFrameActivatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.UI.WebUI.WebUIAppointmentsProviderShowTimeFrameActivatedEventArgs {
  
  /** Gets the app activated operation. */
  /* CompleteClass */
  var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  
  /** Gets the duration of the time frame to be shown. */
  /* CompleteClass */
  var duration: Double = js.native
  
  /** Gets the activation type. */
  /* CompleteClass */
  var kind: ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: ApplicationExecutionState = js.native
  
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: SplashScreen = js.native
  
  /** Gets the starting date and time of the time frame to be shown. */
  /* CompleteClass */
  var timeToShow: js.Date = js.native
  
  /** Gets the action to be performed by the appointments provider. */
  /* CompleteClass */
  var verb: String = js.native
}
