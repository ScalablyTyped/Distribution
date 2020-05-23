package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.ApplicationModel.Calls.LockScreenCallUI
import typings.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides event information when communication to and from the lock screen is required. */
@JSGlobal("Windows.ApplicationModel.Activation.LockScreenCallActivatedEventArgs")
@js.native
abstract class LockScreenCallActivatedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Activation.LockScreenCallActivatedEventArgs {
  /** Gets the arguments that are passed to the app to launch it. */
  /* CompleteClass */
  override var arguments: String = js.native
  /** Gets the UI that handles communication to and from the lock screen. */
  /* CompleteClass */
  override var callUI: LockScreenCallUI = js.native
  /** Gets the identifier for the currently shown app view. */
  /* CompleteClass */
  override var currentlyShownApplicationViewId: Double = js.native
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  /** Gets the identifier of the source that launched the app. */
  /* CompleteClass */
  override var tileId: String = js.native
  /** Gets the view switcher object that allows you to set the view for the application. */
  /* CompleteClass */
  override var viewSwitcher: ActivationViewSwitcher = js.native
}

