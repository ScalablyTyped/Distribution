package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Security.Authentication.Web.Provider.IWebAccountProviderOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information to an app activated as a result of a web account provider operation. */
@JSGlobal("Windows.ApplicationModel.Activation.WebAccountProviderActivatedEventArgs")
@js.native
abstract class WebAccountProviderActivatedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Activation.WebAccountProviderActivatedEventArgs {
  /** Gets the kind of web account provider activation. */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  /** Gets the web account provider operation. */
  /* CompleteClass */
  override var operation: IWebAccountProviderOperation = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
}

