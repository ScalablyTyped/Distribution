package typings.winrtUwp.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables a camera settings app to handle the activation parameters for the app. */
trait WebUICameraSettingsActivatedEventArgs extends StObject {
  
  /** Gets the app activated operation. */
  var activatedOperation: ActivatedOperation
  
  /** Gets the activation type. */
  var kind: ActivationKind
  
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
  
  /** Gets the object that controls device settings on the camera. */
  var videoDeviceController: js.Any
  
  /** Gets the object that implements additional extended settings for the camera. */
  var videoDeviceExtension: js.Any
}
object WebUICameraSettingsActivatedEventArgs {
  
  inline def apply(
    activatedOperation: ActivatedOperation,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    videoDeviceController: js.Any,
    videoDeviceExtension: js.Any
  ): WebUICameraSettingsActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], videoDeviceController = videoDeviceController.asInstanceOf[js.Any], videoDeviceExtension = videoDeviceExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUICameraSettingsActivatedEventArgs]
  }
  
  extension [Self <: WebUICameraSettingsActivatedEventArgs](x: Self) {
    
    inline def setActivatedOperation(value: ActivatedOperation): Self = StObject.set(x, "activatedOperation", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    inline def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
    
    inline def setVideoDeviceController(value: js.Any): Self = StObject.set(x, "videoDeviceController", value.asInstanceOf[js.Any])
    
    inline def setVideoDeviceExtension(value: js.Any): Self = StObject.set(x, "videoDeviceExtension", value.asInstanceOf[js.Any])
  }
}
