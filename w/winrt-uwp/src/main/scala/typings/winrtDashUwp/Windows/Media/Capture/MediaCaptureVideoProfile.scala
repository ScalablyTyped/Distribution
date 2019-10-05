package typings.winrtDashUwp.Windows.Media.Capture

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a video profile that indicates a configuration supported by the video capture device. */
@JSGlobal("Windows.Media.Capture.MediaCaptureVideoProfile")
@js.native
abstract class MediaCaptureVideoProfile () extends js.Object {
  /** Gets the unique identifier of the video profile. */
  var id: String = js.native
  /** Gets a list of MediaCaptureVideoProfileMediaDescription objects that represent supported video device settings for photo capture. */
  var supportedPhotoMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription] = js.native
  /** Gets a list of MediaCaptureVideoProfileMediaDescription objects that represent supported video device settings for video preview. */
  var supportedPreviewMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription] = js.native
  /** Gets a list of MediaCaptureVideoProfileMediaDescription objects that represent supported video device settings for video recording. */
  var supportedRecordMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription] = js.native
  /** Gets the device ID of the video device associated with the video profile. */
  var videoDeviceId: String = js.native
  /**
    * Gets the list of MediaCaptureVideoProfile objects that can be used concurrently with this video profile.
    * @return The list of MediaCaptureVideoProfile objects that can be used concurrently with this video profile.
    */
  def getConcurrency(): IVectorView[MediaCaptureVideoProfile] = js.native
}

