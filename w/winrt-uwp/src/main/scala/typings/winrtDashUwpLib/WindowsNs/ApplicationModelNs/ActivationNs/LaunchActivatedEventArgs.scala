package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides event information when an app is launched. */
@JSGlobal("Windows.ApplicationModel.Activation.LaunchActivatedEventArgs")
@js.native
abstract class LaunchActivatedEventArgs () extends js.Object {
  /** Gets the arguments that are passed to the app during its launch activation. */
  var arguments: java.lang.String = js.native
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: scala.Double = js.native
  /** Gets the reason that this app is being activated. */
  var kind: ActivationKind = js.native
  /** Indicates whether the app was pre-launched. */
  var prelaunchActivated: scala.Boolean = js.native
  /** Gets the execution state of the app before this activation. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the ID of the tile that was invoked to launch the app. */
  var tileId: java.lang.String = js.native
  /** Gets the view switcher object that allows you to set the view for the application. */
  var viewSwitcher: winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ActivationViewSwitcher = js.native
}

