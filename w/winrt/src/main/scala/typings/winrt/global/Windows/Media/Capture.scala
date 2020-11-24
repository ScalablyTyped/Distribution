package typings.winrt.global.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Media.Capture")
@js.native
object Capture extends js.Object {
  
  @js.native
  class CameraCaptureUI ()
    extends typings.winrt.Windows.Media.Capture.CameraCaptureUI
  
  @js.native
  object CameraCaptureUIMaxPhotoResolution extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution with Double
      ] = js.native
    
    /* 0 */ val highestAvailable: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.highestAvailable with Double = js.native
    
    /* 4 */ val large3M: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.large3M with Double = js.native
    
    /* 3 */ val mediumXga: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.mediumXga with Double = js.native
    
    /* 2 */ val smallVga: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.smallVga with Double = js.native
    
    /* 5 */ val veryLarge5M: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.veryLarge5M with Double = js.native
    
    /* 1 */ val verySmallQvga: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.verySmallQvga with Double = js.native
  }
  
  @js.native
  object CameraCaptureUIMaxVideoResolution extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxVideoResolution with Double
      ] = js.native
    
    /* 3 */ val highDefinition: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxVideoResolution.highDefinition with Double = js.native
    
    /* 0 */ val highestAvailable: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxVideoResolution.highestAvailable with Double = js.native
    
    /* 1 */ val lowDefinition: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxVideoResolution.lowDefinition with Double = js.native
    
    /* 2 */ val standardDefinition: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxVideoResolution.standardDefinition with Double = js.native
  }
  
  @js.native
  object CameraCaptureUIMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Capture.CameraCaptureUIMode with Double] = js.native
    
    /* 1 */ val photo: typings.winrt.Windows.Media.Capture.CameraCaptureUIMode.photo with Double = js.native
    
    /* 0 */ val photoOrVideo: typings.winrt.Windows.Media.Capture.CameraCaptureUIMode.photoOrVideo with Double = js.native
    
    /* 2 */ val video: typings.winrt.Windows.Media.Capture.CameraCaptureUIMode.video with Double = js.native
  }
  
  @js.native
  class CameraCaptureUIPhotoCaptureSettings ()
    extends typings.winrt.Windows.Media.Capture.CameraCaptureUIPhotoCaptureSettings
  
  @js.native
  object CameraCaptureUIPhotoFormat extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Capture.CameraCaptureUIPhotoFormat with Double] = js.native
    
    /* 0 */ val jpeg: typings.winrt.Windows.Media.Capture.CameraCaptureUIPhotoFormat.jpeg with Double = js.native
    
    /* 2 */ val jpegXR: typings.winrt.Windows.Media.Capture.CameraCaptureUIPhotoFormat.jpegXR with Double = js.native
    
    /* 1 */ val png: typings.winrt.Windows.Media.Capture.CameraCaptureUIPhotoFormat.png with Double = js.native
  }
  
  @js.native
  class CameraCaptureUIVideoCaptureSettings ()
    extends typings.winrt.Windows.Media.Capture.CameraCaptureUIVideoCaptureSettings
  
  @js.native
  object CameraCaptureUIVideoFormat extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Capture.CameraCaptureUIVideoFormat with Double] = js.native
    
    /* 0 */ val mp4: typings.winrt.Windows.Media.Capture.CameraCaptureUIVideoFormat.mp4 with Double = js.native
    
    /* 1 */ val wmv: typings.winrt.Windows.Media.Capture.CameraCaptureUIVideoFormat.wmv with Double = js.native
  }
  
  @js.native
  class CameraOptionsUI ()
    extends typings.winrt.Windows.Media.Capture.CameraOptionsUI
  /* static members */
  @js.native
  object CameraOptionsUI extends js.Object {
    
    def show(mediaCapture: typings.winrt.Windows.Media.Capture.MediaCapture): Unit = js.native
  }
  
  @js.native
  class MediaCapture ()
    extends typings.winrt.Windows.Media.Capture.MediaCapture
  
  @js.native
  class MediaCaptureFailedEventArgs ()
    extends typings.winrt.Windows.Media.Capture.MediaCaptureFailedEventArgs
  
  @js.native
  class MediaCaptureInitializationSettings ()
    extends typings.winrt.Windows.Media.Capture.MediaCaptureInitializationSettings
  
  @js.native
  class MediaCaptureSettings ()
    extends typings.winrt.Windows.Media.Capture.MediaCaptureSettings
  
  @js.native
  object MediaStreamType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Capture.MediaStreamType with Double] = js.native
    
    /* 2 */ val audio: typings.winrt.Windows.Media.Capture.MediaStreamType.audio with Double = js.native
    
    /* 3 */ val photo: typings.winrt.Windows.Media.Capture.MediaStreamType.photo with Double = js.native
    
    /* 0 */ val videoPreview: typings.winrt.Windows.Media.Capture.MediaStreamType.videoPreview with Double = js.native
    
    /* 1 */ val videoRecord: typings.winrt.Windows.Media.Capture.MediaStreamType.videoRecord with Double = js.native
  }
  
  @js.native
  object PhotoCaptureSource extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Capture.PhotoCaptureSource with Double] = js.native
    
    /* 0 */ val auto: typings.winrt.Windows.Media.Capture.PhotoCaptureSource.auto with Double = js.native
    
    /* 2 */ val photo: typings.winrt.Windows.Media.Capture.PhotoCaptureSource.photo with Double = js.native
    
    /* 1 */ val videoPreview: typings.winrt.Windows.Media.Capture.PhotoCaptureSource.videoPreview with Double = js.native
  }
  
  @js.native
  object PowerlineFrequency extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Capture.PowerlineFrequency with Double] = js.native
    
    /* 0 */ val disabled: typings.winrt.Windows.Media.Capture.PowerlineFrequency.disabled with Double = js.native
    
    /* 1 */ val fiftyHertz: typings.winrt.Windows.Media.Capture.PowerlineFrequency.fiftyHertz with Double = js.native
    
    /* 2 */ val sixtyHertz: typings.winrt.Windows.Media.Capture.PowerlineFrequency.sixtyHertz with Double = js.native
  }
  
  @js.native
  object StreamingCaptureMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Capture.StreamingCaptureMode with Double] = js.native
    
    /* 1 */ val audio: typings.winrt.Windows.Media.Capture.StreamingCaptureMode.audio with Double = js.native
    
    /* 0 */ val audioAndVideo: typings.winrt.Windows.Media.Capture.StreamingCaptureMode.audioAndVideo with Double = js.native
    
    /* 2 */ val video: typings.winrt.Windows.Media.Capture.StreamingCaptureMode.video with Double = js.native
  }
  
  @js.native
  object VideoDeviceCharacteristic extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Capture.VideoDeviceCharacteristic with Double] = js.native
    
    /* 4 */ val allStreamsIdentical: typings.winrt.Windows.Media.Capture.VideoDeviceCharacteristic.allStreamsIdentical with Double = js.native
    
    /* 0 */ val allStreamsIndependent: typings.winrt.Windows.Media.Capture.VideoDeviceCharacteristic.allStreamsIndependent with Double = js.native
    
    /* 2 */ val previewPhotoStreamsIdentical: typings.winrt.Windows.Media.Capture.VideoDeviceCharacteristic.previewPhotoStreamsIdentical with Double = js.native
    
    /* 1 */ val previewRecordStreamsIdentical: typings.winrt.Windows.Media.Capture.VideoDeviceCharacteristic.previewRecordStreamsIdentical with Double = js.native
    
    /* 3 */ val recordPhotoStreamsIdentical: typings.winrt.Windows.Media.Capture.VideoDeviceCharacteristic.recordPhotoStreamsIdentical with Double = js.native
  }
  
  @js.native
  object VideoRotation extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Capture.VideoRotation with Double] = js.native
    
    /* 2 */ val clockwise180Degrees: typings.winrt.Windows.Media.Capture.VideoRotation.clockwise180Degrees with Double = js.native
    
    /* 3 */ val clockwise270Degrees: typings.winrt.Windows.Media.Capture.VideoRotation.clockwise270Degrees with Double = js.native
    
    /* 1 */ val clockwise90Degrees: typings.winrt.Windows.Media.Capture.VideoRotation.clockwise90Degrees with Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Media.Capture.VideoRotation.none with Double = js.native
  }
}
