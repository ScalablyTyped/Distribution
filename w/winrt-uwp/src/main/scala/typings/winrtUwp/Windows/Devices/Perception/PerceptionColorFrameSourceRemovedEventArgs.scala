package typings.winrtUwp.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Event data for color frame source added events. */
@js.native
trait PerceptionColorFrameSourceRemovedEventArgs extends js.Object {
  /** Gets the color frame source that was removed. */
  var frameSource: PerceptionColorFrameSource = js.native
}

object PerceptionColorFrameSourceRemovedEventArgs {
  @scala.inline
  def apply(frameSource: PerceptionColorFrameSource): PerceptionColorFrameSourceRemovedEventArgs = {
    val __obj = js.Dynamic.literal(frameSource = frameSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionColorFrameSourceRemovedEventArgs]
  }
  @scala.inline
  implicit class PerceptionColorFrameSourceRemovedEventArgsOps[Self <: PerceptionColorFrameSourceRemovedEventArgs] (val x: Self) extends AnyVal {
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
    def setFrameSource(value: PerceptionColorFrameSource): Self = this.set("frameSource", value.asInstanceOf[js.Any])
  }
  
}

