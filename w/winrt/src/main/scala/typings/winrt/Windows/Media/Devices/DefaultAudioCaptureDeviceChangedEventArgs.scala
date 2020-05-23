package typings.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultAudioCaptureDeviceChangedEventArgs extends IDefaultAudioDeviceChangedEventArgs

object DefaultAudioCaptureDeviceChangedEventArgs {
  @scala.inline
  def apply(id: String, role: AudioDeviceRole): DefaultAudioCaptureDeviceChangedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultAudioCaptureDeviceChangedEventArgs]
  }
}

