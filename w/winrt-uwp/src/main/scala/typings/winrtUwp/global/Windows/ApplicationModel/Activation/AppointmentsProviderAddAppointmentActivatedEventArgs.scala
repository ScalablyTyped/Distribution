package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.AddAppointmentOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to add an appointment to the user’s calendar. */
@JSGlobal("Windows.ApplicationModel.Activation.AppointmentsProviderAddAppointmentActivatedEventArgs")
@js.native
abstract class AppointmentsProviderAddAppointmentActivatedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Activation.AppointmentsProviderAddAppointmentActivatedEventArgs {
  /** Gets the appointment that is provided to the app when the user tries to add it. */
  /* CompleteClass */
  override var addAppointmentOperation: AddAppointmentOperation = js.native
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  /** Gets the action to be performed by the appointments provider. */
  /* CompleteClass */
  override var verb: String = js.native
}

