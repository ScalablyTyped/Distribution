package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Security.Authentication.Web.Provider.IWebAccountProviderOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information to an app activated as a result of a web account provider operation. */
@js.native
trait WebAccountProviderActivatedEventArgs extends StObject {
  
  /** Gets the kind of web account provider activation. */
  var kind: ActivationKind = js.native
  
  /** Gets the web account provider operation. */
  var operation: IWebAccountProviderOperation = js.native
  
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}
object WebAccountProviderActivatedEventArgs {
  
  @scala.inline
  def apply(
    kind: ActivationKind,
    operation: IWebAccountProviderOperation,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): WebAccountProviderActivatedEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountProviderActivatedEventArgs]
  }
  
  @scala.inline
  implicit class WebAccountProviderActivatedEventArgsMutableBuilder[Self <: WebAccountProviderActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: IWebAccountProviderOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
  }
}
