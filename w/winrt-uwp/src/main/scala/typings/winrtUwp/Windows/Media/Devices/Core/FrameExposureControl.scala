package typings.winrtUwp.Windows.Media.Devices.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the exposure time settings for a frame in a variable photo sequence. */
trait FrameExposureControl extends js.Object {
  /** Gets or sets a value indicating whether auto exposure is enabled for a frame in a variable photo sequence. */
  var auto: Boolean
  /** Gets or sets the exposure time for a frame in a variable photo sequence. */
  var value: Double
}

object FrameExposureControl {
  @scala.inline
  def apply(auto: Boolean, value: Double): FrameExposureControl = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameExposureControl]
  }
}

