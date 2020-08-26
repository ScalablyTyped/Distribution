package typings.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AutoRepeatModeChangeRequested event. */
@js.native
trait AutoRepeatModeChangeRequestedEventArgs extends js.Object {
  /** Gets a value indicating the requested auto-repeat mode. */
  var requestedAutoRepeatMode: MediaPlaybackAutoRepeatMode = js.native
}

object AutoRepeatModeChangeRequestedEventArgs {
  @scala.inline
  def apply(requestedAutoRepeatMode: MediaPlaybackAutoRepeatMode): AutoRepeatModeChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(requestedAutoRepeatMode = requestedAutoRepeatMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoRepeatModeChangeRequestedEventArgs]
  }
  @scala.inline
  implicit class AutoRepeatModeChangeRequestedEventArgsOps[Self <: AutoRepeatModeChangeRequestedEventArgs] (val x: Self) extends AnyVal {
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
    def setRequestedAutoRepeatMode(value: MediaPlaybackAutoRepeatMode): Self = this.set("requestedAutoRepeatMode", value.asInstanceOf[js.Any])
  }
  
}

