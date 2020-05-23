package typings.winrtUwp.Windows.Media.Devices.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the ISO speed settings for a frame in a variable photo sequence. */
trait FrameIsoSpeedControl extends js.Object {
  /** Gets or sets a value indicating whether ISO speed is automatically set for a frame in a variable photo sequence. */
  var auto: Boolean
  /** Gets or sets the ISO speed for a frame in a variable photo sequence. */
  var value: Double
}

object FrameIsoSpeedControl {
  @scala.inline
  def apply(auto: Boolean, value: Double): FrameIsoSpeedControl = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameIsoSpeedControl]
  }
}

