package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.ApplicationModel.Calls.LockScreenCallUI
import typings.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides event information when communication to and from the lock screen is required. */
trait LockScreenCallActivatedEventArgs extends StObject {
  
  /** Gets the arguments that are passed to the app to launch it. */
  var arguments: String
  
  /** Gets the UI that handles communication to and from the lock screen. */
  var callUI: LockScreenCallUI
  
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double
  
  /** Gets the activation type. */
  var kind: ActivationKind
  
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
  
  /** Gets the identifier of the source that launched the app. */
  var tileId: String
  
  /** Gets the view switcher object that allows you to set the view for the application. */
  var viewSwitcher: ActivationViewSwitcher
}
object LockScreenCallActivatedEventArgs {
  
  inline def apply(
    arguments: String,
    callUI: LockScreenCallUI,
    currentlyShownApplicationViewId: Double,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    tileId: String,
    viewSwitcher: ActivationViewSwitcher
  ): LockScreenCallActivatedEventArgs = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callUI = callUI.asInstanceOf[js.Any], currentlyShownApplicationViewId = currentlyShownApplicationViewId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], tileId = tileId.asInstanceOf[js.Any], viewSwitcher = viewSwitcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockScreenCallActivatedEventArgs]
  }
  
  extension [Self <: LockScreenCallActivatedEventArgs](x: Self) {
    
    inline def setArguments(value: String): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCallUI(value: LockScreenCallUI): Self = StObject.set(x, "callUI", value.asInstanceOf[js.Any])
    
    inline def setCurrentlyShownApplicationViewId(value: Double): Self = StObject.set(x, "currentlyShownApplicationViewId", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    inline def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
    
    inline def setTileId(value: String): Self = StObject.set(x, "tileId", value.asInstanceOf[js.Any])
    
    inline def setViewSwitcher(value: ActivationViewSwitcher): Self = StObject.set(x, "viewSwitcher", value.asInstanceOf[js.Any])
  }
}
