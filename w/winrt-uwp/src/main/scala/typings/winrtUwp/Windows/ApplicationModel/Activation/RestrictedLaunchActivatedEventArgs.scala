package typings.winrtUwp.Windows.ApplicationModel.Activation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides event information when a restricted app is launched. */
trait RestrictedLaunchActivatedEventArgs extends StObject {
  
  /** Gets the activation type. */
  var kind: ActivationKind
  
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  
  /** Gets information about a shared context for the restricted launch. */
  var sharedContext: js.Any
  
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
}
object RestrictedLaunchActivatedEventArgs {
  
  @scala.inline
  def apply(
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    sharedContext: js.Any,
    splashScreen: SplashScreen
  ): RestrictedLaunchActivatedEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], sharedContext = sharedContext.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestrictedLaunchActivatedEventArgs]
  }
  
  @scala.inline
  implicit class RestrictedLaunchActivatedEventArgsMutableBuilder[Self <: RestrictedLaunchActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedContext(value: js.Any): Self = StObject.set(x, "sharedContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
  }
}
