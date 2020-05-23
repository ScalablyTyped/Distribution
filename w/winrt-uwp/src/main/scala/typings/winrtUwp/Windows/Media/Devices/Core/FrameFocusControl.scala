package typings.winrtUwp.Windows.Media.Devices.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the focus settings for a frame in a variable photo sequence. */
trait FrameFocusControl extends js.Object {
  /** Gets or sets the focus value for a frame in a variable photo sequence. */
  var value: Double
}

object FrameFocusControl {
  @scala.inline
  def apply(value: Double): FrameFocusControl = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameFocusControl]
  }
}

