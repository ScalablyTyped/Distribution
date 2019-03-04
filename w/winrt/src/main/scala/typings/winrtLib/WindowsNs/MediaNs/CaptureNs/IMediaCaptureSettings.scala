package typings
package winrtLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaCaptureSettings extends js.Object {
  var audioDeviceId: java.lang.String
  var photoCaptureSource: PhotoCaptureSource
  var streamingCaptureMode: StreamingCaptureMode
  var videoDeviceCharacteristic: VideoDeviceCharacteristic
  var videoDeviceId: java.lang.String
}

object IMediaCaptureSettings {
  @scala.inline
  def apply(
    audioDeviceId: java.lang.String,
    photoCaptureSource: PhotoCaptureSource,
    streamingCaptureMode: StreamingCaptureMode,
    videoDeviceCharacteristic: VideoDeviceCharacteristic,
    videoDeviceId: java.lang.String
  ): IMediaCaptureSettings = {
    val __obj = js.Dynamic.literal(audioDeviceId = audioDeviceId, photoCaptureSource = photoCaptureSource, streamingCaptureMode = streamingCaptureMode, videoDeviceCharacteristic = videoDeviceCharacteristic, videoDeviceId = videoDeviceId)
  
    __obj.asInstanceOf[IMediaCaptureSettings]
  }
}

