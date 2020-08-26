package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information to an app that was launched after being suspended for a web authentication broker operation. */
@js.native
trait WebAuthenticationBrokerContinuationEventArgs extends js.Object {
  /** Gets a set of values populated by the app before a web authentication broker operation that deactivates the app in order to provide context when the app is activated. */
  var continuationData: ValueSet = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets a SplashScreen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the WebAuthenticationResult object returned from the web authentication broker operation. */
  var webAuthenticationResult: WebAuthenticationResult = js.native
}

object WebAuthenticationBrokerContinuationEventArgs {
  @scala.inline
  def apply(
    continuationData: ValueSet,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    webAuthenticationResult: WebAuthenticationResult
  ): WebAuthenticationBrokerContinuationEventArgs = {
    val __obj = js.Dynamic.literal(continuationData = continuationData.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], webAuthenticationResult = webAuthenticationResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAuthenticationBrokerContinuationEventArgs]
  }
  @scala.inline
  implicit class WebAuthenticationBrokerContinuationEventArgsOps[Self <: WebAuthenticationBrokerContinuationEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContinuationData(value: ValueSet): Self = this.set("continuationData", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: ActivationKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = this.set("previousExecutionState", value.asInstanceOf[js.Any])
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = this.set("splashScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebAuthenticationResult(value: WebAuthenticationResult): Self = this.set("webAuthenticationResult", value.asInstanceOf[js.Any])
  }
  
}

