package typings
package winrtDashUwpLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to show the details of an appointment. */
@JSGlobal("Windows.UI.WebUI.WebUIAppointmentsProviderShowAppointmentDetailsActivatedEventArgs")
@js.native
abstract class WebUIAppointmentsProviderShowAppointmentDetailsActivatedEventArgs () extends js.Object {
  /** Gets the app activation operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the start date of the appointment instance for which the app should display details. */
  var instanceStartDate: stdLib.Date = js.native
  /** Gets the activation type. */
  var kind: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind = js.native
  /** Gets the local identifier of the appointment for which the app should display details. */
  var localId: java.lang.String = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState = js.native
  /** Gets the roaming identifier of the appointment for which the app should display details. */
  var roamingId: java.lang.String = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen = js.native
  /** Gets the action to be performed by the appointments provider. */
  var verb: java.lang.String = js.native
}

