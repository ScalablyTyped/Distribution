package typings.winrtUwp.global.Windows.Media.Capture

import typings.winrtUwp.Windows.Media.AudioProcessing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains read-only configuration settings for the MediaCapture object. */
@JSGlobal("Windows.Media.Capture.MediaCaptureSettings")
@js.native
abstract class MediaCaptureSettings ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Capture.MediaCaptureSettings {
  
  /** Gets the DeviceInformation.Id of the microphone. */
  /* CompleteClass */
  var audioDeviceId: String = js.native
  
  /** Gets the audio processing mode. */
  /* CompleteClass */
  var audioProcessing: AudioProcessing = js.native
  
  /** Gets a value that indicates if the operating system will make a sound when the capture device takes a picture. */
  /* CompleteClass */
  var cameraSoundRequiredForRegion: Boolean = js.native
  
  /** Gets a value that indicates if the capture device supports recording video and taking a photo sequence at the same time. */
  /* CompleteClass */
  var concurrentRecordAndPhotoSequenceSupported: Boolean = js.native
  
  /** Gets a value that indicates if the capture device supports recording video and taking a photo at the same time. */
  /* CompleteClass */
  var concurrentRecordAndPhotoSupported: Boolean = js.native
  
  /** Gets the horizontal 35mm equivalent focal length of the camera lens on the capture device. */
  /* CompleteClass */
  var horizontal35mmEquivalentFocalLength: Double = js.native
  
  /** Gets the media category of the media. */
  /* CompleteClass */
  var mediaCategory: typings.winrtUwp.Windows.Media.Capture.MediaCategory = js.native
  
  /** Gets the stream that is used for photo capture. */
  /* CompleteClass */
  var photoCaptureSource: typings.winrtUwp.Windows.Media.Capture.PhotoCaptureSource = js.native
  
  /** Gets the pitch offset of the camera in degrees. */
  /* CompleteClass */
  var pitchOffsetDegrees: Double = js.native
  
  /** Gets the streaming mode. */
  /* CompleteClass */
  var streamingCaptureMode: typings.winrtUwp.Windows.Media.Capture.StreamingCaptureMode = js.native
  
  /** Gets the vertical 35mm equivalent focal length of the camera lens on the capture device. */
  /* CompleteClass */
  var vertical35mmEquivalentFocalLength: Double = js.native
  
  /** Gets a value that indicates which video streams are independent of each other. */
  /* CompleteClass */
  var videoDeviceCharacteristic: typings.winrtUwp.Windows.Media.Capture.VideoDeviceCharacteristic = js.native
  
  /** Gets the DeviceInformation.Id of the video camera. */
  /* CompleteClass */
  var videoDeviceId: String = js.native
}
