package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.Security.Authentication.Web.Provider.IWebAccountProviderOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the arguments involved in activated a web account provider. */
@JSGlobal("Windows.UI.WebUI.WebUIWebAccountProviderActivatedEventArgs")
@js.native
abstract class WebUIWebAccountProviderActivatedEventArgs ()
  extends typings.winrtUwp.Windows.UI.WebUI.WebUIWebAccountProviderActivatedEventArgs {
  /** Gets the activated operation. */
  /* CompleteClass */
  override var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  /** Gets the kind of activation. */
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /** Gets the web account provider operation. */
  /* CompleteClass */
  override var operation: IWebAccountProviderOperation = js.native
  /** Gets the previous execution state of the app. */
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen. */
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

