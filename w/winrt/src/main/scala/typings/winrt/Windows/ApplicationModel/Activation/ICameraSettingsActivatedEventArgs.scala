package typings.winrt.Windows.ApplicationModel.Activation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICameraSettingsActivatedEventArgs
  extends StObject
     with IActivatedEventArgs {
  
  var videoDeviceController: js.Any
  
  var videoDeviceExtension: js.Any
}
object ICameraSettingsActivatedEventArgs {
  
  inline def apply(
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    videoDeviceController: js.Any,
    videoDeviceExtension: js.Any
  ): ICameraSettingsActivatedEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], videoDeviceController = videoDeviceController.asInstanceOf[js.Any], videoDeviceExtension = videoDeviceExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICameraSettingsActivatedEventArgs]
  }
  
  extension [Self <: ICameraSettingsActivatedEventArgs](x: Self) {
    
    inline def setVideoDeviceController(value: js.Any): Self = StObject.set(x, "videoDeviceController", value.asInstanceOf[js.Any])
    
    inline def setVideoDeviceExtension(value: js.Any): Self = StObject.set(x, "videoDeviceExtension", value.asInstanceOf[js.Any])
  }
}
