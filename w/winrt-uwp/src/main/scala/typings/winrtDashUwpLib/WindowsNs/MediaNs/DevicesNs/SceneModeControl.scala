package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the scene mode settings on a capture device. */
@JSGlobal("Windows.Media.Devices.SceneModeControl")
@js.native
abstract class SceneModeControl () extends js.Object {
  /** Gets the scene modes supported on the capture device. */
  var supportedModes: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[CaptureSceneMode] = js.native
  /** Gets the current scene mod ethe capture device is set to. */
  var value: CaptureSceneMode = js.native
  /**
    * Asynchronously sets the color temperature Value .
    * @param sceneMode The scene mode to set the Value property to.
    * @return The object that is used to control the asynchronous operation.
    */
  def setValueAsync(sceneMode: CaptureSceneMode): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

