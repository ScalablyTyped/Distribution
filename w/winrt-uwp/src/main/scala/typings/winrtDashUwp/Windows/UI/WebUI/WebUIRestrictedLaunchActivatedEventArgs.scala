package typings.winrtDashUwp.Windows.UI.WebUI

import typings.winrtDashUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtDashUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtDashUwp.Windows.ApplicationModel.Activation.SplashScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides event information when a restricted app is launched. */
@JSGlobal("Windows.UI.WebUI.WebUIRestrictedLaunchActivatedEventArgs")
@js.native
abstract class WebUIRestrictedLaunchActivatedEventArgs () extends js.Object {
  /** Gets the app activated operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets information about a shared context for the restricted launch. */
  var sharedContext: js.Any = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}

