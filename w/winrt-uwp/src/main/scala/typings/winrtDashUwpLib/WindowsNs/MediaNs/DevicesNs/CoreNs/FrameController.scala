package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the settings for a frame in a variable photo sequence. */
@JSGlobal("Windows.Media.Devices.Core.FrameController")
@js.native
class FrameController () extends js.Object {
  /** Gets the exposure compensation settings for a frame in a variable photo sequence. */
  var exposureCompensationControl: FrameExposureCompensationControl = js.native
  /** Gets the exposure settings for a frame in a variable photo sequence. */
  var exposureControl: FrameExposureControl = js.native
  /** Gets the flash settings for a frame in a variable photo sequence. */
  var flashControl: FrameFlashControl = js.native
  /** Gets the focus settings for a frame in a variable photo sequence. */
  var focusControl: FrameFocusControl = js.native
  /** Gets the ISO speed settings for a frame in a variable photo sequence. */
  var isoSpeedControl: FrameIsoSpeedControl = js.native
  /** Gets or sets whether photo confirmation is enabled for a frame in a variable photo sequence. */
  var photoConfirmationEnabled: scala.Boolean = js.native
}

