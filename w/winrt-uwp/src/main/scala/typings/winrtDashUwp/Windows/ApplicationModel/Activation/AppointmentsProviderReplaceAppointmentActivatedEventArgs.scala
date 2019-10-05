package typings.winrtDashUwp.Windows.ApplicationModel.Activation

import typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.ReplaceAppointmentOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to replace an appointment in the user’s calendar. */
@JSGlobal("Windows.ApplicationModel.Activation.AppointmentsProviderReplaceAppointmentActivatedEventArgs")
@js.native
abstract class AppointmentsProviderReplaceAppointmentActivatedEventArgs () extends js.Object {
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the appointment that is provided to the app when the user tries to replace it. */
  var replaceAppointmentOperation: ReplaceAppointmentOperation = js.native
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the action to be performed by the appointments provider. */
  var verb: String = js.native
}

