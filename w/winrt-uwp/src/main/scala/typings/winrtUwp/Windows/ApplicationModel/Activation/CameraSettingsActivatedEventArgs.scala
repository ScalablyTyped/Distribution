package typings.winrtUwp.Windows.ApplicationModel.Activation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables a camera settings app to handle the activation parameters for the app. */
trait CameraSettingsActivatedEventArgs extends StObject {
  
  /** Gets the activation type. */
  var kind: ActivationKind
  
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
  
  /** Gets the object that controls device settings on the camera. */
  var videoDeviceController: js.Any
  
  /** Gets the object that implements additional extended settings for the camera. */
  var videoDeviceExtension: js.Any
}
object CameraSettingsActivatedEventArgs {
  
  @scala.inline
  def apply(
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    videoDeviceController: js.Any,
    videoDeviceExtension: js.Any
  ): CameraSettingsActivatedEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], videoDeviceController = videoDeviceController.asInstanceOf[js.Any], videoDeviceExtension = videoDeviceExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraSettingsActivatedEventArgs]
  }
  
  @scala.inline
  implicit class CameraSettingsActivatedEventArgsMutableBuilder[Self <: CameraSettingsActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDeviceController(value: js.Any): Self = StObject.set(x, "videoDeviceController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDeviceExtension(value: js.Any): Self = StObject.set(x, "videoDeviceExtension", value.asInstanceOf[js.Any])
  }
}
