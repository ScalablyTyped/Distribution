package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to show the details of an appointment. */
@JSGlobal("Windows.ApplicationModel.Activation.AppointmentsProviderShowAppointmentDetailsActivatedEventArgs")
@js.native
abstract class AppointmentsProviderShowAppointmentDetailsActivatedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Activation.AppointmentsProviderShowAppointmentDetailsActivatedEventArgs {
  /** Gets the start date of the appointment instance for which the app should display details. */
  /* CompleteClass */
  override var instanceStartDate: Date = js.native
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  /** Gets the local identifier of the appointment for which the app should display details. */
  /* CompleteClass */
  override var localId: String = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  /** Gets the roaming identifier of the appointment for which the app should display details. */
  /* CompleteClass */
  override var roamingId: String = js.native
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  /** Gets the action to be performed by the appointments provider. */
  /* CompleteClass */
  override var verb: String = js.native
}

