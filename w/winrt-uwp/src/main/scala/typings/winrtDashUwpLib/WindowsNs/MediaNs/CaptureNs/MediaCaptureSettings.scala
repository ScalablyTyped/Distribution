package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains read-only configuration settings for the MediaCapture object. */
@JSGlobal("Windows.Media.Capture.MediaCaptureSettings")
@js.native
abstract class MediaCaptureSettings () extends js.Object {
  /** Gets the DeviceInformation.Id of the microphone. */
  var audioDeviceId: java.lang.String = js.native
  /** Gets the audio processing mode. */
  var audioProcessing: winrtDashUwpLib.WindowsNs.MediaNs.AudioProcessing = js.native
  /** Gets a value that indicates if the operating system will make a sound when the capture device takes a picture. */
  var cameraSoundRequiredForRegion: scala.Boolean = js.native
  /** Gets a value that indicates if the capture device supports recording video and taking a photo sequence at the same time. */
  var concurrentRecordAndPhotoSequenceSupported: scala.Boolean = js.native
  /** Gets a value that indicates if the capture device supports recording video and taking a photo at the same time. */
  var concurrentRecordAndPhotoSupported: scala.Boolean = js.native
  /** Gets the horizontal 35mm equivalent focal length of the camera lens on the capture device. */
  var horizontal35mmEquivalentFocalLength: scala.Double = js.native
  /** Gets the media category of the media. */
  var mediaCategory: MediaCategory = js.native
  /** Gets the stream that is used for photo capture. */
  var photoCaptureSource: PhotoCaptureSource = js.native
  /** Gets the pitch offset of the camera in degrees. */
  var pitchOffsetDegrees: scala.Double = js.native
  /** Gets the streaming mode. */
  var streamingCaptureMode: StreamingCaptureMode = js.native
  /** Gets the vertical 35mm equivalent focal length of the camera lens on the capture device. */
  var vertical35mmEquivalentFocalLength: scala.Double = js.native
  /** Gets a value that indicates which video streams are independent of each other. */
  var videoDeviceCharacteristic: VideoDeviceCharacteristic = js.native
  /** Gets the DeviceInformation.Id of the video camera. */
  var videoDeviceId: java.lang.String = js.native
}

