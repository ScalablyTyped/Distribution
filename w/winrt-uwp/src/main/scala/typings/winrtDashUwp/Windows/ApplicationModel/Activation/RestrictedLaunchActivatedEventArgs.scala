package typings.winrtDashUwp.Windows.ApplicationModel.Activation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides event information when a restricted app is launched. */
@JSGlobal("Windows.ApplicationModel.Activation.RestrictedLaunchActivatedEventArgs")
@js.native
abstract class RestrictedLaunchActivatedEventArgs () extends js.Object {
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets information about a shared context for the restricted launch. */
  var sharedContext: js.Any = js.native
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}

