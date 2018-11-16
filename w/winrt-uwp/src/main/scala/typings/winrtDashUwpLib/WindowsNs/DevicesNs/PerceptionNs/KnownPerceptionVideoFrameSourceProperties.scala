package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides static properties of video frame sources. */
@JSGlobal("Windows.Devices.Perception.KnownPerceptionVideoFrameSourceProperties")
@js.native
abstract class KnownPerceptionVideoFrameSourceProperties () extends js.Object

/** Provides static properties of video frame sources. */
@JSGlobal("Windows.Devices.Perception.KnownPerceptionVideoFrameSourceProperties")
@js.native
object KnownPerceptionVideoFrameSourceProperties extends js.Object {
  /** Gets a string key used to retrieve a boolean property indicating the supported video profiles that are currently available. */
  var availableVideoProfiles: java.lang.String = js.native
  /** Gets a string key used to retrieve a CameraIntrinsics property defining the physical properties of the camera device. The CameraIntrinsics object also provides convenience methods for sensor-related geometry, including camera space to image space projections. */
  var cameraIntrinsics: java.lang.String = js.native
  /** Gets a string key used to retrieve a boolean property indicating whether or not the video frame source is providing mirrored video frames. */
  var isMirrored: java.lang.String = js.native
  /** Gets a string key used to retrieve the supported video profiles property. */
  var supportedVideoProfiles: java.lang.String = js.native
  /** Gets a string key used to retrieve the current video profile property. */
  var videoProfile: java.lang.String = js.native
}

