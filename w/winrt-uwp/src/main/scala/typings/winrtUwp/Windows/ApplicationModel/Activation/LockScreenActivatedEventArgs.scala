package typings.winrtUwp.Windows.ApplicationModel.Activation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an event that occurs when the app is activated as the lock screen. */
trait LockScreenActivatedEventArgs extends StObject {
  
  /** Gets an object that allows an app that is activated as the lock screen to get the same data that the default lock screen can access, and to register for updates to that data. */
  var info: js.Any
  
  /** Gets the reason for the activation of the app for this event. */
  var kind: ActivationKind
  
  /** Gets the execution state of the app before the app was activated as the lock screen. */
  var previousExecutionState: ApplicationExecutionState
  
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
}
object LockScreenActivatedEventArgs {
  
  @scala.inline
  def apply(
    info: js.Any,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): LockScreenActivatedEventArgs = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockScreenActivatedEventArgs]
  }
  
  @scala.inline
  implicit class LockScreenActivatedEventArgsMutableBuilder[Self <: LockScreenActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfo(value: js.Any): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
  }
}
