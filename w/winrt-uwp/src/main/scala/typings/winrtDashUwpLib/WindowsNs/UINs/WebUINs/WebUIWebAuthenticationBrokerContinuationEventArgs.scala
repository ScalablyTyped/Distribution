package typings
package winrtDashUwpLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information to an app that was launched after being suspended for a web authentication broker operation. */
@JSGlobal("Windows.UI.WebUI.WebUIWebAuthenticationBrokerContinuationEventArgs")
@js.native
abstract class WebUIWebAuthenticationBrokerContinuationEventArgs () extends js.Object {
  /** Gets the app activation operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets a set of values populated by the app before a web authentication broker operation that deactivates the app in order to provide context when the app is activated. */
  var continuationData: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet = js.native
  /** Gets the activation type. */
  var kind: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen = js.native
  /** Gets the WebAuthenticationResult object returned from the web authentication broker operation. */
  var webAuthenticationResult: winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationResult = js.native
}

