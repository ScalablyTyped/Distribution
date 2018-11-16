package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to add an appointment to the user’s calendar. */
@JSGlobal("Windows.ApplicationModel.Activation.AppointmentsProviderAddAppointmentActivatedEventArgs")
@js.native
abstract class AppointmentsProviderAddAppointmentActivatedEventArgs () extends js.Object {
  /** Gets the appointment that is provided to the app when the user tries to add it. */
  var addAppointmentOperation: winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentsProviderNs.AddAppointmentOperation = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the action to be performed by the appointments provider. */
  var verb: java.lang.String = js.native
}

