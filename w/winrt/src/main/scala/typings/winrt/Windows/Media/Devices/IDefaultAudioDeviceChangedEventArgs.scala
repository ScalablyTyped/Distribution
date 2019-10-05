package typings.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDefaultAudioDeviceChangedEventArgs extends js.Object {
  var id: String
  var role: AudioDeviceRole
}

object IDefaultAudioDeviceChangedEventArgs {
  @scala.inline
  def apply(id: String, role: AudioDeviceRole): IDefaultAudioDeviceChangedEventArgs = {
    val __obj = js.Dynamic.literal(id = id, role = role)
  
    __obj.asInstanceOf[IDefaultAudioDeviceChangedEventArgs]
  }
}

