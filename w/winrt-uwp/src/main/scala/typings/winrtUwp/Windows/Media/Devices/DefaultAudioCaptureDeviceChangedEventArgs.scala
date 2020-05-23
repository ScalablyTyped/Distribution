package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a default audio capture device change event. */
trait DefaultAudioCaptureDeviceChangedEventArgs extends js.Object {
  /** Gets the ID of the newly selected audio capture device that caused the change event. */
  var id: String
  /** Gets the role of the newly selected audio capture device that caused the change event. */
  var role: AudioDeviceRole
}

object DefaultAudioCaptureDeviceChangedEventArgs {
  @scala.inline
  def apply(id: String, role: AudioDeviceRole): DefaultAudioCaptureDeviceChangedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultAudioCaptureDeviceChangedEventArgs]
  }
}

