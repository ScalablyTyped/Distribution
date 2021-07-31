package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.ReplaceAppointmentOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when an app is activated to replace an appointment in the user’s calendar. */
@JSGlobal("Windows.ApplicationModel.Activation.AppointmentsProviderReplaceAppointmentActivatedEventArgs")
@js.native
abstract class AppointmentsProviderReplaceAppointmentActivatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Activation.AppointmentsProviderReplaceAppointmentActivatedEventArgs {
  
  /** Gets the activation type. */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  
  /** Gets the appointment that is provided to the app when the user tries to replace it. */
  /* CompleteClass */
  var replaceAppointmentOperation: ReplaceAppointmentOperation = js.native
  
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  
  /** Gets the action to be performed by the appointments provider. */
  /* CompleteClass */
  var verb: String = js.native
}
