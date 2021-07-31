package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Media.Capture.Core.VariablePhotoSequenceCapture
import typings.winrtUwp.Windows.Media.Devices.AudioDeviceController
import typings.winrtUwp.Windows.Media.Devices.CameraStreamState
import typings.winrtUwp.Windows.Media.Devices.MediaCapturePauseBehavior
import typings.winrtUwp.Windows.Media.Devices.VideoDeviceController
import typings.winrtUwp.Windows.Media.Effects.IAudioEffectDefinition
import typings.winrtUwp.Windows.Media.Effects.IVideoEffectDefinition
import typings.winrtUwp.Windows.Media.IMediaExtension
import typings.winrtUwp.Windows.Media.MediaProperties.IMediaEncodingProperties
import typings.winrtUwp.Windows.Media.MediaProperties.ImageEncodingProperties
import typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile
import typings.winrtUwp.Windows.Media.MediaProperties.MediaPropertySet
import typings.winrtUwp.Windows.Media.VideoFrame
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.camerastreamstatechanged
import typings.winrtUwp.winrtUwpStrings.failed
import typings.winrtUwp.winrtUwpStrings.focuschanged
import typings.winrtUwp.winrtUwpStrings.photoconfirmationcaptured
import typings.winrtUwp.winrtUwpStrings.recordlimitationexceeded
import typings.winrtUwp.winrtUwpStrings.thermalstatuschanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for capturing photos, audio, and videos from a capture device, such as a webcam. */
@js.native
trait MediaCapture extends StObject {
  
  /**
    * Adds an audio effect to the capture pipeline.
    * @param definition The object containing the definition of the effect to be added.
    * @return An asynchronous operation that returns an IMediaExtension upon successful completion.
    */
  def addAudioEffectAsync(definition: IAudioEffectDefinition): IPromiseWithIAsyncOperation[IMediaExtension] = js.native
  
  /**
    * Adds an audio or video effect.
    * @param mediaStreamType Specifies the streams to which the effect will be applied.
    * @param effectActivationID The class identifier of the activatable runtime class that implements the effect. The runtime class must implement the IMediaExtension interface.
    * @param effectSettings Configuration parameters for the effect.
    * @return Returns an IAsyncAction object that is used to control the asynchronous operation.
    */
  def addEffectAsync(mediaStreamType: MediaStreamType, effectActivationID: String, effectSettings: IPropertySet): IPromiseWithIAsyncAction = js.native
  
