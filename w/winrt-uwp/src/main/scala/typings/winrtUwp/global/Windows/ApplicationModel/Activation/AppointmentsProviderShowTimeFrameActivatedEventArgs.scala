package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when an app is activated to show a specified time frame on the user’s calendar. */
@JSGlobal("Windows.ApplicationModel.Activation.AppointmentsProviderShowTimeFrameActivatedEventArgs")
@js.native
abstract class AppointmentsProviderShowTimeFrameActivatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Activation.AppointmentsProviderShowTimeFrameActivatedEventArgs {
  
  /** Gets the duration of the time frame to be shown. */
  /* CompleteClass */
  var duration: Double = js.native
  
  /** Gets the activation type. */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  
  /** Gets the starting date and time of the time frame to be shown. */
  /* CompleteClass */
  var timeToShow: Date = js.native
  
  /** Gets the action to be performed by the appointments provider. */
  /* CompleteClass */
  var verb: String = js.native
}
