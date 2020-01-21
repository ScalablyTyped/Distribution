package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Security.Authentication.Web.Provider.IWebAccountProviderOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information to an app activated as a result of a web account provider operation. */
@JSGlobal("Windows.ApplicationModel.Activation.WebAccountProviderActivatedEventArgs")
@js.native
abstract class WebAccountProviderActivatedEventArgs () extends js.Object {
  /** Gets the kind of web account provider activation. */
  var kind: ActivationKind = js.native
  /** Gets the web account provider operation. */
  var operation: IWebAccountProviderOperation = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}

