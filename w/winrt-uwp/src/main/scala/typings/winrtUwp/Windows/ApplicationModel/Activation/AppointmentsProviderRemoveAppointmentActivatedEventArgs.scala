package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.RemoveAppointmentOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when an app is activated to remove an appointment from the user’s calendar. */
trait AppointmentsProviderRemoveAppointmentActivatedEventArgs extends StObject {
  
  /** Gets the activation type. */
  var kind: ActivationKind
  
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  
  /** Gets the appointment that is provided to the app when the user tries to remove it. */
  var removeAppointmentOperation: RemoveAppointmentOperation
  
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
  
  /** Gets the action to be performed by the appointments provider. */
  var verb: String
}
object AppointmentsProviderRemoveAppointmentActivatedEventArgs {
  
  inline def apply(
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    removeAppointmentOperation: RemoveAppointmentOperation,
    splashScreen: SplashScreen,
    verb: String
  ): AppointmentsProviderRemoveAppointmentActivatedEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], removeAppointmentOperation = removeAppointmentOperation.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentsProviderRemoveAppointmentActivatedEventArgs]
  }
  
  extension [Self <: AppointmentsProviderRemoveAppointmentActivatedEventArgs](x: Self) {
    
    inline def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    inline def setRemoveAppointmentOperation(value: RemoveAppointmentOperation): Self = StObject.set(x, "removeAppointmentOperation", value.asInstanceOf[js.Any])
    
    inline def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
    
    inline def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
  }
}
