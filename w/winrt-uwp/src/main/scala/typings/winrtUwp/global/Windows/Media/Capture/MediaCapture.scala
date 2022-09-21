package typings.winrtUwp.global.Windows.Media.Capture

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for capturing photos, audio, and videos from a capture device, such as a webcam. */
@JSGlobal("Windows.Media.Capture.MediaCapture")
@js.native
/** Creates a new instance of the MediaCapture object. */
open class MediaCapture ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Capture.MediaCapture
object MediaCapture {
  
  @JSGlobal("Windows.Media.Capture.MediaCapture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Retrieves the list of all video profiles supported by the specified video capture device.
    * @param videoDeviceId The identifier of the video device for which supported video profiles are queried. For information on getting the video device ID, see DeviceInformation::FindAllAsync .
    * @return The list of video profiles supported by the specified video capture device.
    */
  /* static member */
  inline def findAllVideoProfiles(videoDeviceId: String): IVectorView[typings.winrtUwp.Windows.Media.Capture.MediaCaptureVideoProfile] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllVideoProfiles")(videoDeviceId.asInstanceOf[js.Any]).asInstanceOf[IVectorView[typings.winrtUwp.Windows.Media.Capture.MediaCaptureVideoProfile]]
  
  /**
    * Retrieves the list of video profiles supported by the specified video capture device that can be used while another profile is used on a different capture device.
    * @param videoDeviceId The identifier of the video device for which supported video profiles are queried. For information on getting the video device ID, see DeviceInformation::FindAllAsync .
    * @return The list of video profiles supported by the specified video capture device that support concurrency.
    */
  /* static member */
  inline def findConcurrentProfiles(videoDeviceId: String): IVectorView[typings.winrtUwp.Windows.Media.Capture.MediaCaptureVideoProfile] = ^.asInstanceOf[js.Dynamic].applyDynamic("findConcurrentProfiles")(videoDeviceId.asInstanceOf[js.Any]).asInstanceOf[IVectorView[typings.winrtUwp.Windows.Media.Capture.MediaCaptureVideoProfile]]
  
  /**
    * Retrieves the list of all video profiles supported by the specified video capture device that match the specified KnownVideoProfile value.
    * @param videoDeviceId The identifier of the video device for which supported video profiles are queried. For information on getting the video device ID, see DeviceInformation::FindAllAsync .
    * @param name A value specifying one of the profile names known by the system.
    * @return The list of video profiles supported by the specified video capture device that match the specified known profile name.
    */
  /* static member */
  inline def findKnownVideoProfiles(videoDeviceId: String, name: typings.winrtUwp.Windows.Media.Capture.KnownVideoProfile): IVectorView[typings.winrtUwp.Windows.Media.Capture.MediaCaptureVideoProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("findKnownVideoProfiles")(videoDeviceId.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[IVectorView[typings.winrtUwp.Windows.Media.Capture.MediaCaptureVideoProfile]]
  
  /**
    * Gets a boolean value indicating whether video profiles are supported by the specified video capture device.
    * @param videoDeviceId The identifier of the video device for which supported video profile support is queried. For information on getting the video device ID, see DeviceInformation::FindAllAsync .
    * @return True if video profiles are supported; otherwise, false.
    */
  /* static member */
  inline def isVideoProfileSupported(videoDeviceId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVideoProfileSupported")(videoDeviceId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
