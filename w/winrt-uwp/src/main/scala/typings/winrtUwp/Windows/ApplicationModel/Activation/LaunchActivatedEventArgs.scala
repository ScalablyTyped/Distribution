package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides event information when an app is launched. */
trait LaunchActivatedEventArgs extends js.Object {
  /** Gets the arguments that are passed to the app during its launch activation. */
  var arguments: String
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double
  /** Gets the reason that this app is being activated. */
  var kind: ActivationKind
  /** Indicates whether the app was pre-launched. */
  var prelaunchActivated: Boolean
  /** Gets the execution state of the app before this activation. */
  var previousExecutionState: ApplicationExecutionState
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
  /** Gets the ID of the tile that was invoked to launch the app. */
  var tileId: String
  /** Gets the view switcher object that allows you to set the view for the application. */
  var viewSwitcher: ActivationViewSwitcher
}

object LaunchActivatedEventArgs {
  @scala.inline
  def apply(
    arguments: String,
    currentlyShownApplicationViewId: Double,
    kind: ActivationKind,
    prelaunchActivated: Boolean,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    tileId: String,
    viewSwitcher: ActivationViewSwitcher
  ): LaunchActivatedEventArgs = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], currentlyShownApplicationViewId = currentlyShownApplicationViewId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], prelaunchActivated = prelaunchActivated.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], tileId = tileId.asInstanceOf[js.Any], viewSwitcher = viewSwitcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchActivatedEventArgs]
  }
}

