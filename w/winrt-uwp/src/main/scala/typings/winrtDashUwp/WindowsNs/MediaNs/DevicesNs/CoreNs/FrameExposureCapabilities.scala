package typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the exposure time capabilities of the capture device for frames in a variable photo sequences. */
@JSGlobal("Windows.Media.Devices.Core.FrameExposureCapabilities")
@js.native
abstract class FrameExposureCapabilities () extends js.Object {
  /** Gets the maximum exposure time supported by the capture device. */
  var max: Double = js.native
  /** Gets the minimum exposure time supported by the capture device. */
  var min: Double = js.native
  /** Gets the smallest exposure time increment supported by the capture device. */
  var step: Double = js.native
  /** Gets a value that indicates if the capture device supports the exposure control for variable photo sequences. */
  var supported: Boolean = js.native
}

