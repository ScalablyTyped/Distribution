package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables a camera settings app to handle the activation parameters for the app. */
@JSGlobal("Windows.ApplicationModel.Activation.CameraSettingsActivatedEventArgs")
@js.native
abstract class CameraSettingsActivatedEventArgs () extends js.Object {
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the object that controls device settings on the camera. */
  var videoDeviceController: js.Any = js.native
  /** Gets the object that implements additional extended settings for the camera. */
  var videoDeviceExtension: js.Any = js.native
}

