package typings.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultAudioRenderDeviceChangedEventArgs extends IDefaultAudioDeviceChangedEventArgs
object DefaultAudioRenderDeviceChangedEventArgs {
  
  @scala.inline
  def apply(id: String, role: AudioDeviceRole): DefaultAudioRenderDeviceChangedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultAudioRenderDeviceChangedEventArgs]
  }
}
