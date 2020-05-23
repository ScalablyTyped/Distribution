package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides event information when an app is launched. */
@JSGlobal("Windows.ApplicationModel.Activation.LaunchActivatedEventArgs")
@js.native
abstract class LaunchActivatedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Activation.LaunchActivatedEventArgs {
  /** Gets the arguments that are passed to the app during its launch activation. */
  /* CompleteClass */
  override var arguments: String = js.native
  /** Gets the identifier for the currently shown app view. */
  /* CompleteClass */
  override var currentlyShownApplicationViewId: Double = js.native
  /** Gets the reason that this app is being activated. */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  /** Indicates whether the app was pre-launched. */
  /* CompleteClass */
  override var prelaunchActivated: Boolean = js.native
  /** Gets the execution state of the app before this activation. */
  /* CompleteClass */
  override var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  /** Gets the ID of the tile that was invoked to launch the app. */
  /* CompleteClass */
  override var tileId: String = js.native
  /** Gets the view switcher object that allows you to set the view for the application. */
  /* CompleteClass */
  override var viewSwitcher: ActivationViewSwitcher = js.native
}

