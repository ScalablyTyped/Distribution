package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.AddAppointmentOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to add an appointment to the user’s calendar. */
trait AppointmentsProviderAddAppointmentActivatedEventArgs extends js.Object {
  /** Gets the appointment that is provided to the app when the user tries to add it. */
  var addAppointmentOperation: AddAppointmentOperation
  /** Gets the activation type. */
  var kind: ActivationKind
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
  /** Gets the action to be performed by the appointments provider. */
  var verb: String
}

object AppointmentsProviderAddAppointmentActivatedEventArgs {
  @scala.inline
  def apply(
    addAppointmentOperation: AddAppointmentOperation,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    verb: String
  ): AppointmentsProviderAddAppointmentActivatedEventArgs = {
    val __obj = js.Dynamic.literal(addAppointmentOperation = addAppointmentOperation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentsProviderAddAppointmentActivatedEventArgs]
  }
}

