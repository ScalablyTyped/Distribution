package typings.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMediaDeviceStatics extends js.Object {
  var ondefaultaudiocapturedevicechanged: js.Any = js.native
  var ondefaultaudiorenderdevicechanged: js.Any = js.native
  def getAudioCaptureSelector(): String = js.native
  def getAudioRenderSelector(): String = js.native
  def getDefaultAudioCaptureId(role: AudioDeviceRole): String = js.native
  def getDefaultAudioRenderId(role: AudioDeviceRole): String = js.native
  def getVideoCaptureSelector(): String = js.native
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
  @scala.inline
  implicit class IMediaDeviceStaticsOps[Self <: IMediaDeviceStatics] (val x: Self) extends AnyVal {
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
    def setGetAudioCaptureSelector(value: () => String): Self = this.set("getAudioCaptureSelector", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAudioRenderSelector(value: () => String): Self = this.set("getAudioRenderSelector", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDefaultAudioCaptureId(value: AudioDeviceRole => String): Self = this.set("getDefaultAudioCaptureId", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDefaultAudioRenderId(value: AudioDeviceRole => String): Self = this.set("getDefaultAudioRenderId", js.Any.fromFunction1(value))
    @scala.inline
    def setGetVideoCaptureSelector(value: () => String): Self = this.set("getVideoCaptureSelector", js.Any.fromFunction0(value))
    @scala.inline
    def setOndefaultaudiocapturedevicechanged(value: js.Any): Self = this.set("ondefaultaudiocapturedevicechanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setOndefaultaudiorenderdevicechanged(value: js.Any): Self = this.set("ondefaultaudiorenderdevicechanged", value.asInstanceOf[js.Any])
  }
  
}

