package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Media.AudioProcessing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains read-only configuration settings for the MediaCapture object. */
trait MediaCaptureSettings extends js.Object {
  /** Gets the DeviceInformation.Id of the microphone. */
  var audioDeviceId: String
  /** Gets the audio processing mode. */
  var audioProcessing: AudioProcessing
  /** Gets a value that indicates if the operating system will make a sound when the capture device takes a picture. */
  var cameraSoundRequiredForRegion: Boolean
  /** Gets a value that indicates if the capture device supports recording video and taking a photo sequence at the same time. */
  var concurrentRecordAndPhotoSequenceSupported: Boolean
  /** Gets a value that indicates if the capture device supports recording video and taking a photo at the same time. */
  var concurrentRecordAndPhotoSupported: Boolean
  /** Gets the horizontal 35mm equivalent focal length of the camera lens on the capture device. */
  var horizontal35mmEquivalentFocalLength: Double
  /** Gets the media category of the media. */
  var mediaCategory: MediaCategory
  /** Gets the stream that is used for photo capture. */
  var photoCaptureSource: PhotoCaptureSource
  /** Gets the pitch offset of the camera in degrees. */
  var pitchOffsetDegrees: Double
  /** Gets the streaming mode. */
  var streamingCaptureMode: StreamingCaptureMode
  /** Gets the vertical 35mm equivalent focal length of the camera lens on the capture device. */
  var vertical35mmEquivalentFocalLength: Double
  /** Gets a value that indicates which video streams are independent of each other. */
  var videoDeviceCharacteristic: VideoDeviceCharacteristic
  /** Gets the DeviceInformation.Id of the video camera. */
  var videoDeviceId: String
}

object MediaCaptureSettings {
  @scala.inline
  def apply(
    audioDeviceId: String,
    audioProcessing: AudioProcessing,
    cameraSoundRequiredForRegion: Boolean,
    concurrentRecordAndPhotoSequenceSupported: Boolean,
    concurrentRecordAndPhotoSupported: Boolean,
    horizontal35mmEquivalentFocalLength: Double,
    mediaCategory: MediaCategory,
    photoCaptureSource: PhotoCaptureSource,
    pitchOffsetDegrees: Double,
    streamingCaptureMode: StreamingCaptureMode,
    vertical35mmEquivalentFocalLength: Double,
    videoDeviceCharacteristic: VideoDeviceCharacteristic,
    videoDeviceId: String
  ): MediaCaptureSettings = {
    val __obj = js.Dynamic.literal(audioDeviceId = audioDeviceId.asInstanceOf[js.Any], audioProcessing = audioProcessing.asInstanceOf[js.Any], cameraSoundRequiredForRegion = cameraSoundRequiredForRegion.asInstanceOf[js.Any], concurrentRecordAndPhotoSequenceSupported = concurrentRecordAndPhotoSequenceSupported.asInstanceOf[js.Any], concurrentRecordAndPhotoSupported = concurrentRecordAndPhotoSupported.asInstanceOf[js.Any], horizontal35mmEquivalentFocalLength = horizontal35mmEquivalentFocalLength.asInstanceOf[js.Any], mediaCategory = mediaCategory.asInstanceOf[js.Any], photoCaptureSource = photoCaptureSource.asInstanceOf[js.Any], pitchOffsetDegrees = pitchOffsetDegrees.asInstanceOf[js.Any], streamingCaptureMode = streamingCaptureMode.asInstanceOf[js.Any], vertical35mmEquivalentFocalLength = vertical35mmEquivalentFocalLength.asInstanceOf[js.Any], videoDeviceCharacteristic = videoDeviceCharacteristic.asInstanceOf[js.Any], videoDeviceId = videoDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCaptureSettings]
  }
}

