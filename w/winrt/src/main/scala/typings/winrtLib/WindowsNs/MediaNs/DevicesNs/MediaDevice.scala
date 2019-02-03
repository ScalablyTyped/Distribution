package typings
package winrtLib.WindowsNs.MediaNs.DevicesNs

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
  def getAudioCaptureSelector(): java.lang.String = js.native
  def getAudioRenderSelector(): java.lang.String = js.native
  def getDefaultAudioCaptureId(role: winrtLib.WindowsNs.MediaNs.DevicesNs.AudioDeviceRole): java.lang.String = js.native
  def getDefaultAudioRenderId(role: winrtLib.WindowsNs.MediaNs.DevicesNs.AudioDeviceRole): java.lang.String = js.native
  def getVideoCaptureSelector(): java.lang.String = js.native
}

