package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** When supported, allows an app to specify whether the camera driver can dynamically adjust the frame rate of video capture in order to improve video quality in low-light conditions. */
trait ExposurePriorityVideoControl extends js.Object {
  /** Gets or sets a value that specifies if ExposurePriorityVideoControl is enabled. */
  var enabled: Boolean
  /** Gets or sets a value that specifies if ExposurePriorityVideoControl is supported on the current device. */
  var supported: Boolean
}

object ExposurePriorityVideoControl {
  @scala.inline
  def apply(enabled: Boolean, supported: Boolean): ExposurePriorityVideoControl = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExposurePriorityVideoControl]
  }
}

