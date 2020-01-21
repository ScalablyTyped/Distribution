package typings.winrt.Windows.Media.Devices

import typings.winrt.AnonSucceeded
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Media.Capture.MediaStreamType
import typings.winrt.Windows.Media.Capture.PowerlineFrequency
import typings.winrt.Windows.Media.MediaProperties.IMediaEncodingProperties
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
  override def getAvailableMediaStreamProperties(mediaStreamType: MediaStreamType): IVectorView[IMediaEncodingProperties] = js.native
  /* CompleteClass */
  override def getDeviceProperty(propertyId: String): js.Any = js.native
  /* CompleteClass */
  override def getMediaStreamProperties(mediaStreamType: MediaStreamType): IMediaEncodingProperties = js.native
  /* CompleteClass */
  override def setDeviceProperty(propertyId: String, propertyValue: js.Any): Unit = js.native
  /* CompleteClass */
  override def setMediaStreamPropertiesAsync(mediaStreamType: MediaStreamType, mediaEncodingProperties: IMediaEncodingProperties): IAsyncAction = js.native
  /* CompleteClass */
  override def tryGetPowerlineFrequency(): AnonSucceeded = js.native
  /* CompleteClass */
  override def trySetPowerlineFrequency(value: PowerlineFrequency): Boolean = js.native
}

