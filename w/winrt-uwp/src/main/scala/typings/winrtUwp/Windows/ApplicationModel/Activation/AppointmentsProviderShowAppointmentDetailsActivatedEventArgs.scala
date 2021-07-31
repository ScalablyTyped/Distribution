package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when an app is activated to show the details of an appointment. */
trait AppointmentsProviderShowAppointmentDetailsActivatedEventArgs extends StObject {
  
  /** Gets the start date of the appointment instance for which the app should display details. */
  var instanceStartDate: Date
  
  /** Gets the activation type. */
  var kind: ActivationKind
  
  /** Gets the local identifier of the appointment for which the app should display details. */
  var localId: String
  
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  
  /** Gets the roaming identifier of the appointment for which the app should display details. */
  var roamingId: String
  
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
  
  /** Gets the action to be performed by the appointments provider. */
  var verb: String
}
object AppointmentsProviderShowAppointmentDetailsActivatedEventArgs {
  
  @scala.inline
  def apply(
    instanceStartDate: Date,
    kind: ActivationKind,
    localId: String,
    previousExecutionState: ApplicationExecutionState,
    roamingId: String,
    splashScreen: SplashScreen,
    verb: String
  ): AppointmentsProviderShowAppointmentDetailsActivatedEventArgs = {
    val __obj = js.Dynamic.literal(instanceStartDate = instanceStartDate.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], localId = localId.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], roamingId = roamingId.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentsProviderShowAppointmentDetailsActivatedEventArgs]
  }
  
  @scala.inline
  implicit class AppointmentsProviderShowAppointmentDetailsActivatedEventArgsMutableBuilder[Self <: AppointmentsProviderShowAppointmentDetailsActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceStartDate(value: Date): Self = StObject.set(x, "instanceStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoamingId(value: String): Self = StObject.set(x, "roamingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
  }
}
