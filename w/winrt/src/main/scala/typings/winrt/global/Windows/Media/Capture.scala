package typings.winrt.global.Windows.Media

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Size
import typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution
import typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxVideoResolution
import typings.winrt.Windows.Media.Capture.CameraCaptureUIMode
import typings.winrt.Windows.Media.Capture.CameraCaptureUIPhotoFormat
import typings.winrt.Windows.Media.Capture.CameraCaptureUIVideoFormat
import typings.winrt.Windows.Media.Capture.PhotoCaptureSource
import typings.winrt.Windows.Media.Capture.StreamingCaptureMode
import typings.winrt.Windows.Media.Capture.VideoDeviceCharacteristic
import typings.winrt.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Capture {
  
  @JSGlobal("Windows.Media.Capture.CameraCaptureUI")
  @js.native
  class CameraCaptureUI ()
    extends StObject
       with typings.winrt.Windows.Media.Capture.CameraCaptureUI {
    
    /* CompleteClass */
    override def captureFileAsync(mode: CameraCaptureUIMode): IAsyncOperation[StorageFile] = js.native
    
    /* CompleteClass */
    var photoSettings: typings.winrt.Windows.Media.Capture.CameraCaptureUIPhotoCaptureSettings = js.native
    
    /* CompleteClass */
    var videoSettings: typings.winrt.Windows.Media.Capture.CameraCaptureUIVideoCaptureSettings = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution")
  @js.native
  object CameraCaptureUIMaxPhotoResolution extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution & Double] = js.native
    
    /* 0 */ val highestAvailable: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.highestAvailable & Double = js.native
    
    /* 4 */ val large3M: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.large3M & Double = js.native
    
    /* 3 */ val mediumXga: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.mediumXga & Double = js.native
    
    /* 2 */ val smallVga: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.smallVga & Double = js.native
    
    /* 5 */ val veryLarge5M: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.veryLarge5M & Double = js.native
    
    /* 1 */ val verySmallQvga: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.verySmallQvga & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.CameraCaptureUIMaxVideoResolution")
  @js.native
  object CameraCaptureUIMaxVideoResolution extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxVideoResolution & Double] = js.native
    
    /* 3 */ val highDefinition: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxVideoResolution.highDefinition & Double = js.native
    
    /* 0 */ val highestAvailable: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxVideoResolution.highestAvailable & Double = js.native
    
    /* 1 */ val lowDefinition: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxVideoResolution.lowDefinition & Double = js.native
    
    /* 2 */ val standardDefinition: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxVideoResolution.standardDefinition & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.CameraCaptureUIMode")
  @js.native
  object CameraCaptureUIMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Capture.CameraCaptureUIMode & Double] = js.native
    
    /* 1 */ val photo: typings.winrt.Windows.Media.Capture.CameraCaptureUIMode.photo & Double = js.native
    
    /* 0 */ val photoOrVideo: typings.winrt.Windows.Media.Capture.CameraCaptureUIMode.photoOrVideo & Double = js.native
    
    /* 2 */ val video: typings.winrt.Windows.Media.Capture.CameraCaptureUIMode.video & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.CameraCaptureUIPhotoCaptureSettings")
  @js.native
  class CameraCaptureUIPhotoCaptureSettings ()
    extends StObject
       with typings.winrt.Windows.Media.Capture.CameraCaptureUIPhotoCaptureSettings {
    
    /* CompleteClass */
    var allowCropping: Boolean = js.native
    
    /* CompleteClass */
    var croppedAspectRatio: Size = js.native
    
    /* CompleteClass */
    var croppedSizeInPixels: Size = js.native
    
    /* CompleteClass */
    var format: CameraCaptureUIPhotoFormat = js.native
    
    /* CompleteClass */
    var maxResolution: CameraCaptureUIMaxPhotoResolution = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.CameraCaptureUIPhotoFormat")
  @js.native
  object CameraCaptureUIPhotoFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Capture.CameraCaptureUIPhotoFormat & Double] = js.native
    
    /* 0 */ val jpeg: typings.winrt.Windows.Media.Capture.CameraCaptureUIPhotoFormat.jpeg & Double = js.native
    
    /* 2 */ val jpegXR: typings.winrt.Windows.Media.Capture.CameraCaptureUIPhotoFormat.jpegXR & Double = js.native
    
    /* 1 */ val png: typings.winrt.Windows.Media.Capture.CameraCaptureUIPhotoFormat.png & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.CameraCaptureUIVideoCaptureSettings")
  @js.native
  class CameraCaptureUIVideoCaptureSettings ()
    extends StObject
       with typings.winrt.Windows.Media.Capture.CameraCaptureUIVideoCaptureSettings {
    
    /* CompleteClass */
    var allowTrimming: Boolean = js.native
    
    /* CompleteClass */
    var format: CameraCaptureUIVideoFormat = js.native
    
    /* CompleteClass */
    var maxDurationInSeconds: Double = js.native
    
    /* CompleteClass */
    var maxResolution: CameraCaptureUIMaxVideoResolution = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.CameraCaptureUIVideoFormat")
  @js.native
  object CameraCaptureUIVideoFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Capture.CameraCaptureUIVideoFormat & Double] = js.native
    
    /* 0 */ val mp4: typings.winrt.Windows.Media.Capture.CameraCaptureUIVideoFormat.mp4 & Double = js.native
    
    /* 1 */ val wmv: typings.winrt.Windows.Media.Capture.CameraCaptureUIVideoFormat.wmv & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.CameraOptionsUI")
  @js.native
  class CameraOptionsUI ()
    extends StObject
       with typings.winrt.Windows.Media.Capture.CameraOptionsUI
  /* static members */
  object CameraOptionsUI {
    
    @JSGlobal("Windows.Media.Capture.CameraOptionsUI")
    @js.native
    val ^ : js.Any = js.native
    
    inline def show(mediaCapture: typings.winrt.Windows.Media.Capture.MediaCapture): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(mediaCapture.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSGlobal("Windows.Media.Capture.MediaCapture")
  @js.native
  class MediaCapture ()
    extends StObject
       with typings.winrt.Windows.Media.Capture.MediaCapture
  
  @JSGlobal("Windows.Media.Capture.MediaCaptureFailedEventArgs")
  @js.native
  class MediaCaptureFailedEventArgs ()
    extends StObject
       with typings.winrt.Windows.Media.Capture.MediaCaptureFailedEventArgs {
    
    /* CompleteClass */
    var code: Double = js.native
    
    /* CompleteClass */
    var message: String = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.MediaCaptureInitializationSettings")
  @js.native
  class MediaCaptureInitializationSettings ()
    extends StObject
       with typings.winrt.Windows.Media.Capture.MediaCaptureInitializationSettings {
    
    /* CompleteClass */
    var audioDeviceId: String = js.native
    
    /* CompleteClass */
    var photoCaptureSource: PhotoCaptureSource = js.native
    
    /* CompleteClass */
    var streamingCaptureMode: StreamingCaptureMode = js.native
    
    /* CompleteClass */
    var videoDeviceId: String = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.MediaCaptureSettings")
  @js.native
  class MediaCaptureSettings ()
    extends StObject
       with typings.winrt.Windows.Media.Capture.MediaCaptureSettings {
    
    /* CompleteClass */
    var audioDeviceId: String = js.native
    
    /* CompleteClass */
    var photoCaptureSource: PhotoCaptureSource = js.native
    
    /* CompleteClass */
    var streamingCaptureMode: StreamingCaptureMode = js.native
    
    /* CompleteClass */
    var videoDeviceCharacteristic: VideoDeviceCharacteristic = js.native
    
    /* CompleteClass */
    var videoDeviceId: String = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.MediaStreamType")
  @js.native
  object MediaStreamType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Capture.MediaStreamType & Double] = js.native
    
    /* 2 */ val audio: typings.winrt.Windows.Media.Capture.MediaStreamType.audio & Double = js.native
    
    /* 3 */ val photo: typings.winrt.Windows.Media.Capture.MediaStreamType.photo & Double = js.native
    
    /* 0 */ val videoPreview: typings.winrt.Windows.Media.Capture.MediaStreamType.videoPreview & Double = js.native
    
    /* 1 */ val videoRecord: typings.winrt.Windows.Media.Capture.MediaStreamType.videoRecord & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.PhotoCaptureSource")
  @js.native
  object PhotoCaptureSource extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Capture.PhotoCaptureSource & Double] = js.native
    
    /* 0 */ val auto: typings.winrt.Windows.Media.Capture.PhotoCaptureSource.auto & Double = js.native
    
    /* 2 */ val photo: typings.winrt.Windows.Media.Capture.PhotoCaptureSource.photo & Double = js.native
    
    /* 1 */ val videoPreview: typings.winrt.Windows.Media.Capture.PhotoCaptureSource.videoPreview & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.PowerlineFrequency")
  @js.native
  object PowerlineFrequency extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Capture.PowerlineFrequency & Double] = js.native
    
    /* 0 */ val disabled: typings.winrt.Windows.Media.Capture.PowerlineFrequency.disabled & Double = js.native
    
    /* 1 */ val fiftyHertz: typings.winrt.Windows.Media.Capture.PowerlineFrequency.fiftyHertz & Double = js.native
    
    /* 2 */ val sixtyHertz: typings.winrt.Windows.Media.Capture.PowerlineFrequency.sixtyHertz & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.StreamingCaptureMode")
  @js.native
  object StreamingCaptureMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Capture.StreamingCaptureMode & Double] = js.native
    
    /* 1 */ val audio: typings.winrt.Windows.Media.Capture.StreamingCaptureMode.audio & Double = js.native
    
    /* 0 */ val audioAndVideo: typings.winrt.Windows.Media.Capture.StreamingCaptureMode.audioAndVideo & Double = js.native
    
    /* 2 */ val video: typings.winrt.Windows.Media.Capture.StreamingCaptureMode.video & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.VideoDeviceCharacteristic")
  @js.native
  object VideoDeviceCharacteristic extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Capture.VideoDeviceCharacteristic & Double] = js.native
    
    /* 4 */ val allStreamsIdentical: typings.winrt.Windows.Media.Capture.VideoDeviceCharacteristic.allStreamsIdentical & Double = js.native
    
    /* 0 */ val allStreamsIndependent: typings.winrt.Windows.Media.Capture.VideoDeviceCharacteristic.allStreamsIndependent & Double = js.native
    
    /* 2 */ val previewPhotoStreamsIdentical: typings.winrt.Windows.Media.Capture.VideoDeviceCharacteristic.previewPhotoStreamsIdentical & Double = js.native
    
    /* 1 */ val previewRecordStreamsIdentical: typings.winrt.Windows.Media.Capture.VideoDeviceCharacteristic.previewRecordStreamsIdentical & Double = js.native
    
    /* 3 */ val recordPhotoStreamsIdentical: typings.winrt.Windows.Media.Capture.VideoDeviceCharacteristic.recordPhotoStreamsIdentical & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.VideoRotation")
  @js.native
  object VideoRotation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Capture.VideoRotation & Double] = js.native
    
    /* 2 */ val clockwise180Degrees: typings.winrt.Windows.Media.Capture.VideoRotation.clockwise180Degrees & Double = js.native
    
    /* 3 */ val clockwise270Degrees: typings.winrt.Windows.Media.Capture.VideoRotation.clockwise270Degrees & Double = js.native
    
    /* 1 */ val clockwise90Degrees: typings.winrt.Windows.Media.Capture.VideoRotation.clockwise90Degrees & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Media.Capture.VideoRotation.none & Double = js.native
  }
}
