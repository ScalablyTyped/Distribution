package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for capturing photos, audio, and videos from a capture device, such as a webcam. */
@JSGlobal("Windows.Media.Capture.MediaCapture")
@js.native
class MediaCapture () extends js.Object {
  /** Gets an object that controls settings for the microphone. */
  var audioDeviceController: winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.AudioDeviceController = js.native
  /** Gets the current stream state of the camera stream. */
  var cameraStreamState: winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CameraStreamState = js.native
  /** Gets the configuration settings for the MediaCapture object. */
  var mediaCaptureSettings: MediaCaptureSettings = js.native
  /** Occurs when the state of the camera stream changes. */
  @JSName("oncamerastreamstatechanged")
  var oncamerastreamstatechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaCapture, _] = js.native
  /** Raised when an error occurs during media capture. */
  @JSName("onfailed")
  var onfailed_Original: MediaCaptureFailedEventHandler = js.native
  /** Occurs when the capture device changes focus. */
  @JSName("onfocuschanged")
  var onfocuschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaCapture, MediaCaptureFocusChangedEventArgs] = js.native
  /** Occurs when a photo confirmation frame is captured. */
  @JSName("onphotoconfirmationcaptured")
  var onphotoconfirmationcaptured_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaCapture, PhotoConfirmationCapturedEventArgs] = js.native
  /** Occurs when the record limit is exceeded. */
  @JSName("onrecordlimitationexceeded")
  var onrecordlimitationexceeded_Original: RecordLimitationExceededEventHandler = js.native
  /** Occurs when the thermal status of the capture device changes. */
  @JSName("onthermalstatuschanged")
  var onthermalstatuschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaCapture, _] = js.native
  /** Gets a value that indicates the current thermal status of the capture device. */
  var thermalStatus: MediaCaptureThermalStatus = js.native
  /** Gets an object that controls settings for the video camera. */
  var videoDeviceController: winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.VideoDeviceController = js.native
  /**
                   * Adds an audio effect to the capture pipeline.
                   * @param definition The object containing the definition of the effect to be added.
                   * @return An asynchronous operation that returns an IMediaExtension upon successful completion.
                   */
  def addAudioEffectAsync(definition: winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.MediaNs.IMediaExtension] = js.native
  /**
                   * Adds an audio or video effect.
                   * @param mediaStreamType Specifies the streams to which the effect will be applied.
                   * @param effectActivationID The class identifier of the activatable runtime class that implements the effect. The runtime class must implement the IMediaExtension interface.
                   * @param effectSettings Configuration parameters for the effect.
                   * @return Returns an IAsyncAction object that is used to control the asynchronous operation.
                   */
  def addEffectAsync(
    mediaStreamType: MediaStreamType,
    effectActivationID: java.lang.String,
    effectSettings: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_camerastreamstatechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.camerastreamstatechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaCapture, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_failed(`type`: winrtDashUwpLib.winrtDashUwpLibStrings.failed, listener: MediaCaptureFailedEventHandler): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.focuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaCapture, MediaCaptureFocusChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_photoconfirmationcaptured(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.photoconfirmationcaptured,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaCapture, PhotoConfirmationCapturedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_recordlimitationexceeded(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.recordlimitationexceeded,
    listener: RecordLimitationExceededEventHandler
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thermalstatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.thermalstatuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaCapture, _]
  ): scala.Unit = js.native
  /**
                   * Adds a video effect to the capture pipeline.
                   * @param definition The object containing the definition of the effect to be added.
                   * @param mediaStreamType Specifies the streams to which the effect will be applied.
                   * @return An asynchronous operation that returns an IMediaExtension upon successful completion.
                   */
  def addVideoEffectAsync(
    definition: winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IVideoEffectDefinition,
    mediaStreamType: MediaStreamType
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.MediaNs.IMediaExtension] = js.native
  /**
                   * Captures a photo to a storage file.
                   * @param type The encoding properties for the output image.
                   * @param file The storage file where the image is saved.
                   * @return Returns an IAsyncAction object that is used to control the asynchronous operation.
                   */
  def capturePhotoToStorageFileAsync(
    `type`: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.ImageEncodingProperties,
    file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Captures a photo to a random-access stream.
                   * @param type The encoding properties for the output image.
                   * @param stream The stream where the image data is written.
                   * @return Returns an IAsyncAction object that is used to control the asynchronous operation.
                   */
  def capturePhotoToStreamAsync(
    `type`: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.ImageEncodingProperties,
    stream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Removes all audio and video effects from a stream.
                   * @param mediaStreamType The stream from which to remove the effects.
                   * @return Returns a IAsyncAction object that is used to control the asynchronous operation.
                   */
  def clearEffectsAsync(mediaStreamType: MediaStreamType): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /** Closes the media capture object. */
  def close(): scala.Unit = js.native
  /**
                   * Gets the value of an encoding property.
                   * @param mediaStreamType Specifies the stream to query for the encoding property.
                   * @param propertyId The encoding property to retrieve.
                   * @return Returns the value of the encoding property.
                   */
  def getEncoderProperty(mediaStreamType: MediaStreamType, propertyId: java.lang.String): js.Any = js.native
  /**
                   * Gets a preview frame from the capture device.
                   * @return An asynchronous operation that returns a VideoFrame on successful completion.
                   */
  def getPreviewFrameAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.MediaNs.VideoFrame] = js.native
  /**
                   * Gets a preview frame from the capture device, copied into the provided destination VideoFrame and converted into the destination frame's format.
                   * @param destination The video frame into which the preview frame will be copied.
                   * @return An asynchronous operation that returns a VideoFrame on successful completion.
                   */
  def getPreviewFrameAsync(destination: winrtDashUwpLib.WindowsNs.MediaNs.VideoFrame): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.MediaNs.VideoFrame] = js.native
  /**
                   * Queries whether the video stream is mirrored horizontally.
                   * @return True if mirroring is enabled; false otherwise.
                   */
  def getPreviewMirroring(): scala.Boolean = js.native
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
  def initializeAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Initializes the MediaCapture object.
                   * @param mediaCaptureInitializationSettings The initialization settings.
                   * @return Returns a IAsyncAction object that is used to control the asynchronous operation.
                   */
  def initializeAsync(mediaCaptureInitializationSettings: MediaCaptureInitializationSettings): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /** Occurs when the state of the camera stream changes. */
  def oncamerastreamstatechanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaCapture]): scala.Unit = js.native
  /** Raised when an error occurs during media capture. */
  def onfailed(ev: MediaCaptureFailedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaCapture]): scala.Unit = js.native
  /** Occurs when the capture device changes focus. */
  def onfocuschanged(ev: MediaCaptureFocusChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaCapture]): scala.Unit = js.native
  /** Occurs when a photo confirmation frame is captured. */
  def onphotoconfirmationcaptured(ev: PhotoConfirmationCapturedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaCapture]): scala.Unit = js.native
  /** Occurs when the record limit is exceeded. */
  def onrecordlimitationexceeded(ev: winrtDashUwpLib.WindowsNs.WinRTEvent[MediaCapture]): scala.Unit = js.native
  /** Occurs when the thermal status of the capture device changes. */
  def onthermalstatuschanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaCapture]): scala.Unit = js.native
  /**
                   * Pauses an ongoing record operation.
                   * @param behavior A value indicating whether the media capture hardware resources should be preserved or released while recording is paused.
                   * @return An asynchronous action.
                   */
  def pauseRecordAsync(behavior: winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.MediaCapturePauseBehavior): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Initializes the advanced photo capture and provides the AdvancedPhotoCapture object used to manage the recording.
                   * @param encodingProperties The encoding properties used for the resulting image.
                   * @return An asynchronous operation that returns an AdvancedPhotoCapture object on successful completion.
                   */
  def prepareAdvancedPhotoCaptureAsync(encodingProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.ImageEncodingProperties): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[AdvancedPhotoCapture] = js.native
  /**
                   * Initializes the low shutter lag photo capture and provides the LowLagPhotoCapture object used to manage the recording.
                   * @param type The encoding profile used for the image.
                   * @return When this method completes, a LowLagPhotoCapture object is returned which can be used to start the photo capture.
                   */
  def prepareLowLagPhotoCaptureAsync(`type`: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.ImageEncodingProperties): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[LowLagPhotoCapture] = js.native
  /**
                   * Initializes the low shutter lag photo sequence capture and provides the LowLagPhotoSequenceCapture object used to manage the recording.
                   * @param type The encoding profile used for the image.
                   * @return When this method completes, a LowLagPhotoSequenceCapture object is returned which can be used to start the photo sequence capture.
                   */
  def prepareLowLagPhotoSequenceCaptureAsync(`type`: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.ImageEncodingProperties): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[LowLagPhotoSequenceCapture] = js.native
  /**
                   * Initializes the low lag recording using the specified custom sink to store the recording. This method provides the LowLagMediaRecording object used to managed the capture.
                   * @param encodingProfile The encoding profile to use for the recording.
                   * @param customMediaSink The media extension for the custom media sink.
                   * @return When this method completes, a LowLagMediaRecording object is returned which can be used to start the photo capture.
                   */
  def prepareLowLagRecordToCustomSinkAsync(
    encodingProfile: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile,
    customMediaSink: winrtDashUwpLib.WindowsNs.MediaNs.IMediaExtension
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[LowLagMediaRecording] = js.native
  /**
                   * Initializes the low lag recording using the specified custom sink to store the recording. This method provides the LowLagMediaRecording object used to managed the recording.
                   * @param encodingProfile The encoding profile to use for the recording.
                   * @param customSinkActivationId The activatable class ID of the media extension for the custom media sink.
                   * @param customSinkSettings Contains properties of the media extension.
                   * @return When this method completes, a LowLagMediaRecording object is returned which can be used to start the photo capture.
                   */
  def prepareLowLagRecordToCustomSinkAsync(
    encodingProfile: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile,
    customSinkActivationId: java.lang.String,
    customSinkSettings: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[LowLagMediaRecording] = js.native
  /**
                   * Initializes the low lag recording using the specified file to store the recording. This method provides the LowLagMediaRecording object used to managed the recording.
                   * @param encodingProfile The encoding profile for the recording.
                   * @param file The storage file where the image is saved.
                   * @return When this method completes, a LowLagMediaRecording object is returned which can be used to start the photo capture.
                   */
  def prepareLowLagRecordToStorageFileAsync(
    encodingProfile: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile,
    file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[LowLagMediaRecording] = js.native
  /**
                   * Initializes the low lag recording using the specified random-access stream to store the recording. This method provides the LowLagMediaRecording object used to managed the recording.
                   * @param encodingProfile The encoding profile for the recording.
                   * @param stream The stream where the image data is written.
                   * @return When this method completes, a LowLagMediaRecording object is returned which can be used to start the photo capture.
                   */
  def prepareLowLagRecordToStreamAsync(
    encodingProfile: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile,
    stream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[LowLagMediaRecording] = js.native
  /**
                   * Initializes the variable photo sequence capture and provides the VariablePhotoSequenceCapture object used to manage the recording.
                   * @param type The encoding profile used for the image.
                   * @return When this method completes, a VariablePhotoSequenceCapture object is returned which can be used to start the photo sequence capture.
                   */
  def prepareVariablePhotoSequenceCaptureAsync(`type`: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.ImageEncodingProperties): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CoreNs.VariablePhotoSequenceCapture] = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_camerastreamstatechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.camerastreamstatechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaCapture, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_failed(`type`: winrtDashUwpLib.winrtDashUwpLibStrings.failed, listener: MediaCaptureFailedEventHandler): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.focuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaCapture, MediaCaptureFocusChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_photoconfirmationcaptured(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.photoconfirmationcaptured,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaCapture, PhotoConfirmationCapturedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_recordlimitationexceeded(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.recordlimitationexceeded,
    listener: RecordLimitationExceededEventHandler
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_thermalstatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.thermalstatuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaCapture, _]
  ): scala.Unit = js.native
  /**
                   * Resumes a paused recording operation.
                   * @return An asynchronous operation.
                   */
  def resumeRecordAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Sets an encoding property.
                   * @param mediaStreamType The type of media data the stream represents, such as video or audio.
                   * @param propertyId The encoding property to set.
                   * @param propertyValue The new value of the encoding property.
                   */
  def setEncoderProperty(mediaStreamType: MediaStreamType, propertyId: java.lang.String, propertyValue: js.Any): scala.Unit = js.native
  /**
                   * Asynchronously sets the media encoding properties.
                   * @param mediaStreamType The type of media data the stream represents, such as video or audio.
                   * @param mediaEncodingProperties The properties for the media encoding.
                   * @param encoderProperties The properties for the encoder.
                   * @return Object that is used to control the asynchronous operation.
                   */
  def setEncodingPropertiesAsync(
    mediaStreamType: MediaStreamType,
    mediaEncodingProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties,
    encoderProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaPropertySet
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Enables or disables horizontal mirroring of the video preview stream. This is not the preferred method for mirroring. See the Remarks section below for details.
                   * @param value True to enable mirroring; false to disable mirroring.
                   */
  def setPreviewMirroring(value: scala.Boolean): scala.Unit = js.native
  /**
                   * Rotates the video preview stream.
                   * @param value The amount by which to rotate the video.
                   */
  def setPreviewRotation(value: VideoRotation): scala.Unit = js.native
  /**
                   * Rotates the recorded video.
                   * @param value The amount by which to rotate the video.
                   */
  def setRecordRotation(value: VideoRotation): scala.Unit = js.native
  /**
                   * Start recording to a custom media sink using the specified encoding profile.
                   * @param encodingProfile The encoding profile to use for the recording.
                   * @param customMediaSink The media extension for the custom media sink.
                   * @return An object that is used to control the asynchronous operation.
                   */
  def startRecordToCustomSinkAsync(
    encodingProfile: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile,
    customMediaSink: winrtDashUwpLib.WindowsNs.MediaNs.IMediaExtension
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Start recording to a custom media sink using the specified encoding profile and sink settings.
                   * @param encodingProfile The encoding profile to use for the recording.
                   * @param customSinkActivationId The activatable class ID of the media extension for the custom media sink.
                   * @param customSinkSettings Contains properties of the media extension.
                   * @return Anobject that is used to control the asynchronous operation.
                   */
  def startRecordToCustomSinkAsync(
    encodingProfile: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile,
    customSinkActivationId: java.lang.String,
    customSinkSettings: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Starts recording asynchronously to a storage file.
                   * @param encodingProfile The encoding profile for the recording.
                   * @param file The storage file where the image is saved.
                   * @return Returns a IAsyncAction object that is used to control the asynchronous operation.
                   */
  def startRecordToStorageFileAsync(
    encodingProfile: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile,
    file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Starts recording to a random-access stream.
                   * @param encodingProfile The encoding profile for the recording.
                   * @param stream The stream where the image data is written.
                   * @return Returns a IAsyncAction object that is used to control the asynchronous operation.
                   */
  def startRecordToStreamAsync(
    encodingProfile: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile,
    stream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Stops recording.
                   * @return Returns a IAsyncAction object that is used to control the asynchronous operation.
                   */
  def stopRecordAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

/** Provides functionality for capturing photos, audio, and videos from a capture device, such as a webcam. */
@JSGlobal("Windows.Media.Capture.MediaCapture")
@js.native
object MediaCapture extends js.Object {
  /**
                   * Retrieves the list of all video profiles supported by the specified video capture device.
                   * @param videoDeviceId The identifier of the video device for which supported video profiles are queried. For information on getting the video device ID, see DeviceInformation::FindAllAsync .
                   * @return The list of video profiles supported by the specified video capture device.
                   */
  def findAllVideoProfiles(videoDeviceId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaCaptureVideoProfile] = js.native
  /**
                   * Retrieves the list of video profiles supported by the specified video capture device that can be used while another profile is used on a different capture device.
                   * @param videoDeviceId The identifier of the video device for which supported video profiles are queried. For information on getting the video device ID, see DeviceInformation::FindAllAsync .
                   * @return The list of video profiles supported by the specified video capture device that support concurrency.
                   */
  def findConcurrentProfiles(videoDeviceId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaCaptureVideoProfile] = js.native
  /**
                   * Retrieves the list of all video profiles supported by the specified video capture device that match the specified KnownVideoProfile value.
                   * @param videoDeviceId The identifier of the video device for which supported video profiles are queried. For information on getting the video device ID, see DeviceInformation::FindAllAsync .
                   * @param name A value specifying one of the profile names known by the system.
                   * @return The list of video profiles supported by the specified video capture device that match the specified known profile name.
                   */
  def findKnownVideoProfiles(
    videoDeviceId: java.lang.String,
    name: winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.KnownVideoProfile
  ): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaCaptureVideoProfile] = js.native
  /**
                   * Gets a boolean value indicating whether video profiles are supported by the specified video capture device.
                   * @param videoDeviceId The identifier of the video device for which supported video profile support is queried. For information on getting the video device ID, see DeviceInformation::FindAllAsync .
                   * @return True if video profiles are supported; otherwise, false.
                   */
  def isVideoProfileSupported(videoDeviceId: java.lang.String): scala.Boolean = js.native
}

