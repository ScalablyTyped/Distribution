package typings
package winrtLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDefaultAudioDeviceChangedEventArgs extends js.Object {
  var id: java.lang.String
  var role: AudioDeviceRole
}

object IDefaultAudioDeviceChangedEventArgs {
  @scala.inline
  def apply(id: java.lang.String, role: AudioDeviceRole): IDefaultAudioDeviceChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[IDefaultAudioDeviceChangedEventArgs]
  }
}

