package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a video profile that indicates a configuration supported by the video capture device. */
trait MediaCaptureVideoProfile extends js.Object {
  /** Gets the unique identifier of the video profile. */
  var id: String
  /** Gets a list of MediaCaptureVideoProfileMediaDescription objects that represent supported video device settings for photo capture. */
  var supportedPhotoMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription]
  /** Gets a list of MediaCaptureVideoProfileMediaDescription objects that represent supported video device settings for video preview. */
  var supportedPreviewMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription]
  /** Gets a list of MediaCaptureVideoProfileMediaDescription objects that represent supported video device settings for video recording. */
  var supportedRecordMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription]
  /** Gets the device ID of the video device associated with the video profile. */
  var videoDeviceId: String
  /**
    * Gets the list of MediaCaptureVideoProfile objects that can be used concurrently with this video profile.
    * @return The list of MediaCaptureVideoProfile objects that can be used concurrently with this video profile.
    */
  def getConcurrency(): IVectorView[MediaCaptureVideoProfile]
}

object MediaCaptureVideoProfile {
  @scala.inline
  def apply(
    getConcurrency: () => IVectorView[MediaCaptureVideoProfile],
    id: String,
    supportedPhotoMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription],
    supportedPreviewMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription],
    supportedRecordMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription],
    videoDeviceId: String
  ): MediaCaptureVideoProfile = {
    val __obj = js.Dynamic.literal(getConcurrency = js.Any.fromFunction0(getConcurrency), id = id.asInstanceOf[js.Any], supportedPhotoMediaDescription = supportedPhotoMediaDescription.asInstanceOf[js.Any], supportedPreviewMediaDescription = supportedPreviewMediaDescription.asInstanceOf[js.Any], supportedRecordMediaDescription = supportedRecordMediaDescription.asInstanceOf[js.Any], videoDeviceId = videoDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCaptureVideoProfile]
  }
}

