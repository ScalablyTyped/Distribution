package typings.winrtUwp.Windows.ApplicationModel.Activation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an event that occurs when the app is activated as the lock screen. */
@JSGlobal("Windows.ApplicationModel.Activation.LockScreenActivatedEventArgs")
@js.native
abstract class LockScreenActivatedEventArgs () extends js.Object {
  /** Gets an object that allows an app that is activated as the lock screen to get the same data that the default lock screen can access, and to register for updates to that data. */
  var info: js.Any = js.native
  /** Gets the reason for the activation of the app for this event. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before the app was activated as the lock screen. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}

