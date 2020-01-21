package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Media.AudioProcessing
import typings.winrtUwp.Windows.Media.Core.IMediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains initialization settings for the MediaCapture object which are passed to the MediaCapture.InitializeAsync method. */
@JSGlobal("Windows.Media.Capture.MediaCaptureInitializationSettings")
@js.native
/** Creates a new instance of the MediaCaptureInitializationSettings object. */
class MediaCaptureInitializationSettings () extends js.Object {
  /** Gets the DeviceInformation.Id of the microphone. */
  var audioDeviceId: String = js.native
  /** Gets or sets a value that specifies the audio processing mode. */
  var audioProcessing: AudioProcessing = js.native
  /** Gets or sets the audio source for the capture operation. */
  var audioSource: IMediaSource = js.native
  /** Gets or set the media category. */
  var mediaCategory: MediaCategory = js.native
  /** Gets or sets the stream that is used for photo capture. */
  var photoCaptureSource: PhotoCaptureSource = js.native
  /** Gets or sets the media description for photo capture. */
  var photoMediaDescription: MediaCaptureVideoProfileMediaDescription = js.native
  /** Gets or sets the media description for preview video. */
  var previewMediaDescription: MediaCaptureVideoProfileMediaDescription = js.native
  /** Gets or sets the media description for video recording. */
  var recordMediaDescription: MediaCaptureVideoProfileMediaDescription = js.native
  /** Gets or sets the streaming mode. */
  var streamingCaptureMode: StreamingCaptureMode = js.native
  /** Gets the DeviceInformation.Id of the video camera. */
  var videoDeviceId: String = js.native
  /** Gets or sets the video profile which provides hints to the driver to allow it to optimize for different capture scenarios. */
  var videoProfile: MediaCaptureVideoProfile = js.native
  /** Gets or sets the video source for the capture operation. */
  var videoSource: IMediaSource = js.native
}

