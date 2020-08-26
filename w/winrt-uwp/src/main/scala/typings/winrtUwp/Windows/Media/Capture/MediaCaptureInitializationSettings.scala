package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Media.AudioProcessing
import typings.winrtUwp.Windows.Media.Core.IMediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains initialization settings for the MediaCapture object which are passed to the MediaCapture.InitializeAsync method. */
@js.native
trait MediaCaptureInitializationSettings extends js.Object {
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

object MediaCaptureInitializationSettings {
  @scala.inline
  def apply(
    audioDeviceId: String,
    audioProcessing: AudioProcessing,
    audioSource: IMediaSource,
    mediaCategory: MediaCategory,
    photoCaptureSource: PhotoCaptureSource,
    photoMediaDescription: MediaCaptureVideoProfileMediaDescription,
    previewMediaDescription: MediaCaptureVideoProfileMediaDescription,
    recordMediaDescription: MediaCaptureVideoProfileMediaDescription,
    streamingCaptureMode: StreamingCaptureMode,
    videoDeviceId: String,
    videoProfile: MediaCaptureVideoProfile,
    videoSource: IMediaSource
  ): MediaCaptureInitializationSettings = {
    val __obj = js.Dynamic.literal(audioDeviceId = audioDeviceId.asInstanceOf[js.Any], audioProcessing = audioProcessing.asInstanceOf[js.Any], audioSource = audioSource.asInstanceOf[js.Any], mediaCategory = mediaCategory.asInstanceOf[js.Any], photoCaptureSource = photoCaptureSource.asInstanceOf[js.Any], photoMediaDescription = photoMediaDescription.asInstanceOf[js.Any], previewMediaDescription = previewMediaDescription.asInstanceOf[js.Any], recordMediaDescription = recordMediaDescription.asInstanceOf[js.Any], streamingCaptureMode = streamingCaptureMode.asInstanceOf[js.Any], videoDeviceId = videoDeviceId.asInstanceOf[js.Any], videoProfile = videoProfile.asInstanceOf[js.Any], videoSource = videoSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCaptureInitializationSettings]
  }
  @scala.inline
  implicit class MediaCaptureInitializationSettingsOps[Self <: MediaCaptureInitializationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAudioDeviceId(value: String): Self = this.set("audioDeviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudioProcessing(value: AudioProcessing): Self = this.set("audioProcessing", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudioSource(value: IMediaSource): Self = this.set("audioSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaCategory(value: MediaCategory): Self = this.set("mediaCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhotoCaptureSource(value: PhotoCaptureSource): Self = this.set("photoCaptureSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhotoMediaDescription(value: MediaCaptureVideoProfileMediaDescription): Self = this.set("photoMediaDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviewMediaDescription(value: MediaCaptureVideoProfileMediaDescription): Self = this.set("previewMediaDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecordMediaDescription(value: MediaCaptureVideoProfileMediaDescription): Self = this.set("recordMediaDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamingCaptureMode(value: StreamingCaptureMode): Self = this.set("streamingCaptureMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideoDeviceId(value: String): Self = this.set("videoDeviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideoProfile(value: MediaCaptureVideoProfile): Self = this.set("videoProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideoSource(value: IMediaSource): Self = this.set("videoSource", value.asInstanceOf[js.Any])
  }
  
}

