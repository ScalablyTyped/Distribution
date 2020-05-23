package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables a camera settings app to handle the activation parameters for the app. */
@JSGlobal("Windows.ApplicationModel.Activation.CameraSettingsActivatedEventArgs")
@js.native
abstract class CameraSettingsActivatedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Activation.CameraSettingsActivatedEventArgs {
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  /** Gets the object that controls device settings on the camera. */
  /* CompleteClass */
  override var videoDeviceController: js.Any = js.native
  /** Gets the object that implements additional extended settings for the camera. */
  /* CompleteClass */
  override var videoDeviceExtension: js.Any = js.native
}

