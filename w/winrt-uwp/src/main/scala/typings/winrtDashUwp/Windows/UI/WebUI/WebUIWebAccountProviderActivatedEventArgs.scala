package typings.winrtDashUwp.Windows.UI.WebUI

import typings.winrtDashUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtDashUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtDashUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtDashUwp.Windows.Security.Authentication.Web.Provider.IWebAccountProviderOperation
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

