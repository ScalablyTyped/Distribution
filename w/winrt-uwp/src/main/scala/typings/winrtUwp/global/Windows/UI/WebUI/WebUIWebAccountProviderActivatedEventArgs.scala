package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.Security.Authentication.Web.Provider.IWebAccountProviderOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the arguments involved in activated a web account provider. */
/* note: abstract class */ @JSGlobal("Windows.UI.WebUI.WebUIWebAccountProviderActivatedEventArgs")
@js.native
open class WebUIWebAccountProviderActivatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.UI.WebUI.WebUIWebAccountProviderActivatedEventArgs {
  
  /** Gets the activated operation. */
  /* CompleteClass */
  var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  
  /** Gets the kind of activation. */
  /* CompleteClass */
  var kind: ActivationKind = js.native
  
  /** Gets the web account provider operation. */
  /* CompleteClass */
  var operation: IWebAccountProviderOperation = js.native
  
  /** Gets the previous execution state of the app. */
  /* CompleteClass */
  var previousExecutionState: ApplicationExecutionState = js.native
  
  /** Gets the splash screen. */
  /* CompleteClass */
  var splashScreen: SplashScreen = js.native
}
