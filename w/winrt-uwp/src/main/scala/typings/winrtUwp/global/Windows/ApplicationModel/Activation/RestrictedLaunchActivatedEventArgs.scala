package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides event information when a restricted app is launched. */
@JSGlobal("Windows.ApplicationModel.Activation.RestrictedLaunchActivatedEventArgs")
@js.native
abstract class RestrictedLaunchActivatedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Activation.RestrictedLaunchActivatedEventArgs {
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  /** Gets information about a shared context for the restricted launch. */
  /* CompleteClass */
  override var sharedContext: js.Any = js.native
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
}

