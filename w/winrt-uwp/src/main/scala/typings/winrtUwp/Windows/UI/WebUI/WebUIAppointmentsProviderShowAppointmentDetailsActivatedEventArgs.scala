package typings.winrtUwp.Windows.UI.WebUI

import typings.std.Date
import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to show the details of an appointment. */
trait WebUIAppointmentsProviderShowAppointmentDetailsActivatedEventArgs extends js.Object {
  /** Gets the app activation operation. */
  var activatedOperation: ActivatedOperation
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
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
  /** Gets the action to be performed by the appointments provider. */
  var verb: String
}

object WebUIAppointmentsProviderShowAppointmentDetailsActivatedEventArgs {
  @scala.inline
  def apply(
    activatedOperation: ActivatedOperation,
    instanceStartDate: Date,
    kind: ActivationKind,
    localId: String,
    previousExecutionState: ApplicationExecutionState,
    roamingId: String,
    splashScreen: SplashScreen,
    verb: String
  ): WebUIAppointmentsProviderShowAppointmentDetailsActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], instanceStartDate = instanceStartDate.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], localId = localId.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], roamingId = roamingId.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIAppointmentsProviderShowAppointmentDetailsActivatedEventArgs]
  }
}

