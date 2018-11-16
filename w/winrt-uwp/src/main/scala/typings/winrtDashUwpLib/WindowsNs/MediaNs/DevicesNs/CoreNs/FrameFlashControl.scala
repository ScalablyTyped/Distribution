package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the flash settings for a frame in a variable photo sequence. */
@JSGlobal("Windows.Media.Devices.Core.FrameFlashControl")
@js.native
abstract class FrameFlashControl () extends js.Object {
  /** Gets or sets a value indicating whether flash settings are automatically set for a frame in a variable photo sequence. */
  var auto: scala.Boolean = js.native
  /** Gets or sets the flash mode for a frame in a variable photo sequence. */
  var mode: FrameFlashMode = js.native
  /** Gets or sets the flash power for a frame in a variable photo sequence. */
  var powerPercent: scala.Double = js.native
  /** Gets or sets a value indicating if red eye reduction is enabled for a frame in a variable photo sequence. */
  var redEyeReduction: scala.Boolean = js.native
}

