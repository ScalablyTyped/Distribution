package typings.winrtUwp.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Event data for infrared frame source removed events. */
@js.native
trait PerceptionInfraredFrameSourceRemovedEventArgs extends js.Object {
  /** Gets the infrared frame source that was removed. */
  var frameSource: PerceptionInfraredFrameSource = js.native
}

object PerceptionInfraredFrameSourceRemovedEventArgs {
  @scala.inline
  def apply(frameSource: PerceptionInfraredFrameSource): PerceptionInfraredFrameSourceRemovedEventArgs = {
    val __obj = js.Dynamic.literal(frameSource = frameSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionInfraredFrameSourceRemovedEventArgs]
  }
  @scala.inline
  implicit class PerceptionInfraredFrameSourceRemovedEventArgsOps[Self <: PerceptionInfraredFrameSourceRemovedEventArgs] (val x: Self) extends AnyVal {
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
    def setFrameSource(value: PerceptionInfraredFrameSource): Self = this.set("frameSource", value.asInstanceOf[js.Any])
  }
  
}

