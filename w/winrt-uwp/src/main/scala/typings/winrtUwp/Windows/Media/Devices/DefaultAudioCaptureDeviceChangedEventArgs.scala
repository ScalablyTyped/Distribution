package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a default audio capture device change event. */
@js.native
trait DefaultAudioCaptureDeviceChangedEventArgs extends js.Object {
  /** Gets the ID of the newly selected audio capture device that caused the change event. */
  var id: String = js.native
  /** Gets the role of the newly selected audio capture device that caused the change event. */
  var role: AudioDeviceRole = js.native
}

object DefaultAudioCaptureDeviceChangedEventArgs {
  @scala.inline
  def apply(id: String, role: AudioDeviceRole): DefaultAudioCaptureDeviceChangedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultAudioCaptureDeviceChangedEventArgs]
  }
  @scala.inline
  implicit class DefaultAudioCaptureDeviceChangedEventArgsOps[Self <: DefaultAudioCaptureDeviceChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: AudioDeviceRole): Self = this.set("role", value.asInstanceOf[js.Any])
  }
  
}

