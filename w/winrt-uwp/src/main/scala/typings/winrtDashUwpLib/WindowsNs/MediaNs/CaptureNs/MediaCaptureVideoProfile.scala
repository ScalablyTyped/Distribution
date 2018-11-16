package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a video profile that indicates a configuration supported by the video capture device. */
@JSGlobal("Windows.Media.Capture.MediaCaptureVideoProfile")
@js.native
abstract class MediaCaptureVideoProfile () extends js.Object {
  /** Gets the unique identifier of the video profile. */
  var id: java.lang.String = js.native
  /** Gets a list of MediaCaptureVideoProfileMediaDescription objects that represent supported video device settings for photo capture. */
  var supportedPhotoMediaDescription: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[MediaCaptureVideoProfileMediaDescription] = js.native
  /** Gets a list of MediaCaptureVideoProfileMediaDescription objects that represent supported video device settings for video preview. */
  var supportedPreviewMediaDescription: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[MediaCaptureVideoProfileMediaDescription] = js.native
  /** Gets a list of MediaCaptureVideoProfileMediaDescription objects that represent supported video device settings for video recording. */
  var supportedRecordMediaDescription: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[MediaCaptureVideoProfileMediaDescription] = js.native
  /** Gets the device ID of the video device associated with the video profile. */
  var videoDeviceId: java.lang.String = js.native
  /**
                   * Gets the list of MediaCaptureVideoProfile objects that can be used concurrently with this video profile.
                   * @return The list of MediaCaptureVideoProfile objects that can be used concurrently with this video profile.
                   */
  def getConcurrency(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[MediaCaptureVideoProfile] = js.native
}

