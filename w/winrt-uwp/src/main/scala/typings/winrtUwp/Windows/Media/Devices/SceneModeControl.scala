package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the scene mode settings on a capture device. */
trait SceneModeControl extends js.Object {
  /** Gets the scene modes supported on the capture device. */
  var supportedModes: IVectorView[CaptureSceneMode]
  /** Gets the current scene mod ethe capture device is set to. */
  var value: CaptureSceneMode
  /**
    * Asynchronously sets the color temperature Value .
    * @param sceneMode The scene mode to set the Value property to.
    * @return The object that is used to control the asynchronous operation.
    */
  def setValueAsync(sceneMode: CaptureSceneMode): IPromiseWithIAsyncAction
}

object SceneModeControl {
  @scala.inline
  def apply(
    setValueAsync: CaptureSceneMode => IPromiseWithIAsyncAction,
    supportedModes: IVectorView[CaptureSceneMode],
    value: CaptureSceneMode
  ): SceneModeControl = {
    val __obj = js.Dynamic.literal(setValueAsync = js.Any.fromFunction1(setValueAsync), supportedModes = supportedModes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneModeControl]
  }
}

