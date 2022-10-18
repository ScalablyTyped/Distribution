package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables a camera settings app to handle the activation parameters for the app. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Activation.CameraSettingsActivatedEventArgs")
@js.native
open class CameraSettingsActivatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Activation.CameraSettingsActivatedEventArgs {
  
  /** Gets the activation type. */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  
  /** Gets the object that controls device settings on the camera. */
  /* CompleteClass */
  var videoDeviceController: Any = js.native
  
  /** Gets the object that implements additional extended settings for the camera. */
  /* CompleteClass */
  var videoDeviceExtension: Any = js.native
}
