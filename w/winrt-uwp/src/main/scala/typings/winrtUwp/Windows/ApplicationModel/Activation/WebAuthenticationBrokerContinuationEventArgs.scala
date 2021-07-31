package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information to an app that was launched after being suspended for a web authentication broker operation. */
trait WebAuthenticationBrokerContinuationEventArgs extends StObject {
  
  /** Gets a set of values populated by the app before a web authentication broker operation that deactivates the app in order to provide context when the app is activated. */
  var continuationData: ValueSet
  
  /** Gets the activation type. */
  var kind: ActivationKind
  
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  
  /** Gets a SplashScreen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
  
  /** Gets the WebAuthenticationResult object returned from the web authentication broker operation. */
  var webAuthenticationResult: WebAuthenticationResult
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
  implicit class WebAuthenticationBrokerContinuationEventArgsMutableBuilder[Self <: WebAuthenticationBrokerContinuationEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinuationData(value: ValueSet): Self = StObject.set(x, "continuationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAuthenticationResult(value: WebAuthenticationResult): Self = StObject.set(x, "webAuthenticationResult", value.asInstanceOf[js.Any])
  }
}
