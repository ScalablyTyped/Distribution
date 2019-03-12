package typings
package winrtLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaDeviceStatics extends js.Object {
  var ondefaultaudiocapturedevicechanged: js.Any
  var ondefaultaudiorenderdevicechanged: js.Any
  def getAudioCaptureSelector(): java.lang.String
  def getAudioRenderSelector(): java.lang.String
  def getDefaultAudioCaptureId(role: AudioDeviceRole): java.lang.String
  def getDefaultAudioRenderId(role: AudioDeviceRole): java.lang.String
  def getVideoCaptureSelector(): java.lang.String
}

object IMediaDeviceStatics {
  @scala.inline
  def apply(
    getAudioCaptureSelector: () => java.lang.String,
    getAudioRenderSelector: () => java.lang.String,
    getDefaultAudioCaptureId: AudioDeviceRole => java.lang.String,
    getDefaultAudioRenderId: AudioDeviceRole => java.lang.String,
    getVideoCaptureSelector: () => java.lang.String,
    ondefaultaudiocapturedevicechanged: js.Any,
    ondefaultaudiorenderdevicechanged: js.Any
  ): IMediaDeviceStatics = {
    val __obj = js.Dynamic.literal(getAudioCaptureSelector = js.Any.fromFunction0(getAudioCaptureSelector), getAudioRenderSelector = js.Any.fromFunction0(getAudioRenderSelector), getDefaultAudioCaptureId = js.Any.fromFunction1(getDefaultAudioCaptureId), getDefaultAudioRenderId = js.Any.fromFunction1(getDefaultAudioRenderId), getVideoCaptureSelector = js.Any.fromFunction0(getVideoCaptureSelector), ondefaultaudiocapturedevicechanged = ondefaultaudiocapturedevicechanged, ondefaultaudiorenderdevicechanged = ondefaultaudiorenderdevicechanged)
  
    __obj.asInstanceOf[IMediaDeviceStatics]
  }
}

