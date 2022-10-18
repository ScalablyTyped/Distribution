package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when an app is activated to show the details of an appointment. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Activation.AppointmentsProviderShowAppointmentDetailsActivatedEventArgs")
@js.native
open class AppointmentsProviderShowAppointmentDetailsActivatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Activation.AppointmentsProviderShowAppointmentDetailsActivatedEventArgs {
  
  /** Gets the start date of the appointment instance for which the app should display details. */
  /* CompleteClass */
  var instanceStartDate: js.Date = js.native
  
  /** Gets the activation type. */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  
  /** Gets the local identifier of the appointment for which the app should display details. */
  /* CompleteClass */
  var localId: String = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  
  /** Gets the roaming identifier of the appointment for which the app should display details. */
  /* CompleteClass */
  var roamingId: String = js.native
  
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  
  /** Gets the action to be performed by the appointments provider. */
  /* CompleteClass */
  var verb: String = js.native
}
