package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information to an app that was launched after being suspended for a web authentication broker operation. */
@JSGlobal("Windows.UI.WebUI.WebUIWebAuthenticationBrokerContinuationEventArgs")
@js.native
abstract class WebUIWebAuthenticationBrokerContinuationEventArgs ()
  extends typings.winrtUwp.Windows.UI.WebUI.WebUIWebAuthenticationBrokerContinuationEventArgs {
  /** Gets the app activation operation. */
  /* CompleteClass */
  override var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  /** Gets a set of values populated by the app before a web authentication broker operation that deactivates the app in order to provide context when the app is activated. */
  /* CompleteClass */
  override var continuationData: ValueSet = js.native
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
  /** Gets the WebAuthenticationResult object returned from the web authentication broker operation. */
  /* CompleteClass */
  override var webAuthenticationResult: WebAuthenticationResult = js.native
}

