package typings.winrtUwp.Windows.ApplicationModel.Activation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the Activated event when it occurs after a picker returns. */
trait PickerReturnedActivatedEventArgs extends StObject {
  
  /** Gets the reason that this app is being activated. */
  var kind: ActivationKind
  
  /** Gets an identifier indicating the picker operation that was performed prior to the activation. */
  var pickerOperationId: String
  
  /** Gets the execution state of the app before this activation. */
  var previousExecutionState: ApplicationExecutionState
  
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
}
object PickerReturnedActivatedEventArgs {
  
  inline def apply(
    kind: ActivationKind,
    pickerOperationId: String,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): PickerReturnedActivatedEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], pickerOperationId = pickerOperationId.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerReturnedActivatedEventArgs]
  }
  
  extension [Self <: PickerReturnedActivatedEventArgs](x: Self) {
    
    inline def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPickerOperationId(value: String): Self = StObject.set(x, "pickerOperationId", value.asInstanceOf[js.Any])
    
    inline def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    inline def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
  }
}
