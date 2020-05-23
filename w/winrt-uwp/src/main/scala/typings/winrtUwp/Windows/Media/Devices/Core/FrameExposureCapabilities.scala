package typings.winrtUwp.Windows.Media.Devices.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the exposure time capabilities of the capture device for frames in a variable photo sequences. */
trait FrameExposureCapabilities extends js.Object {
  /** Gets the maximum exposure time supported by the capture device. */
  var max: Double
  /** Gets the minimum exposure time supported by the capture device. */
  var min: Double
  /** Gets the smallest exposure time increment supported by the capture device. */
  var step: Double
  /** Gets a value that indicates if the capture device supports the exposure control for variable photo sequences. */
  var supported: Boolean
}

object FrameExposureCapabilities {
  @scala.inline
  def apply(max: Double, min: Double, step: Double, supported: Boolean): FrameExposureCapabilities = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameExposureCapabilities]
  }
}

