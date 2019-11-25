package typings.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaDeviceStatics extends js.Object {
  var ondefaultaudiocapturedevicechanged: js.Any
  var ondefaultaudiorenderdevicechanged: js.Any
  def getAudioCaptureSelector(): String
  def getAudioRenderSelector(): String
  def getDefaultAudioCaptureId(role: AudioDeviceRole): String
  def getDefaultAudioRenderId(role: AudioDeviceRole): String
  def getVideoCaptureSelector(): String
}

object IMediaDeviceStatics {
  @scala.inline
  def apply(
    getAudioCaptureSelector: () => String,
    getAudioRenderSelector: () => String,
    getDefaultAudioCaptureId: AudioDeviceRole => String,
    getDefaultAudioRenderId: AudioDeviceRole => String,
    getVideoCaptureSelector: () => String,
    ondefaultaudiocapturedevicechanged: js.Any,
    ondefaultaudiorenderdevicechanged: js.Any
  ): IMediaDeviceStatics = {
    val __obj = js.Dynamic.literal(getAudioCaptureSelector = js.Any.fromFunction0(getAudioCaptureSelector), getAudioRenderSelector = js.Any.fromFunction0(getAudioRenderSelector), getDefaultAudioCaptureId = js.Any.fromFunction1(getDefaultAudioCaptureId), getDefaultAudioRenderId = js.Any.fromFunction1(getDefaultAudioRenderId), getVideoCaptureSelector = js.Any.fromFunction0(getVideoCaptureSelector), ondefaultaudiocapturedevicechanged = ondefaultaudiocapturedevicechanged.asInstanceOf[js.Any], ondefaultaudiorenderdevicechanged = ondefaultaudiorenderdevicechanged.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMediaDeviceStatics]
  }
}

