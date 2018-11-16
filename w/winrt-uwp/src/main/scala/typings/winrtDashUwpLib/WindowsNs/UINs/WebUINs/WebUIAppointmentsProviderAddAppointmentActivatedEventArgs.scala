package typings
package winrtDashUwpLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to add an appointment to the user’s calendar. */
@JSGlobal("Windows.UI.WebUI.WebUIAppointmentsProviderAddAppointmentActivatedEventArgs")
@js.native
abstract class WebUIAppointmentsProviderAddAppointmentActivatedEventArgs () extends js.Object {
  /** Gets the app activated operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the appointment that is provided to the app when the user tries to add it. */
  var addAppointmentOperation: winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentsProviderNs.AddAppointmentOperation = js.native
  /** Gets the activation type. */
  var kind: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen = js.native
  /** Gets the action to be performed by the appointments provider. */
  var verb: java.lang.String = js.native
}

