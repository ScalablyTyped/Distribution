package typings.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMediaCaptureInitializationSettings extends StObject {
  
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
  implicit class IMediaCaptureInitializationSettingsMutableBuilder[Self <: IMediaCaptureInitializationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioDeviceId(value: String): Self = StObject.set(x, "audioDeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoCaptureSource(value: PhotoCaptureSource): Self = StObject.set(x, "photoCaptureSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingCaptureMode(value: StreamingCaptureMode): Self = StObject.set(x, "streamingCaptureMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDeviceId(value: String): Self = StObject.set(x, "videoDeviceId", value.asInstanceOf[js.Any])
  }
}
