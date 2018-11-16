package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the flash capabilities of the capture device for frames in a variable photo sequences. */
@JSGlobal("Windows.Media.Devices.Core.FrameFlashCapabilities")
@js.native
abstract class FrameFlashCapabilities () extends js.Object {
  /** Gets a value indicating whether flash power is supported for frames in a variable photo sequences. */
  var powerSupported: scala.Boolean = js.native
  /** Gets a value indicating whether red eye reduction is supported for frames in a variable photo sequences. */
  var redEyeReductionSupported: scala.Boolean = js.native
  /** Gets a value that indicates if the capture device supports the flash control for frames in a variable photo sequence. */
  var supported: scala.Boolean = js.native
}

