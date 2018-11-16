package typings
package winrtDashUwpLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents arguments used when the lock screen is activated. */
@JSGlobal("Windows.UI.WebUI.WebUILockScreenActivatedEventArgs")
@js.native
abstract class WebUILockScreenActivatedEventArgs () extends js.Object {
  /** Gets the object that manages an app activation operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: scala.Double = js.native
  /** Gets information about the app activation operation. */
  var info: js.Any = js.native
  /** Gets and activation kind for the app activation operation. */
  var kind: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind = js.native
  /** Gets the previous execution state. */
  var previousExecutionState: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen = js.native
}

