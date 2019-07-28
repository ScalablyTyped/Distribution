package typings.winrtDashUwp.WindowsNs.UINs.WebUINs

import typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
import typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
import typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen
import typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.IWebAccountProviderOperation
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
  var kind: ActivationKind = js.native
  /** Gets the web account provider operation. */
  var operation: IWebAccountProviderOperation = js.native
  /** Gets the previous execution state of the app. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen. */
  var splashScreen: SplashScreen = js.native
}

