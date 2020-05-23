package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.ReplaceAppointmentOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to replace an appointment in the user’s calendar. */
trait AppointmentsProviderReplaceAppointmentActivatedEventArgs extends js.Object {
  /** Gets the activation type. */
  var kind: ActivationKind
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  /** Gets the appointment that is provided to the app when the user tries to replace it. */
  var replaceAppointmentOperation: ReplaceAppointmentOperation
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
  /** Gets the action to be performed by the appointments provider. */
  var verb: String
}

object AppointmentsProviderReplaceAppointmentActivatedEventArgs {
  @scala.inline
  def apply(
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    replaceAppointmentOperation: ReplaceAppointmentOperation,
    splashScreen: SplashScreen,
    verb: String
  ): AppointmentsProviderReplaceAppointmentActivatedEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], replaceAppointmentOperation = replaceAppointmentOperation.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentsProviderReplaceAppointmentActivatedEventArgs]
  }
}

