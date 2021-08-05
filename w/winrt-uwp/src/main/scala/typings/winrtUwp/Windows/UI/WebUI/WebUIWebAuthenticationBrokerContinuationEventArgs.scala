package typings.winrtUwp.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information to an app that was launched after being suspended for a web authentication broker operation. */
trait WebUIWebAuthenticationBrokerContinuationEventArgs extends StObject {
  
  /** Gets the app activation operation. */
  var activatedOperation: ActivatedOperation
  
  /** Gets a set of values populated by the app before a web authentication broker operation that deactivates the app in order to provide context when the app is activated. */
  var continuationData: ValueSet
  
  /** Gets the activation type. */
  var kind: ActivationKind
  
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
  
  /** Gets the WebAuthenticationResult object returned from the web authentication broker operation. */
  var webAuthenticationResult: WebAuthenticationResult
}
object WebUIWebAuthenticationBrokerContinuationEventArgs {
  
  inline def apply(
    activatedOperation: ActivatedOperation,
    continuationData: ValueSet,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    webAuthenticationResult: WebAuthenticationResult
  ): WebUIWebAuthenticationBrokerContinuationEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], continuationData = continuationData.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], webAuthenticationResult = webAuthenticationResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIWebAuthenticationBrokerContinuationEventArgs]
  }
  
  extension [Self <: WebUIWebAuthenticationBrokerContinuationEventArgs](x: Self) {
    
    inline def setActivatedOperation(value: ActivatedOperation): Self = StObject.set(x, "activatedOperation", value.asInstanceOf[js.Any])
    
    inline def setContinuationData(value: ValueSet): Self = StObject.set(x, "continuationData", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    inline def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
    
    inline def setWebAuthenticationResult(value: WebAuthenticationResult): Self = StObject.set(x, "webAuthenticationResult", value.asInstanceOf[js.Any])
  }
}
