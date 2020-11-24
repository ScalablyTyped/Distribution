package typings.winrt.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMediaCaptureInitializationSettings extends js.Object {
  
  var audioDeviceId: String = js.native
  
  var photoCaptureSource: PhotoCaptureSource = js.native
  
  var streamingCaptureMode: StreamingCaptureMode = js.native
  
  var videoDeviceId: String = js.native
}
object IMediaCaptureInitializationSettings {
  
  @scala.inline
  def apply(
    audioDeviceId: String,
    photoCaptureSource: PhotoCaptureSource,
    streamingCaptureMode: StreamingCaptureMode,
    videoDeviceId: String
  ): IMediaCaptureInitializationSettings = {
    val __obj = js.Dynamic.literal(audioDeviceId = audioDeviceId.asInstanceOf[js.Any], photoCaptureSource = photoCaptureSource.asInstanceOf[js.Any], streamingCaptureMode = streamingCaptureMode.asInstanceOf[js.Any], videoDeviceId = videoDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaCaptureInitializationSettings]
  }
  
  @scala.inline
  implicit class IMediaCaptureInitializationSettingsOps[Self <: IMediaCaptureInitializationSettings] (val x: Self) extends AnyVal {
    
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
    def setAudioDeviceId(value: String): Self = this.set("audioDeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoCaptureSource(value: PhotoCaptureSource): Self = this.set("photoCaptureSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingCaptureMode(value: StreamingCaptureMode): Self = this.set("streamingCaptureMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDeviceId(value: String): Self = this.set("videoDeviceId", value.asInstanceOf[js.Any])
  }
}
