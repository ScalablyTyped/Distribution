package typings.winrt.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaCaptureInitializationSettings extends js.Object {
  var audioDeviceId: String
  var photoCaptureSource: PhotoCaptureSource
  var streamingCaptureMode: StreamingCaptureMode
  var videoDeviceId: String
}

object IMediaCaptureInitializationSettings {
  @scala.inline
  def apply(
    audioDeviceId: String,
    photoCaptureSource: PhotoCaptureSource,
    streamingCaptureMode: StreamingCaptureMode,
    videoDeviceId: String
  ): IMediaCaptureInitializationSettings = {
    val __obj = js.Dynamic.literal(audioDeviceId = audioDeviceId, photoCaptureSource = photoCaptureSource, streamingCaptureMode = streamingCaptureMode, videoDeviceId = videoDeviceId)
  
    __obj.asInstanceOf[IMediaCaptureInitializationSettings]
  }
}

