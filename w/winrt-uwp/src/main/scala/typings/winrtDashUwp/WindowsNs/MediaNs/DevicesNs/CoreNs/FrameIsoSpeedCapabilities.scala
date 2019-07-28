package typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the ISO speed capabilities of the capture device for frames in a variable photo sequences. */
@JSGlobal("Windows.Media.Devices.Core.FrameIsoSpeedCapabilities")
@js.native
abstract class FrameIsoSpeedCapabilities () extends js.Object {
  /** Gets the maximum ISO speed supported by the capture device for a frame in a variable photo sequence. */
  var max: Double = js.native
  /** The minimum ISO speed supported by the capture device for a frame in a variable photo sequence. */
  var min: Double = js.native
  /** Gets the smallest ISO speed increment supported by the capture device for a frame in a variable photo sequence, specified in millimeters. */
  var step: Double = js.native
  /** Gets a value that indicates if the capture device supports the ISO speed control for frames in a variable photo sequence. */
  var supported: Boolean = js.native
}

