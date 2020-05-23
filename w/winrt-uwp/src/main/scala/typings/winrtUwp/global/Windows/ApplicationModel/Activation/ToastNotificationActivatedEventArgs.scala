package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an event that occurs when the app is activated because a user tapped on the body of a toast notification or performed an action inside a toast notification. */
@JSGlobal("Windows.ApplicationModel.Activation.ToastNotificationActivatedEventArgs")
@js.native
abstract class ToastNotificationActivatedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Activation.ToastNotificationActivatedEventArgs {
  /** Gets the arguments that the app can retrieve after it is activated through an interactive toast notification. */
  /* CompleteClass */
  override var argument: String = js.native
  /** Gets the reason for the activation of the app for this event. */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  /** Gets the execution state of the app before the app was activated because a user tapped on the body of a toast notification or performed an action inside a toast notification. */
  /* CompleteClass */
  override var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  /** Gets a set of values that you can use to obtain the user input from an interactive toast notification. */
  /* CompleteClass */
  override var userInput: ValueSet = js.native
}

