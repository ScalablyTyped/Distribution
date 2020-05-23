package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated from another app by using the DIAL protocol. */
trait DialReceiverActivatedEventArgs extends js.Object {
  /** Gets the name of the app that invoked the dial receiver app. */
  var appName: String
  /** Gets the arguments passed by the calling app. */
  var arguments: String
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double
  /** Gets the activation type. */
  var kind: ActivationKind
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
  /** Gets the unique tile identifier for the calling app. */
  var tileId: String
  /** Gets the view switcher object that allows you to set the view for the application. */
  var viewSwitcher: ActivationViewSwitcher
}

object DialReceiverActivatedEventArgs {
  @scala.inline
  def apply(
    appName: String,
    arguments: String,
    currentlyShownApplicationViewId: Double,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    tileId: String,
    viewSwitcher: ActivationViewSwitcher
  ): DialReceiverActivatedEventArgs = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], arguments = arguments.asInstanceOf[js.Any], currentlyShownApplicationViewId = currentlyShownApplicationViewId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], tileId = tileId.asInstanceOf[js.Any], viewSwitcher = viewSwitcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialReceiverActivatedEventArgs]
  }
}

