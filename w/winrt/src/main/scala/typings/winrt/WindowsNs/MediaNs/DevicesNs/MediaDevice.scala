package typings.winrt.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Devices.MediaDevice")
@js.native
class MediaDevice () extends js.Object

/* static members */
@JSGlobal("Windows.Media.Devices.MediaDevice")
@js.native
object MediaDevice extends js.Object {
  var ondefaultaudiocapturedevicechanged: js.Any = js.native
  var ondefaultaudiorenderdevicechanged: js.Any = js.native
  def getAudioCaptureSelector(): String = js.native
  def getAudioRenderSelector(): String = js.native
  def getDefaultAudioCaptureId(role: AudioDeviceRole): String = js.native
  def getDefaultAudioRenderId(role: AudioDeviceRole): String = js.native
  def getVideoCaptureSelector(): String = js.native
}

