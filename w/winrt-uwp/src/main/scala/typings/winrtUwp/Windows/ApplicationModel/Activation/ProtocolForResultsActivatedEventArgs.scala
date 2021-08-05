package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.System.ProtocolForResultsOperation
import typings.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Received by an application when it is launched by another application with the expectation that it will return results back to the caller. */
trait ProtocolForResultsActivatedEventArgs extends StObject {
  
  /** Gets the package family name of the application that activated the current application. */
  var callerPackageFamilyName: String
  
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double
  
  /** Data received from the application that activated the current application. */
  var data: ValueSet
  
  /** Gets the activation type. */
  var kind: ActivationKind
  
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  
  /** Gets the ProtocolForResultsOperation that you use to signal that your app is ready to return to the app that launched it for results. */
  var protocolForResultsOperation: ProtocolForResultsOperation
  
  /** Gets a SplashScreen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
  
  /** Gets the Uniform Resource Identifier (URI) used to activate the app. */
  var uri: Uri
  
  /** Gets the view switcher object that allows you to set the view for the application. */
  var viewSwitcher: ActivationViewSwitcher
}
object ProtocolForResultsActivatedEventArgs {
  
  inline def apply(
    callerPackageFamilyName: String,
    currentlyShownApplicationViewId: Double,
    data: ValueSet,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    protocolForResultsOperation: ProtocolForResultsOperation,
    splashScreen: SplashScreen,
    uri: Uri,
    viewSwitcher: ActivationViewSwitcher
  ): ProtocolForResultsActivatedEventArgs = {
    val __obj = js.Dynamic.literal(callerPackageFamilyName = callerPackageFamilyName.asInstanceOf[js.Any], currentlyShownApplicationViewId = currentlyShownApplicationViewId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], protocolForResultsOperation = protocolForResultsOperation.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], viewSwitcher = viewSwitcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolForResultsActivatedEventArgs]
  }
  
  extension [Self <: ProtocolForResultsActivatedEventArgs](x: Self) {
    
    inline def setCallerPackageFamilyName(value: String): Self = StObject.set(x, "callerPackageFamilyName", value.asInstanceOf[js.Any])
    
    inline def setCurrentlyShownApplicationViewId(value: Double): Self = StObject.set(x, "currentlyShownApplicationViewId", value.asInstanceOf[js.Any])
    
    inline def setData(value: ValueSet): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    inline def setProtocolForResultsOperation(value: ProtocolForResultsOperation): Self = StObject.set(x, "protocolForResultsOperation", value.asInstanceOf[js.Any])
    
    inline def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setViewSwitcher(value: ActivationViewSwitcher): Self = StObject.set(x, "viewSwitcher", value.asInstanceOf[js.Any])
  }
}
