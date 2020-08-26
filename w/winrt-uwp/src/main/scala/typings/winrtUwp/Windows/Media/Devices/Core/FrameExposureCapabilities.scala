package typings.winrtUwp.Windows.Media.Devices.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the exposure time capabilities of the capture device for frames in a variable photo sequences. */
@js.native
trait FrameExposureCapabilities extends js.Object {
  /** Gets the maximum exposure time supported by the capture device. */
  var max: Double = js.native
  /** Gets the minimum exposure time supported by the capture device. */
  var min: Double = js.native
  /** Gets the smallest exposure time increment supported by the capture device. */
  var step: Double = js.native
  /** Gets a value that indicates if the capture device supports the exposure control for variable photo sequences. */
  var supported: Boolean = js.native
}

object FrameExposureCapabilities {
  @scala.inline
  def apply(max: Double, min: Double, step: Double, supported: Boolean): FrameExposureCapabilities = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameExposureCapabilities]
  }
  @scala.inline
  implicit class FrameExposureCapabilitiesOps[Self <: FrameExposureCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupported(value: Boolean): Self = this.set("supported", value.asInstanceOf[js.Any])
  }
  
}

