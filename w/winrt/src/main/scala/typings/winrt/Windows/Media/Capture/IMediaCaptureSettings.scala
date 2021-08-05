package typings.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMediaCaptureSettings extends StObject {
  
  var audioDeviceId: String
  
  var photoCaptureSource: PhotoCaptureSource
  
  var streamingCaptureMode: StreamingCaptureMode
  
  var videoDeviceCharacteristic: VideoDeviceCharacteristic
  
  var videoDeviceId: String
}
object IMediaCaptureSettings {
  
  inline def apply(
    audioDeviceId: String,
    photoCaptureSource: PhotoCaptureSource,
    streamingCaptureMode: StreamingCaptureMode,
    videoDeviceCharacteristic: VideoDeviceCharacteristic,
    videoDeviceId: String
  ): IMediaCaptureSettings = {
    val __obj = js.Dynamic.literal(audioDeviceId = audioDeviceId.asInstanceOf[js.Any], photoCaptureSource = photoCaptureSource.asInstanceOf[js.Any], streamingCaptureMode = streamingCaptureMode.asInstanceOf[js.Any], videoDeviceCharacteristic = videoDeviceCharacteristic.asInstanceOf[js.Any], videoDeviceId = videoDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaCaptureSettings]
  }
  
  extension [Self <: IMediaCaptureSettings](x: Self) {
    
    inline def setAudioDeviceId(value: String): Self = StObject.set(x, "audioDeviceId", value.asInstanceOf[js.Any])
    
    inline def setPhotoCaptureSource(value: PhotoCaptureSource): Self = StObject.set(x, "photoCaptureSource", value.asInstanceOf[js.Any])
    
    inline def setStreamingCaptureMode(value: StreamingCaptureMode): Self = StObject.set(x, "streamingCaptureMode", value.asInstanceOf[js.Any])
    
    inline def setVideoDeviceCharacteristic(value: VideoDeviceCharacteristic): Self = StObject.set(x, "videoDeviceCharacteristic", value.asInstanceOf[js.Any])
    
    inline def setVideoDeviceId(value: String): Self = StObject.set(x, "videoDeviceId", value.asInstanceOf[js.Any])
  }
}
