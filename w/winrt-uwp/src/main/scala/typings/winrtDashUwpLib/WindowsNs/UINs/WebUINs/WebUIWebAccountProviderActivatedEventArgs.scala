package typings
package winrtDashUwpLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the arguments involved in activated a web account provider. */
@JSGlobal("Windows.UI.WebUI.WebUIWebAccountProviderActivatedEventArgs")
@js.native
abstract class WebUIWebAccountProviderActivatedEventArgs () extends js.Object {
  /** Gets the activated operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the kind of activation. */
  var kind: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind = js.native
  /** Gets the web account provider operation. */
  var operation: winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.IWebAccountProviderOperation = js.native
  /** Gets the previous execution state of the app. */
  var previousExecutionState: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState = js.native
  /** Gets the splash screen. */
  var splashScreen: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen = js.native
}

