package typings.winrtDashUwp.Windows.ApplicationModel.Activation

import typings.winrtDashUwp.Windows.ApplicationModel.Calls.LockScreenCallUI
import typings.winrtDashUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides event information when communication to and from the lock screen is required. */
@JSGlobal("Windows.ApplicationModel.Activation.LockScreenCallActivatedEventArgs")
@js.native
abstract class LockScreenCallActivatedEventArgs () extends js.Object {
  /** Gets the arguments that are passed to the app to launch it. */
  var arguments: String = js.native
  /** Gets the UI that handles communication to and from the lock screen. */
  var callUI: LockScreenCallUI = js.native
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the identifier of the source that launched the app. */
  var tileId: String = js.native
  /** Gets the view switcher object that allows you to set the view for the application. */
  var viewSwitcher: ActivationViewSwitcher = js.native
}

