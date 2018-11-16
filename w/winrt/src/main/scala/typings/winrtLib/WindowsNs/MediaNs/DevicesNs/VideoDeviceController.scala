package typings
package winrtLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Devices.VideoDeviceController")
@js.native
class VideoDeviceController ()
  extends IVideoDeviceController
     with IAdvancedVideoCaptureDeviceController {
  /* CompleteClass */
  override var backlightCompensation: MediaDeviceControl = js.native
  /* CompleteClass */
  override var brightness: MediaDeviceControl = js.native
  /* CompleteClass */
  override var contrast: MediaDeviceControl = js.native
  /* CompleteClass */
  override var exposure: MediaDeviceControl = js.native
  /* CompleteClass */
  override var focus: MediaDeviceControl = js.native
  /* CompleteClass */
  override var hue: MediaDeviceControl = js.native
  /* CompleteClass */
  override var pan: MediaDeviceControl = js.native
  /* CompleteClass */
  override var roll: MediaDeviceControl = js.native
  /* CompleteClass */
  override var tilt: MediaDeviceControl = js.native
  /* CompleteClass */
  override var whiteBalance: MediaDeviceControl = js.native
  /* CompleteClass */
  override var zoom: MediaDeviceControl = js.native
  /* CompleteClass */
  override def getAvailableMediaStreamProperties(mediaStreamType: winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties] = js.native
  /* CompleteClass */
  override def getDeviceProperty(propertyId: java.lang.String): js.Any = js.native
  /* CompleteClass */
  override def getMediaStreamProperties(mediaStreamType: winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType): winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties = js.native
  /* CompleteClass */
  override def setDeviceProperty(propertyId: java.lang.String, propertyValue: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def setMediaStreamPropertiesAsync(
    mediaStreamType: winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType,
    mediaEncodingProperties: winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  /* CompleteClass */
  override def tryGetPowerlineFrequency(): winrtLib.Anon_Value = js.native
  /* CompleteClass */
  override def trySetPowerlineFrequency(value: winrtLib.WindowsNs.MediaNs.CaptureNs.PowerlineFrequency): scala.Boolean = js.native
}

