package typings.winrtUwp.global.Windows.Media.Capture

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for capturing photos, audio, and videos from a capture device, such as a webcam. */
@JSGlobal("Windows.Media.Capture.MediaCapture")
@js.native
/** Creates a new instance of the MediaCapture object. */
class MediaCapture ()
  extends typings.winrtUwp.Windows.Media.Capture.MediaCapture

/* static members */
@JSGlobal("Windows.Media.Capture.MediaCapture")
@js.native
object MediaCapture extends js.Object {
  /**
    * Retrieves the list of all video profiles supported by the specified video capture device.
    * @param videoDeviceId The identifier of the video device for which supported video profiles are queried. For information on getting the video device ID, see DeviceInformation::FindAllAsync .
    * @return The list of video profiles supported by the specified video capture device.
    */
  def findAllVideoProfiles(videoDeviceId: String): IVectorView[typings.winrtUwp.Windows.Media.Capture.MediaCaptureVideoProfile] = js.native
  /**
    * Retrieves the list of video profiles supported by the specified video capture device that can be used while another profile is used on a different capture device.
    * @param videoDeviceId The identifier of the video device for which supported video profiles are queried. For information on getting the video device ID, see DeviceInformation::FindAllAsync .
    * @return The list of video profiles supported by the specified video capture device that support concurrency.
    */
  def findConcurrentProfiles(videoDeviceId: String): IVectorView[typings.winrtUwp.Windows.Media.Capture.MediaCaptureVideoProfile] = js.native
  /**
    * Retrieves the list of all video profiles supported by the specified video capture device that match the specified KnownVideoProfile value.
    * @param videoDeviceId The identifier of the video device for which supported video profiles are queried. For information on getting the video device ID, see DeviceInformation::FindAllAsync .
    * @param name A value specifying one of the profile names known by the system.
    * @return The list of video profiles supported by the specified video capture device that match the specified known profile name.
    */
  def findKnownVideoProfiles(videoDeviceId: String, name: typings.winrtUwp.Windows.Media.Capture.KnownVideoProfile): IVectorView[typings.winrtUwp.Windows.Media.Capture.MediaCaptureVideoProfile] = js.native
  /**
    * Gets a boolean value indicating whether video profiles are supported by the specified video capture device.
    * @param videoDeviceId The identifier of the video device for which supported video profile support is queried. For information on getting the video device ID, see DeviceInformation::FindAllAsync .
    * @return True if video profiles are supported; otherwise, false.
    */
  def isVideoProfileSupported(videoDeviceId: String): Boolean = js.native
}

