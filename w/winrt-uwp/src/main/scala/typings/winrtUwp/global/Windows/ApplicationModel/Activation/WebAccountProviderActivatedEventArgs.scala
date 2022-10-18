package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Security.Authentication.Web.Provider.IWebAccountProviderOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information to an app activated as a result of a web account provider operation. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Activation.WebAccountProviderActivatedEventArgs")
@js.native
open class WebAccountProviderActivatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Activation.WebAccountProviderActivatedEventArgs {
  
  /** Gets the kind of web account provider activation. */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  
  /** Gets the web account provider operation. */
  /* CompleteClass */
  var operation: IWebAccountProviderOperation = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
}
