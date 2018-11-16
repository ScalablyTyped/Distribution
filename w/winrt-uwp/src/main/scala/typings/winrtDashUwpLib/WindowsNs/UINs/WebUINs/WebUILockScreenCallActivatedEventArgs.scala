package typings
package winrtDashUwpLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides event information when communication to and from the lock screen is required. */
@JSGlobal("Windows.UI.WebUI.WebUILockScreenCallActivatedEventArgs")
@js.native
abstract class WebUILockScreenCallActivatedEventArgs () extends js.Object {
  /** Gets the app activated operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the arguments that are passed to the app during its launch activation. */
  var arguments: java.lang.String = js.native
  /** Gets the UI that handles communication to and from the lock screen. */
  var callUI: winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.LockScreenCallUI = js.native
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: scala.Double = js.native
  /** Gets the activation type. */
  var kind: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState = js.native
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen = js.native
  /** Gets the identifier of the source that launched the app. */
  var tileId: java.lang.String = js.native
}

