package typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the exposure compensation capabilities of the capture device for frames in a variable photo sequences. */
@JSGlobal("Windows.Media.Devices.Core.FrameExposureCompensationCapabilities")
@js.native
abstract class FrameExposureCompensationCapabilities () extends js.Object {
  /** Gets the maximum exposure compensation supported by the capture device. */
  var max: Double = js.native
  /** Gets the minimum exposure compensation supported by the capture device. */
  var min: Double = js.native
  /** Gets the smallest exposure time compensation increment supported by the capture device. */
  var step: Double = js.native
  /** Gets a value that indicates if the capture device supports the frame exposure compensation control for frames in a variable photo sequence. */
  var supported: Boolean = js.native
}

