package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to show a specified time frame on the user’s calendar. */
@JSGlobal("Windows.ApplicationModel.Activation.AppointmentsProviderShowTimeFrameActivatedEventArgs")
@js.native
abstract class AppointmentsProviderShowTimeFrameActivatedEventArgs () extends js.Object {
  /** Gets the duration of the time frame to be shown. */
  var duration: Double = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the starting date and time of the time frame to be shown. */
  var timeToShow: Date = js.native
  /** Gets the action to be performed by the appointments provider. */
  var verb: String = js.native
}

