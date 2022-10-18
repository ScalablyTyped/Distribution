package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information to an app that was launched after being suspended for a web authentication broker operation. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Activation.WebAuthenticationBrokerContinuationEventArgs")
@js.native
open class WebAuthenticationBrokerContinuationEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Activation.WebAuthenticationBrokerContinuationEventArgs {
  
  /** Gets a set of values populated by the app before a web authentication broker operation that deactivates the app in order to provide context when the app is activated. */
  /* CompleteClass */
  var continuationData: ValueSet = js.native
  
  /** Gets the activation type. */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  
  /** Gets a SplashScreen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  
  /** Gets the WebAuthenticationResult object returned from the web authentication broker operation. */
  /* CompleteClass */
  var webAuthenticationResult: WebAuthenticationResult = js.native
}
