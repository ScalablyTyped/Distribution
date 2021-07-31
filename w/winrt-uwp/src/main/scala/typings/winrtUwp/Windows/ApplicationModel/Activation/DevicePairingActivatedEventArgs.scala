package typings.winrtUwp.Windows.ApplicationModel.Activation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevicePairingActivatedEventArgs extends StObject {
  
  var deviceInformation: js.Any
  
  /* unmapped type */
  var kind: js.Any
  
  /* unmapped type */
  var previousExecutionState: js.Any
  
  /* unmapped type */
  var splashScreen: js.Any
}
object DevicePairingActivatedEventArgs {
  
  @scala.inline
  def apply(deviceInformation: js.Any, kind: js.Any, previousExecutionState: js.Any, splashScreen: js.Any): DevicePairingActivatedEventArgs = {
    val __obj = js.Dynamic.literal(deviceInformation = deviceInformation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePairingActivatedEventArgs]
  }
  
  @scala.inline
  implicit class DevicePairingActivatedEventArgsMutableBuilder[Self <: DevicePairingActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceInformation(value: js.Any): Self = StObject.set(x, "deviceInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: js.Any): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousExecutionState(value: js.Any): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplashScreen(value: js.Any): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
  }
}
