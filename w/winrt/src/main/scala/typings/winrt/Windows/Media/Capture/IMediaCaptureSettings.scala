package typings.winrt.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaCaptureSettings extends js.Object {
  var audioDeviceId: String
  var photoCaptureSource: PhotoCaptureSource
  var streamingCaptureMode: StreamingCaptureMode
  var videoDeviceCharacteristic: VideoDeviceCharacteristic
  var videoDeviceId: String
}

object IMediaCaptureSettings {
  @scala.inline
  def apply(
    audioDeviceId: String,
    photoCaptureSource: PhotoCaptureSource,
    streamingCaptureMode: StreamingCaptureMode,
    videoDeviceCharacteristic: VideoDeviceCharacteristic,
    videoDeviceId: String
  ): IMediaCaptureSettings = {
    val __obj = js.Dynamic.literal(audioDeviceId = audioDeviceId.asInstanceOf[js.Any], photoCaptureSource = photoCaptureSource.asInstanceOf[js.Any], streamingCaptureMode = streamingCaptureMode.asInstanceOf[js.Any], videoDeviceCharacteristic = videoDeviceCharacteristic.asInstanceOf[js.Any], videoDeviceId = videoDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaCaptureSettings]
  }
}

