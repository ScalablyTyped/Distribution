package typings.winrtUwp.global.Windows.Media.Capture

import typings.winrtUwp.Windows.Media.AudioProcessing
import typings.winrtUwp.Windows.Media.Core.IMediaSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains initialization settings for the MediaCapture object which are passed to the MediaCapture.InitializeAsync method. */
@JSGlobal("Windows.Media.Capture.MediaCaptureInitializationSettings")
@js.native
/** Creates a new instance of the MediaCaptureInitializationSettings object. */
open class MediaCaptureInitializationSettings ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Capture.MediaCaptureInitializationSettings {
  
  /** Gets the DeviceInformation.Id of the microphone. */
  /* CompleteClass */
  var audioDeviceId: String = js.native
  
  /** Gets or sets a value that specifies the audio processing mode. */
  /* CompleteClass */
  var audioProcessing: AudioProcessing = js.native
  
  /** Gets or sets the audio source for the capture operation. */
  /* CompleteClass */
  var audioSource: IMediaSource = js.native
  
  /** Gets or set the media category. */
  /* CompleteClass */
  var mediaCategory: typings.winrtUwp.Windows.Media.Capture.MediaCategory = js.native
  
  /** Gets or sets the stream that is used for photo capture. */
  /* CompleteClass */
  var photoCaptureSource: typings.winrtUwp.Windows.Media.Capture.PhotoCaptureSource = js.native
  
  /** Gets or sets the media description for photo capture. */
  /* CompleteClass */
  var photoMediaDescription: typings.winrtUwp.Windows.Media.Capture.MediaCaptureVideoProfileMediaDescription = js.native
  
  /** Gets or sets the media description for preview video. */
  /* CompleteClass */
  var previewMediaDescription: typings.winrtUwp.Windows.Media.Capture.MediaCaptureVideoProfileMediaDescription = js.native
  
  /** Gets or sets the media description for video recording. */
  /* CompleteClass */
  var recordMediaDescription: typings.winrtUwp.Windows.Media.Capture.MediaCaptureVideoProfileMediaDescription = js.native
  
  /** Gets or sets the streaming mode. */
  /* CompleteClass */
  var streamingCaptureMode: typings.winrtUwp.Windows.Media.Capture.StreamingCaptureMode = js.native
  
  /** Gets the DeviceInformation.Id of the video camera. */
  /* CompleteClass */
  var videoDeviceId: String = js.native
  
  /** Gets or sets the video profile which provides hints to the driver to allow it to optimize for different capture scenarios. */
  /* CompleteClass */
  var videoProfile: typings.winrtUwp.Windows.Media.Capture.MediaCaptureVideoProfile = js.native
  
  /** Gets or sets the video source for the capture operation. */
  /* CompleteClass */
  var videoSource: IMediaSource = js.native
}
