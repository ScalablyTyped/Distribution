package typings.winrtUwp.Windows.ApplicationModel.Activation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevicePairingActivatedEventArgs extends StObject {
  
  var deviceInformation: Any
  
  /* unmapped type */
  var kind: Any
  
  /* unmapped type */
  var previousExecutionState: Any
  
  /* unmapped type */
  var splashScreen: Any
}
object DevicePairingActivatedEventArgs {
  
  inline def apply(deviceInformation: Any, kind: Any, previousExecutionState: Any, splashScreen: Any): DevicePairingActivatedEventArgs = {
    val __obj = js.Dynamic.literal(deviceInformation = deviceInformation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePairingActivatedEventArgs]
  }
  
  extension [Self <: DevicePairingActivatedEventArgs](x: Self) {
    
    inline def setDeviceInformation(value: Any): Self = StObject.set(x, "deviceInformation", value.asInstanceOf[js.Any])
    
    inline def setKind(value: Any): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPreviousExecutionState(value: Any): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    inline def setSplashScreen(value: Any): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
  }
}
