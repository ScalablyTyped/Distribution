package typings.winrtUwp.Windows.Media.Devices.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the exposure compensation settings for a frame in a variable photo sequence. */
trait FrameExposureCompensationControl extends js.Object {
  /** Gets or sets the exposure compensation time for a frame in a variable photo sequence. */
  var value: Double
}

object FrameExposureCompensationControl {
  @scala.inline
  def apply(value: Double): FrameExposureCompensationControl = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameExposureCompensationControl]
  }
}