  def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_camerastreamstatechanged(`type`: camerastreamstatechanged, listener: TypedEventHandler[MediaCapture, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_failed(`type`: failed, listener: MediaCaptureFailedEventHandler): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focuschanged(`type`: focuschanged, listener: TypedEventHandler[MediaCapture, MediaCaptureFocusChangedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_photoconfirmationcaptured(
    `type`: photoconfirmationcaptured,
    listener: TypedEventHandler[MediaCapture, PhotoConfirmationCapturedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_recordlimitationexceeded(`type`: recordlimitationexceeded, listener: RecordLimitationExceededEventHandler): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thermalstatuschanged(`type`: thermalstatuschanged, listener: TypedEventHandler[MediaCapture, js.Any]): Unit = js.native
  
  /**
    * Adds a video effect to the capture pipeline.
    * @param definition The object containing the definition of the effect to be added.
    * @param mediaStreamType Specifies the streams to which the effect will be applied.
    * @return An asynchronous operation that returns an IMediaExtension upon successful completion.
    */
  def addVideoEffectAsync(definition: IVideoEffectDefinition, mediaStreamType: MediaStreamType): IPromiseWithIAsyncOperation[IMediaExtension] = js.native
  
  /** Gets an object that controls settings for the microphone. */
  var audioDeviceController: AudioDeviceController = js.native
  
  /** Gets the current stream state of the camera stream. */
  var cameraStreamState: CameraStreamState = js.native
  
  /**
    * Captures a photo to a storage file.
    * @param type The encoding properties for the output image.
    * @param file The storage file where the image is saved.
    * @return Returns an IAsyncAction object that is used to control the asynchronous operation.
    */
  def capturePhotoToStorageFileAsync(`type`: ImageEncodingProperties, file: IStorageFile): IPromiseWithIAsyncAction = js.native
  
  /**
    * Captures a photo to a random-access stream.
    * @param type The encoding properties for the output image.
    * @param stream The stream where the image data is written.
    * @return Returns an IAsyncAction object that is used to control the asynchronous operation.
    */
  def capturePhotoToStreamAsync(`type`: ImageEncodingProperties, stream: IRandomAccessStream): IPromiseWithIAsyncAction = js.native
  
  /**
    * Removes all audio and video effects from a stream.
    * @param mediaStreamType The stream from which to remove the effects.
    * @return Returns a IAsyncAction object that is used to control the asynchronous operation.
    */
  def clearEffectsAsync(mediaStreamType: MediaStreamType): IPromiseWithIAsyncAction = js.native
  
  /** Closes the media capture object. */
  def close(): Unit = js.native
  
  /**
    * Gets the value of an encoding property.
    * @param mediaStreamType Specifies the stream to query for the encoding property.
    * @param propertyId The encoding property to retrieve.
    * @return Returns the value of the encoding property.
    */
  def getEncoderProperty(mediaStreamType: MediaStreamType, propertyId: String): js.Any = js.native
  
  /**
    * Gets a preview frame from the capture device.
    * @return An asynchronous operation that returns a VideoFrame on successful completion.
    */
  def getPreviewFrameAsync(): IPromiseWithIAsyncOperation[VideoFrame] = js.native
  /**
    * Gets a preview frame from the capture device, copied into the provided destination VideoFrame and converted into the destination frame's format.
    * @param destination The video frame into which the preview frame will be copied.
    * @return An asynchronous operation that returns a VideoFrame on successful completion.
    */
  def getPreviewFrameAsync(destination: VideoFrame): IPromiseWithIAsyncOperation[VideoFrame] = js.native
  
  /**
    * Queries whether the video stream is mirrored horizontally.
    * @return True if mirroring is enabled; false otherwise.
    */
  def getPreviewMirroring(): Boolean = js.native
  
  /**
    * Gets the rotation of the video preview stream.
    * @return The amount by which the video preview stream is rotated.
    */
  def getPreviewRotation(): VideoRotation = js.native
  
  /**
    * Gets the rotation of the recorded video.
    * @return The amount by which the recorded video is rotated.
    */
  def getRecordRotation(): VideoRotation = js.native
  
  /**
    * Initializes the MediaCapture object, using default settings.
    * @return Returns a IAsyncAction object that is used to control the asynchronous operation.
    */
  def initializeAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Initializes the MediaCapture object.
    * @param mediaCaptureInitializationSettings The initialization settings.
    * @return Returns a IAsyncAction object that is used to control the asynchronous operation.
    */
  def initializeAsync(mediaCaptureInitializationSettings: MediaCaptureInitializationSettings): IPromiseWithIAsyncAction = js.native
  
  /** Gets the configuration settings for the MediaCapture object. */
  var mediaCaptureSettings: MediaCaptureSettings = js.native
  
  /** Occurs when the state of the camera stream changes. */
  def oncamerastreamstatechanged(ev: js.Any & WinRTEvent[MediaCapture]): Unit = js.native
  /** Occurs when the state of the camera stream changes. */
  @JSName("oncamerastreamstatechanged")
  var oncamerastreamstatechanged_Original: TypedEventHandler[MediaCapture, js.Any] = js.native
  
  /** Raised when an error occurs during media capture. */
  def onfailed(ev: MediaCaptureFailedEventArgs & WinRTEvent[MediaCapture]): Unit = js.native
  /** Raised when an error occurs during media capture. */
  @JSName("onfailed")
  var onfailed_Original: MediaCaptureFailedEventHandler = js.native
  
  /** Occurs when the capture device changes focus. */
  def onfocuschanged(ev: MediaCaptureFocusChangedEventArgs & WinRTEvent[MediaCapture]): Unit = js.native
  /** Occurs when the capture device changes focus. */
  @JSName("onfocuschanged")
  var onfocuschanged_Original: TypedEventHandler[MediaCapture, MediaCaptureFocusChangedEventArgs] = js.native
  
  /** Occurs when a photo confirmation frame is captured. */
  def onphotoconfirmationcaptured(ev: PhotoConfirmationCapturedEventArgs & WinRTEvent[MediaCapture]): Unit = js.native
  /** Occurs when a photo confirmation frame is captured. */
  @JSName("onphotoconfirmationcaptured")
  var onphotoconfirmationcaptured_Original: TypedEventHandler[MediaCapture, PhotoConfirmationCapturedEventArgs] = js.native
  
  /** Occurs when the record limit is exceeded. */
  def onrecordlimitationexceeded(ev: WinRTEvent[MediaCapture]): Unit = js.native
  /** Occurs when the record limit is exceeded. */
  @JSName("onrecordlimitationexceeded")
  var onrecordlimitationexceeded_Original: RecordLimitationExceededEventHandler = js.native
  
  /** Occurs when the thermal status of the capture device changes. */
  def onthermalstatuschanged(ev: js.Any & WinRTEvent[MediaCapture]): Unit = js.native
  /** Occurs when the thermal status of the capture device changes. */
  @JSName("onthermalstatuschanged")
  var onthermalstatuschanged_Original: TypedEventHandler[MediaCapture, js.Any] = js.native
  
  /**
    * Pauses an ongoing record operation.
    * @param behavior A value indicating whether the media capture hardware resources should be preserved or released while recording is paused.
    * @return An asynchronous action.
    */
  def pauseRecordAsync(behavior: MediaCapturePauseBehavior): IPromiseWithIAsyncAction = js.native
  
  /**
    * Initializes the advanced photo capture and provides the AdvancedPhotoCapture object used to manage the recording.
    * @param encodingProperties The encoding properties used for the resulting image.
    * @return An asynchronous operation that returns an AdvancedPhotoCapture object on successful completion.
    */
  def prepareAdvancedPhotoCaptureAsync(encodingProperties: ImageEncodingProperties): IPromiseWithIAsyncOperation[AdvancedPhotoCapture] = js.native
  
  /**
    * Initializes the low shutter lag photo capture and provides the LowLagPhotoCapture object used to manage the recording.
    * @param type The encoding profile used for the image.
    * @return When this method completes, a LowLagPhotoCapture object is returned which can be used to start the photo capture.
    */
  def prepareLowLagPhotoCaptureAsync(`type`: ImageEncodingProperties): IPromiseWithIAsyncOperation[LowLagPhotoCapture] = js.native
  
  /**
    * Initializes the low shutter lag photo sequence capture and provides the LowLagPhotoSequenceCapture object used to manage the recording.
    * @param type The encoding profile used for the image.
    * @return When this method completes, a LowLagPhotoSequenceCapture object is returned which can be used to start the photo sequence capture.
    */
  def prepareLowLagPhotoSequenceCaptureAsync(`type`: ImageEncodingProperties): IPromiseWithIAsyncOperation[LowLagPhotoSequenceCapture] = js.native
  
  /**
    * Initializes the low lag recording using the specified custom sink to store the recording. This method provides the LowLagMediaRecording object used to managed the capture.
    * @param encodingProfile The encoding profile to use for the recording.
    * @param customMediaSink The media extension for the custom media sink.
    * @return When this method completes, a LowLagMediaRecording object is returned which can be used to start the photo capture.
    */
  def prepareLowLagRecordToCustomSinkAsync(encodingProfile: MediaEncodingProfile, customMediaSink: IMediaExtension): IPromiseWithIAsyncOperation[LowLagMediaRecording] = js.native
  /**
    * Initializes the low lag recording using the specified custom sink to store the recording. This method provides the LowLagMediaRecording object used to managed the recording.
    * @param encodingProfile The encoding profile to use for the recording.
    * @param customSinkActivationId The activatable class ID of the media extension for the custom media sink.
    * @param customSinkSettings Contains properties of the media extension.
    * @return When this method completes, a LowLagMediaRecording object is returned which can be used to start the photo capture.
    */
  def prepareLowLagRecordToCustomSinkAsync(
    encodingProfile: MediaEncodingProfile,
    customSinkActivationId: String,
    customSinkSettings: IPropertySet
  ): IPromiseWithIAsyncOperation[LowLagMediaRecording] = js.native
  
  /**
    * Initializes the low lag recording using the specified file to store the recording. This method provides the LowLagMediaRecording object used to managed the recording.
    * @param encodingProfile The encoding profile for the recording.
    * @param file The storage file where the image is saved.
    * @return When this method completes, a LowLagMediaRecording object is returned which can be used to start the photo capture.
    */
  def prepareLowLagRecordToStorageFileAsync(encodingProfile: MediaEncodingProfile, file: IStorageFile): IPromiseWithIAsyncOperation[LowLagMediaRecording] = js.native
  
  /**
    * Initializes the low lag recording using the specified random-access stream to store the recording. This method provides the LowLagMediaRecording object used to managed the recording.
    * @param encodingProfile The encoding profile for the recording.
    * @param stream The stream where the image data is written.
    * @return When this method completes, a LowLagMediaRecording object is returned which can be used to start the photo capture.
    */
  def prepareLowLagRecordToStreamAsync(encodingProfile: MediaEncodingProfile, stream: IRandomAccessStream): IPromiseWithIAsyncOperation[LowLagMediaRecording] = js.native
  
  /**
    * Initializes the variable photo sequence capture and provides the VariablePhotoSequenceCapture object used to manage the recording.
    * @param type The encoding profile used for the image.
    * @return When this method completes, a VariablePhotoSequenceCapture object is returned which can be used to start the photo sequence capture.
    */
  def prepareVariablePhotoSequenceCaptureAsync(`type`: ImageEncodingProperties): IPromiseWithIAsyncOperation[VariablePhotoSequenceCapture] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_camerastreamstatechanged(`type`: camerastreamstatechanged, listener: TypedEventHandler[MediaCapture, js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_failed(`type`: failed, listener: MediaCaptureFailedEventHandler): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focuschanged(`type`: focuschanged, listener: TypedEventHandler[MediaCapture, MediaCaptureFocusChangedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_photoconfirmationcaptured(
    `type`: photoconfirmationcaptured,
    listener: TypedEventHandler[MediaCapture, PhotoConfirmationCapturedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_recordlimitationexceeded(`type`: recordlimitationexceeded, listener: RecordLimitationExceededEventHandler): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_thermalstatuschanged(`type`: thermalstatuschanged, listener: TypedEventHandler[MediaCapture, js.Any]): Unit = js.native
  
  /**
    * Resumes a paused recording operation.
    * @return An asynchronous operation.
    */
  def resumeRecordAsync(): IPromiseWithIAsyncAction = js.native
  
  /**
    * Sets an encoding property.
    * @param mediaStreamType The type of media data the stream represents, such as video or audio.
    * @param propertyId The encoding property to set.
    * @param propertyValue The new value of the encoding property.
    */
  def setEncoderProperty(mediaStreamType: MediaStreamType, propertyId: String, propertyValue: js.Any): Unit = js.native
  
  /**
    * Asynchronously sets the media encoding properties.
    * @param mediaStreamType The type of media data the stream represents, such as video or audio.
    * @param mediaEncodingProperties The properties for the media encoding.
    * @param encoderProperties The properties for the encoder.
    * @return Object that is used to control the asynchronous operation.
    */
  def setEncodingPropertiesAsync(
    mediaStreamType: MediaStreamType,
    mediaEncodingProperties: IMediaEncodingProperties,
    encoderProperties: MediaPropertySet
  ): IPromiseWithIAsyncAction = js.native
  
  /**
    * Enables or disables horizontal mirroring of the video preview stream. This is not the preferred method for mirroring. See the Remarks section below for details.
    * @param value True to enable mirroring; false to disable mirroring.
    */
  def setPreviewMirroring(value: Boolean): Unit = js.native
  
  /**
    * Rotates the video preview stream.
    * @param value The amount by which to rotate the video.
    */
  def setPreviewRotation(value: VideoRotation): Unit = js.native
  
  /**
    * Rotates the recorded video.
    * @param value The amount by which to rotate the video.
    */
  def setRecordRotation(value: VideoRotation): Unit = js.native
  
  /**
    * Start recording to a custom media sink using the specified encoding profile.
    * @param encodingProfile The encoding profile to use for the recording.
    * @param customMediaSink The media extension for the custom media sink.
    * @return An object that is used to control the asynchronous operation.
    */
  def startRecordToCustomSinkAsync(encodingProfile: MediaEncodingProfile, customMediaSink: IMediaExtension): IPromiseWithIAsyncAction = js.native
  /**
    * Start recording to a custom media sink using the specified encoding profile and sink settings.
    * @param encodingProfile The encoding profile to use for the recording.
    * @param customSinkActivationId The activatable class ID of the media extension for the custom media sink.
    * @param customSinkSettings Contains properties of the media extension.
    * @return Anobject that is used to control the asynchronous operation.
    */
  def startRecordToCustomSinkAsync(
    encodingProfile: MediaEncodingProfile,
    customSinkActivationId: String,
    customSinkSettings: IPropertySet
  ): IPromiseWithIAsyncAction = js.native
  
  /**
    * Starts recording asynchronously to a storage file.
    * @param encodingProfile The encoding profile for the recording.
    * @param file The storage file where the image is saved.
    * @return Returns a IAsyncAction object that is used to control the asynchronous operation.
    */
  def startRecordToStorageFileAsync(encodingProfile: MediaEncodingProfile, file: IStorageFile): IPromiseWithIAsyncAction = js.native
  
  /**
    * Starts recording to a random-access stream.
    * @param encodingProfile The encoding profile for the recording.
    * @param stream The stream where the image data is written.
    * @return Returns a IAsyncAction object that is used to control the asynchronous operation.
    */
  def startRecordToStreamAsync(encodingProfile: MediaEncodingProfile, stream: IRandomAccessStream): IPromiseWithIAsyncAction = js.native
  
  /**
    * Stops recording.
    * @return Returns a IAsyncAction object that is used to control the asynchronous operation.
    */
  def stopRecordAsync(): IPromiseWithIAsyncAction = js.native
  
  /** Gets a value that indicates the current thermal status of the capture device. */
  var thermalStatus: MediaCaptureThermalStatus = js.native
  
  /** Gets an object that controls settings for the video camera. */
  var videoDeviceController: VideoDeviceController = js.native
}
