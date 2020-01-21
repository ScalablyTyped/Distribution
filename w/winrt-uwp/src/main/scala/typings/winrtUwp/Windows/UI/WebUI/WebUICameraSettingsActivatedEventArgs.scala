package typings.winrtUwp.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables a camera settings app to handle the activation parameters for the app. */
@JSGlobal("Windows.UI.WebUI.WebUICameraSettingsActivatedEventArgs")
@js.native
abstract class WebUICameraSettingsActivatedEventArgs () extends js.Object {
  /** Gets the app activated operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the object that controls device settings on the camera. */
  var videoDeviceController: js.Any = js.native
  /** Gets the object that implements additional extended settings for the camera. */
  var videoDeviceExtension: js.Any = js.native
}

